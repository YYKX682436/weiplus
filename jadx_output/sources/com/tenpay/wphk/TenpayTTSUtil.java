package com.tenpay.wphk;

/* loaded from: classes14.dex */
public class TenpayTTSUtil {
    private static boolean sEnabled = true;
    private static android.speech.tts.TextToSpeech sTts;

    public static void destroy() {
        android.speech.tts.TextToSpeech textToSpeech = sTts;
        if (textToSpeech != null) {
            textToSpeech.stop();
            sTts.shutdown();
            sTts = null;
        }
    }

    public static void init(android.content.Context context) {
        if (sTts == null) {
            sTts = new android.speech.tts.TextToSpeech(context.getApplicationContext(), null);
        }
    }

    public static void setEnabled(boolean z17) {
        sEnabled = z17;
    }

    public static void speak(java.lang.String str) {
        if (!sEnabled || sTts == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        sTts.speak(str, 1, null);
    }

    public static void stop() {
        android.speech.tts.TextToSpeech textToSpeech = sTts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    public static void speak(java.lang.CharSequence charSequence) {
        if (!sEnabled || sTts == null || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        sTts.speak(charSequence.toString(), 1, null);
    }
}
