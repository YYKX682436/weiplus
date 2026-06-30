package com.tencent.mm.plugin.luckymoney.scaledLayout;

/* loaded from: classes10.dex */
public class a extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f145748n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.scaledLayout.b f145749o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.luckymoney.scaledLayout.b bVar, android.content.Context context, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        super(context);
        this.f145749o = bVar;
        this.f145748n = layoutManager;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View view, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.e3 e3Var) {
        int[] c17 = this.f145749o.c(this.f145748n, view);
        int i17 = c17[0];
        int i18 = c17[1];
        int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
        if (k17 > 0) {
            e3Var.b(i17, i18, k17, this.f12176i);
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 50.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return java.lang.Math.min(50, super.l(i17));
    }
}
