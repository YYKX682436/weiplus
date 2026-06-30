package e33;

/* loaded from: classes10.dex */
public class o2 implements y51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247422a;

    public o2(e33.v2 v2Var) {
        this.f247422a = v2Var;
    }

    @Override // y51.f
    public void a() {
    }

    @Override // y51.f
    public int b() {
        e33.v2 v2Var = this.f247422a;
        int c17 = com.tencent.mm.ui.bl.c(v2Var.f247499g);
        if (com.tencent.mm.ui.b4.c(v2Var.f247499g)) {
            c17 = 0;
        }
        int i17 = com.tencent.mm.ui.bh.a(v2Var.f247499g).f197136b - c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onGetViewMaxHeightLocation >> maxHeight: %d, navBarHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c17));
        return i17;
    }

    @Override // y51.f
    public int c() {
        e33.r2 r2Var = this.f247422a.f247509t;
        int i17 = 0;
        if (r2Var != null) {
            com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = ((e33.n3$$j) r2Var).f247395a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "bottomHeightGetCallback >> titleFooterVisible: %b selectItemSize: %d", java.lang.Boolean.valueOf(imagePreviewUI.f138573J), java.lang.Integer.valueOf(imagePreviewUI.f138592n.size()));
            if (imagePreviewUI.f138573J) {
                int f17 = i65.a.f(imagePreviewUI, com.tencent.mm.R.dimen.f479923j2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "operateBarHeight visible its height: %d", java.lang.Integer.valueOf(f17));
                if (imagePreviewUI.f138581f.getVisibility() == 0) {
                    i17 = imagePreviewUI.f138581f.getHeight();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "mPreviewRecyclerView visible its height: %d", java.lang.Integer.valueOf(i17));
                }
                i17 += f17;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onGetLocationCallback >> heightFromCallback: %d", java.lang.Integer.valueOf(i17));
        return i17;
    }
}
