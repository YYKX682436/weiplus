package i53;

/* loaded from: classes3.dex */
public class l0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f288645d = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) recyclerView.getLayoutManager();
        recyclerView.u0(view);
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) view.getLayoutParams();
        int i17 = gridLayoutManager.f11861w;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameHaowanRecycleView", "getItemOffsets, spanSize = %d, spanCount = %d, index = %d", java.lang.Integer.valueOf(layoutParams.f11866i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(layoutParams.f11865h));
        if (layoutParams.f11866i == i17) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int i18 = layoutParams.f11865h;
        int i19 = this.f288645d;
        if (i18 == 0) {
            rect.set(i19 * 2, i19 / 2, i19 / 2, i19 / 2);
        } else {
            rect.set(i19 / 2, i19 / 2, i19 * 2, i19 / 2);
        }
    }
}
