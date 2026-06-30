package la5;

/* loaded from: classes14.dex */
public class a implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la5.c f317596b;

    public a(la5.c cVar, java.lang.String str) {
        this.f317596b = cVar;
        this.f317595a = str;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i17) {
        la5.c cVar = this.f317596b;
        android.speech.tts.TextToSpeech textToSpeech = cVar.f317605c;
        if (textToSpeech != null) {
            textToSpeech.setLanguage(com.tencent.mm.sdk.platformtools.m2.j() ? java.util.Locale.CHINESE : java.util.Locale.ENGLISH);
            cVar.f317605c.speak(this.f317595a, 0, null);
        }
    }
}
