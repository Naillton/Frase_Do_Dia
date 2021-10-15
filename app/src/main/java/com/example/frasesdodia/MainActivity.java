package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //public method which by default returns void
    public void buttonClick(View view){
        //array list frases
        String[] frases ={
                "Acredite em Deus ele te ajudará.",
                "Se entregar ao amor é a melhor opção.",
                "Se tudo está dando errado não desanime, no final a vitoria é certa.",
                "Motivar é uma arte espiritual.",
                "Quando pensar em desistir, lembre-se porque começou.",
                "Se não puder fazer tudo, faça tudo que puder.",
                "Comece onde você está. Use o que você tem. Faça o que puder.",
                "Não sabendo que era impossível, foi lá e fez.",
                "Eu nasci para ser feliz, não para ser normal.",
                "Ninguém é igual a você, e isso pode ser sua grande arma.",
                "Jamais desista de ser feliz.",
                "Não chore porque acabou, sorria porque aconteceu.",
                "O melhor lugar do mundo é aqui e agora.",
                "Acredite: tudo tem seu tempo.",
                "Corra, viva, sonhe e alcance.",
                "Seu maior medo também pode ser sua maior motivação.",
                "A força de vontade é meu superpoder.",
                "Tudo é possível. O impossível apenas demora mais.",
                "Amanhã será um dia melhor.",
                "Você é forte, você é capaz, você pode.",
                "Até seu último suspiro, viva uma vida de tirar o fôlego.",
                "A vida é curta demais para deixarmos nossos sonhos adormecidos.",
                "Pare de ter medo do que poderia dar errado e pense no que poderia dar certo.",
                "Confiar em Deus é ter a certeza de que tudo dará certo.",
                "Deus vai fazer de seu deserto um jardim.",
                "Não coloque limite em seus sonhos. Coloque fé.",
                "Se Deus for sua razão para vencer, você nunca terá porque desistir.",
                "Foco, força e fé é o lema dos vencedores.",
                "Quem fica de joelhos diante de Deus, fica de pé diante de qualquer coisa.",
                "Olhe pra cima, que é de lá que vem sua força.",
                "Eu sigo a vontade de Deus e confio que assim viverei plena.",
                "Tudo o que Deus faz tem um propósito.",
                "Faça mais do que simplesmente acreditar, tenha fé.",
                "Não te deixes vencer pelo mal, mas vence o mal com o bem.",
                "Acreditar é a força que nos permite subir os maiores degraus da vida.",
                "Agora é a hora de começar a surpreender aqueles que duvidaram de você.",
                "Por mais difícil que algo possa parecer, jamais desista antes de tentar.",
                "Para todo game over existe um play again.",
                "Que todo mal vire amor, que toda dor vire flor.",
                "Enquanto você tiver força para lutar, terá possibilidade de ganhar.",
                "Às vezes você tem que levantar sozinho e seguir em frente.",
                "Nunca é perda de tempo se você conseguiu aprender algo.",
                "Aprenda a rir dos seus tropeços.",
                "Se você não lutar por alguma coisa, será vencido por qualquer coisa.",
                "Esqueça, levante a cabeça. Siga em frente. Amanhã é um novo dia.",
                "Persista! Se tudo fosse fácil, qualquer um conseguiria.",
                "Se a vida não ficar mais fácil, trate de ficar mais forte.",
                "Dificuldades preparam pessoas comuns para destinos extraordinários.",
                "Se não puder fazer tudo, faça tudo que puder.",
                "Por maior que seja, não há obstáculo que não possa ser superado.",
                "Felizes são os que ouvem a palavra de Deus e a guardam!.",
                "Não amemos de palavras nem de língua, mas por ações e em verdade.",
                "O meu mandamento é este: amem uns aos outros como eu amo vocês.",
                "Se Cristo vos libertar, verdadeiramente sereis livres.",
                "Quem é correto nunca fracassará e será lembrado para sempre.",
                "Felizes são aqueles que não se deixam levar pelos conselhos dos maus.",
                "O ódio provoca dissensão, mas o amor cobre todos os pecados.",
                "Quem semeia a injustiça colherá a desgraça.",
                "Deus converte o deserto em lago e a terra seca em fontes.",
                "Tu que estás lá nas alturas, assim mesmo te interesses pelos humildes.",
                "Entreguem todas as suas preocupações a Deus, pois ele cuida de vocês.",
                "Deus limpará de seus olhos todas as lágrimas.",
                "Aquele que crê em mim fará as mesmas coisas que eu fiz e fará ainda maior.",
                "Portanto, não percam a coragem, pois ela traz uma grande recompensa.",
                "Todavia é preciso pedir com fé, sem duvidar, porque aquele que duvida é como a onda do mar, que o vento leva de um lado para outro.",
                "Procurai a paz com todos e ao mesmo tempo a santidade, sem a qual ninguém pode ver o Senhor",
                "Basta-te minha graça, porque é na fraqueza que se revela totalmente a minha força. Portanto, prefiro gloriar-me das minhas fraquezas, para que habite em mim a força de Cristo.",
                "Não entregues tua alma à tristeza, não atormentes a ti mesmo em teus pensamentos. A alegria do coração é a vida do homem, e um inesgotável tesouro de santidade.",
                "Apeguemo-nos com firmeza à esperança que professamos, pois, aquele que prometeu é fiel.",
                "A tua palavra é lâmpada que ilumina os meus passos e luz que clareia o meu caminho.",
                "Àquele que é capaz de fazer infinitamente mais do que tudo o que pedimos ou pensamos, de acordo com o seu poder que atua em nós, ",
                "Sejam alegres na esperança, pacientes na tribulação e perseverantes na oração",
                "O Senhor detesta os pensamentos dos maus, mas se agrada de palavras ditas sem maldade.",
                "Isto é uma ordem: sê firme e corajoso. Não te atemorizes, não tenhas medo, porque o Senhor está contigo em qualquer parte para onde fores.",
                "Deem graças ao Senhor porque ele é bom; o Seu amor dura para sempre. ",
                "Acima de tudo, porém, revistam-se do amor, que é o elo perfeito.",
                "Confia Nele e Ele Tudo Fará!.",
                "E também faço esta oração: que o vosso amor aumente mais e mais em pleno conhecimento e toda a percepção.",
                "Crescei na graça e no conhecimento de nosso Senhor e Salvador Jesus Cristo.",
                "Porque, agora, vemos como em espelho, obscuramente; então, veremos face a face. Agora, conheço em parte; então, conhecerei como também sou conhecido.",
        };

        int numero = new Random().nextInt(frases.length);
        //pubic class TextView where in the text variable I get the id of the text in the app
        TextView texto = findViewById(R.id.textTexto);
        texto.setText(frases[numero]);
    }
}