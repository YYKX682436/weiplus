package xc2;

/* loaded from: classes2.dex */
public final class k2 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f453193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f453194e;

    public k2(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment, com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        this.f453193d = vASCommonFragment;
        this.f453194e = aiVar;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "onDrawerDetach");
        this.f453194e.S6(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        wm3.j jVar;
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "onDrawerOpen open: " + z17 + ", begin:" + z18);
        if (!z17 || z18 || (vASActivity = this.f453193d.f211121p) == null || (jVar = (wm3.j) pf5.z.f353948a.a(vASActivity).e(wm3.j.class)) == null) {
            return;
        }
        jVar.U6();
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
