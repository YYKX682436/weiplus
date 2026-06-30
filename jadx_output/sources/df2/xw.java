package df2;

/* loaded from: classes3.dex */
public final class xw extends if2.b implements if2.e {

    /* renamed from: w, reason: collision with root package name */
    public static final df2.nw f231808w = new df2.nw(null);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f231809m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f231810n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f231811o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f231812p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f231813q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f231814r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f231815s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f231816t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f231817u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f231818v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231809m = new java.util.ArrayList();
        this.f231813q = new androidx.lifecycle.j0(java.lang.Boolean.FALSE);
        this.f231816t = new java.util.LinkedList();
    }

    public static final java.lang.String Z6(df2.xw xwVar) {
        if (!((mm2.c1) xwVar.business(mm2.c1.class)).T && g92.b.f269769e.k2().getInteger(4) != 2) {
            return zl2.r4.f473950a.h0(xwVar.O6());
        }
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.d(r17);
        return r17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a7(df2.xw r6, java.util.List r7) {
        /*
            r6.getClass()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r7.next()
            so0.c r1 = (so0.c) r1
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.o.g(r1, r2)
            r2 = 0
            byte[] r3 = r1.f410209f     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L50
            r45.ch1 r4 = new r45.ch1     // Catch: java.lang.Exception -> L38
            r4.<init>()     // Catch: java.lang.Exception -> L38
            r4.parseFrom(r3)     // Catch: java.lang.Exception -> L2b
            goto L51
        L2b:
            r3 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.String r5 = ""
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L38
            com.tencent.mm.sdk.platformtools.Log.a(r4, r5, r3)     // Catch: java.lang.Exception -> L38
            goto L50
        L38:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[FinderLiveShopMsg.getAppMsg] e:"
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "LiveShopMsgCommon"
            com.tencent.mars.xlog.Log.i(r4, r3)
        L50:
            r4 = r2
        L51:
            if (r4 == 0) goto Lc
            java.lang.Class<we2.s> r3 = we2.s.class
            androidx.lifecycle.c1 r3 = r6.business(r3)
            we2.s r3 = (we2.s) r3
            r3.getClass()
            we2.p r3 = r3.f445255g
            dk2.zf r3 = r3.b(r4)
            if (r3 == 0) goto Lc
            boolean r4 = r3 instanceof dk2.dg
            if (r4 == 0) goto L6e
            r4 = r3
            dk2.dg r4 = (dk2.dg) r4
            goto L6f
        L6e:
            r4 = r2
        L6f:
            if (r4 != 0) goto L72
            goto L8d
        L72:
            int r1 = r1.f410213j
            if (r1 == 0) goto L83
            r5 = 1
            if (r1 == r5) goto L80
            r5 = 2
            if (r1 == r5) goto L7d
            goto L85
        L7d:
            r45.d54 r2 = r45.d54.LOADING
            goto L85
        L80:
            r45.d54 r2 = r45.d54.FAILED
            goto L85
        L83:
            r45.d54 r2 = r45.d54.SUCCESS
        L85:
            java.lang.String r1 = "forNumber(...)"
            kotlin.jvm.internal.o.f(r2, r1)
            r4.t(r2)
        L8d:
            r0.add(r3)
            goto Lc
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.xw.a7(df2.xw, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(df2.xw r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.xw.b7(df2.xw, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long c7() {
        return ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
    }

    public final qo2.e d7() {
        return ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Zj();
    }

    public final boolean e7() {
        java.lang.Boolean bool = (java.lang.Boolean) this.f231813q.getValue();
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void f7(java.lang.String content, java.lang.String str) {
        kotlin.jvm.internal.o.g(content, "content");
        if (((mm2.c1) business(mm2.c1.class)).T) {
            return;
        }
        mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
        if (n0Var != null && n0Var.f329273r) {
            return;
        }
        java.lang.String str2 = this.f231810n;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.i("LiveShopMsgDataController", "[postMsg] sessionId empty");
            return;
        }
        r45.xn1 xn1Var = new r45.xn1();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        finderContact.setUsername(((mm2.c1) business(mm2.c1.class)).f328852o);
        xn1Var.set(0, finderContact);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, xn1Var);
        r45.xn1 xn1Var2 = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var2.set(0, r4Var.m0(getStore().getLiveRoomData()));
        xn1Var2.set(11, ((mm2.c1) business(mm2.c1.class)).f328812h);
        xn1Var2.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var2);
        r45.xj1 xj1Var = new r45.xj1();
        xj1Var.set(0, content);
        r45.up2 up2Var = new r45.up2();
        kn0.e a17 = hn0.v.f282440a.a();
        up2Var.set(0, a17 != null ? a17.B : null);
        xj1Var.set(1, up2Var);
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(xj1Var.toByteArray()));
        ch1Var.set(1, 20002);
        ch1Var.set(10, 0);
        ch1Var.set(2, str == null ? zl2.q4.f473933a.m() : str);
        ch1Var.set(16, java.lang.Long.valueOf(c7()));
        h0Var.f310123d = ch1Var;
        com.tencent.mars.xlog.Log.i("LiveShopMsgDataController", "[postMsg] sessionId:" + this.f231810n + ", anchorUserName: " + ((mm2.c1) business(mm2.c1.class)).f328852o + ", content:" + content + ", resendClientMsgId:" + str);
        we2.s sVar = (we2.s) business(we2.s.class);
        r45.ch1 msg = (r45.ch1) h0Var.f310123d;
        sVar.getClass();
        kotlin.jvm.internal.o.g(msg, "msg");
        dk2.zf b17 = sVar.f445255g.b(msg);
        pm0.v.X(new df2.uw(b17, this, str));
        df2.nw nwVar = f231808w;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str3 = this.f231810n;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[0] = new jz5.l("sessionid", str3);
        lVarArr[1] = new jz5.l("sessionid_msg_text", content);
        nwVar.a(7, kz5.c1.k(lVarArr));
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.vw(str, h0Var, this, xn1Var, b17, content, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        androidx.lifecycle.j0 j0Var;
        r45.up1 up1Var;
        androidx.lifecycle.j0 j0Var2;
        r45.up1 up1Var2;
        super.onLiveMsg(r71Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canAskProduct: isBoxLive = ");
        sb6.append(com.tencent.mm.plugin.finder.assist.o0.f102420a.a(getStore().getLiveRoomData()));
        sb6.append(", flag = ");
        sb6.append((r71Var == null || (up1Var2 = (r45.up1) r71Var.getCustom(32)) == null) ? null : java.lang.Long.valueOf(up1Var2.getLong(7)));
        com.tencent.mars.xlog.Log.i("LiveShopMsgDataController", sb6.toString());
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ae2.in.T6.r()).booleanValue()) {
            df2.xw xwVar = (df2.xw) getStore().controller(df2.xw.class);
            if (xwVar == null || (j0Var2 = xwVar.f231813q) == null) {
                return;
            }
            j0Var2.postValue(java.lang.Boolean.TRUE);
            return;
        }
        df2.xw xwVar2 = (df2.xw) getStore().controller(df2.xw.class);
        if (xwVar2 == null || (j0Var = xwVar2.f231813q) == null) {
            return;
        }
        j0Var.postValue(java.lang.Boolean.valueOf(pm0.v.A((r71Var == null || (up1Var = (r45.up1) r71Var.getCustom(32)) == null) ? 0L : up1Var.getLong(7), 1L)));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        androidx.lifecycle.j0 j0Var;
        r45.up1 up1Var;
        androidx.lifecycle.j0 j0Var2;
        r45.up1 up1Var2;
        super.onLiveStart(hc1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canAskProduct: isBoxLive = ");
        sb6.append(com.tencent.mm.plugin.finder.assist.o0.f102420a.a(getStore().getLiveRoomData()));
        sb6.append(", flag = ");
        sb6.append((hc1Var == null || (up1Var2 = (r45.up1) hc1Var.getCustom(68)) == null) ? null : java.lang.Long.valueOf(up1Var2.getLong(7)));
        com.tencent.mars.xlog.Log.i("LiveShopMsgDataController", sb6.toString());
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ae2.in.T6.r()).booleanValue()) {
            df2.xw xwVar = (df2.xw) getStore().controller(df2.xw.class);
            if (xwVar == null || (j0Var2 = xwVar.f231813q) == null) {
                return;
            }
            j0Var2.postValue(java.lang.Boolean.TRUE);
            return;
        }
        df2.xw xwVar2 = (df2.xw) getStore().controller(df2.xw.class);
        if (xwVar2 == null || (j0Var = xwVar2.f231813q) == null) {
            return;
        }
        j0Var.postValue(java.lang.Boolean.valueOf(pm0.v.A((hc1Var == null || (up1Var = (r45.up1) hc1Var.getCustom(68)) == null) ? 0L : up1Var.getLong(7), 1L)));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.sdk.event.IListener iListener = this.f231817u;
        if (iListener != null) {
            iListener.dead();
        }
        final com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveShopMsgEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveShopMsgEvent>(ubVar) { // from class: com.tencent.mm.plugin.finder.live.controller.LiveVisitorShopMsgDataController$initReceiveMsgListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.tencent.mm.plugin.finder.live.view.k0) ubVar);
                kotlin.jvm.internal.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                this.__eventId = 633350705;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveShopMsgEvent finderLiveShopMsgEvent) {
                com.tencent.mm.autogen.events.FinderLiveShopMsgEvent event = finderLiveShopMsgEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (((mm2.c1) df2.xw.this.business(mm2.c1.class)).T) {
                    return false;
                }
                mm2.n0 n0Var = (mm2.n0) df2.xw.this.business(mm2.n0.class);
                if (n0Var != null && n0Var.f329273r) {
                    return false;
                }
                df2.xw xwVar = df2.xw.this;
                com.tencent.mm.plugin.finder.live.util.y.o(xwVar, kotlinx.coroutines.q1.f310570c, null, new df2.qw(xwVar, event, null), 2, null);
                return true;
            }
        };
        this.f231817u = iListener2;
        iListener2.alive();
        com.tencent.mm.sdk.event.IListener iListener3 = this.f231818v;
        if (iListener3 != null) {
            iListener3.dead();
        }
        final com.tencent.mm.plugin.finder.live.view.ub ubVar2 = this.f291099e;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ResendFinderLiveShopMsgEvent> iListener4 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ResendFinderLiveShopMsgEvent>(ubVar2) { // from class: com.tencent.mm.plugin.finder.live.controller.LiveVisitorShopMsgDataController$initResendMsgListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.tencent.mm.plugin.finder.live.view.k0) ubVar2);
                kotlin.jvm.internal.o.e(ubVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                this.__eventId = -1535684532;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ResendFinderLiveShopMsgEvent resendFinderLiveShopMsgEvent) {
                com.tencent.mm.autogen.events.ResendFinderLiveShopMsgEvent event = resendFinderLiveShopMsgEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.sr srVar = event.f54703g;
                java.lang.String content = srVar.f7930a;
                kotlin.jvm.internal.o.f(content, "content");
                df2.xw.this.f7(content, srVar.f7931b);
                return true;
            }
        };
        this.f231818v = iListener4;
        iListener4.alive();
        this.f231813q.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.tw(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mm.sdk.event.IListener iListener = this.f231817u;
        if (iListener != null) {
            iListener.dead();
        }
        this.f231817u = null;
        com.tencent.mm.sdk.event.IListener iListener2 = this.f231818v;
        if (iListener2 != null) {
            iListener2.dead();
        }
        this.f231818v = null;
        this.f231812p = false;
        this.f231809m.clear();
        this.f231810n = null;
        this.f231815s = false;
        this.f231814r = false;
    }
}
