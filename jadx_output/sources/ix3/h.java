package ix3;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i f295428d;

    public h(ix3.i iVar) {
        this.f295428d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ix3.i iVar = this.f295428d;
        long j17 = iVar.f295441e;
        long j18 = iVar.f295443g;
        java.lang.StackTraceElement[] stackTrace = iVar.f295439c.getStackTrace();
        kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
        ix3.c cVar = new ix3.c(j17, j18, stackTrace);
        ix3.f fVar = ix3.i.f295434j;
        fVar.a().add(cVar);
        com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI = iVar.f295442f;
        if (repairerBlockDetectUI != null) {
            ix3.g0 g0Var = new ix3.g0(fVar.a().size() + 1, cVar);
            com.tencent.mm.view.recyclerview.WxRecyclerView b17 = repairerBlockDetectUI.U6().b();
            kotlin.jvm.internal.o.f(b17, "getRecyclerView(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(b17);
            if (a17 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.q(a17, g0Var, false, 2, null);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.BlockDetect", "dumpMainThreadStack");
    }
}
