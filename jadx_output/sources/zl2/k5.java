package zl2;

/* loaded from: classes.dex */
public final class k5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f473864d;

    public k5(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f473864d = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r8 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/utils/RecyclerViewExtKt$setupNestedScrollingFix$1"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r8)
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r7
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r8 = r9.getAction()
            androidx.recyclerview.widget.RecyclerView r9 = r7.f473864d
            r0 = 0
            if (r8 == 0) goto L45
            r1 = 1
            if (r8 == r1) goto L3b
            r2 = 2
            if (r8 == r2) goto L31
            r1 = 3
            if (r8 == r1) goto L3b
            goto L4e
        L31:
            android.view.ViewParent r8 = r9.getParent()
            if (r8 == 0) goto L4e
            r8.requestDisallowInterceptTouchEvent(r1)
            goto L4e
        L3b:
            android.view.ViewParent r8 = r9.getParent()
            if (r8 == 0) goto L4e
            r8.requestDisallowInterceptTouchEvent(r0)
            goto L4e
        L45:
            android.view.ViewParent r8 = r9.getParent()
            if (r8 == 0) goto L4e
            r8.requestDisallowInterceptTouchEvent(r0)
        L4e:
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/utils/RecyclerViewExtKt$setupNestedScrollingFix$1"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = 0
            r2 = r7
            yj0.a.i(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.k5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
