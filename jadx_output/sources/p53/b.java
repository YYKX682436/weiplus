package p53;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m53.c2 f352050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameRouteUI f352051e;

    public b(com.tencent.mm.plugin.game.ui.tab.GameRouteUI gameRouteUI, m53.c2 c2Var) {
        this.f352051e = gameRouteUI;
        this.f352050d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.c2 c2Var = this.f352050d;
        com.tencent.mm.plugin.game.model.a3.I(c2Var);
        com.tencent.mm.plugin.game.ui.tab.GameRouteUI gameRouteUI = this.f352051e;
        if (c2Var == null || com.tencent.mm.sdk.platformtools.t8.L0(c2Var.f323598d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameRouteUI", "get GameIndex4TabNavData err");
            int i17 = com.tencent.mm.plugin.game.ui.tab.GameRouteUI.f141767i;
            gameRouteUI.Z6();
        } else {
            java.util.LinkedList linkedList = c2Var.f323598d;
            int i18 = com.tencent.mm.plugin.game.ui.tab.GameRouteUI.f141767i;
            gameRouteUI.a7(linkedList, false);
        }
    }
}
