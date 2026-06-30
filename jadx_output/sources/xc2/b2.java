package xc2;

/* loaded from: classes2.dex */
public final class b2 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f453089d;

    public b2(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        this.f453089d = aiVar;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "onDrawerDetach");
        this.f453089d.S6(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "onDrawerOpen open: " + z17 + ", begin:" + z18);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void d() {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "onDrawerPeek");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void f() {
        xc2.y2.d(xc2.y2.f453343a);
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "onDrawerExpand");
    }
}
