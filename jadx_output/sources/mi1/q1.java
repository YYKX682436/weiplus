package mi1;

/* loaded from: classes7.dex */
public final class q1 implements mi1.i2 {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f326662h;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f326663d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f326664e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.h2 f326665f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326666g;

    static {
        new mi1.c1(null);
        f326662h = jz5.h.b(mi1.b1.f326518d);
    }

    public q1(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f326663d = runtime;
        this.f326664e = jz5.h.b(new mi1.p1(this));
        this.f326665f = new mi1.h2(0, null, 2, null);
        this.f326666g = jz5.h.b(mi1.o1.f326654d);
    }

    public static final void b(mi1.q1 q1Var) {
        q1Var.getClass();
        new mi1.k2().x(q1Var.f326663d.C0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (r10 == pz5.a.f359186d) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        if (r10 == pz5.a.f359186d) goto L60;
     */
    @Override // mi1.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(mi1.h2 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.q1.a(mi1.h2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z17, boolean z18) {
        int i17;
        if ((this.f326665f.f326567a > 0) == true) {
            android.animation.AnimatorSet animatorSet = null;
            android.animation.ValueAnimator valueAnimator = null;
            if (!z18) {
                android.animation.Animator g17 = g(true, null);
                if (g17 != null) {
                    d(g17);
                    g17.start();
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = this.f326663d;
            kotlin.jvm.internal.o.g(runtime, "runtime");
            android.view.View a17 = runtime.f74821z.a(com.tencent.mm.R.id.f482514db2);
            android.widget.LinearLayout linearLayout = a17 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) a17 : null;
            if (linearLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int width = runtime.f74821z.d().getWidth() - com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                if (linearLayout.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
                } else {
                    i17 = width;
                }
                if (i17 != width) {
                    valueAnimator = android.animation.ValueAnimator.ofInt(0, width);
                    valueAnimator.addUpdateListener(new mi1.c3(linearLayout));
                }
                if (valueAnimator != null) {
                    arrayList.add(valueAnimator);
                }
                if (!z17) {
                    android.widget.ImageView buttonImage = runtime.f74821z.d().getButtonImage();
                    kotlin.jvm.internal.o.f(buttonImage, "getButtonImage(...)");
                    arrayList.add(mi1.e3.a(buttonImage, 300L));
                }
                animatorSet = new android.animation.AnimatorSet();
                animatorSet.playSequentially(kz5.n0.S0(arrayList));
            }
            if (animatorSet != null) {
                d(animatorSet);
                animatorSet.start();
            }
        }
    }

    public final android.animation.Animator d(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f326663d;
        mi1.j1 j1Var = new mi1.j1(animator);
        kotlin.jvm.internal.o.g(appBrandRuntime, "<this>");
        java.lang.String str = appBrandRuntime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        j1Var.invoke(mVar);
        appBrandRuntime.N.a(mVar);
        return animator;
    }

    public final mi1.r1 e(mi1.h2 state) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(state, "state");
        mi1.j0 j0Var = (mi1.j0) state.f326568b;
        if (j0Var == null || (obj = j0Var.f326591g) == null || !(obj instanceof mi1.r1)) {
            return null;
        }
        return (mi1.r1) obj;
    }

    public final mi1.h2 f() {
        return (mi1.h2) ((jz5.n) this.f326666g).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator g(boolean r6, mi1.r1 r7) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r5.f326663d
            java.lang.String r1 = "runtime"
            kotlin.jvm.internal.o.g(r0, r1)
            mi1.z0 r1 = mi1.z0.f326739e
            mi1.z0 r2 = mi1.a1.d(r0)
            r3 = 0
            if (r1 == r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = r3
        L13:
            r2 = 0
            if (r1 == 0) goto L19
            if (r7 == 0) goto L19
            return r2
        L19:
            mi1.v r7 = r0.f74821z
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton r7 = r7.d()
            android.widget.ImageView r7 = r7.getButtonImage()
            r1 = 0
            r7.setAlpha(r1)
            mi1.v r7 = r0.f74821z
            r1 = 2131296558(0x7f09012e, float:1.8211036E38)
            android.view.View r7 = r7.a(r1)
            boolean r1 = r7 instanceof android.widget.LinearLayout
            if (r1 == 0) goto L37
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            goto L38
        L37:
            r7 = r2
        L38:
            if (r7 != 0) goto L3b
            return r2
        L3b:
            mi1.v r0 = r0.f74821z
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton r0 = r0.d()
            int r0 = r0.getWidth()
            android.content.res.Resources r1 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r4 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r1 = r1.getDimensionPixelSize(r4)
            int r0 = r0 - r1
            if (r6 == 0) goto L6e
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            boolean r6 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L69
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.o.e(r6, r1)
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = r6.getMarginEnd()
            goto L6a
        L69:
            r6 = r3
        L6a:
            if (r6 != 0) goto L6e
            r6 = r2
            goto L7e
        L6e:
            int[] r6 = new int[]{r0, r3}
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r6)
            mi1.c3 r0 = new mi1.c3
            r0.<init>(r7)
            r6.addUpdateListener(r0)
        L7e:
            if (r6 == 0) goto L89
            mi1.n1 r7 = new mi1.n1
            r7.<init>(r5)
            r6.addListener(r7)
            r2 = r6
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.q1.g(boolean, mi1.r1):android.animation.Animator");
    }

    @Override // mi1.i2
    /* renamed from: getCurrentState */
    public mi1.h2 getF91045m() {
        return this.f326665f;
    }
}
