package com.tencent.mm.view.recyclerview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/view/recyclerview/ObservableGridLayoutManager;", "Lcom/tencent/mm/view/recyclerview/WxGridLayoutManager;", "in5/t", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class ObservableGridLayoutManager extends com.tencent.mm.view.recyclerview.WxGridLayoutManager {
    public in5.t D;

    @Override // com.tencent.mm.view.recyclerview.WxGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        in5.t tVar = this.D;
        if (tVar != null) {
            i33.y0 y0Var = ((i33.v0) tVar).f288281a;
            i33.t0 t0Var = (i33.t0) ((jz5.n) y0Var.f288292h).getValue();
            if (t0Var != null ? t0Var.f288248g : false) {
                y0Var.W6();
                androidx.recyclerview.widget.f2 adapter = y0Var.T6().getAdapter();
                e33.b0 b0Var = adapter instanceof e33.b0 ? (e33.b0) adapter : null;
                if (b0Var != null) {
                    b0Var.f247146y = true;
                }
            }
        }
        super.onLayoutChildren(z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        in5.t tVar = this.D;
        if (tVar != null) {
            i33.y0 y0Var = ((i33.v0) tVar).f288281a;
            java.lang.String str = y0Var.f288290f;
            y0Var.X6(0L);
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        return super.scrollVerticallyBy(i17, z2Var, h3Var);
    }
}
