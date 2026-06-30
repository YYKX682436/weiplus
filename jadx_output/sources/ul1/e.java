package ul1;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f428570a;

    /* renamed from: b, reason: collision with root package name */
    public ul1.g f428571b;

    /* renamed from: c, reason: collision with root package name */
    public ul1.n f428572c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f428573d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public int f428574e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f428575f;

    public e(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f428570a = v5Var;
    }

    public final ul1.g a() {
        ul1.g gVar = this.f428571b;
        if (gVar != null && !gVar.f428580f) {
            return gVar;
        }
        this.f428571b = null;
        com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView = this.f428570a.getCustomViewContainer().f86767k;
        if (appBrandPageFullScreenView == null) {
            return null;
        }
        for (int i17 = 0; i17 < appBrandPageFullScreenView.getChildCount(); i17++) {
            android.view.View childAt = appBrandPageFullScreenView.getChildAt(i17);
            if (childAt instanceof ul1.g) {
                return (ul1.g) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            com.tencent.mm.plugin.appbrand.page.v5 r1 = r0.f428570a
            boolean r2 = r1.isRunning()
            com.tencent.mm.sdk.platformtools.n3 r3 = r0.f428573d
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L2d
            if (r19 == 0) goto L25
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r1.t3()
            if (r2 == 0) goto L25
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r1.t3()
            ul1.h r2 = ul1.h.a(r2, r5)
            if (r2 == 0) goto L25
            java.util.LinkedList r2 = r2.f428581d
            r2.remove(r1)
        L25:
            if (r19 == 0) goto L2a
            r3.removeCallbacksAndMessages(r4)
        L2a:
            r0.f428575f = r4
            return r5
        L2d:
            boolean r2 = com.tencent.mm.plugin.appbrand.utils.d5.a()
            if (r2 == 0) goto Lea
            ul1.g r2 = r0.f428571b
            if (r2 == 0) goto Lc9
            java.util.WeakHashMap r6 = n3.l1.f334362a
            boolean r6 = n3.x0.b(r2)
            if (r6 == 0) goto Lc9
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r7 = r5
        L45:
            int r8 = r2.getChildCount()
            if (r7 >= r8) goto L66
            android.view.View r8 = r2.getChildAt(r7)
            if (r8 == 0) goto L63
            r9 = 2131297542(0x7f090506, float:1.8213032E38)
            java.lang.Object r9 = r8.getTag(r9)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = java.util.Objects.equals(r9, r10)
            if (r9 == 0) goto L63
            r6.add(r8)
        L63:
            int r7 = r7 + 1
            goto L45
        L66:
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ 1
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lca
            java.lang.Object r8 = r6.next()
            android.view.View r8 = (android.view.View) r8
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.ThreadLocal r9 = zj0.c.f473285a
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.add(r9)
            java.util.Collections.reverse(r15)
            java.lang.Object[] r10 = r15.toArray()
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper"
            java.lang.String r12 = "hideToastViews"
            java.lang.String r13 = "(Z)Z"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r8
            r4 = r15
            r15 = r16
            r16 = r17
            yj0.a.d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r8.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper"
            java.lang.String r11 = "hideToastViews"
            java.lang.String r12 = "(Z)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            yj0.a.f(r9, r10, r11, r12, r13, r14, r15)
            r2.removeView(r8)
            r4 = 0
            goto L70
        Lc9:
            r7 = r5
        Lca:
            if (r19 == 0) goto Le1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r1.t3()
            if (r2 == 0) goto Le1
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r1.t3()
            ul1.h r2 = ul1.h.a(r2, r5)
            if (r2 == 0) goto Le1
            java.util.LinkedList r2 = r2.f428581d
            r2.remove(r1)
        Le1:
            r1 = 0
            if (r19 == 0) goto Le7
            r3.removeCallbacksAndMessages(r1)
        Le7:
            r0.f428575f = r1
            return r7
        Lea:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Should be called on main-thread"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ul1.e.b(boolean):boolean");
    }

    public final ul1.g c() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f428570a;
        android.view.ViewGroup m17 = v5Var.getCustomViewContainer().m();
        ul1.g a17 = a();
        if (a17 == null) {
            a17 = new ul1.g(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(v5Var.getContext()));
            a17.addOnAttachStateChangeListener(new ul1.f(this));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
            marginLayoutParams.topMargin = this.f428574e;
            m17.addView(a17, marginLayoutParams);
        }
        a17.bringToFront();
        this.f428571b = a17;
        return a17;
    }

    public void d(int i17) {
        this.f428574e = i17;
        ul1.g a17 = a();
        if (a17 == null || !(a17.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) a17.getLayoutParams();
        if (i17 != marginLayoutParams.topMargin) {
            marginLayoutParams.topMargin = i17;
            a17.requestLayout();
        }
    }

    public void e(android.view.View view, long j17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f428570a;
        if (!v5Var.isRunning() || v5Var.t3() == null) {
            return;
        }
        this.f428575f = view;
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            throw new java.lang.RuntimeException("Should be called on main-thread");
        }
        ul1.g c17 = c();
        al1.b r17 = v5Var.r1();
        if (r17 != null) {
            d(r17.getTop() + r17.getMeasuredHeight());
        }
        view.setTag(com.tencent.mm.R.id.a0l, java.lang.Boolean.TRUE);
        c17.addView(view);
        if (j17 < 0) {
            j17 = 0;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f428573d;
        n3Var.postDelayed(new ul1.i(view), j17);
        n3Var.postDelayed(new java.lang.Runnable() { // from class: ul1.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                ul1.e.this.f428575f = null;
            }
        }, j17);
        ul1.h a17 = ul1.h.a(v5Var.t3(), true);
        java.util.Objects.requireNonNull(a17);
        a17.f428581d.add(v5Var);
    }
}
