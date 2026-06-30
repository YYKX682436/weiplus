package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class l0 extends com.tencent.mm.xcompat.recyclerview.widget.f0 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.m0 f214567p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.xcompat.recyclerview.widget.m0 m0Var, android.content.Context context) {
        super(context);
        this.f214567p = m0Var;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.f0, com.tencent.mm.xcompat.recyclerview.widget.t1
    public void b(android.view.View view, com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var, com.tencent.mm.xcompat.recyclerview.widget.r1 r1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.m0 m0Var = this.f214567p;
        int[] a17 = m0Var.a(m0Var.f214491a.getLayoutManager(), view);
        int i17 = a17[0];
        int i18 = a17[1];
        int ceil = (int) java.lang.Math.ceil(f(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18))) / 0.3356d);
        if (ceil > 0) {
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f214511i;
            r1Var.f214624a = i17;
            r1Var.f214625b = i18;
            r1Var.f214626c = ceil;
            r1Var.f214628e = decelerateInterpolator;
            r1Var.f214629f = true;
        }
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.f0
    public float e(android.util.DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.f0
    public int f(int i17) {
        return java.lang.Math.min(100, super.f(i17));
    }
}
