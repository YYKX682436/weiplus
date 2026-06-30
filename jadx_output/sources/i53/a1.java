package i53;

/* loaded from: classes3.dex */
public class a1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f288495d = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 3);

    public a1(com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView) {
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) recyclerView.getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view.getLayoutParams();
        int i17 = gridLayoutManager.f11861w;
        int u07 = recyclerView.u0(view);
        int i18 = layoutParams.f11865h;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLocalMediaView", "getItemOffsets, spanSize = %d, spanCount = %d, index = %d", java.lang.Integer.valueOf(layoutParams.f11866i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = this.f288495d;
        if (u07 < i17) {
            if (i18 == 0) {
                rect.set(0, 0, 0, 0);
                return;
            } else {
                rect.set(i19, 0, 0, 0);
                return;
            }
        }
        if (i18 == 0) {
            rect.set(0, i19, 0, 0);
        } else {
            rect.set(i19, i19, 0, 0);
        }
    }
}
