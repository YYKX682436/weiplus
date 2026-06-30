package ko5;

/* loaded from: classes14.dex */
public final class b implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f310097c;

    public b(java.lang.String str, java.lang.String str2, yz5.a aVar) {
        this.f310095a = str;
        this.f310096b = str2;
        this.f310097c = aVar;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "init tts engine success and ready to play");
        nq4.e.f339008a.d(this.f310095a, this.f310096b, new ko5.a(this.f310097c));
    }
}
