package k23;

/* loaded from: classes12.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f303624d;

    public n0(k23.v0 v0Var) {
        this.f303624d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishRecognizeTimeoutTask onResult, ");
        k23.v0 v0Var = this.f303624d;
        sb6.append(v0Var.f303709d);
        sb6.append(", ");
        sb6.append(v0Var.f303710e);
        sb6.append(", scene=");
        k23.d0 d0Var = v0Var.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        sb6.append(d0Var.f303548e);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        v0Var.f303718m = false;
        if (v0Var.f303709d.length() > 0) {
            k23.v0.x(this.f303624d, 6, "{\"voiceId\":\"" + v0Var.f303710e + "\"}", null, 4, null);
        } else {
            k23.v0.x(this.f303624d, 7, "{\"errorCode\":-2;\"errMsg\":\"empty text\";\"voiceId\":\"" + v0Var.f303710e + "\"}", null, 4, null);
        }
        k23.d0 d0Var2 = v0Var.f303707b;
        if (d0Var2 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        k23.v2 v2Var = d0Var2.f303546c;
        if (v2Var != null) {
            v2Var.b(v0Var.f303709d, v0Var.f303710e);
        }
        k23.d0 d0Var3 = v0Var.f303707b;
        if (d0Var3 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        if (d0Var3.f303548e != k23.w0.f303734d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "finishRecognizeTimeoutTask: hideRecognizingPanel for non-TEACH_PAGE_MAIN scene");
            v0Var.s();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "finishRecognizeTimeoutTask: skip hideRecognizingPanel for TEACH_PAGE_MAIN scene");
        }
        v0Var.z();
    }
}
