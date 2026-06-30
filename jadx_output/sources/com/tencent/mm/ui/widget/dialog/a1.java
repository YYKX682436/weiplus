package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class a1 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f211739n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211740o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(context);
        this.f211740o = k0Var;
        this.f211739n = recyclerView;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f211739n;
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !(recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) ? super.a(i17) : ((androidx.recyclerview.widget.LinearLayoutManager) this.f211740o.G1.getLayoutManager()).a(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 1.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int m() {
        return -1;
    }
}
