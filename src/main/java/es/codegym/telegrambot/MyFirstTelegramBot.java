package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;

import static es.codegym.telegrambot.TelegramBotContent.*;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "L9TDeveloper_bot";
    public static final String TOKEN = "6909107363:AAGN7dCxpkYyN1zAaK7v7F6xUuqk-uyScyI";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí
        if (getMessageText().equals("/start")) {
            setUserGlory(0);

          sendPhotoMessageAsync("step_1_pic");

            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", "step_1_btn"));

        }

        if (getMessageText().contains("hola")) {
            setUserGlory(0);
            sendPhotoMessageAsync("step_1_pic");


            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", "step_1_btn"));

        }
        if (getCallbackQueryButtonKey().equals("step_1_btn")){
            setUserGlory(20);


            sendPhotoMessageAsync("step_2_pic");
            sendTextMessageAsync(STEP_2_TEXT,
                    Map.of("¡Tomar una salchicha! + 20 de fama", "step_2_btn",
                            "¡Tomar un pescado! + 20 de fama", "step_2_btn",
                            "¡Tirar una lata de pepinillos! + 28 de fama", "step_2_btn"));

    }

        if (getCallbackQueryButtonKey().equals("step_2_btn")){
            setUserGlory(20);
            sendPhotoMessageAsync("step_3_pic");
            sendTextMessageAsync(STEP_3_TEXT,
                    Map.of("¡Romper al Robot Aspirador! + 20 de fama", "step_3_btn"));

        }

        if (getCallbackQueryButtonKey().equals("step_3_btn")){
            setUserGlory(30);
            sendPhotoMessageAsync("step_4_pic");
            sendTextMessageAsync(STEP_4_TEXT,
                    Map.of("¡Romper al Robot Aspirador! + 20 de fama", "step_4_btn",
                            "Dar un paseo en el robot aspirador + 30 de fama", "step_4_btn",
                            "Huir del robot aspirardor¡ +30 de fama", "step_4_btn"));

        }

        if (getCallbackQueryButtonKey().equals("step_4_btn")){
            setUserGlory(40);
            sendPhotoMessageAsync("step_5_pic");
            sendTextMessageAsync(STEP_5_TEXT,
                    Map.of("¡Ponerme la GOPRO! + 40 de fama", "step_5_btn"));
        }


        if (getCallbackQueryButtonKey().equals("step_5_btn")){
            setUserGlory(40);
            sendPhotoMessageAsync("step_6_pic");
            sendTextMessageAsync(STEP_6_TEXT,
                    Map.of("¡Dar un paseo puesta la GOPRO", "step_6_btn",
                            "¡Huir con la GOPRO", "step_6_btn",
                            "¡Quitarme la GOPRO! + 40 de fama", "step_6_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_6_btn")){
            setUserGlory(40);
            sendPhotoMessageAsync("step_7_pic");
            sendTextMessageAsync(STEP_7_TEXT,
                    Map.of("¡Hackea la contraseña de computadora", "step_7_btn"));
        }


        if (getCallbackQueryButtonKey().equals("step_7_btn")){
            setUserGlory(40);
            sendPhotoMessageAsync("step_8_pic");
            sendTextMessageAsync(STEP_8_TEXT,
                    Map.of("¡Recicbir mensaje de superacion", "step_8_btn",
                            "¡Felicitaciones", "step_8_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_8_btn")){
            setUserGlory(40);
            sendPhotoMessageAsync("final_pic");
            sendTextMessageAsync(FINAL_TEXT);
        }


    }




      /*if (getMessageText().contains("me llamo")){
            sendTextMessageAsync("Encantado de conocerte, soy *Gato*");
        }*/


    /*sendTextMessageAsync("Hola, _futuro_ *programador* L9TDeveloper");
    }*/
    /*if (getMessageText().contains("hola")){*/




    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}