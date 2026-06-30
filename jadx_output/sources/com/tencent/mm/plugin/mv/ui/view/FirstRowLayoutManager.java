package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes8.dex */
public class FirstRowLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        com.tencent.mm.plugin.mv.ui.view.l lVar = new com.tencent.mm.plugin.mv.ui.view.l(recyclerView.getContext());
        lVar.f12049a = i17;
        startSmoothScroll(lVar);
    }
}
