package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public class SpeedyLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public float f151755v;

    public SpeedyLinearLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f151755v = 50.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        com.tencent.mm.plugin.mv.ui.view.k4 k4Var = new com.tencent.mm.plugin.mv.ui.view.k4(this, recyclerView.getContext());
        k4Var.f12049a = i17;
        startSmoothScroll(k4Var);
    }

    public SpeedyLinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f151755v = 50.0f;
    }
}
