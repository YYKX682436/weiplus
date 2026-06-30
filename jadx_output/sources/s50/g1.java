package s50;

/* loaded from: classes12.dex */
public final class g1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f403056c;

    public g1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        this.f403054a = l1Var;
        this.f403055b = weakReference;
        this.f403056c = v0Var;
    }

    @Override // k23.v2
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "FloatingVoiceInput onStartPress");
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "FloatingVoiceInput onResult: ".concat(result));
        s50.l1.wi(this.f403054a, this.f403055b, result, false, voiceID);
        k23.v0 v0Var = this.f403056c;
        v0Var.w(8, "", result);
        v0Var.w(9, "", result);
    }

    @Override // k23.v2
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", "FloatingVoiceInput onCancel");
        this.f403054a.Vi(this.f403055b);
    }
}
