package dz4;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245354d;

    public n(dz4.j0 j0Var) {
        this.f245354d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.j0 j0Var = this.f245354d;
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "closeVoiceInputPanel: holder null");
            return;
        }
        ((dz4.k1) ((jz5.n) ((ez4.u) pVar).f257955n).getValue()).b(j0Var.f245312d, r1.f245320d);
    }
}
