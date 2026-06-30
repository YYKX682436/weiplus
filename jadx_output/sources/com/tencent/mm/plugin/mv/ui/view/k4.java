package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public class k4 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager f151887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.plugin.mv.ui.view.SpeedyLinearLayoutManager speedyLinearLayoutManager, android.content.Context context) {
        super(context);
        this.f151887n = speedyLinearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return this.f151887n.a(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return this.f151887n.f151755v / displayMetrics.densityDpi;
    }
}
