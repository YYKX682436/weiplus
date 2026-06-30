package uy3;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431937d;

    public f0(uy3.j0 j0Var) {
        this.f431937d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        uy3.j0 j0Var = this.f431937d;
        r45.sn snVar = j0Var.f431948f;
        if (snVar == null) {
            kotlin.jvm.internal.o.o("homeContext");
            throw null;
        }
        objArr[0] = snVar.f385852f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "startLoadUrl %s", objArr);
        zg0.q2 q2Var = j0Var.f431950h;
        if (q2Var != null) {
            android.content.Intent intent = new android.content.Intent();
            r45.sn snVar2 = j0Var.f431948f;
            if (snVar2 == null) {
                kotlin.jvm.internal.o.o("homeContext");
                throw null;
            }
            intent.putExtra("rawUrl", snVar2.f385852f);
            intent.putExtra("useJs", true);
            ((com.tencent.mm.plugin.webview.core.e3) q2Var).j(intent);
        }
    }
}
