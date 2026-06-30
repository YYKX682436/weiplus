package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static android.speech.tts.TextToSpeech f210281a;

    /* renamed from: b, reason: collision with root package name */
    public static android.media.AudioManager f210282b;

    public static synchronized void a() {
        synchronized (com.tencent.mm.ui.tools.b1.class) {
            android.speech.tts.TextToSpeech textToSpeech = f210281a;
            if (textToSpeech != null) {
                textToSpeech.setOnUtteranceProgressListener(null);
                f210281a.stop();
                f210281a.shutdown();
                f210281a = null;
            }
            android.media.AudioManager audioManager = f210282b;
            if (audioManager != null) {
                audioManager.setSpeakerphoneOn(true);
                f210282b.setMode(0);
            }
        }
    }
}
