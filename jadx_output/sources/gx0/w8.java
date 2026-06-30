package gx0;

/* loaded from: classes5.dex */
public final class w8 extends ou0.p implements yt0.c {
    public java.lang.ref.WeakReference A;
    public android.widget.FrameLayout B;
    public android.widget.FrameLayout C;
    public android.widget.FrameLayout D;
    public android.widget.FrameLayout E;
    public com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public android.view.ViewGroup I;

    /* renamed from: J, reason: collision with root package name */
    public final ou0.s f277112J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public com.tencent.maas.moviecomposing.c S;
    public volatile com.tencent.maas.moviecomposing.ExportSession T;
    public com.tencent.mm.ui.widget.dialog.u3 U;
    public final hx0.e V;
    public final jz5.g W;
    public final jz5.g X;
    public final jz5.g Y;
    public final jz5.g Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f277113l1;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m f277114p0;

    /* renamed from: r, reason: collision with root package name */
    public volatile gx0.y4 f277115r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f277116s;

    /* renamed from: t, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f277117t;

    /* renamed from: u, reason: collision with root package name */
    public final gx0.h7 f277118u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f277119v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f277120w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig f277121x;

    /* renamed from: x0, reason: collision with root package name */
    public final xt0.d f277122x0;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f277123y;

    /* renamed from: y0, reason: collision with root package name */
    public ou0.z f277124y0;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f277125z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277115r = gx0.y4.f277200d;
        this.f277116s = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.J(1).plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f277118u = new gx0.h7(this);
        this.f277119v = jz5.h.b(new gx0.w5(this));
        this.f277120w = jz5.h.b(new gx0.i5(this));
        this.f277123y = new java.util.ArrayList();
        this.f277112J = new ou0.s();
        this.K = jz5.h.b(new gx0.r8(this));
        this.L = jz5.h.b(new gx0.o8(this));
        this.M = jz5.h.b(new gx0.m5(this));
        this.N = jz5.h.b(new gx0.t6(this));
        this.P = jz5.h.b(new gx0.i7(this, activity));
        this.Q = jz5.h.b(new gx0.s6(this));
        this.R = jz5.h.b(new gx0.q6(this));
        this.V = new hx0.e(getContext(), new gx0.s5(this));
        this.W = jz5.h.b(new gx0.k7(this));
        this.X = jz5.h.b(new gx0.r6(activity));
        this.Y = jz5.h.b(new gx0.q7(this));
        this.Z = jz5.h.b(new gx0.j7(this));
        this.f277114p0 = new gx0.n5(this);
        this.f277122x0 = new xt0.d();
        this.f277124y0 = new ou0.w(false);
    }

    public static final void Y6(gx0.w8 w8Var) {
        ex0.a0 a0Var;
        com.tencent.maas.moviecomposing.Timeline o76 = w8Var.W6().o7();
        if (o76 == null) {
            return;
        }
        com.tencent.maas.model.time.MJTime l17 = o76.l();
        kotlin.jvm.internal.o.f(l17, "getDuration(...)");
        if (l17.toSeconds() < 6.0d && (a0Var = w8Var.W6().f276642r) != null) {
            java.util.List list = a0Var.f257097g.f257177e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                ex0.c cVar = null;
                if (!it.hasNext()) {
                    break;
                }
                ex0.r rVar = (ex0.r) it.next();
                if (rVar.f257169c == ug.m.ImageClip && (rVar instanceof ex0.c)) {
                    cVar = (ex0.c) rVar;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            ex0.a0 a0Var2 = w8Var.W6().f276642r;
            if (a0Var2 != null) {
                java.util.List list2 = a0Var2.f257097g.f257177e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
                while (it6.hasNext()) {
                    ex0.r rVar2 = (ex0.r) it6.next();
                    ug.m mVar = rVar2.f257169c;
                    ex0.c cVar2 = ((mVar == ug.m.MovieClip || mVar == ug.m.VideoClip) && (rVar2 instanceof ex0.c)) ? (ex0.c) rVar2 : null;
                    if (cVar2 != null) {
                        arrayList2.add(cVar2);
                    }
                }
                java.util.Iterator it7 = arrayList2.iterator();
                double d17 = 0.0d;
                while (it7.hasNext()) {
                    d17 += ((ex0.c) it7.next()).i().toSeconds();
                }
                com.tencent.maas.model.time.MJTime b17 = o76.b(com.tencent.maas.model.time.MJTime.fromSeconds((6.0d - d17) / arrayList.size()));
                kotlin.jvm.internal.o.f(b17, "alignTimeToVideoFrameBoundaryForward(...)");
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    ((ex0.c) it8.next()).y(b17);
                }
            }
        }
    }

    public static final java.lang.Object Z6(gx0.w8 w8Var, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, kotlin.coroutines.Continuation continuation) {
        w8Var.getClass();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.z4(w8Var, audioCacheInfo, null), continuation);
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
    public static final java.lang.Object a7(gx0.w8 r4, kotlinx.coroutines.r2 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof gx0.e5
            if (r0 == 0) goto L16
            r0 = r7
            gx0.e5 r0 = (gx0.e5) r0
            int r1 = r0.f276362h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f276362h = r1
            goto L1b
        L16:
            gx0.e5 r0 = new gx0.e5
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f276360f
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f276362h
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r5 = r0.f276359e
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            java.lang.Object r6 = r0.f276358d
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
            r0.f276358d = r6     // Catch: java.lang.Throwable -> L5a
            r0.f276359e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f276362h = r2     // Catch: java.lang.Throwable -> L5a
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
            java.lang.String r5 = "MovieComp.MainComposingUIC"
            com.tencent.mars.xlog.Log.e(r5, r4)
        L88:
            jz5.f0 r7 = jz5.f0.f302826a
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.a7(gx0.w8, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlinx.coroutines.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x02a5 -> B:21:0x0431). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0331 -> B:20:0x0428). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x034c -> B:14:0x0350). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0244 -> B:21:0x0431). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(gx0.w8 r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.b7(gx0.w8, kotlin.coroutines.Continuation):java.lang.Object");
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
    public static final java.lang.Object c7(gx0.w8 r10, kotlin.coroutines.Continuation r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof gx0.h5
            if (r0 == 0) goto L16
            r0 = r11
            gx0.h5 r0 = (gx0.h5) r0
            int r1 = r0.f276498m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f276498m = r1
            goto L1b
        L16:
            gx0.h5 r0 = new gx0.h5
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f276496h
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276498m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            int r10 = r0.f276495g
            java.lang.Object r2 = r0.f276494f
            zu0.a r2 = (zu0.a) r2
            java.lang.Object r5 = r0.f276493e
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f276492d
            gx0.w8 r6 = (gx0.w8) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L7a
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.ArrayList r11 = r10.f277123y
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
            r0.f276492d = r11
            r0.f276493e = r5
            r0.f276494f = r2
            r0.f276495g = r10
            r0.f276498m = r4
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
            java.lang.String r7 = "MovieComp.MainComposingUIC"
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
            java.util.ArrayList r11 = r11.f277123y
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
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.c7(gx0.w8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void d7(gx0.w8 w8Var) {
        com.tencent.maas.moviecomposing.Timeline o76;
        com.tencent.maas.moviecomposing.Storyline storyline;
        com.tencent.maas.moviecomposing.segments.Segment[] l17;
        float doubleValue;
        com.tencent.maas.moviecomposing.AspectRatio o17;
        com.tencent.maas.moviecomposing.Timeline o77 = w8Var.W6().o7();
        if (o77 == null || (o76 = w8Var.W6().o7()) == null || (storyline = o76.f48414a) == null || (l17 = storyline.l()) == null) {
            return;
        }
        for (com.tencent.maas.moviecomposing.segments.Segment segment : l17) {
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            double q17 = o77.q();
            java.lang.Double valueOf = (clipSegment == null || (o17 = clipSegment.o1()) == null) ? null : java.lang.Double.valueOf(o17.f48363b);
            if (clipSegment != null && valueOf != null && ou0.b0.a(clipSegment)) {
                yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
                m0Var.getClass();
                float hj6 = !pp0.h0.Q2(m0Var, false, 1, null) ? 0.0f : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingAspectRatioMinValue());
                float Ni = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ni();
                if (valueOf.doubleValue() < hj6) {
                    doubleValue = (float) (q17 / valueOf.doubleValue());
                } else {
                    double d17 = Ni;
                    doubleValue = valueOf.doubleValue() > d17 ? (float) (valueOf.doubleValue() / d17) : 1.0f;
                }
                clipSegment.t0(new android.graphics.PointF(clipSegment.o0().x * doubleValue, clipSegment.o0().y * doubleValue));
            }
        }
    }

    public static final bv0.e e7(gx0.w8 w8Var) {
        return (bv0.e) ((jz5.n) w8Var.X).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f7(gx0.w8 r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof gx0.x5
            if (r0 == 0) goto L16
            r0 = r8
            gx0.x5 r0 = (gx0.x5) r0
            int r1 = r0.f277161g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f277161g = r1
            goto L1b
        L16:
            gx0.x5 r0 = new gx0.x5
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f277159e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f277161g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.throwOnFailure(r8)
            goto L90
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f277158d
            gx0.w8 r6 = (gx0.w8) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7c
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.tencent.mm.vfs.z7.a(r7)
            r8.<init>(r7)
            boolean r7 = r8.m()
            if (r7 == 0) goto L53
            r8.l()
        L53:
            r6.G7()
            hx0.e r7 = r6.V
            jx0.k r7 = r7.f285615b
            boolean r8 = r7.isShowing()
            if (r8 == 0) goto L63
            r7.dismiss()
        L63:
            r7 = 0
            int[] r7 = new int[r7]
            gx0.w7 r8 = new gx0.w7
            r2 = 2131771348(0x7f103fd4, float:1.9174025E38)
            r8.<init>(r6, r2, r7, r3)
            r6.D7(r8)
            r0.f277158d = r6
            r0.f277161g = r5
            java.lang.Object r7 = r6.I7(r0)
            if (r7 != r1) goto L7c
            goto L92
        L7c:
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r7 = kotlinx.coroutines.internal.b0.f310484a
            gx0.y5 r8 = new gx0.y5
            r8.<init>(r6, r3)
            r0.f277158d = r3
            r0.f277161g = r4
            java.lang.Object r6 = kotlinx.coroutines.l.g(r7, r8, r0)
            if (r6 != r1) goto L90
            goto L92
        L90:
            jz5.f0 r1 = jz5.f0.f302826a
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.f7(gx0.w8, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
    public static final java.lang.Object g7(gx0.w8 r4, kotlinx.coroutines.r2 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof gx0.l6
            if (r0 == 0) goto L16
            r0 = r7
            gx0.l6 r0 = (gx0.l6) r0
            int r1 = r0.f276668h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f276668h = r1
            goto L1b
        L16:
            gx0.l6 r0 = new gx0.l6
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f276666f
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f276668h
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r5 = r0.f276665e
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            java.lang.Object r6 = r0.f276664d
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
            r0.f276664d = r6     // Catch: java.lang.Throwable -> L5a
            r0.f276665e = r5     // Catch: java.lang.Throwable -> L5a
            r0.f276668h = r2     // Catch: java.lang.Throwable -> L5a
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
            java.lang.String r5 = "MovieComp.MainComposingUIC"
            com.tencent.mars.xlog.Log.e(r5, r4)
        L88:
            jz5.f0 r7 = jz5.f0.f302826a
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.g7(gx0.w8, kotlinx.coroutines.r2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h7(gx0.w8 r27, xt0.h r28, com.tencent.maas.moviecomposing.Timeline r29, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r30, java.lang.String r31, com.tencent.maas.model.time.MJTime r32, java.lang.String r33, java.lang.String r34, boolean r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.h7(gx0.w8, xt0.h, com.tencent.maas.moviecomposing.Timeline, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, java.lang.String, com.tencent.maas.model.time.MJTime, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:10:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i7(gx0.w8 r7, kotlin.coroutines.Continuation r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof gx0.p6
            if (r0 == 0) goto L16
            r0 = r8
            gx0.p6 r0 = (gx0.p6) r0
            int r1 = r0.f276827m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f276827m = r1
            goto L1b
        L16:
            gx0.p6 r0 = new gx0.p6
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f276825h
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276827m
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f276824g
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r2 = r0.f276823f
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f276822e
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r0.f276821d
            gx0.w8 r5 = (gx0.w8) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L89
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList r8 = r7.f277123y
            r8.clear()
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r2 = r7.v7()
            java.util.List r2 = r2.f69343e
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto Lba
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r2 = r7.v7()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r2 = r2.f69343e
            java.util.Iterator r2 = r2.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L69:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L92
            java.lang.Object r5 = r2.next()
            com.tencent.mm.maas_api.MJMediaItem r5 = (com.tencent.mm.maas_api.MJMediaItem) r5
            r0.f276821d = r8
            r0.f276822e = r4
            r0.f276823f = r2
            r0.f276824g = r7
            r0.f276827m = r3
            java.lang.Object r5 = zu0.g.f(r5, r0)
            if (r5 != r1) goto L86
            goto Lbc
        L86:
            r6 = r5
            r5 = r8
            r8 = r6
        L89:
            zu0.a r8 = (zu0.a) r8
            if (r8 == 0) goto L90
            r4.add(r8)
        L90:
            r8 = r5
            goto L69
        L92:
            java.util.List r4 = (java.util.List) r4
            r7.addAll(r4)
            java.util.ArrayList r7 = r8.f277123y
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto Lba
            android.app.Activity r7 = r8.getContext()
            r0 = 0
            int[] r1 = new int[r0]
            r2 = 2131771353(0x7f103fd9, float:1.9174035E38)
            by0.t.a(r7, r2, r1)
            androidx.appcompat.app.AppCompatActivity r7 = r8.getActivity()
            r7.setResult(r0)
            androidx.appcompat.app.AppCompatActivity r7 = r8.getActivity()
            r7.finish()
        Lba:
            jz5.f0 r1 = jz5.f0.f302826a
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.i7(gx0.w8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void k7(gx0.w8 w8Var, java.lang.String str) {
        kotlinx.coroutines.y0 y0Var = w8Var.f277116s;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        w8Var.f277117t = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new gx0.v6(w8Var, str, null), 2, null);
    }

    public static final java.lang.Object l7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        gx0.y4 y4Var = w8Var.f277115r;
        gx0.y4 y4Var2 = gx0.y4.f277204h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (y4Var != y4Var2) {
            com.tencent.mars.xlog.Log.e("MovieComp.MainComposingUIC", "releasePlaybackSessionUnderPlaybackState >> but state is " + w8Var.f277115r);
        } else {
            w8Var.J7(gx0.y4.f277205i);
            w8Var.f277117t = kotlinx.coroutines.l.d(w8Var.getLifecycleScope(), null, null, new gx0.r7(w8Var, null), 3, null);
        }
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7(gx0.w8 r15, com.tencent.maas.moviecomposing.Timeline r16, java.lang.String r17, com.tencent.maas.instamovie.MJExportSettings r18, kotlin.coroutines.Continuation r19) {
        /*
            r0 = r15
            r1 = r19
            r15.getClass()
            boolean r2 = r1 instanceof gx0.y7
            if (r2 == 0) goto L19
            r2 = r1
            gx0.y7 r2 = (gx0.y7) r2
            int r3 = r2.f277218n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f277218n = r3
            goto L1e
        L19:
            gx0.y7 r2 = new gx0.y7
            r2.<init>(r15, r1)
        L1e:
            java.lang.Object r1 = r2.f277216i
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f277218n
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L51
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lbf
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r0 = r2.f277214g
            com.tencent.maas.instamovie.MJExportSettings r0 = (com.tencent.maas.instamovie.MJExportSettings) r0
            java.lang.Object r4 = r2.f277213f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.f277212e
            com.tencent.maas.moviecomposing.Timeline r7 = (com.tencent.maas.moviecomposing.Timeline) r7
            java.lang.Object r8 = r2.f277211d
            gx0.w8 r8 = (gx0.w8) r8
            kotlin.ResultKt.throwOnFailure(r1)
            r9 = r0
            r10 = r7
            r0 = r8
            r8 = r4
            goto L76
        L51:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            gx0.e8 r4 = new gx0.e8
            r7 = 0
            r4.<init>(r15, r7)
            r2.f277211d = r0
            r7 = r16
            r2.f277212e = r7
            r8 = r17
            r2.f277213f = r8
            r9 = r18
            r2.f277214g = r9
            r2.f277218n = r6
            java.lang.Object r1 = kotlinx.coroutines.l.g(r1, r4, r2)
            if (r1 != r3) goto L75
            goto Lc0
        L75:
            r10 = r7
        L76:
            r7 = r1
            com.tencent.maas.moviecomposing.ExportSession r7 = (com.tencent.maas.moviecomposing.ExportSession) r7
            r2.f277211d = r0
            r2.f277212e = r10
            r2.f277213f = r8
            r2.f277214g = r9
            r2.f277215h = r7
            r2.f277218n = r5
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = pz5.f.b(r2)
            r1.<init>(r2, r6)
            r1.k()
            gx0.a8 r2 = new gx0.a8
            r2.<init>(r7, r0, r8)
            r1.m(r2)
            kotlin.jvm.internal.f0 r2 = new kotlin.jvm.internal.f0
            r2.<init>()
            r2.f310116d = r6
            com.tencent.maas.moviecomposing.Storyline r4 = r10.f48414a
            com.tencent.maas.model.time.MJTimeRange r11 = r4.n()
            gx0.b8 r12 = new gx0.b8
            r12.<init>(r2, r0)
            gx0.c8 r13 = new gx0.c8
            r13.<init>(r2, r0)
            gx0.d8 r14 = new gx0.d8
            r14.<init>(r1)
            r7.c(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.j()
            if (r1 != r3) goto Lbf
            goto Lc0
        Lbf:
            r3 = r1
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.m7(gx0.w8, com.tencent.maas.moviecomposing.Timeline, java.lang.String, com.tencent.maas.instamovie.MJExportSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n7(gx0.w8 r15, com.tencent.maas.moviecomposing.Timeline r16, java.lang.String r17, com.tencent.maas.moviecomposing.ExportInitParam r18, com.tencent.maas.instamovie.MJExportSettings r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r15
            r1 = r20
            r15.getClass()
            boolean r2 = r1 instanceof gx0.f8
            if (r2 == 0) goto L19
            r2 = r1
            gx0.f8 r2 = (gx0.f8) r2
            int r3 = r2.f276415n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f276415n = r3
            goto L1e
        L19:
            gx0.f8 r2 = new gx0.f8
            r2.<init>(r15, r1)
        L1e:
            java.lang.Object r1 = r2.f276413i
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f276415n
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L51
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lc1
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r0 = r2.f276411g
            com.tencent.maas.instamovie.MJExportSettings r0 = (com.tencent.maas.instamovie.MJExportSettings) r0
            java.lang.Object r4 = r2.f276410f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.f276409e
            com.tencent.maas.moviecomposing.Timeline r7 = (com.tencent.maas.moviecomposing.Timeline) r7
            java.lang.Object r8 = r2.f276408d
            gx0.w8 r8 = (gx0.w8) r8
            kotlin.ResultKt.throwOnFailure(r1)
            r9 = r0
            r10 = r7
            r0 = r8
            r8 = r4
            goto L78
        L51:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            gx0.l8 r4 = new gx0.l8
            r7 = 0
            r8 = r18
            r4.<init>(r8, r15, r7)
            r2.f276408d = r0
            r7 = r16
            r2.f276409e = r7
            r8 = r17
            r2.f276410f = r8
            r9 = r19
            r2.f276411g = r9
            r2.f276415n = r6
            java.lang.Object r1 = kotlinx.coroutines.l.g(r1, r4, r2)
            if (r1 != r3) goto L77
            goto Lc2
        L77:
            r10 = r7
        L78:
            r7 = r1
            com.tencent.maas.moviecomposing.ExportSession r7 = (com.tencent.maas.moviecomposing.ExportSession) r7
            r2.f276408d = r0
            r2.f276409e = r10
            r2.f276410f = r8
            r2.f276411g = r9
            r2.f276412h = r7
            r2.f276415n = r5
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = pz5.f.b(r2)
            r1.<init>(r2, r6)
            r1.k()
            gx0.h8 r2 = new gx0.h8
            r2.<init>(r7, r0, r8)
            r1.m(r2)
            kotlin.jvm.internal.f0 r2 = new kotlin.jvm.internal.f0
            r2.<init>()
            r2.f310116d = r6
            com.tencent.maas.moviecomposing.Storyline r4 = r10.f48414a
            com.tencent.maas.model.time.MJTimeRange r11 = r4.n()
            gx0.i8 r12 = new gx0.i8
            r12.<init>(r2, r0)
            gx0.j8 r13 = new gx0.j8
            r13.<init>(r2, r0)
            gx0.k8 r14 = new gx0.k8
            r14.<init>(r1)
            r7.d(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.j()
            if (r1 != r3) goto Lc1
            goto Lc2
        Lc1:
            r3 = r1
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.n7(gx0.w8, com.tencent.maas.moviecomposing.Timeline, java.lang.String, com.tencent.maas.moviecomposing.ExportInitParam, com.tencent.maas.instamovie.MJExportSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void o7(gx0.w8 w8Var) {
        w8Var.getClass();
        w8Var.J7(gx0.y4.f277203g);
        w8Var.f277117t = kotlinx.coroutines.l.d(w8Var.getLifecycleScope(), null, null, new gx0.m8(w8Var, null), 3, null);
    }

    public static final java.lang.Object p7(gx0.w8 w8Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        java.lang.Object C = ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(w8Var.f277116s, null, null, new gx0.q8(w8Var, z18, z17, null), 3, null)).C(continuation);
        return C == pz5.a.f359186d ? C : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    @Override // yt0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A2() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.A2():void");
    }

    @Override // yt0.c
    public boolean A4() {
        return (((z7().getScaleY() > 1.0f ? 1 : (z7().getScaleY() == 1.0f ? 0 : -1)) == 0) ^ true) || (((z7().getTranslationY() > 0.0f ? 1 : (z7().getTranslationY() == 0.0f ? 0 : -1)) == 0) ^ true);
    }

    @Override // yt0.c
    public java.lang.Object A6(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.x7(this, str, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final android.widget.FrameLayout A7() {
        android.widget.FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("topAreaContainer");
        throw null;
    }

    public final android.view.ViewGroup B7() {
        android.view.ViewGroup viewGroup = this.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("videoContainer");
        throw null;
    }

    public final android.util.SizeF C7() {
        return new android.util.SizeF(B7().getWidth(), B7().getHeight());
    }

    public final void D7(yz5.l lVar) {
        kotlinx.coroutines.y0 mainScope = getMainScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(mainScope, kotlinx.coroutines.internal.b0.f310484a, null, new gx0.o6(lVar, null), 2, null);
    }

    @Override // yt0.c
    public java.lang.Object E4(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.o5(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final java.lang.Object E7(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new gx0.n7(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F7(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gx0.o7
            if (r0 == 0) goto L13
            r0 = r6
            gx0.o7 r0 = (gx0.o7) r0
            int r1 = r0.f276792f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f276792f = r1
            goto L18
        L13:
            gx0.o7 r0 = new gx0.o7
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f276790d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f276792f
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
            gx0.p7 r2 = new gx0.p7
            r4 = 0
            r2.<init>(r5, r4)
            r0.f276792f = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.F7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G7() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.maas.moviecomposing.ExportSession exportSession = this.T;
            if (exportSession != null) {
                exportSession.b();
            }
            this.T = null;
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public final void H7() {
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "reportPreparePlaybackSessionFinished");
        i95.m c17 = i95.n0.c(pp0.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        L("SCRecordToMC", "MJShootComposing", ((yy0.m7) ((pp0.l0) c17)).Ni(), 0);
        L("SCAssetGenerateToMC", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0);
        L("MCImport", "MJShootComposing", "", 0);
    }

    public final java.lang.Object I7(kotlin.coroutines.Continuation continuation) {
        com.tencent.maas.moviecomposing.PlaybackSession k76 = V6().k7();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (k76 == null) {
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "restartPlaybackSession: ");
            java.lang.Object r76 = r7(false, V6().h7(), continuation);
            if (r76 == pz5.a.f359186d) {
                return r76;
            }
        }
        return f0Var;
    }

    @Override // yt0.c
    public android.util.SizeF J1() {
        return C7();
    }

    public final void J7(gx0.y4 y4Var) {
        if (this.f277115r == y4Var) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "state: " + this.f277115r + " -> " + y4Var);
        this.f277115r = y4Var;
        this.f277117t = null;
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.n8(this, y4Var, null), 3, null);
    }

    public final void K7(java.lang.String str) {
        int dimensionPixelOffset = j65.q.a(getContext()).getDimensionPixelOffset(com.tencent.mm.R.dimen.agp);
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar s76 = s7();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(s76);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = (a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(s76.getContext())) - j65.q.a(s76.getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd);
        if (c17 < 0) {
            c17 = 0;
        }
        int i17 = c17 + dimensionPixelOffset;
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar s77 = s7();
        android.view.ViewGroup.LayoutParams layoutParams = s77.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i17;
        s77.setLayoutParams(layoutParams2);
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "[updateBottomBarHeight] source:" + str + " bottomToolBarHeight:" + i17 + " defaultHeight:" + dimensionPixelOffset);
    }

    public final void L7(boolean z17) {
        android.widget.ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("playButton");
            throw null;
        }
    }

    public final void M7(boolean z17) {
        android.widget.TextView textView = this.H;
        if (textView != null) {
            textView.setVisibility(z17 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("tvPlayerTime");
            throw null;
        }
    }

    @Override // yt0.c
    public void N0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k panelUIC, java.util.Map map, boolean z17, zw0.b entrance) {
        kotlin.jvm.internal.o.g(panelUIC, "panelUIC");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        if (panelUIC.X6()) {
            return;
        }
        if (z17) {
            gx0.x4 x4Var = (gx0.x4) ((jz5.n) this.f348901o).getValue();
            x4Var.getClass();
            if (x4Var.q()) {
                if (entrance == zw0.b.f476552f) {
                    x4Var.l7();
                } else {
                    x4Var.U6(false);
                }
            }
        }
        nv0.e.a((nv0.e) ((jz5.n) this.f277120w).getValue(), panelUIC, map, new zw0.e(entrance, zw0.d.f476561f), z17 ? this.f277114p0 : null, null, false, 48, null);
    }

    @Override // yt0.c
    public java.util.List N5() {
        return this.f277123y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N7(boolean z17) {
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigComposingCreationReedit()) == 1;
        if (!z17 || !z18) {
            android.view.View view = this.f277113l1;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "updateReeditBubbleVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "updateReeditBubbleVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        eu0.q qVar = v7().f69355t;
        if (qVar == null || !qVar.a()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setupReeditBubble: skip, reeditParams is null: ");
            sb6.append(qVar == null);
            sb6.append(", isValid: ");
            sb6.append(qVar != null ? java.lang.Boolean.valueOf(qVar.a()) : null);
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", sb6.toString());
            return;
        }
        if (v7().f69356u == null) {
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "setupReeditBubble: skip, localCreateTemplateInfo is null");
            return;
        }
        r45.mi0 mi0Var = v7().f69357v;
        if (mi0Var == null) {
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "setupReeditBubble: skip, effectEditInfo is null");
            return;
        }
        int i17 = mi0Var.f380537g;
        java.lang.String str = mi0Var.f380538h;
        if (str == null) {
            str = "";
        }
        if (i17 == 1) {
            if (!(str.length() == 0)) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = v7().f69348m;
                com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = recordConfigProvider != null ? recordConfigProvider.I : null;
                java.lang.String str2 = videoCaptureReportInfo != null ? videoCaptureReportInfo.f155698o : null;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.Object obj = videoCaptureReportInfo != null ? videoCaptureReportInfo.f155697n : null;
                qVar.f256735f = new eu0.o(str2, obj != null ? obj : "");
                android.view.View view2 = this.f277113l1;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "setupReeditBubbleIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC", "setupReeditBubbleIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.soi);
                    if (textView != null) {
                        textView.setText(str);
                    }
                    view2.setOnClickListener(new gx0.v7(this, qVar));
                    com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "setupReeditBubble: attached, wording=".concat(str));
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setupReeditBubble: skip, enableEdit=");
        sb7.append(i17);
        sb7.append(", wording.empty=");
        sb7.append(str.length() == 0);
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", sb7.toString());
    }

    @Override // yt0.c
    public void Z2(boolean z17) {
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "reportExitMovieComposing");
        com.tencent.maas.moviecomposing.Timeline o76 = W6().o7();
        if (o76 != null) {
            du0.v0 R6 = R6();
            int h76 = W6().h7();
            int k76 = W6().k7();
            R6.getClass();
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b1(m7Var, o76, h76, k76, null), 3, null);
        }
        if (v7().a()) {
            yt0.c.V(this, "MCToSC", "MJShootComposing", null, 0, 12, null);
        }
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e.fh((w40.e) c17, "andr_MJ_Edit_Video_Cancel", null, 2, null);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.p5(this, z17, null), 3, null);
    }

    @Override // yt0.c
    public yw0.n f2() {
        return (yw0.n) ((jz5.n) this.Y).getValue();
    }

    @Override // yt0.c
    public boolean h2() {
        ex0.a0 a0Var = W6().f276642r;
        if (a0Var != null) {
            return a0Var.f257091a.b();
        }
        return false;
    }

    @Override // yt0.c
    public void j() {
        nv0.e.c((nv0.e) ((jz5.n) this.f277120w).getValue(), false, 1, null);
    }

    @Override // yt0.c
    public com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig l2() {
        return v7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        int i17 = v7().f69351p ? 1 : 3;
        vt3.l lVar = vt3.l.f440005a;
        com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "removeAllMedia");
        lVar.c(new vt3.g(i17));
        if (U6().onBackPressed() || nv0.e.c((nv0.e) ((jz5.n) this.f277120w).getValue(), false, 1, null)) {
            return true;
        }
        O4(getContext());
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        D7(new gx0.w6(this, null));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.c7(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (P6().f243362d) {
            return;
        }
        kotlinx.coroutines.l.d(this.f277116s, null, null, new gx0.k6(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025e  */
    @Override // du0.g, com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.onViewCreated(android.view.View):void");
    }

    public final void q7(float f17, int i17) {
        float width = A7().getWidth();
        float height = ((A7().getHeight() + s7().getHeight()) - i17) - X6().c7();
        boolean z17 = f17 > width / height;
        float height2 = A7().getHeight();
        android.util.SizeF sizeF = (f17 > (width / height2) ? 1 : (f17 == (width / height2) ? 0 : -1)) > 0 ? new android.util.SizeF(width, width / f17) : new android.util.SizeF(height2 * f17, height2);
        android.util.SizeF sizeF2 = z17 ? new android.util.SizeF(width, width / f17) : new android.util.SizeF(height * f17, height);
        by0.b.b(B7(), f17, sizeF.getWidth(), sizeF.getHeight());
        by0.b.b(z7(), f17, sizeF.getWidth(), sizeF.getHeight());
        by0.b.b(y7(), f17, sizeF.getWidth(), sizeF.getHeight());
        z7().setTranslationY(0.0f);
        y7().setTranslationY(0.0f);
        z7().setScaleX(1.0f);
        z7().setScaleY(1.0f);
        y7().setScaleX(1.0f);
        y7().setScaleY(1.0f);
        float f18 = (-(height2 - height)) / 2;
        z7().setTranslationY(f18);
        y7().setTranslationY(f18);
        if (!(sizeF.getWidth() == sizeF2.getWidth())) {
            float width2 = sizeF2.getWidth() / sizeF.getWidth();
            z7().setScaleX(width2);
            z7().setScaleY(width2);
            y7().setScaleX(width2);
            y7().setScaleY(width2);
        }
        B7().invalidate();
        B7().requestLayout();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|134|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x007e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0081, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f4 A[Catch: all -> 0x00c8, Exception -> 0x00cc, TRY_LEAVE, TryCatch #13 {Exception -> 0x00cc, all -> 0x00c8, blocks: (B:105:0x00bf, B:107:0x00f0, B:109:0x00f4), top: B:104:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ou0.p] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [gx0.w8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v34, types: [gx0.w8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r7(boolean r19, com.tencent.maas.model.time.MJTime r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.w8.r7(boolean, com.tencent.maas.model.time.MJTime, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar s7() {
        com.tencent.mm.mj_publisher.finder.widgets.ComposingBottomToolBar composingBottomToolBar = this.F;
        if (composingBottomToolBar != null) {
            return composingBottomToolBar;
        }
        kotlin.jvm.internal.o.o("bottomToolBar");
        throw null;
    }

    public final nv0.d t7() {
        return (nv0.d) ((jz5.n) this.f277119v).getValue();
    }

    public final android.widget.TextView u7() {
        return (android.widget.TextView) ((jz5.n) this.R).getValue();
    }

    @Override // yt0.c
    public nv0.d v6() {
        return t7();
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig v7() {
        com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig movieComposingConfig = this.f277121x;
        if (movieComposingConfig != null) {
            return movieComposingConfig;
        }
        kotlin.jvm.internal.o.o("movieComposingConfig");
        throw null;
    }

    public final com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView w7() {
        return (com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView) ((jz5.n) this.P).getValue();
    }

    public final java.util.Map x7() {
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = v7().f69348m;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = recordConfigProvider != null ? recordConfigProvider.I : null;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str2 = videoCaptureReportInfo != null ? videoCaptureReportInfo.f155698o : null;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        java.lang.String str4 = videoCaptureReportInfo != null ? videoCaptureReportInfo.f155697n : null;
        if (str4 == null) {
            str4 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str4);
        lVarArr[2] = new jz5.l("comment_scene", 101);
        eu0.q qVar = v7().f69355t;
        if (qVar != null && (str = qVar.f256731b) != null) {
            str3 = str;
        }
        lVarArr[3] = new jz5.l("templateid", str3);
        return kz5.c1.k(lVarArr);
    }

    public final android.widget.FrameLayout y7() {
        android.widget.FrameLayout frameLayout = this.E;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("scalableReferenceContainer");
        throw null;
    }

    public final android.widget.FrameLayout z7() {
        android.widget.FrameLayout frameLayout = this.D;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("scalableVideoContainer");
        throw null;
    }
}
