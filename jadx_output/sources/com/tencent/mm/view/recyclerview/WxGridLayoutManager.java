package com.tencent.mm.view.recyclerview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/view/recyclerview/WxGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class WxGridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxGridLayoutManager", "meet a IOOBE in RecyclerView");
        }
    }
}
