package zi2;

/* loaded from: classes3.dex */
public final class w extends com.tencent.mm.plugin.finder.live.plugin.l implements lj2.x0, lj2.v0 {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f473153p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f473154q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f473155r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f473156s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f473157t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f473158u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f473159v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f473160w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Boolean f473161x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.view.FinderLiveShadeView shadeView, android.view.ViewGroup viewGroup) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(shadeView, "shadeView");
        this.f473153p = statusMonitor;
        this.f473154q = viewGroup;
        this.f473157t = jz5.h.b(new zi2.v(this));
        this.f473158u = jz5.h.b(new zi2.f(this));
        this.f473159v = jz5.h.b(new zi2.b(this));
        this.f473160w = jz5.h.b(new zi2.c(root, this));
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "FinderLiveMicCoverPlugin init");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.content.Intent intent = ((android.app.Activity) context).getIntent();
        if (intent != null) {
            long longExtra = intent.getLongExtra("CURRENT_FEED_ID", 0L);
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "feedId: " + longExtra);
            if (longExtra == 0 || !((mm2.e1) P0(mm2.e1.class)).g7()) {
                return;
            }
            me2.a aVar = !me2.c.f325921a.a(longExtra) ? null : (me2.a) me2.c.f325922b.remove(java.lang.Long.valueOf(longExtra));
            if (aVar != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "applyFeedData: " + aVar.f325919d.size());
                ((mm2.y2) P0(mm2.y2.class)).f329572y = aVar.f325918c;
                ((mm2.y2) P0(mm2.y2.class)).f329571x = aVar.f325916a;
                ((mm2.y2) P0(mm2.y2.class)).f329573z = aVar.f325917b;
                ((mm2.o4) P0(mm2.o4.class)).f329335z.clear();
                java.util.Collection values = aVar.f325919d.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(values)).iterator();
                while (it.hasNext()) {
                    km2.q qVar = (km2.q) it.next();
                    if (!kotlin.jvm.internal.o.b(((mm2.c1) P0(mm2.c1.class)).f328852o, qVar.f309172c)) {
                        if (qVar.f309177h) {
                            java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329324s;
                            if (list != null) {
                                list.add(qVar);
                            }
                        } else {
                            java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f329327v;
                            if (list2 != null) {
                                list2.add(qVar);
                            }
                        }
                        ((mm2.o4) P0(mm2.o4.class)).O7(qVar);
                    }
                }
                com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(R0(), aVar.f325917b, aVar.f325916a, aVar.f325918c, true, null, 16, null);
                me2.c cVar = me2.c.f325921a;
                java.util.Map channelMap = me2.c.f325922b;
                kotlin.jvm.internal.o.f(channelMap, "channelMap");
                kz5.h0.A(channelMap.keySet(), new me2.b(java.lang.Long.valueOf(longExtra)));
                java.util.Map ktvChannelMap = me2.c.f325923c;
                kotlin.jvm.internal.o.f(ktvChannelMap, "ktvChannelMap");
                kz5.h0.A(ktvChannelMap.keySet(), new me2.b(java.lang.Long.valueOf(longExtra)));
                java.util.Map ktvSurfaceTextureMap = me2.c.f325924d;
                kotlin.jvm.internal.o.f(ktvSurfaceTextureMap, "ktvSurfaceTextureMap");
                kz5.h0.A(ktvSurfaceTextureMap.keySet(), new me2.b(java.lang.Long.valueOf(longExtra)));
                x1().w(null, ((mm2.y2) P0(mm2.y2.class)).f329565r);
            }
        }
    }

    public final void A1(boolean z17) {
        java.util.ArrayList t17 = x1().t();
        if (t17 != null) {
            java.util.Iterator it = t17.iterator();
            while (it.hasNext()) {
                ((lj2.u0) it.next()).k(z17);
            }
        }
    }

    public final void B1() {
        java.util.Iterator it = ((fi2.a) x1()).t().iterator();
        while (it.hasNext()) {
            ((lj2.u0) it.next()).e();
        }
    }

    @Override // lj2.v0
    public com.tencent.mm.plugin.finder.live.plugin.l C(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return X0(modelClass);
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        df2.t6 t6Var = (df2.t6) U0(df2.t6.class);
        if (t6Var != null) {
            t6Var.g7(micUserMap);
        }
        x1().w(micUserMap, ((mm2.y2) P0(mm2.y2.class)).f329565r);
        if (micUserMap.get(((mm2.c1) P0(mm2.c1.class)).m8()) == null) {
            ((mm2.o4) P0(mm2.o4.class)).f329313h = false;
        }
    }

    public final void C1() {
        java.util.ArrayList t17 = x1().t();
        if (t17 != null) {
            java.util.Iterator it = t17.iterator();
            while (it.hasNext()) {
                wj2.w wVar = (wj2.w) ((lj2.u0) it.next());
                wVar.Y();
                com.tencent.mars.xlog.Log.i(wVar.getTAG(), "onNotifyLikeEnableUpdate");
            }
        }
    }

    public final void D1() {
        java.lang.String str;
        km2.q curBindLinkMicUser;
        fi2.a aVar = (fi2.a) x1();
        for (lj2.u0 u0Var : aVar.t()) {
            zi2.w wVar = aVar.f262801a;
            mm2.y2 y2Var = (mm2.y2) wVar.P0(mm2.y2.class);
            wj2.w wVar2 = (wj2.w) u0Var;
            km2.q curBindLinkMicUser2 = wVar2.getCurBindLinkMicUser();
            if (curBindLinkMicUser2 == null || (str = curBindLinkMicUser2.f309170a) == null) {
                str = "";
            }
            xh2.g Q6 = y2Var.Q6(str, zl2.r4.f473950a.w1());
            if (Q6 == null && ((om2.l) wVar.P0(om2.l.class)).R6() && (curBindLinkMicUser = wVar2.getCurBindLinkMicUser()) != null) {
                Q6 = new xh2.g(curBindLinkMicUser.f309183n, curBindLinkMicUser.f309191v, false);
            }
            if (Q6 != null) {
                wVar2.f(Q6.f454546a, Q6.f454547b, Q6.f454548c);
            }
        }
    }

    public final void E1(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "notifyUpdateMicSeatInfo: ".concat(source));
        com.tencent.mm.plugin.finder.live.util.y.e(this, kotlinx.coroutines.q1.f310570c, null, new zi2.g(this, null), 2, null);
    }

    public final void F1(boolean z17) {
        om2.i iVar;
        if (((mm2.e1) P0(mm2.e1.class)).b7() && (iVar = ((om2.g) P0(om2.g.class)).f346307n) != null && kotlin.jvm.internal.o.b(iVar.d(), ((mm2.c1) P0(mm2.c1.class)).m8())) {
            r45.ia4 ia4Var = iVar.f346323c;
            boolean z18 = false;
            if (ia4Var != null && ia4Var.f376873h == z17) {
                z18 = true;
            }
            if (z18) {
                return;
            }
            synchronized (ia4Var) {
                r45.ia4 ia4Var2 = iVar.f346323c;
                if (ia4Var2 != null) {
                    ia4Var2.f376873h = z17;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    public final void G1(java.lang.String userId, boolean z17) {
        kotlin.jvm.internal.o.g(userId, "userId");
        x1().i(userId, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H1(java.util.HashMap r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.H1(java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void I1(int i17, int i18) {
        android.view.View k17 = x1().k();
        jz5.f0 f0Var = null;
        android.view.ViewGroup.LayoutParams layoutParams = k17 != null ? k17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i18;
            android.view.ViewGroup p17 = x1().p();
            com.tencent.mm.view.ratio.RatioLayout ratioLayout = p17 instanceof com.tencent.mm.view.ratio.RatioLayout ? (com.tencent.mm.view.ratio.RatioLayout) p17 : null;
            if (ratioLayout != null) {
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C).getValue()).r()).intValue() != 1) {
                    com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "setCoverContentRootSize:FINDER_LIVE_ENABLE_RATIO_LAYOUT_ENHANCE is false");
                } else if (i18 > 0) {
                    ratioLayout.setExactlyHeight(i18);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiAreaLayout", "unsetExactlyHeight");
                    ratioLayout.f213704n = -1;
                }
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveMicCoverPlugin", "layoutParams is null");
        }
    }

    @Override // lj2.x0
    public void J() {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = V0().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new mf2.i(liveRoomControllerStore));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J1(java.util.LinkedList r23, boolean r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.J1(java.util.LinkedList, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // lj2.v0
    public void K(int i17) {
        if (i17 == 10001) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327258p2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (i17 != 10002) {
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        ml2.b4 b4Var2 = ml2.b4.f327250n2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 2);
        jSONObject2.put("pos", 3);
        ml2.r0.hj(r0Var2, b4Var2, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible: ");
        sb6.append(i17);
        sb6.append(", rootVisibility: ");
        android.view.ViewGroup viewGroup = this.f365323d;
        sb6.append(viewGroup.getVisibility());
        sb6.append(" alpha: ");
        sb6.append(viewGroup.getAlpha());
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", sb6.toString());
    }

    public final void K1(java.lang.String str) {
        x1().f(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // lj2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(java.util.HashMap r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.M(java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if ((r1 != -1) == true) goto L59;
     */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // lj2.x0
    public java.lang.Object O(xh2.a aVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "opChangeTagName newTagName: " + str + " micCoverData: " + aVar);
        int i17 = aVar.f454521b.f454553e;
        java.util.HashMap S6 = ((mm2.y2) P0(mm2.y2.class)).S6();
        S6.put(new java.lang.Integer(i17), str);
        return H1(S6, continuation);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        x1();
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "unMount");
    }

    @Override // lj2.x0
    public void S(int i17) {
        java.lang.Object obj;
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) P0(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        if ((obj != null) || zl2.r4.f473950a.w1() || ((mm2.c1) P0(mm2.c1.class)).T || ((mm2.n0) P0(mm2.n0.class)).f329273r) {
            return;
        }
        ml2.n4 n4Var = ml2.n4.f327763z;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 23");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        qo0.c cVar = this.f473153p;
        qo0.b bVar = qo0.b.V3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", i17);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", 2);
        cVar.statusChange(bVar, bundle);
    }

    @Override // lj2.v0
    public android.view.ViewGroup T() {
        return this.f473154q;
    }

    @Override // lj2.x0
    public boolean V() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    @Override // lj2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(km2.q r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.X(km2.q):void");
    }

    @Override // lj2.x0
    public kotlinx.coroutines.y0 a() {
        return R0().getViewScope();
    }

    @Override // lj2.v0
    public lj2.t0 a0() {
        return w1();
    }

    @Override // lj2.x0
    public void c(xh2.a micCoverData) {
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
        x1().c(micCoverData);
    }

    @Override // lj2.x0
    public void c0() {
        boolean x17 = zl2.r4.f473950a.x1();
        qo0.c cVar = this.f473153p;
        if (x17) {
            qo0.b bVar = qo0.b.f365366i4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
            cVar.statusChange(bVar, bundle);
        } else {
            qo0.c.a(cVar, qo0.b.f365397p0, null, 2, null);
        }
        F1(false);
    }

    @Override // lj2.x0
    public void e(xh2.a micCoverData) {
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
        if (w1().w()) {
            x1().e(micCoverData);
        }
    }

    @Override // lj2.v0
    public lj2.w0 f() {
        return lj2.w0.f318958d;
    }

    @Override // lj2.v0
    public void i0(int i17) {
        if (i17 == 10001) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327258p2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (i17 != 10002) {
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        ml2.b4 b4Var2 = ml2.b4.f327250n2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 1);
        jSONObject2.put("pos", 3);
        ml2.r0.hj(r0Var2, b4Var2, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // lj2.v0
    public boolean k0() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.S).getValue()).r()).intValue() == 1 && ((mm2.e1) P0(mm2.e1.class)).d7();
    }

    @Override // lj2.x0
    public zh2.b m() {
        return (zh2.b) U0(ch2.o2.class);
    }

    @Override // lj2.x0
    public void n0() {
        boolean x17 = zl2.r4.f473950a.x1();
        qo0.c cVar = this.f473153p;
        if (x17) {
            qo0.b bVar = qo0.b.f365366i4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            cVar.statusChange(bVar, bundle);
        } else {
            qo0.c.a(cVar, qo0.b.f365431x0, null, 2, null);
        }
        F1(true);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        x1().h();
        u1();
        mm2.y2 y2Var = (mm2.y2) P0(mm2.y2.class);
        y2Var.f329557g.observe(this, new zi2.h(this));
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new zi2.j(this, null), 3, null);
    }

    @Override // lj2.v0
    public com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController o(java.lang.Class ctrl) {
        kotlin.jvm.internal.o.g(ctrl, "ctrl");
        return U0(ctrl);
    }

    @Override // lj2.v0
    public qo0.c q() {
        return this.f113325g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (zl2.r4.f473950a.x1() && ((mm2.o4) P0(mm2.o4.class)).a7().f309192w != 1) {
            java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((km2.q) obj2).f309192w == 1) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar = (km2.q) obj2;
            if (qVar != null) {
                int i17 = ((mm2.o4) P0(mm2.o4.class)).a7().f309192w;
                java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
                kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    java.lang.String str = ((zn0.v) next).f474406d;
                    if (kotlin.jvm.internal.o.b(str, str)) {
                        obj = next;
                        break;
                    }
                }
                zn0.v vVar = (zn0.v) obj;
                if (vVar != null) {
                    vVar.f474413n = i17;
                }
                qVar.f309192w = i17;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "checkReplaceAnchorToFirstPos");
            ((mm2.o4) P0(mm2.o4.class)).a7().f309192w = 1;
            zn0.y yVar = zn0.x.f474414a;
            int size = yVar.f474415a.size();
            yVar.f474416b = 1;
            yVar.f474417c = size;
            E1("checkOnVoiceRoomUpdate");
        }
    }

    public void u1() {
        tn0.w0 Z0 = Z0();
        in0.q qVar = Z0 instanceof in0.q ? (in0.q) Z0 : null;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(R0(), qVar.T1, qVar.J(), qVar.W0(), true, null, 16, null);
        } else {
            com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(R0(), R0().getFullSEIData(), R0().getCurrentMicData(), R0().getAnchorSEIMsg(), true, null, 16, null);
        }
    }

    public final android.view.ViewGroup v1() {
        lj2.u0 d17 = ((fi2.a) x1()).d(((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n);
        if (d17 != null) {
            return d17.getAnchorAudioModeLayout();
        }
        return null;
    }

    public final zi2.y w1() {
        return (zi2.y) this.f473159v.getValue();
    }

    public final fi2.m x1() {
        fi2.m mVar = ((mm2.e1) P0(mm2.e1.class)).g7() ? (fi2.j1) ((jz5.n) this.f473157t).getValue() : (fi2.x0) ((jz5.n) this.f473158u).getValue();
        mVar.n(this.f473155r, this.f473156s);
        return mVar;
    }

    public final sj2.m y1(java.lang.String sdkUserId) {
        lj2.u0 u0Var;
        mh2.n0 f17;
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        if (((mm2.e1) P0(mm2.e1.class)).b7() && (f17 = ((fi2.j1) ((jz5.n) this.f473157t).getValue()).B().f()) != null && f17.isAttachedToWindow()) {
            int childCount = f17.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = f17.getChildAt(i17);
                if (childAt instanceof wj2.w) {
                    km2.q curBindLinkMicUser = ((wj2.w) childAt).getCurBindLinkMicUser();
                    if (kotlin.jvm.internal.o.b(curBindLinkMicUser != null ? curBindLinkMicUser.f309170a : null, sdkUserId)) {
                        u0Var = (lj2.u0) childAt;
                        break;
                    }
                }
            }
        }
        u0Var = null;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "getMicGiftCallback ktvcallback sdkUserId: " + sdkUserId + " callback: " + u0Var);
        if (u0Var != null) {
            return u0Var;
        }
        lj2.u0 d17 = ((fi2.a) x1()).d(sdkUserId);
        if (d17 != null) {
            return d17.getMicGiftCallback();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        K0(0);
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "mount: " + w0());
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new zi2.e(this, null), 3, null);
    }

    public final void z1(boolean z17, boolean z18) {
        java.util.ArrayList t17 = x1().t();
        if (t17 != null) {
            java.util.Iterator it = t17.iterator();
            while (it.hasNext()) {
                ((lj2.u0) it.next()).b(z17, z18);
            }
        }
    }
}
