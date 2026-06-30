package l93;

/* loaded from: classes5.dex */
public final class t0 implements ah5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f317307a;

    public t0(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        this.f317307a = aVar;
    }

    @Override // ah5.a
    public void a() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f317307a;
        if (aVar != null) {
            aVar.c(true, false, 0);
        }
    }

    @Override // ah5.a
    public void b(int i17, int i18) {
        if (i17 > i18) {
            return;
        }
        float f17 = 1 - ((i17 * 1.0f) / i18);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f317307a;
        if (aVar != null) {
            aVar.a(f17);
        }
        com.tencent.mars.xlog.Log.i("FinderWeComHalfDrawListener", "onHeightChanged " + i17 + " percent：" + f17);
    }

    @Override // ah5.a
    public void c() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f317307a;
        if (aVar != null) {
            aVar.c(false, true, 0);
        }
    }

    @Override // ah5.a
    public void d() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f317307a;
        if (aVar != null) {
            aVar.c(false, false, 0);
        }
    }

    @Override // ah5.a
    public void e() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f317307a;
        if (aVar != null) {
            aVar.c(true, true, 0);
        }
    }
}
