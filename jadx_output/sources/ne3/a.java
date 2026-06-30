package ne3;

/* loaded from: classes7.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scl.nativedemo.ui.MagicSclNativeDemoUI f336546d;

    public a(com.tencent.mm.plugin.magicbrush.scl.nativedemo.ui.MagicSclNativeDemoUI magicSclNativeDemoUI) {
        this.f336546d = magicSclNativeDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.magicbrush.scl.nativedemo.ui.MagicSclNativeDemoUI magicSclNativeDemoUI = this.f336546d;
        int i17 = com.tencent.mm.plugin.magicbrush.scl.nativedemo.ui.MagicSclNativeDemoUI.f148131f;
        magicSclNativeDemoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclNativeDemoUI", "releaseDynamicCardEnv");
        android.view.ViewGroup viewGroup = magicSclNativeDemoUI.f148133e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        hq0.e0 e0Var = magicSclNativeDemoUI.f148132d;
        if (e0Var != null) {
            me3.i iVar = (me3.i) i95.n0.c(me3.i.class);
            java.lang.String rootId = e0Var.f282984e;
            me3.j jVar = (me3.j) iVar;
            jVar.getClass();
            kotlin.jvm.internal.o.g(rootId, "rootId");
            le3.a aVar = jVar.f325934d;
            if (aVar != null) {
                aVar.F1(rootId);
            }
        }
        magicSclNativeDemoUI.f148132d = null;
        me3.j jVar2 = (me3.j) ((me3.i) i95.n0.c(me3.i.class));
        synchronized (jVar2) {
            le3.a aVar2 = jVar2.f325934d;
            if (aVar2 != null) {
                aVar2.destroy();
            }
            jVar2.f325934d = null;
        }
        this.f336546d.finish();
        return true;
    }
}
