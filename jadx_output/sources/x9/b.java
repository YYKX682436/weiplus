package x9;

/* loaded from: classes14.dex */
public class b extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public int f452604a;

    /* renamed from: b, reason: collision with root package name */
    public int f452605b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f452606c;

    public b(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
        this.f452606c = swipeDismissBehavior;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View view, int i17, int i18) {
        int width;
        int width2;
        int width3;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = n3.v0.d(view) == 1;
        int i19 = this.f452606c.f44357f;
        if (i19 == 0) {
            if (z17) {
                width = this.f452604a - view.getWidth();
                width2 = this.f452604a;
            } else {
                width = this.f452604a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i19 != 1) {
            width = this.f452604a - view.getWidth();
            width2 = view.getWidth() + this.f452604a;
        } else if (z17) {
            width = this.f452604a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f452604a - view.getWidth();
            width2 = this.f452604a;
        }
        return java.lang.Math.min(java.lang.Math.max(width, i17), width2);
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View view, int i17, int i18) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.k
    public int c(android.view.View view) {
        return view.getWidth();
    }

    @Override // androidx.customview.widget.k
    public void g(android.view.View view, int i17) {
        this.f452605b = i17;
        this.f452604a = view.getLeft();
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // androidx.customview.widget.k
    public void h(int i17) {
        this.f452606c.getClass();
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        float f17 = this.f452604a;
        float width = view.getWidth();
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.f452606c;
        float f18 = f17 + (width * swipeDismissBehavior.f44359h);
        float width2 = this.f452604a + (view.getWidth() * swipeDismissBehavior.f44360i);
        float f19 = i17;
        if (f19 <= f18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        if (f19 >= width2) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        float min = java.lang.Math.min(java.lang.Math.max(0.0f, 1.0f - ((f19 - f18) / (width2 - f18))), 1.0f);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Float.valueOf(min));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view, "com/google/android/material/behavior/SwipeDismissBehavior$1", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f452604a) >= java.lang.Math.round(r9.getWidth() * r3.f44358g)) goto L17;
     */
    @Override // androidx.customview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f452605b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f452606c
            r4 = 0
            if (r1 == 0) goto L3c
            java.util.WeakHashMap r5 = n3.l1.f334362a
            int r5 = n3.v0.d(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f44357f
            r7 = 2
            if (r6 != r7) goto L21
            goto L2c
        L21:
            if (r6 != 0) goto L30
            if (r5 == 0) goto L2a
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L2e
            goto L2c
        L2a:
            if (r1 <= 0) goto L2e
        L2c:
            r10 = r2
            goto L56
        L2e:
            r10 = r4
            goto L56
        L30:
            if (r6 != r2) goto L2e
            if (r5 == 0) goto L37
            if (r1 <= 0) goto L2e
            goto L3b
        L37:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L2e
        L3b:
            goto L2c
        L3c:
            int r10 = r9.getLeft()
            int r0 = r8.f452604a
            int r10 = r10 - r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r1 = r3.f44358g
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.abs(r10)
            if (r10 < r0) goto L2e
            goto L2c
        L56:
            if (r10 == 0) goto L64
            int r10 = r9.getLeft()
            int r0 = r8.f452604a
            if (r10 >= r0) goto L62
            int r0 = r0 - r11
            goto L67
        L62:
            int r0 = r0 + r11
            goto L67
        L64:
            int r0 = r8.f452604a
            r2 = r4
        L67:
            androidx.customview.widget.l r10 = r3.f44355d
            int r11 = r9.getTop()
            boolean r10 = r10.s(r0, r11)
            if (r10 == 0) goto L7e
            x9.c r10 = new x9.c
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = n3.l1.f334362a
            n3.u0.m(r9, r10)
            goto L83
        L7e:
            if (r2 == 0) goto L83
            r3.getClass()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.b.j(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View view, int i17) {
        return this.f452605b == -1 && this.f452606c.y(view);
    }
}
