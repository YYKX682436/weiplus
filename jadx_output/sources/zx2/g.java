package zx2;

/* loaded from: classes2.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx2.h f477038d;

    public g(zx2.h hVar) {
        this.f477038d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "adjust align");
        zx2.h hVar = this.f477038d;
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = hVar.f477039v;
        if (finderTabLayout != null) {
            finderTabLayout.setVisibility(0);
        }
        zx2.b0 b0Var = hVar.f133662n;
        if (b0Var != null) {
            b0Var.a(hVar.f477039v);
        }
    }
}
