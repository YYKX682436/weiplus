package eg2;

/* loaded from: classes3.dex */
public final class o implements eg2.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg2.p f252604a;

    public o(eg2.p pVar) {
        this.f252604a = pVar;
    }

    public void a(java.lang.Exception exc) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HD task failed: ");
        sb6.append(exc != null ? exc.getMessage() : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.FinderCoverHDTaskPlugin", sb6.toString());
        eg2.p pVar = this.f252604a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = pVar.f252610n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        pVar.getClass();
    }

    public void b(java.lang.String localPath) {
        kotlin.jvm.internal.o.g(localPath, "localPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task success: ".concat(localPath));
        eg2.p pVar = this.f252604a;
        pVar.getClass();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = pVar.f252610n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        te2.m3.f418224a.a(te2.j3.f418132e, pVar.f252608i == 2 ? te2.l3.f418201e : te2.l3.f418200d, pVar.f252613q > 0 ? java.lang.System.currentTimeMillis() - pVar.f252613q : 0L);
        yz5.l lVar = pVar.f252611o;
        if (lVar != null) {
            lVar.invoke(localPath);
        }
    }
}
