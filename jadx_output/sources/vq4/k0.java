package vq4;

/* loaded from: classes14.dex */
public final class k0 implements android.speech.tts.TextToSpeech.OnInitListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f439328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f439329f;

    public k0(java.lang.String str, java.lang.String str2, vq4.m0 m0Var, java.lang.String str3, boolean z17, boolean z18) {
        this.f439324a = str;
        this.f439325b = str2;
        this.f439326c = m0Var;
        this.f439327d = str3;
        this.f439328e = z17;
        this.f439329f = z18;
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "init tts engine success and ready to play");
        nq4.e.f339008a.d(this.f439324a, this.f439325b, new vq4.j0(this.f439326c, this.f439327d, this.f439328e, this.f439329f));
    }
}
