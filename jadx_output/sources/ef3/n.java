package ef3;

/* loaded from: classes9.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f252425b;

    public n(int i17, long j17) {
        this.f252424a = i17;
        this.f252425b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.wh5 wh5Var = (r45.wh5) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.QueryWeChatWalletManager", "callback ui");
        int i17 = this.f252424a - 1;
        if (wh5Var != null || i17 < 0) {
            ef3.q.f252426a = false;
            java.util.ArrayList arrayList = (java.util.ArrayList) ef3.q.f252427b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ef3.p pVar = (ef3.p) arrayList.get(size);
                com.tencent.mm.plugin.mall.ui.t2 t2Var = (com.tencent.mm.plugin.mall.ui.t2) pVar;
                t2Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "net callback: %s", wh5Var);
                com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI = t2Var.f148493a;
                android.app.Dialog dialog = mallWalletUI.f148321m;
                if (dialog != null) {
                    dialog.dismiss();
                    mallWalletUI.f148321m = null;
                }
                if (wh5Var != null) {
                    r45.yj6 yj6Var = wh5Var.f389165d;
                    if (yj6Var != null) {
                        mallWalletUI.f148319h = yj6Var;
                        mallWalletUI.V6(false);
                    }
                    r45.yt5 yt5Var = wh5Var.f389166e;
                    if (yt5Var != null && yt5Var.f391354d == 13) {
                        mallWalletUI.runOnUiThread(new com.tencent.mm.plugin.mall.ui.s2(t2Var, wh5Var));
                    }
                }
                arrayList.remove(pVar);
            }
        } else if (i17 >= 0) {
            long j17 = this.f252425b;
            new ef3.c(j17, null).l().q(new ef3.o()).h(new ef3.n(i17, j17));
        }
        return null;
    }
}
