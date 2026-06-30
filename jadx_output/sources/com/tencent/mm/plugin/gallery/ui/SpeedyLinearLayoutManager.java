package com.tencent.mm.plugin.gallery.ui;

/* loaded from: classes10.dex */
public class SpeedyLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final float f138638v;

    public SpeedyLinearLayoutManager(android.content.Context context) {
        super(context);
        this.f138638v = 50.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        e33.j6 j6Var = new e33.j6(this, recyclerView.getContext());
        j6Var.f12049a = i17;
        startSmoothScroll(j6Var);
    }

    public SpeedyLinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f138638v = 50.0f;
    }
}
