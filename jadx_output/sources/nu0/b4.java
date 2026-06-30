package nu0;

/* loaded from: classes5.dex */
public final class b4 extends nu0.e implements yt0.c {
    public android.widget.FrameLayout A;
    public android.widget.FrameLayout B;
    public com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar C;
    public android.view.ViewGroup D;
    public androidx.recyclerview.widget.RecyclerView E;
    public android.view.View F;
    public com.tencent.mm.ui.widget.imageview.WeImageView G;
    public android.widget.TextView H;
    public androidx.recyclerview.widget.RecyclerView I;

    /* renamed from: J, reason: collision with root package name */
    public ju0.d f339877J;
    public final ju0.b K;
    public float L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public com.tencent.mm.ui.widget.dialog.u3 S;
    public final hx0.e T;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;
    public final jz5.g X;
    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m Y;
    public final xt0.b Z;

    /* renamed from: o, reason: collision with root package name */
    public volatile nu0.c1 f339878o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f339879p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f339880p0;

    /* renamed from: q, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f339881q;

    /* renamed from: r, reason: collision with root package name */
    public final nu0.w2 f339882r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f339883s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f339884t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f339885u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig f339886v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f339887w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f339888x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.lang.Runnable f339889x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.ref.WeakReference f339890y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.FrameLayout f339891z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339878o = nu0.c1.f339894d;
        this.f339879p = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.J(1).plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f339882r = new nu0.w2(this);
        this.f339883s = jz5.h.b(new nu0.s1(this));
        this.f339884t = jz5.h.b(new nu0.j1(this));
        this.f339885u = jz5.h.b(nu0.v1.f340115d);
        this.f339887w = new java.util.ArrayList();
        this.K = new ju0.b();
        this.L = 0.5625f;
        this.M = jz5.h.b(new nu0.k3(this));
        this.N = jz5.h.b(new nu0.y3(this));
        this.P = jz5.h.b(new nu0.t3(this));
        this.Q = jz5.h.b(new nu0.x2(this, activity));
        this.R = jz5.h.b(new nu0.p2(this));
        this.T = new hx0.e(getContext(), new nu0.r1(this));
        this.U = jz5.h.b(new nu0.z2(this));
        this.V = jz5.h.b(new nu0.o2(activity));
        this.W = jz5.h.b(new nu0.e3(this));
        this.X = jz5.h.b(new nu0.y2(this));
        this.Y = new nu0.k1(this);
        this.Z = new xt0.b();
        this.f339889x0 = new nu0.o3(this);
    }

    public static final java.lang.Object W6(nu0.b4 b4Var, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, kotlin.coroutines.Continuation continuation) {
        b4Var.getClass();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new nu0.f1(b4Var, audioCacheInfo, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(2:25|(2:27|(2:29|30)))(1:31))|12|13|(1:15)|16|17))|34|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r4 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X6(nu0.b4 r4, kotlinx.coroutines.r2 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof nu0.h1
            if (r0 == 0) goto L16
            r0 = r7
            nu0.h1 r0 = (nu0.h1) r0
            int r1 = r0.f339952h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f339952h = r1
            goto L1b
        L16:
            nu0.h1 r0 = new nu0.h1
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f339950f
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f339952h
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r5 = r0.f339949e
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            java.lang.Object r6 = r0.f339948d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L54
            boolean r4 = r5.a()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L55
            r0.f339948d = r6     // Catch: java.lang.Throwable -> L5a
            r0.f339949e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f339952h = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = kotlinx.coroutines.v2.d(r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != r7) goto L55
            goto L8a
        L54:
            r5 = 0
        L55:
            java.lang.Object r4 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m521constructorimpl(r4)
        L65:
            java.lang.Throwable r4 = kotlin.Result.m524exceptionOrNullimpl(r4)
            if (r4 == 0) goto L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " cancelAndJoinSafely error: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "ImageComp.MainComposingUIC"
            com.tencent.mars.xlog.Log.e(r5, r4)
        L88:
            jz5.f0 r7 = jz5.f0.f302826a
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.X6(nu0.b4, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:10:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y6(nu0.b4 r10, kotlin.coroutines.Continuation r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof nu0.i1
            if (r0 == 0) goto L16
            r0 = r11
            nu0.i1 r0 = (nu0.i1) r0
            int r1 = r0.f339967m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f339967m = r1
            goto L1b
        L16:
            nu0.i1 r0 = new nu0.i1
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f339965h
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f339967m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            int r10 = r0.f339964g
            java.lang.Object r2 = r0.f339963f
            zu0.a r2 = (zu0.a) r2
            java.lang.Object r5 = r0.f339962e
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f339961d
            nu0.b4 r6 = (nu0.b4) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L7a
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.ArrayList r11 = r10.f339887w
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L53
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L53
            r11 = r10
            r10 = r3
            goto La9
        L53:
            java.util.Iterator r11 = r11.iterator()
            r5 = r11
            r11 = r10
            r10 = r3
        L5a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r5.next()
            zu0.a r2 = (zu0.a) r2
            r0.f339961d = r11
            r0.f339962e = r5
            r0.f339963f = r2
            r0.f339964g = r10
            r0.f339967m = r4
            java.lang.Object r6 = zu0.g.e(r2, r0)
            if (r6 != r1) goto L77
            goto Lbd
        L77:
            r9 = r6
            r6 = r11
            r11 = r9
        L7a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkIsRealShoot: "
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "ImageComp.MainComposingUIC"
            com.tencent.mars.xlog.Log.i(r7, r2)
            if (r11 == 0) goto La7
            int r10 = r10 + 1
            if (r10 < 0) goto La2
            goto La7
        La2:
            kz5.c0.o()
            r10 = 0
            throw r10
        La7:
            r11 = r6
            goto L5a
        La9:
            float r10 = (float) r10
            java.util.ArrayList r11 = r11.f339887w
            int r11 = r11.size()
            float r11 = (float) r11
            float r10 = r10 / r11
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto Lb9
            r3 = r4
        Lb9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.Y6(nu0.b4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(nu0.b4 r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof nu0.t1
            if (r0 == 0) goto L16
            r0 = r14
            nu0.t1 r0 = (nu0.t1) r0
            int r1 = r0.f340099g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f340099g = r1
            goto L1b
        L16:
            nu0.t1 r0 = new nu0.t1
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.f340097e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f340099g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.throwOnFailure(r14)
            goto L9d
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            java.lang.Object r12 = r0.f340096d
            nu0.b4 r12 = (nu0.b4) r12
            kotlin.ResultKt.throwOnFailure(r14)
            goto L89
        L3e:
            kotlin.ResultKt.throwOnFailure(r14)
            com.tencent.mm.vfs.r6 r14 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r13 = com.tencent.mm.vfs.z7.a(r13)
            r14.<init>(r13)
            boolean r13 = r14.m()
            if (r13 == 0) goto L53
            r14.l()
        L53:
            hx0.e r13 = r12.T
            jx0.k r13 = r13.f285615b
            boolean r14 = r13.isShowing()
            if (r14 == 0) goto L60
            r13.dismiss()
        L60:
            r13 = 0
            int[] r13 = new int[r13]
            nu0.m3 r14 = new nu0.m3
            r2 = 2131771348(0x7f103fd4, float:1.9174025E38)
            r14.<init>(r12, r2, r13, r3)
            kotlinx.coroutines.y0 r6 = r12.getMainScope()
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r7 = kotlinx.coroutines.internal.b0.f310484a
            r8 = 0
            nu0.l2 r9 = new nu0.l2
            r9.<init>(r14, r3)
            r10 = 2
            r11 = 0
            kotlinx.coroutines.l.d(r6, r7, r8, r9, r10, r11)
            r0.f340096d = r12
            r0.f340099g = r5
            java.lang.Object r13 = r12.y7(r0)
            if (r13 != r1) goto L89
            goto L9f
        L89:
            kotlinx.coroutines.p0 r13 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r13 = kotlinx.coroutines.internal.b0.f310484a
            nu0.u1 r14 = new nu0.u1
            r14.<init>(r12, r3)
            r0.f340096d = r3
            r0.f340099g = r4
            java.lang.Object r12 = kotlinx.coroutines.l.g(r13, r14, r0)
            if (r12 != r1) goto L9d
            goto L9f
        L9d:
            jz5.f0 r1 = jz5.f0.f302826a
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.Z6(nu0.b4, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void a7(nu0.b4 b4Var) {
        b4Var.getClass();
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[hideContentImageView]");
        androidx.recyclerview.widget.RecyclerView k76 = b4Var.k7();
        android.view.ViewGroup.LayoutParams layoutParams = k76.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        k76.setLayoutParams(layoutParams2);
        android.view.ViewGroup m76 = b4Var.m7();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m76, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m76, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "hideContentImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "hideContentImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(m76, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(2:25|(2:27|(2:29|30)))(1:31))|12|13|(1:15)|16|17))|34|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r5 = kotlin.Result.INSTANCE;
        r4 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(nu0.b4 r4, kotlinx.coroutines.r2 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof nu0.j2
            if (r0 == 0) goto L16
            r0 = r7
            nu0.j2 r0 = (nu0.j2) r0
            int r1 = r0.f339988h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f339988h = r1
            goto L1b
        L16:
            nu0.j2 r0 = new nu0.j2
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f339986f
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f339988h
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r5 = r0.f339985e
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            java.lang.Object r6 = r0.f339984d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r4)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L54
            boolean r4 = r5.a()     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L55
            r0.f339984d = r6     // Catch: java.lang.Throwable -> L5a
            r0.f339985e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f339988h = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r5.C(r0)     // Catch: java.lang.Throwable -> L5a
            if (r4 != r7) goto L55
            goto L8a
        L54:
            r5 = 0
        L55:
            java.lang.Object r4 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m521constructorimpl(r4)
        L65:
            java.lang.Throwable r4 = kotlin.Result.m524exceptionOrNullimpl(r4)
            if (r4 == 0) goto L88
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = " joinSafely error: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "ImageComp.MainComposingUIC"
            com.tencent.mars.xlog.Log.e(r5, r4)
        L88:
            jz5.f0 r7 = jz5.f0.f302826a
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.b7(nu0.b4, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:17:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c7(nu0.b4 r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.c7(nu0.b4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void d7(nu0.b4 b4Var, int i17) {
        b4Var.getClass();
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[scrollToPosition] position:" + i17);
        androidx.recyclerview.widget.RecyclerView k76 = b4Var.k7();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(k76, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        k76.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(k76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    public static final void e7(nu0.b4 b4Var) {
        b4Var.getClass();
        b4Var.z7(nu0.c1.f339897g);
        b4Var.f339881q = kotlinx.coroutines.l.d(b4Var.getLifecycleScope(), null, null, new nu0.r3(b4Var, null), 3, null);
    }

    public static final java.lang.Object f7(nu0.b4 b4Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[terminalSync] state:" + b4Var.f339878o);
        java.lang.Object C = ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(b4Var.f339879p, null, null, new nu0.x3(b4Var, z18, z17, null), 3, null)).C(continuation);
        return C == pz5.a.f359186d ? C : jz5.f0.f302826a;
    }

    @Override // yt0.c
    public void A2() {
        android.os.Bundle bundle;
        i7().setDoneBtnEnabled(false);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = o7().f69348m;
        java.lang.String string = (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null) ? null : bundle.getString("output_dir");
        h0Var.f310123d = string;
        java.lang.String str = string;
        if (str == null || str.length() == 0) {
            return;
        }
        h0Var.f310123d = ((java.lang.String) h0Var.f310123d) + "image_" + java.lang.System.currentTimeMillis();
        kotlinx.coroutines.l.d(this.f339879p, null, null, new nu0.v2(this, h0Var, null), 3, null);
    }

    @Override // yt0.c
    public boolean A4() {
        return (((s7().getScaleY() > 1.0f ? 1 : (s7().getScaleY() == 1.0f ? 0 : -1)) == 0) ^ true) || (((s7().getTranslationY() > 0.0f ? 1 : (s7().getTranslationY() == 0.0f ? 0 : -1)) == 0) ^ true);
    }

    @Override // yt0.c
    public java.lang.Object A6(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new nu0.n3(this, str, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final void A7(java.lang.String str, int i17, yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[switchScene] from:" + str + " position:" + i17);
        ju0.b bVar = this.K;
        zu0.a aVar2 = ((ku0.a) bVar.x(i17)).f312060a;
        int i18 = bVar.f301680g;
        D7(i17);
        C7(aVar2, new nu0.v3(this, i17, aVar, i18));
    }

    public final void B7(java.lang.String str) {
        int dimensionPixelOffset = j65.q.a(getContext()).getDimensionPixelOffset(com.tencent.mm.R.dimen.agp);
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar i76 = i7();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(i76);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = (a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(i76.getContext())) - j65.q.a(i76.getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd);
        if (c17 < 0) {
            c17 = 0;
        }
        int i17 = c17 + dimensionPixelOffset;
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar i77 = i7();
        android.view.ViewGroup.LayoutParams layoutParams = i77.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i17;
        i77.setLayoutParams(layoutParams2);
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[updateBottomBarHeight] source:" + str + " bottomToolBarHeight:" + i17 + " defaultHeight:" + dimensionPixelOffset);
    }

    @Override // yt0.c
    public void C6() {
        this.f339880p0 = true;
    }

    public final void C7(zu0.a aVar, yz5.a aVar2) {
        int i17;
        float width = t7().getWidth();
        float height = t7().getHeight();
        kotlin.jvm.internal.o.g(aVar, "<this>");
        int i18 = aVar.f475662b;
        float f17 = (i18 <= 0 || (i17 = aVar.f475663c) <= 0) ? 0.5625f : (i18 * 1.0f) / i17;
        this.L = f17;
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[updateRenderSize] ratio:" + f17);
        by0.b.b(r7(), f17, width, height);
        by0.b.b(s7(), f17, width, height);
        by0.b.b(m7(), f17, width, height);
        m7().post(new nu0.a4(aVar2));
    }

    public final void D7(int i17) {
        ju0.b bVar = this.K;
        if (i17 == bVar.f301680g) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[updateSelectedPosition] position:" + i17);
        bVar.f301680g = i17;
        bVar.notifyDataSetChanged();
    }

    @Override // yt0.c
    public java.lang.Object E4(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new nu0.l1(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    @Override // yt0.c
    public android.util.SizeF J1() {
        return new android.util.SizeF(m7().getWidth(), m7().getHeight());
    }

    @Override // yt0.c
    public void N0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k panelUIC, java.util.Map map, boolean z17, zw0.b entrance) {
        kotlin.jvm.internal.o.g(panelUIC, "panelUIC");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        if (panelUIC.X6()) {
            return;
        }
        if (z17) {
            nu0.b1 b1Var = (nu0.b1) ((jz5.n) this.f339917n).getValue();
            b1Var.getClass();
            if (b1Var.q()) {
                if (entrance == zw0.b.f476552f) {
                    b1Var.l7();
                } else {
                    b1Var.U6(false);
                }
            }
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m mVar = z17 ? this.Y : null;
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[openPanel] ".concat(panelUIC.getClass().getSimpleName()));
        nv0.e.a((nv0.e) ((jz5.n) this.f339884t).getValue(), panelUIC, map, new zw0.e(entrance, zw0.d.f476561f), mVar, null, false, 48, null);
    }

    @Override // yt0.c
    public java.util.List N5() {
        return this.f339887w;
    }

    @Override // yt0.c
    public void Z2(boolean z17) {
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "reportExitMovieComposing");
        if (o7().a()) {
            yt0.c.V(this, "MCToSC", "MJShootComposing", null, 0, 12, null);
        }
        w7();
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e.fh((w40.e) c17, "andr_MJ_Edit_Video_Cancel", null, 2, null);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new nu0.m1(this, z17, null), 3, null);
    }

    @Override // yt0.c
    public yw0.n f2() {
        return (yw0.n) ((jz5.n) this.W).getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|89|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f6, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f7, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008e, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x008f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea A[Catch: all -> 0x008e, Exception -> 0x00f6, LOOP:0: B:46:0x00e4->B:48:0x00ea, LOOP_END, TryCatch #0 {Exception -> 0x00f6, blocks: (B:30:0x0063, B:31:0x0116, B:37:0x006c, B:38:0x010a, B:45:0x00d5, B:46:0x00e4, B:48:0x00ea, B:50:0x00f8, B:67:0x008a, B:68:0x00b3), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, nu0.b4] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v6, types: [nu0.e, java.lang.Object, nu0.b4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g7(kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.g7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yt0.c
    public boolean h2() {
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = U6().f340075r;
        if (mJImageSession == null || (imageScenes = mJImageSession.getImageScenes()) == null) {
            return false;
        }
        for (com.tencent.maas.imagestudio.MJImageScene mJImageScene : imageScenes) {
            if (mJImageScene.isModified()) {
                return true;
            }
        }
        return false;
    }

    public final androidx.recyclerview.widget.RecyclerView h7() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.E;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("bottomImageRv");
        throw null;
    }

    public final com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar i7() {
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar composingBottomToolBar = this.C;
        if (composingBottomToolBar != null) {
            return composingBottomToolBar;
        }
        kotlin.jvm.internal.o.o("bottomToolBar");
        throw null;
    }

    @Override // yt0.c
    public void j() {
        nv0.e.c((nv0.e) ((jz5.n) this.f339884t).getValue(), false, 1, null);
    }

    public final androidx.recyclerview.widget.RecyclerView k7() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.I;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("contentImageRv");
        throw null;
    }

    @Override // yt0.c
    public com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig l2() {
        return o7();
    }

    public final android.view.View l7() {
        android.view.View view = this.F;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("deleteAreaView");
        throw null;
    }

    public final android.view.ViewGroup m7() {
        android.view.ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("imageContainer");
        throw null;
    }

    public final int n7() {
        return ((java.lang.Number) ((jz5.n) this.f339885u).getValue()).intValue();
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig o7() {
        com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig movieComposingConfig = this.f339886v;
        if (movieComposingConfig != null) {
            return movieComposingConfig;
        }
        kotlin.jvm.internal.o.o("movieComposingConfig");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList arrayList;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 100 && i18 == -1) {
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("key_select_mix_media_list") : null;
            if (parcelableArrayListExtra != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(parcelableArrayListExtra, 10));
                for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : parcelableArrayListExtra) {
                    pp0.u0 u0Var = pp0.u0.f357387e;
                    java.lang.String str = galleryItem$MediaItem.f138430e;
                    kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
                    java.lang.String o17 = galleryItem$MediaItem.o();
                    kotlin.jvm.internal.o.f(o17, "getThumbPath(...)");
                    arrayList.add(new com.tencent.mm.maas_api.MJMediaItem(u0Var, str, o17, 0, 0, 0, 56, null));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new nu0.e1(arrayList, this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (V6().onBackPressed() || nv0.e.c((nv0.e) ((jz5.n) this.f339884t).getValue(), false, 1, null)) {
            return true;
        }
        O4(getContext());
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (P6().f243362d) {
            return;
        }
        kotlinx.coroutines.l.d(this.f339879p, null, null, new nu0.w1(this, null), 3, null);
    }

    @Override // du0.g, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        if (!fp.i.a(52428800L) || !fp.i.c(52428800L)) {
            by0.t.a(getContext(), com.tencent.mm.R.string.cm6, new int[0]);
            getActivity().setResult(0);
            getActivity().finish();
            return;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig a17 = com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig.CREATOR.a(getIntent());
        if (a17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.e("ImageComp.MainComposingUIC", "InitData error, movieComposingConfig is null");
            getActivity().setResult(0);
            getActivity().finish();
        } else {
            this.f339886v = a17;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData: shootTemplateCoverStartTime: ");
            java.lang.Object value = ((jz5.n) a17.f69352q).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            sb6.append((com.tencent.maas.model.time.MJTime) value);
            com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", sb6.toString());
            R6().R6(a17.f69351p, a17.f69343e.size(), false);
            kotlinx.coroutines.l.d(this.f339879p, null, null, new nu0.w1(this, null), 3, null);
            yy0.m7 m7Var = (yy0.m7) R6().O6();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.n1(m7Var, null), 3, null);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q8c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f339888x = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.uhc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.q8p);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f339891z = (android.widget.FrameLayout) findViewById3;
        t7().addView(p7(), t7().getChildCount());
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.s3j);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.A = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.s3i);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.B = (android.widget.FrameLayout) findViewById5;
        android.view.View findViewById6 = t7().findViewById(com.tencent.mm.R.id.q8q);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.D = (android.view.ViewGroup) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.uhb);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.E = (androidx.recyclerview.widget.RecyclerView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.szr);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.I = (androidx.recyclerview.widget.RecyclerView) findViewById8;
        p7().setOnClickListener(new nu0.h2(this));
        android.view.View view = this.f339888x;
        if (view == null) {
            kotlin.jvm.internal.o.o("mcBackBtn");
            throw null;
        }
        view.setOnClickListener(new nu0.i2(this));
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.q8m);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.C = (com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar) findViewById9;
        i7().setDoneBtnEnabled(false);
        i7().setOnClick(new nu0.a2(this));
        B7(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        i7().c(dy0.a.f244540e);
        i7().c(dy0.a.f244542g);
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar i76 = i7();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = i76.f69675e;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("textIv");
            throw null;
        }
        weImageView.setImageResource(com.tencent.mm.R.raw.text_filled);
        weImageView.setIconColor(b3.l.getColor(i76.getContext(), com.tencent.mm.R.color.aby));
        weImageView.setEnableColorFilter(true);
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar i77 = i7();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = i77.f69678h;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("stickerIv");
            throw null;
        }
        weImageView2.setImageResource(com.tencent.mm.R.raw.sticker_filled);
        weImageView2.setIconColor(b3.l.getColor(i77.getContext(), com.tencent.mm.R.color.aby));
        weImageView2.setEnableColorFilter(true);
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar i78 = i7();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(i78)) {
            B7("onAttach");
        } else {
            i78.addOnAttachStateChangeListener(new nu0.z1(i78, this));
        }
        if (o7().f69349n) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) contentView.findViewById(com.tencent.mm.R.id.q8o);
            android.view.View findViewById10 = viewGroup.findViewById(com.tencent.mm.R.id.q8n);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById10, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "doOnlyPreviewCheck", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById10.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById10, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "doOnlyPreviewCheck", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById11 = viewGroup.findViewById(com.tencent.mm.R.id.q8m);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById11, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "doOnlyPreviewCheck", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById11.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById11, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "doOnlyPreviewCheck", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById12 = viewGroup.findViewById(com.tencent.mm.R.id.f487452qr1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById12, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "doOnlyPreviewCheck", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById12.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById12, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "doOnlyPreviewCheck", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView p7() {
        return (com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView) ((jz5.n) this.Q).getValue();
    }

    public final nu0.i q7() {
        return (nu0.i) this.M.getValue();
    }

    public final android.widget.FrameLayout r7() {
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("scalableReferenceContainer");
        throw null;
    }

    public final android.widget.FrameLayout s7() {
        android.widget.FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("scalableVideoContainer");
        throw null;
    }

    public final android.widget.FrameLayout t7() {
        android.widget.FrameLayout frameLayout = this.f339891z;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("topAreaContainer");
        throw null;
    }

    public final java.lang.Object u7(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new nu0.b3(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    @Override // yt0.c
    public nv0.d v6() {
        return (nv0.d) ((jz5.n) this.f339883s).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v7(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nu0.c3
            if (r0 == 0) goto L13
            r0 = r6
            nu0.c3 r0 = (nu0.c3) r0
            int r1 = r0.f339906f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f339906f = r1
            goto L18
        L13:
            nu0.c3 r0 = new nu0.c3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f339904d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f339906f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a
            nu0.d3 r2 = new nu0.d3
            r4 = 0
            r2.<init>(r5, r4)
            r0.f339906f = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b4.v7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w7() {
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        int size = this.f339887w.size();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("images_cnt", size);
            jSONObject.put("images_live_cnt", 0);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject == null) {
                return;
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderFeedReportObject.setImageInfo(r26.i0.t(jSONObject2, ",", ";", false));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderPostReportLogic", e17.getMessage());
        }
    }

    public final void x7() {
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "reportPreparePlaybackSessionFinished");
        i95.m c17 = i95.n0.c(pp0.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String Ni = ((yy0.m7) ((pp0.l0) c17)).Ni();
        L("SCRecordToMC", "MJShootComposing", Ni, 0);
        L("SCAssetGenerateToMC", "MJShootComposing", Ni, 0);
        L("MCImport", "MJShootComposing", "", 0);
    }

    public final java.lang.Object y7(kotlin.coroutines.Continuation continuation) {
        boolean z17 = U6().f340075r == null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "restartImageSession: ");
            java.lang.Object g76 = g7(continuation);
            if (g76 == pz5.a.f359186d) {
                return g76;
            }
        }
        return f0Var;
    }

    public final void z7(nu0.c1 c1Var) {
        if (this.f339878o == c1Var) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "state: " + this.f339878o + " -> " + c1Var);
        this.f339878o = c1Var;
        this.f339881q = null;
        kotlinx.coroutines.l.d(getMainScope(), null, null, new nu0.s3(this, null), 3, null);
    }
}
