package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ap extends com.tencent.mm.plugin.finder.live.plugin.l implements com.tencent.mm.plugin.finder.live.util.k1 {
    public static final int N;
    public static final float P;
    public static final float Q;
    public static final float R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final boolean V;
    public final java.util.Map A;
    public final java.util.Map B;
    public final java.util.Map C;
    public final java.util.Map D;
    public final java.util.LinkedList E;
    public final java.util.concurrent.ConcurrentHashMap F;
    public final java.util.concurrent.ConcurrentHashMap G;
    public final com.tencent.mm.sdk.platformtools.b4 H;
    public final com.tencent.mm.sdk.platformtools.n3 I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f111914J;
    public pm2.a K;
    public int L;
    public int M;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111915p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.o1 f111916q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f111917r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f111918s;

    /* renamed from: t, reason: collision with root package name */
    public final int f111919t;

    /* renamed from: u, reason: collision with root package name */
    public final int f111920u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.RelativeLayout f111921v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.RelativeLayout f111922w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.RelativeLayout f111923x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.RelativeLayout f111924y;

    /* renamed from: z, reason: collision with root package name */
    public final int f111925z;

    static {
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.H1).getValue()).r()).intValue() * 1000;
        N = intValue;
        int i17 = 500 / (intValue + 500);
        P = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479688cn);
        Q = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479646bl);
        R = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479718db);
        com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479718db);
        S = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
        T = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 3.0f);
        U = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479679cf);
        V = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.P0).getValue()).r()).intValue() == 0 && dk2.ef.f233372a.e() != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.util.o1 iGiftQueue, android.view.ViewGroup outerSpaceParent, boolean z17) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(iGiftQueue, "iGiftQueue");
        kotlin.jvm.internal.o.g(outerSpaceParent, "outerSpaceParent");
        this.f111915p = statusMonitor;
        this.f111916q = iGiftQueue;
        this.f111917r = outerSpaceParent;
        this.f111918s = z17;
        ae2.in inVar = ae2.in.f3688a;
        this.f111919t = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.J1).getValue()).r()).intValue();
        this.f111920u = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K1).getValue()).r()).intValue();
        this.E = new java.util.LinkedList();
        this.F = new java.util.concurrent.ConcurrentHashMap();
        this.G = new java.util.concurrent.ConcurrentHashMap();
        this.H = new com.tencent.mm.sdk.platformtools.b4("FinderLiveGiftQueuePlugin::Timer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.plugin.uo(this), false);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484666f35);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f111921v = relativeLayout;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f37);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById2;
        this.f111922w = relativeLayout2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f484667f36);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) findViewById3;
        this.f111923x = relativeLayout3;
        android.view.View inflate = android.view.LayoutInflater.from(root.getContext()).inflate(com.tencent.mm.R.layout.arg, root, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) inflate;
        this.f111924y = relativeLayout4;
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap(3));
        kotlin.jvm.internal.o.f(synchronizedMap, "synchronizedMap(...)");
        this.A = synchronizedMap;
        synchronizedMap.put(relativeLayout, new com.tencent.mm.plugin.finder.live.plugin.tn(this, relativeLayout, 0, z17, false, false, false, 0, 120, null));
        synchronizedMap.put(relativeLayout2, new com.tencent.mm.plugin.finder.live.plugin.tn(this, relativeLayout2, 1, z17, false, false, false, 0, 120, null));
        synchronizedMap.put(relativeLayout3, new com.tencent.mm.plugin.finder.live.plugin.tn(this, relativeLayout3, 2, z17, true, false, false, 0, 112, null));
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = new com.tencent.mm.plugin.finder.live.plugin.tn(this, relativeLayout4, 1000, z17, false, false, false, 0, 120, null);
        tnVar.f114456w = true;
        tnVar.f114439f.getAndSet(true);
        tnVar.f114454u = "";
        synchronizedMap.put(relativeLayout4, tnVar);
        this.f111925z = synchronizedMap.size();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(3);
        this.B = concurrentHashMap;
        concurrentHashMap.put(relativeLayout, z1(this, relativeLayout, false, null, 6, null));
        concurrentHashMap.put(relativeLayout2, z1(this, relativeLayout2, false, null, 6, null));
        concurrentHashMap.put(relativeLayout3, z1(this, relativeLayout3, false, null, 6, null));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap(3);
        this.C = concurrentHashMap2;
        concurrentHashMap2.put(relativeLayout, A1(relativeLayout, false));
        concurrentHashMap2.put(relativeLayout2, A1(relativeLayout2, false));
        concurrentHashMap2.put(relativeLayout3, A1(relativeLayout3, false));
        java.util.Map synchronizedMap2 = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
        kotlin.jvm.internal.o.f(synchronizedMap2, "synchronizedMap(...)");
        this.D = synchronizedMap2;
        java.util.Iterator it = synchronizedMap.values().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = ((com.tencent.mm.plugin.finder.live.plugin.tn) it.next()).f114447n.f114597g;
            if (finderLiveGiftTextView != null) {
                zl2.r4.f473950a.b3(finderLiveGiftTextView);
            }
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.plugin.ln(this));
        this.I = n3Var;
        n3Var.setLogging(false);
        boolean z18 = V;
        if (z18) {
            android.widget.RelativeLayout relativeLayout5 = this.f111921v;
            if (relativeLayout5 != null) {
                relativeLayout5.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout6 = this.f111922w;
            if (relativeLayout6 != null) {
                relativeLayout6.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout7 = this.f111923x;
            if (relativeLayout7 != null) {
                relativeLayout7.setVisibility(8);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "ENABLE_TEST:" + z18);
        this.K = pm2.a.f356853f;
        this.M = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08f4  */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V1(com.tencent.mm.plugin.finder.live.plugin.ap r37, com.tencent.mm.plugin.finder.live.plugin.tn r38, com.tencent.mm.plugin.finder.live.util.l1 r39, boolean r40, int r41, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ap.V1(com.tencent.mm.plugin.finder.live.plugin.ap, com.tencent.mm.plugin.finder.live.plugin.tn, com.tencent.mm.plugin.finder.live.util.l1, boolean, int, java.lang.Object):void");
    }

    public static /* synthetic */ android.animation.ValueAnimator z1(com.tencent.mm.plugin.finder.live.plugin.ap apVar, android.view.ViewGroup viewGroup, boolean z17, android.animation.ValueAnimator valueAnimator, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            valueAnimator = null;
        }
        return apVar.y1(viewGroup, z17, valueAnimator);
    }

    public final android.animation.ValueAnimator A1(android.view.ViewGroup viewGroup, boolean z17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public final void B1(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar != null) {
            tnVar.a();
            tnVar.f114455v.getAndSet(false);
        }
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (r2 == false) goto L64;
     */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ap.C0(java.util.LinkedHashMap):void");
    }

    public final void C1(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar != null) {
            tnVar.f114455v.getAndSet(true);
        }
    }

    public final java.util.Map.Entry D1() {
        java.util.List y17 = q26.h0.y(q26.h0.i(kz5.e1.u(this.A), com.tencent.mm.plugin.finder.live.plugin.co.f112181d));
        if (!y17.isEmpty()) {
            return (java.util.Map.Entry) y17.get(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E1(java.lang.String r6, pm2.a r7) {
        /*
            r5 = this;
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            xh2.c r0 = (xh2.c) r0
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.LinkedList r0 = r0.f454531a
            if (r0 == 0) goto L3b
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r3 = r2
            xh2.a r3 = (xh2.a) r3
            java.lang.String r3 = r3.b()
            boolean r3 = kotlin.jvm.internal.o.b(r3, r6)
            if (r3 == 0) goto L1b
            goto L34
        L33:
            r2 = r1
        L34:
            xh2.a r2 = (xh2.a) r2
            if (r2 == 0) goto L3b
            xh2.i r0 = r2.f454521b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L41
            int r2 = r0.f454553e
            goto L42
        L41:
            r2 = 1
        L42:
            if (r0 == 0) goto L47
            int r3 = r0.f454557i
            goto L48
        L47:
            r3 = 0
        L48:
            r4 = 2
            boolean r3 = pm0.v.z(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r6 = 64
            r4.append(r6)
            int r7 = r7.ordinal()
            r4.append(r7)
            r4.append(r6)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            r4.append(r6)
            if (r0 == 0) goto L78
            int r6 = r0.f454555g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L78:
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ap.E1(java.lang.String, pm2.a):java.lang.String");
    }

    public final java.lang.CharSequence F1(com.tencent.mm.protocal.protobuf.FinderContact finderContact, android.widget.TextView textView, boolean z17, boolean z18) {
        java.lang.String nickname;
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.String D0 = zl2.r4.D0(r4Var, finderContact != null ? finderContact.getUsername() : null, finderContact != null ? finderContact.getNickname() : null, false, 4, null);
        if (((mm2.c1) P0(mm2.c1.class)).Z3 && finderContact != null && (nickname = finderContact.getNickname()) != null) {
            D0 = nickname;
        }
        if (((mm2.c1) P0(mm2.c1.class)).R6()) {
            D0 = com.tencent.mm.plugin.finder.assist.w2.s(finderContact != null ? finderContact.getUsername() : null, D0);
            kotlin.jvm.internal.o.f(D0, "makeAnonymousNameIfIsMySelf(...)");
        }
        java.lang.String str = D0;
        if (z18) {
            return str;
        }
        if (z17) {
            return r4Var.c1(str, 4, true);
        }
        int i17 = this.f111919t;
        if (i17 > 0) {
            return r4Var.c1(str, i17, true);
        }
        if (textView == null) {
            return str;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        return c61.yb.nf((c61.yb) c17, context, paint, str, 0, 8, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean3;
        if (viewGroup == null || l1Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if ((tnVar == null || (atomicBoolean3 = tnVar.f114437d) == null || true != atomicBoolean3.get()) ? false : true) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.no(this, viewGroup, l1Var));
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar2 != null && (atomicBoolean2 = tnVar2.f114437d) != null) {
            atomicBoolean2.getAndSet(true);
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar3 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar3 != null && (atomicBoolean = tnVar3.f114439f) != null) {
            atomicBoolean.getAndSet(kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT"));
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar4 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar4 != null) {
            java.lang.String str = l1Var.f115593h;
            if (str == null) {
                str = "";
            }
            tnVar4.f114441h = str;
        }
        df2.wy wyVar = (df2.wy) U0(df2.wy.class);
        if (wyVar != null) {
            wyVar.g7(l1Var);
        }
        tf2.k kVar = (tf2.k) U0(tf2.k.class);
        if (kVar != null) {
            kVar.a7(l1Var);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.Cdo(viewGroup, this, l1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    public final void H1(pm2.a aVar, java.util.LinkedHashMap linkedHashMap, java.util.List list) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        android.view.ViewGroup viewGroup;
        java.lang.String str;
        boolean z19;
        boolean z27;
        km2.q qVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        x1();
        boolean z28 = false;
        M1(0);
        java.util.Iterator it = this.F.entrySet().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((java.util.Map.Entry) it.next()).getValue();
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup2);
            java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserList>(...)");
            synchronized (list2) {
                java.util.Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (kotlin.jvm.internal.o.b(tnVar != null ? tnVar.f114454u : null, ((km2.q) obj2).f309172c)) {
                        break;
                    }
                }
            }
            if (obj2 == null) {
                if (android.text.TextUtils.equals(((mm2.c1) P0(mm2.c1.class)).f328852o, tnVar != null ? tnVar.f114454u : null)) {
                    continue;
                } else {
                    synchronized (list) {
                        java.util.Iterator it7 = list.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            java.lang.Object next = it7.next();
                            if (android.text.TextUtils.equals(((km2.q) next).f309172c, tnVar != null ? tnVar.f114454u : null)) {
                                obj3 = next;
                                break;
                            }
                        }
                    }
                    if (obj3 == null) {
                        U1(viewGroup2);
                        it.remove();
                    }
                }
            }
        }
        boolean a76 = ((mm2.y2) P0(mm2.y2.class)).a7();
        boolean z29 = false;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) entry.getKey();
            if (!((charSequence == null || charSequence.length() == 0) ? true : z28)) {
                java.util.List list3 = ((mm2.o4) P0(mm2.o4.class)).f329324s;
                kotlin.jvm.internal.o.f(list3, "<get-anchorPkMicUserList>(...)");
                synchronized (list3) {
                    java.util.Iterator it8 = list3.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj = it8.next();
                            if (kotlin.jvm.internal.o.b(entry.getKey(), ((km2.q) obj).f309170a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                }
                km2.q qVar2 = (km2.q) obj;
                if (qVar2 == null) {
                    synchronized (list) {
                        java.util.Iterator it9 = list.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                qVar = it9.next();
                                if (((java.lang.String) entry.getKey()).equals(((km2.q) qVar).f309170a)) {
                                    break;
                                }
                            } else {
                                qVar = 0;
                                break;
                            }
                        }
                    }
                    qVar2 = qVar;
                }
                java.lang.String E1 = E1((java.lang.String) entry.getKey(), aVar);
                zi2.w wVar = (zi2.w) X0(zi2.w.class);
                sj2.m y17 = wVar != null ? wVar.y1((java.lang.String) entry.getKey()) : null;
                if (y17 != null) {
                    android.view.ViewGroup giftRootView = y17.getGiftRootView();
                    if (giftRootView != null) {
                        z27 = a76;
                    } else {
                        giftRootView = this.f111921v;
                        z29 = true;
                        z27 = z28;
                    }
                    z17 = z29;
                    viewGroup = giftRootView;
                    z18 = z27;
                } else {
                    z17 = z29;
                    z18 = a76;
                    viewGroup = null;
                }
                if (this.F.containsKey(E1) && kotlin.jvm.internal.o.b(this.F.get(E1), viewGroup)) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "onNormalMicUserChange: adjustContainerLocation, sdkUserId = " + ((java.lang.String) entry.getKey()) + " isUseCustomMode: " + a76);
                } else {
                    if (qVar2 == null || (str = qVar2.f309172c) == null) {
                        str = ((mm2.c1) P0(mm2.c1.class)).f328852o;
                    }
                    java.lang.String str2 = str;
                    if (y17 != null && viewGroup != null) {
                        java.lang.Object obj4 = this.F.get(E1);
                        android.view.ViewGroup viewGroup3 = obj4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj4 : null;
                        if (viewGroup3 != null) {
                            U1(viewGroup3);
                        }
                        android.view.ViewGroup viewGroup4 = viewGroup;
                        z19 = z17;
                        J1(viewGroup, str2, z18, z18, ((android.graphics.Rect) entry.getValue()).width(), y17.getGiftInAnimator());
                        this.F.put(E1, viewGroup4);
                        this.G.put(viewGroup4, y17);
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "onNormalMicUserChange: outerSpaceMap add new entry, key = " + ((java.lang.String) entry.getKey()) + ", value = " + viewGroup4 + ", outSpaceWidth:" + ((android.graphics.Rect) entry.getValue()).width() + " isNeedUserDefaultContainer: " + z19);
                        z29 = z19;
                    }
                }
                z19 = z17;
                z29 = z19;
            }
            z28 = false;
        }
        if (z29) {
            C1(this.f111921v);
            this.f111921v.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0354 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void I1() {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ap.I1():void");
    }

    public final void J1(android.view.ViewGroup viewGroup, java.lang.String str, boolean z17, boolean z18, int i17, android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView;
        if (this.A.size() == this.f111925z) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "registerOuterSpace: disable origin three container");
            java.util.Map.Entry D1 = D1();
            u1(D1 != null ? (com.tencent.mm.plugin.finder.live.plugin.tn) D1.getValue() : null);
            B1(this.f111921v);
            B1(this.f111922w);
            B1(this.f111923x);
        }
        java.util.Map map = this.A;
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = new com.tencent.mm.plugin.finder.live.plugin.tn(this, viewGroup, map.size(), this.f111918s, false, z17, z18, i17, 8, null);
        tnVar.f114457x.addListener(new com.tencent.mm.plugin.finder.live.plugin.nn(tnVar));
        map.put(viewGroup, tnVar);
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar2 != null) {
            kotlin.jvm.internal.o.g(str, "<set-?>");
            tnVar2.f114454u = str;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "registerOuterSpace isCustomMode: " + z18 + " : info:" + this.A.get(viewGroup));
        java.util.Map map2 = this.B;
        android.animation.ValueAnimator y17 = y1(viewGroup, z17, valueAnimator);
        y17.addListener(new com.tencent.mm.plugin.finder.live.plugin.ko(this, viewGroup, y17, z17));
        ((java.util.concurrent.ConcurrentHashMap) map2).put(viewGroup, y17);
        java.util.Map map3 = this.C;
        android.animation.ValueAnimator A1 = A1(viewGroup, z17);
        A1.addListener(new com.tencent.mm.plugin.finder.live.plugin.mo(this, viewGroup));
        ((java.util.concurrent.ConcurrentHashMap) map3).put(viewGroup, A1);
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar3 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (tnVar3 == null || (finderLiveGiftTextView = tnVar3.f114447n.f114597g) == null) {
            return;
        }
        zl2.r4.f473950a.b3(finderLiveGiftTextView);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            super.K0(8);
            return;
        }
        if (((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            super.K0(8);
            this.f113327i = i17;
            return;
        }
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.N5).getValue()).r()).booleanValue()) {
            i17 = 8;
        }
        super.K0(i17);
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            this.f111917r.setVisibility(8);
        } else {
            M1(this.M);
        }
    }

    public final void K1(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        java.util.LinkedHashMap linkedHashMap;
        if (viewGroup == null || l1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet, originSpace BulletShowingInfo=" + this.A.get(viewGroup) + ", giftShowInfo=" + l1Var);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = viewGroup;
        java.lang.String str = l1Var.f115601s;
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
        if (!str.equals(tnVar != null ? tnVar.f114454u : null)) {
            java.util.Map map = this.A;
            synchronized (map) {
                linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114454u.equals(l1Var.f115601s)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((android.view.ViewGroup) ((java.util.Map.Entry) it.next()).getKey());
            }
            if (arrayList.isEmpty()) {
                return;
            } else {
                h0Var.f310123d = arrayList.get(0);
            }
        }
        if (!kotlin.jvm.internal.o.b(h0Var.f310123d, viewGroup)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "replaceBullet, targetSpace BulletShowingInfo=" + this.A.get(h0Var.f310123d));
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(viewGroup);
            if (tnVar2 != null) {
                tnVar2.a();
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar3 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(h0Var.f310123d);
        if (tnVar3 != null) {
            tnVar3.a();
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar4 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(h0Var.f310123d);
        if (tnVar4 != null && (atomicBoolean2 = tnVar4.f114437d) != null) {
            atomicBoolean2.getAndSet(true);
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar5 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(h0Var.f310123d);
        if (tnVar5 != null && (atomicBoolean = tnVar5.f114439f) != null) {
            atomicBoolean.getAndSet(kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || kotlin.jvm.internal.o.b(l1Var.f115596n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT"));
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar6 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(h0Var.f310123d);
        if (tnVar6 != null) {
            java.lang.String str2 = l1Var.f115593h;
            if (str2 == null) {
                str2 = "";
            }
            tnVar6.f114441h = str2;
        }
        df2.wy wyVar = (df2.wy) U0(df2.wy.class);
        if (wyVar != null) {
            wyVar.g7(l1Var);
        }
        tf2.k kVar = (tf2.k) U0(tf2.k.class);
        if (kVar != null) {
            kVar.a7(l1Var);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.oo(this, h0Var, viewGroup, l1Var));
    }

    public final long L1(java.lang.String str, boolean z17) {
        long longValue;
        ce2.i e17 = dk2.u7.f234181a.e(str);
        boolean z18 = false;
        if (e17 != null && e17.Y0()) {
            z18 = true;
        }
        if (z18) {
            return 300L;
        }
        long longValue2 = ((java.lang.Number) ae2.in.f3688a.H().r()).longValue();
        java.lang.Boolean bool = (java.lang.Boolean) dk2.u7.f234187g.get(str);
        if (z17 && kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            java.lang.Float f17 = (java.lang.Float) dk2.u7.f234193m.get(str);
            java.lang.Long l17 = (java.lang.Long) dk2.u7.f234192l.get(str);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "safeGetDuration: id:" + str + ",custom value = " + f17 + ", value = " + l17);
            if (f17 != null) {
                longValue = f17.floatValue();
            } else {
                if (l17 != null) {
                    longValue = l17.longValue() / 1000;
                }
                longValue = longValue2;
            }
        } else {
            java.lang.Long l18 = (java.lang.Long) dk2.u7.f234192l.get(str);
            if (l18 != null) {
                longValue = l18.longValue() / 1000;
            }
            longValue = longValue2;
        }
        if (0 != longValue) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "safeGetDuration: id:" + str + ", isCustomGift:" + z17 + ", customGiftReady:" + bool);
            return longValue;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "safeGetDuration: giftFullPagDurationMap id:" + str + ", isCustomGift:" + z17 + ", customGiftReady:" + bool + ", value = " + dk2.u7.f234192l.get(str));
        return longValue2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        if (com.tencent.mm.plugin.finder.live.plugin.xn.f115112a[status.ordinal()] == 1) {
            if (bundle != null && bundle.getBoolean("isShow")) {
                K0(8);
            } else {
                K0(0);
            }
        }
    }

    public final void M1(int i17) {
        this.M = i17;
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            i17 = 8;
        }
        this.f111917r.setVisibility(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.util.k1
    public void N(com.tencent.mm.plugin.finder.live.util.m1 giftType, java.util.List appendList) {
        kotlin.jvm.internal.o.g(giftType, "giftType");
        kotlin.jvm.internal.o.g(appendList, "appendList");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ho(this));
        I1();
    }

    public final boolean N1(com.tencent.mm.plugin.finder.live.plugin.tn tnVar, ug2.f fVar) {
        boolean z17 = true;
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = tnVar.f114437d.get() ^ true ? tnVar : null;
        if (tnVar2 == null) {
            return false;
        }
        tnVar.f114437d.getAndSet(true);
        if (fVar instanceof ug2.c) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.zo(tnVar, (ug2.c) fVar, this));
        } else {
            z17 = false;
        }
        if (z17) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.po(this, tnVar));
            tnVar2.f114451r = c01.id.c();
        }
        ((com.tencent.mm.plugin.finder.live.util.j1) this.f111916q).m(fVar);
        return z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "unMount");
        super.O0();
        this.H.d();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.vo(this));
        ((com.tencent.mm.plugin.finder.live.util.j1) this.f111916q).n(this);
        for (com.tencent.mm.plugin.finder.live.plugin.tn tnVar : this.A.values()) {
            tnVar.f114457x.removeAllListeners();
            tnVar.a();
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.B).entrySet().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it.next()).getValue()).removeAllListeners();
        }
        java.util.Iterator it6 = ((java.util.concurrent.ConcurrentHashMap) this.C).entrySet().iterator();
        while (it6.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it6.next()).getValue()).removeAllListeners();
        }
        this.f111914J = false;
        this.I.removeCallbacksAndMessages(null);
    }

    public final void P1(ug2.f fVar) {
        boolean z17 = fVar instanceof ug2.a;
        com.tencent.mm.plugin.finder.live.util.o1 o1Var = this.f111916q;
        qo0.c cVar = this.f111915p;
        if (z17) {
            android.os.Bundle bundle = new android.os.Bundle();
            ug2.a aVar = (ug2.a) fVar;
            bundle.putByteArray("PARAM_LIVE_GIFT_FUNDING_SUC_MSG", aVar.f427511a.toByteArray());
            java.lang.Long l17 = aVar.f427512b;
            if (l17 != null) {
                bundle.putLong("PARAM_LIVE_GIFT_FUNDING_ANIM_DURATION", l17.longValue());
            }
            cVar.statusChange(qo0.b.V1, bundle);
            ((com.tencent.mm.plugin.finder.live.util.j1) o1Var).m(fVar);
            return;
        }
        if (fVar instanceof ug2.g) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ug2.g gVar = (ug2.g) fVar;
            bundle2.putByteArray("PARAM_LIVE_GIFT_FUNDING_SUC_MSG", gVar.f427526a.toByteArray());
            java.lang.Long l18 = gVar.f427527b;
            if (l18 != null) {
                bundle2.putLong("PARAM_LIVE_GIFT_FUNDING_ANIM_DURATION", l18.longValue());
            }
            cVar.statusChange(qo0.b.V1, bundle2);
            ((com.tencent.mm.plugin.finder.live.util.j1) o1Var).m(fVar);
        }
    }

    public final void Q1(com.tencent.mm.plugin.finder.live.util.l1 l1Var, boolean z17) {
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.String str;
        r45.cj1 cj1Var;
        r45.kv1 kv1Var;
        java.util.LinkedList list;
        r45.cj1 cj1Var2;
        r45.ir1 ir1Var;
        java.util.LinkedList list2;
        r45.cj1 cj1Var3;
        boolean z18 = false;
        java.lang.Object obj2 = null;
        java.lang.String string = (l1Var == null || (cj1Var3 = l1Var.f115592g) == null) ? null : cj1Var3.getString(0);
        r45.xv1 xv1Var = l1Var != null ? l1Var.f115603u : null;
        if (kotlin.jvm.internal.o.b(l1Var != null ? l1Var.f115596n : null, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT")) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "showFullScreenPreciousGift giftId:" + string + " PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT mode. ignore");
            return;
        }
        java.util.List list3 = ((mm2.o4) P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list3, "<get-audienceLinkMicUserList>(...)");
        synchronized (list3) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list3) {
                if (kotlin.jvm.internal.o.b(((km2.q) obj3).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj3);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309172c, l1Var != null ? l1Var.f115601s : null)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        boolean z19 = obj != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFullScreenPreciousGift giftId:");
        sb6.append(string);
        sb6.append(" targetUsername:");
        sb6.append(l1Var != null ? l1Var.f115601s : null);
        sb6.append(" curPkUser:");
        km2.q l76 = ((mm2.o4) P0(mm2.o4.class)).l7();
        sb6.append(l76 != null ? l76.f309172c : null);
        sb6.append(" randomItem:");
        sb6.append((xv1Var == null || (list2 = xv1Var.getList(1)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
        sb6.append(" isOtherRoom:");
        sb6.append(z19);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
        java.util.List list4 = ((mm2.o4) P0(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list4, "<get-anchorPkMicUserList>(...)");
        synchronized (list4) {
            java.util.Iterator it6 = list4.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(l1Var != null ? l1Var.f115601s : null, ((km2.q) next).f309172c)) {
                    obj2 = next;
                    break;
                }
            }
        }
        if (obj2 != null || z19) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_LIVE_GIFT_INFO_Id", string);
        if (l1Var == null || (str = l1Var.f115593h) == null) {
            str = "";
        }
        bundle.putString("PARAM_LIVE_GIFT_COMBO_ID", str);
        bundle.putInt("PARAM_LIVE_GIFT_GESTURE_ID", (l1Var == null || (cj1Var2 = l1Var.f115592g) == null || (ir1Var = (r45.ir1) cj1Var2.getCustom(7)) == null) ? 0 : ir1Var.getInteger(0));
        bundle.putBoolean("PARAM_LIVE_GIFT_IS_FORCE_REPLACE", z17);
        bundle.putBoolean("PARAM_LIVE_GIFT_IS_FROM_SELF", l1Var != null ? l1Var.f115599q : false);
        if (xv1Var != null && (list = xv1Var.getList(1)) != null && (!list.isEmpty())) {
            z18 = true;
        }
        if (z18) {
            bundle.putByteArray("PARAM_LIVE_GIFT_RANDOM_ITEM", xv1Var.toByteArray());
        }
        if (l1Var != null && (cj1Var = l1Var.f115592g) != null && (kv1Var = (r45.kv1) cj1Var.getCustom(3)) != null) {
            bundle.putByteArray("PARAM_LIVE_GIFT_INFO", kv1Var.toByteArray());
        }
        this.f111915p.statusChange(qo0.b.U1, bundle);
    }

    public final void R1(boolean z17) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "stopCurrentPreciousGift");
        java.util.Map.Entry D1 = D1();
        if (D1 != null) {
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) D1.getValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "stopCurrentPreciousGift isFromBatchSend:" + tnVar.f114443j + ", comboSumCount:" + tnVar.f114442i + ",comboId:" + tnVar.f114441h);
            com.tencent.mm.plugin.finder.live.util.o1 o1Var = this.f111916q;
            java.lang.String str = tnVar.f114441h;
            com.tencent.mm.plugin.finder.live.util.j1 j1Var = (com.tencent.mm.plugin.finder.live.util.j1) o1Var;
            if (str == null) {
                j1Var.getClass();
            } else {
                com.tencent.mars.xlog.Log.i(j1Var.f115578k, "addSkipComboId:".concat(str));
                j1Var.f115575h.add(str);
                com.tencent.mars.xlog.Log.i(j1Var.f115578k, "remove comboId:".concat(str));
                synchronized (j1Var.f115569b) {
                    pm0.v.d0(j1Var.f115568a, new com.tencent.mm.plugin.finder.live.util.i1(str));
                }
            }
            T1(D1);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "[stopCurrentPreciousGift] findCurrentShowingPreciousGift = null, forceHideGift = " + z17);
            if (z17) {
                qo0.c.a(this.f111915p, qo0.b.X1, null, 2, null);
            }
        }
    }

    public final void T1(java.util.Map.Entry entry) {
        java.util.Map.Entry D1 = entry == null ? D1() : entry;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "stopPreciousGift entry:" + entry + ", realEntry:" + D1);
        if (D1 != null) {
            qo0.c.a(this.f111915p, qo0.b.X1, null, 2, null);
            ((com.tencent.mm.plugin.finder.live.plugin.tn) D1.getValue()).f114450q = 0L;
            ((com.tencent.mm.plugin.finder.live.plugin.tn) D1.getValue()).f114451r = 0L;
            if (((com.tencent.mm.plugin.finder.live.plugin.tn) D1.getValue()).f114456w) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: fake container");
                ((com.tencent.mm.plugin.finder.live.plugin.tn) D1.getValue()).f114437d.getAndSet(false);
                I1();
            } else {
                if (this.f111914J) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: preciousGiftBulletOutHandlerProcessing is true, skip");
                    return;
                }
                this.f111914J = true;
                android.os.Message obtainMessage = this.I.obtainMessage();
                obtainMessage.obj = D1.getKey();
                this.I.sendMessageDelayed(obtainMessage, 2000L);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: handler msg.obj = " + obtainMessage.obj);
            }
        }
    }

    public final void U1(android.view.ViewGroup viewGroup) {
        java.util.Map map = this.A;
        if (map.containsKey(viewGroup)) {
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) map.get(viewGroup);
            u1(tnVar);
            if (tnVar != null) {
                tnVar.f114457x.removeAllListeners();
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "unregisterOuterSpace: info:" + tnVar);
            map.remove(viewGroup);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.B;
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) concurrentHashMap.get(viewGroup);
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            concurrentHashMap.remove(viewGroup);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) this.C;
            android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) concurrentHashMap2.get(viewGroup);
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            concurrentHashMap2.remove(viewGroup);
            this.f111917r.removeView(viewGroup);
            if (map.size() == this.f111925z) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "unregisterOuterSpace: enable origin three container");
                C1(this.f111921v);
                C1(this.f111922w);
                C1(this.f111923x);
                M1(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W1(java.lang.String r12, com.tencent.mm.plugin.finder.live.plugin.tn r13, int r14, com.tencent.mm.plugin.finder.live.util.l1 r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ap.W1(java.lang.String, com.tencent.mm.plugin.finder.live.plugin.tn, int, com.tencent.mm.plugin.finder.live.util.l1):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.util.Map.Entry entry;
        com.tencent.mm.plugin.finder.live.util.l1 l1Var;
        com.tencent.mm.plugin.finder.live.util.j1 j1Var = (com.tencent.mm.plugin.finder.live.util.j1) this.f111916q;
        com.tencent.mm.plugin.finder.live.util.m1 d17 = j1Var.d();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "[checkIfGiftForceReplace] nextType:" + d17);
        if (d17 == null || d17.compareTo(com.tencent.mm.plugin.finder.live.util.m1.f115622g) > 0 || (entry = (java.util.Map.Entry) q26.h0.l(q26.h0.v(q26.h0.i(kz5.e1.u(this.A), com.tencent.mm.plugin.finder.live.plugin.yn.f115219d), com.tencent.mm.plugin.finder.live.plugin.zn.f115363d))) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "[checkIfGiftForceReplace] entry:" + entry.getValue());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) entry.getKey();
        synchronized (j1Var.f115569b) {
            l1Var = (com.tencent.mm.plugin.finder.live.util.l1) j1Var.f115568a.pollFirst();
        }
        K1(viewGroup, l1Var);
    }

    public final void u1(com.tencent.mm.plugin.finder.live.plugin.tn tnVar) {
        java.lang.Object obj;
        if (tnVar != null && tnVar.f114437d.get() && tnVar.f114439f.get() && !tnVar.f114456w && tnVar.f114439f.get()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "cloneToFakeContainer: origin info = " + tnVar);
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) this.A.get(this.f111924y);
            if (tnVar2 != null) {
                tnVar2.f114450q = tnVar.f114450q;
                tnVar2.f114451r = tnVar.f114451r;
                tnVar2.f114437d.getAndSet(true);
                if (this.H.e()) {
                    java.util.Iterator it = ((kz5.k0) kz5.n0.J(this.A.entrySet())).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.o.b(((java.util.Map.Entry) obj).getKey(), this.f111924y)) {
                                break;
                            }
                        }
                    }
                    w1((java.util.Map.Entry) obj);
                }
            }
        }
    }

    public final boolean v1(java.util.Map.Entry entry) {
        if (entry == null || !((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114437d.get() || ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114440g || ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114439f.get()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfOuterSpacePreciousGiftForceReplace: entry fail, ");
            sb6.append(entry != null ? (com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue() : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.l1 i17 = ((com.tencent.mm.plugin.finder.live.util.j1) this.f111916q).i(((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114454u);
        if (i17 == null || kotlin.jvm.internal.o.b(i17.f115596n, "PRECIOUS_GIFT_SCHEDULE_NONE")) {
            return false;
        }
        K1((android.view.ViewGroup) entry.getKey(), i17);
        com.tencent.mm.plugin.finder.live.util.j1 j1Var = (com.tencent.mm.plugin.finder.live.util.j1) this.f111916q;
        j1Var.getClass();
        synchronized (j1Var.f115569b) {
            j1Var.f115568a.remove(i17);
        }
        return true;
    }

    public final boolean w1(java.util.Map.Entry entry) {
        if (entry == null) {
            entry = D1();
        }
        if (entry == null) {
            return false;
        }
        long c17 = ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114450q - (c01.id.c() - ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114451r);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkIfPreciousGiftTimeOver: remainingTime=" + c17 + ", entry=" + entry);
        if (c17 > 100) {
            this.H.c(c17, c17);
            return true;
        }
        T1(entry);
        return false;
    }

    public final void x1() {
        java.util.Map map = this.A;
        android.widget.RelativeLayout relativeLayout = this.f111921v;
        if (map.get(relativeLayout) == null) {
            android.widget.RelativeLayout relativeLayout2 = this.f111921v;
            map.put(relativeLayout2, new com.tencent.mm.plugin.finder.live.plugin.tn(this, relativeLayout2, 0, this.f111918s, false, false, false, 0, 120, null));
            java.util.Map map2 = this.B;
            android.widget.RelativeLayout relativeLayout3 = this.f111921v;
            android.animation.ValueAnimator z17 = z1(this, relativeLayout3, false, null, 6, null);
            z17.addListener(new com.tencent.mm.plugin.finder.live.plugin.ko(this, relativeLayout, z17, false));
            ((java.util.concurrent.ConcurrentHashMap) map2).put(relativeLayout3, z17);
            java.util.Map map3 = this.C;
            android.animation.ValueAnimator A1 = A1(relativeLayout, false);
            A1.addListener(new com.tencent.mm.plugin.finder.live.plugin.mo(this, relativeLayout));
            ((java.util.concurrent.ConcurrentHashMap) map3).put(relativeLayout, A1);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "checkRecoverContainerOne restart register containerOne");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.util.k1
    public void y() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ho(this));
        I1();
    }

    public final android.animation.ValueAnimator y1(android.view.ViewGroup viewGroup, boolean z17, android.animation.ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            valueAnimator = z17 ? android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f, 1.0f) : android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", -500.0f, 0.0f);
            kotlin.jvm.internal.o.f(valueAnimator, "run(...)");
        }
        int i17 = N;
        valueAnimator.setDuration(i17 + 500);
        if (z17) {
            valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
            valueAnimator.setEvaluator(new com.tencent.mm.plugin.finder.live.plugin.mn(500, i17, new com.tencent.mm.plugin.finder.live.plugin.ao(this, viewGroup)));
        } else {
            valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
            valueAnimator.setEvaluator(new cn2.m(500, i17, new com.tencent.mm.plugin.finder.live.plugin.bo(this, viewGroup)));
        }
        return valueAnimator;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "mount");
        super.z0();
        ((com.tencent.mm.plugin.finder.live.util.j1) this.f111916q).l(this);
        java.util.Map map = this.A;
        for (com.tencent.mm.plugin.finder.live.plugin.tn tnVar : map.values()) {
            tnVar.getClass();
            tnVar.f114457x.addListener(new com.tencent.mm.plugin.finder.live.plugin.nn(tnVar));
        }
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) this.B).entrySet()) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) entry.getValue();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) entry.getKey();
            com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) map.get(entry.getKey());
            boolean z17 = tnVar2 != null ? tnVar2.f114436c : false;
            if (valueAnimator != null) {
                valueAnimator.addListener(new com.tencent.mm.plugin.finder.live.plugin.ko(this, viewGroup, valueAnimator, z17));
            }
        }
        for (java.util.Map.Entry entry2 : ((java.util.concurrent.ConcurrentHashMap) this.C).entrySet()) {
            android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) entry2.getValue();
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) entry2.getKey();
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new com.tencent.mm.plugin.finder.live.plugin.mo(this, viewGroup2));
            }
        }
        pm0.v.w(new com.tencent.mm.plugin.finder.live.plugin.fo(this));
        ((je2.t) P0(je2.t.class)).f299264g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.go(this));
    }

    public /* synthetic */ ap(android.view.ViewGroup viewGroup, qo0.c cVar, com.tencent.mm.plugin.finder.live.util.o1 o1Var, android.view.ViewGroup viewGroup2, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(viewGroup, cVar, o1Var, viewGroup2, (i17 & 16) != 0 ? false : z17);
    }
}
