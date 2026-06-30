package vw3;

/* loaded from: classes5.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f440981d;

    public h6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI) {
        this.f440981d = repairerUDRUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI = this.f440981d;
        vw3.e6 e6Var = repairerUDRUI.e;
        if (e6Var == null) {
            kotlin.jvm.internal.o.o("listAdapter");
            throw null;
        }
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).getClass();
        e6Var.f440942d = (com.tencent.wechat.aff.udr.w) com.tencent.wechat.aff.udr.a.f217529b.g().orElse(null);
        vw3.e6 e6Var2 = repairerUDRUI.e;
        if (e6Var2 != null) {
            e6Var2.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("listAdapter");
            throw null;
        }
    }
}
