package zw1;

/* loaded from: classes15.dex */
public class x1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476842a;

    public x1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476842a = collectMainUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476842a;
        if (collectMainUI.isFinishing() || collectMainUI.isDestroyed()) {
            return null;
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(collectMainUI.getContext());
            u1Var.u(fVar.f70617c);
            u1Var.b(new zw1.w1(this));
            u1Var.q(false);
            return java.lang.Boolean.FALSE;
        }
        r45.jx jxVar = (r45.jx) fVar.f70618d;
        java.lang.String str = jxVar.f378179d;
        java.lang.String str2 = jxVar.f378180e;
        int i17 = jxVar.f378181f;
        if (collectMainUI.V) {
            collectMainUI.P = str;
        } else {
            collectMainUI.L = str;
        }
        collectMainUI.M = str2;
        collectMainUI.Q = i17;
        collectMainUI.p7();
        collectMainUI.V1 = ((r45.jx) fVar.f70618d).f378182g;
        collectMainUI.c7(null, null);
        collectMainUI.e7(2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 5);
        collectMainUI.T1 = false;
        return java.lang.Boolean.TRUE;
    }
}
