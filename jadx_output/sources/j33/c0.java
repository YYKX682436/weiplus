package j33;

/* loaded from: classes10.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final j33.w f297419d;

    /* renamed from: e, reason: collision with root package name */
    public final long f297420e;

    /* renamed from: f, reason: collision with root package name */
    public final long f297421f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f297422g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f297423h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f297424i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f297425m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f297426n;

    public c0(com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer albumScrollBarContainer, j33.w wVar, long j17, long j18, yz5.a aVar, yz5.a aVar2, int i17, kotlin.jvm.internal.i iVar) {
        wVar = (i17 & 2) != 0 ? null : wVar;
        j17 = (i17 & 4) != 0 ? 100L : j17;
        j18 = (i17 & 8) != 0 ? 100L : j18;
        aVar = (i17 & 16) != 0 ? null : aVar;
        aVar2 = (i17 & 32) != 0 ? null : aVar2;
        this.f297419d = wVar;
        this.f297420e = j17;
        this.f297421f = j18;
        this.f297422g = aVar;
        this.f297423h = aVar2;
        this.f297424i = new java.lang.ref.WeakReference(albumScrollBarContainer);
        this.f297425m = "MicroMsg.AlbumScrollBarUIC.ScrollbarAnimChangeVisibilityTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        j33.z zVar;
        com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer albumScrollBarContainer = (com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer) this.f297424i.get();
        java.lang.String str = this.f297425m;
        if (albumScrollBarContainer == null) {
            com.tencent.mars.xlog.Log.e(str, "scrollBarView null");
            return;
        }
        k33.d uICore = albumScrollBarContainer.getUICore();
        if (albumScrollBarContainer.getVisibility() == 0) {
            com.tencent.mm.ui.q2 f138672e = uICore.getF138672e();
            com.tencent.mm.ui.q2 q2Var = com.tencent.mm.ui.q2.NORMAL;
            if (f138672e == q2Var) {
                com.tencent.mars.xlog.Log.i(str, "normal fade start");
                this.f297426n = true;
                yz5.a aVar = this.f297422g;
                if (aVar != null) {
                    aVar.invoke();
                }
                sa5.d.d(albumScrollBarContainer, 0, this.f297421f, new j33.y(this), 1, null);
                return;
            }
            j33.w wVar = this.f297419d;
            if (wVar != null) {
                float translationY = albumScrollBarContainer.getTranslationY();
                zVar = new j33.z(albumScrollBarContainer, translationY, wVar.a(((com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) uICore).c(wVar.b(), q2Var)) - translationY);
            } else {
                zVar = null;
            }
            this.f297426n = true;
            yz5.a aVar2 = this.f297422g;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            j33.b0 b0Var = new j33.b0(this, albumScrollBarContainer);
            com.tencent.mars.xlog.Log.i(str, "focus to normal anim start");
            ((com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) uICore).b(q2Var, this.f297420e, zVar, b0Var);
        }
    }
}
