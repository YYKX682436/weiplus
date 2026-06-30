package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class l3 extends androidx.recyclerview.widget.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final float f124612d;

    /* renamed from: e, reason: collision with root package name */
    public float f124613e;

    /* renamed from: f, reason: collision with root package name */
    public float f124614f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124615g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f124616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124617i;

    public l3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124617i = s4Var;
        this.f124612d = ym5.x.a(s4Var.f124748b, -138.0f);
    }

    @Override // androidx.recyclerview.widget.d3, androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        android.view.View k07;
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124617i;
        androidx.recyclerview.widget.RecyclerView recyclerView = s4Var.f124759m;
        if (recyclerView == null || (k07 = recyclerView.k0(this.f124613e, this.f124614f)) == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = s4Var.f124759m;
        androidx.recyclerview.widget.k3 w07 = recyclerView2 != null ? recyclerView2.w0(k07) : null;
        if (w07 instanceof com.tencent.mm.plugin.finder.profile.widget.n3) {
            int actionMasked = e17.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f124615g && this.f124616h) {
                        e(e17.getX() - this.f124613e, (com.tencent.mm.plugin.finder.profile.widget.n3) w07);
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    return;
                }
            }
            com.tencent.mm.plugin.finder.profile.widget.n3 n3Var = (com.tencent.mm.plugin.finder.profile.widget.n3) w07;
            float min = java.lang.Math.min(e17.getX() - this.f124613e, 0.0f);
            float f17 = this.f124612d;
            float max = java.lang.Math.max(min, f17);
            if (!(max < f17 / ((float) 2))) {
                f17 = 0.0f;
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(max, f17);
            kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.profile.widget.j3(this, n3Var));
            ofFloat.start();
            this.f124613e = 0.0f;
            this.f124614f = 0.0f;
            this.f124615g = false;
            this.f124616h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3 != 3) goto L19;
     */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(androidx.recyclerview.widget.RecyclerView r3, android.view.MotionEvent r4) {
        /*
            r2 = this;
            java.lang.String r0 = "rv"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r3 = "e"
            kotlin.jvm.internal.o.g(r4, r3)
            int r3 = r4.getActionMasked()
            if (r3 == 0) goto L4c
            r0 = 1
            if (r3 == r0) goto L41
            r1 = 2
            if (r3 == r1) goto L1a
            r4 = 3
            if (r3 == r4) goto L41
            goto L58
        L1a:
            boolean r3 = r2.f124615g
            if (r3 != 0) goto L58
            r2.f124615g = r0
            float r3 = r4.getX()
            float r1 = r2.f124613e
            float r3 = r3 - r1
            float r3 = java.lang.Math.abs(r3)
            float r4 = r4.getY()
            float r1 = r2.f124614f
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3d
            r2.f124616h = r0
            goto L58
        L3d:
            r2.d()
            goto L58
        L41:
            r3 = 0
            r2.f124613e = r3
            r2.f124614f = r3
            r3 = 0
            r2.f124615g = r3
            r2.f124616h = r3
            goto L58
        L4c:
            float r3 = r4.getX()
            r2.f124613e = r3
            float r3 = r4.getY()
            r2.f124614f = r3
        L58:
            boolean r3 = r2.f124616h
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.widget.l3.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public final void d() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124617i.f124759m;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                androidx.recyclerview.widget.k3 w07 = recyclerView.w0(recyclerView.getChildAt(i17));
                if (w07 instanceof com.tencent.mm.plugin.finder.profile.widget.n3) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(((com.tencent.mm.plugin.finder.profile.widget.n3) w07).f124632g.getTranslationX(), 0.0f);
                    kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
                    ofFloat.setDuration(400L);
                    ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.profile.widget.k3(this, w07));
                    ofFloat.start();
                }
            }
        }
    }

    public final void e(float f17, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var) {
        n3Var.f124632g.setTranslationX(java.lang.Math.max(java.lang.Math.min(f17, 0.0f), this.f124612d));
    }
}
