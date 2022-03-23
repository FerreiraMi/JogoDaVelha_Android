package com.senaisp.tictactoeapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.senaisp.tictactoeapp.R;
import com.senaisp.tictactoeapp.databinding.FragmentJogoBinding;


public class JogoFragment extends Fragment {
//variavel para acessar os elementos da view
    private FragmentJogoBinding binding;
    //vetor de botoes para referenciar os botoes
    private Button[] botoes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                          Bundle saveInstanceState) {
        //instanciar o biding

        binding = FragmentJogoBinding.inflate(inflater, container, false);
          botoes = new Button[9];

          //associar o vetor aos botoes
        botoes[0] = binding.bt00;
        botoes[0] = binding.bt01;
        botoes[0] = binding.bt02;
        botoes[0] = binding.bt10;
        botoes[0] = binding.bt11;
        botoes[0] = binding.bt12;
        botoes[0] = binding.bt20;
        botoes[0] = binding.bt21;
        botoes[0] = binding.bt22;

        //associa o Listener aos botoes
        for(Button bt: botoes){
            bt.setOnClickListener(ListenerBotoes);
        }

        //retorna a view root do biding
        return binding.getRoot();
    }

    //Listener par os botoes
    private View.OnClickListener ListenerBotoes = btPress -> {

        //obtem o nome do botão
String nomeBotao = getContext().getResources().getResourceName(btPress.getId());
//extrai a posição através do nome do botão
String posicao = nomeBotao.substring(nomeBotao.length()-2);
//extrai linha e coluna da string posição
        int linha = Character.getNumericValue(posicao.charAt(0));
        int coluna = Character.getNumericValue(posicao.charAt(1));

        Log.w("Botao", linha+"");
        Log.w("Botao", coluna+"");
    };

}