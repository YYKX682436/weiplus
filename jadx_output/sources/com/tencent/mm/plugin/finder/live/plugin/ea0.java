package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ea0 extends com.tencent.mm.plugin.finder.live.plugin.l implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f112386p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f112387q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f112388r;

    /* renamed from: s, reason: collision with root package name */
    public final cm2.t f112389s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f112390t;

    /* renamed from: u, reason: collision with root package name */
    public so2.j5 f112391u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f112392v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(android.view.ViewGroup entranceRoot, android.view.ViewGroup shoppingWidgetRoot, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        super(shoppingWidgetRoot, statusMonitor, null);
        kotlin.jvm.internal.o.g(entranceRoot, "entranceRoot");
        kotlin.jvm.internal.o.g(shoppingWidgetRoot, "shoppingWidgetRoot");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112386p = shoppingWidgetRoot;
        this.f112387q = statusMonitor;
        this.f112388r = lVar;
        this.f112389s = tVar;
        this.f112390t = "Finder.LiveShoppingBubblePlugin";
        this.f112392v = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ca0(entranceRoot, this));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, cm2.m0 m0Var, boolean z17, l81.b1 b1Var, r45.y23 y23Var) {
        r45.ce0 ce0Var;
        boolean z18;
        boolean z19;
        java.lang.String str;
        cm2.m0 m0Var2;
        boolean z27;
        bw5.x7 x7Var;
        long j17;
        r45.bd5 bd5Var;
        android.content.Context context = ea0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gk2.e live = ea0Var.S0();
        com.tencent.mm.plugin.finder.live.view.k0 Y0 = ea0Var.Y0();
        kotlin.jvm.internal.o.g(live, "live");
        if (z17) {
            if (y23Var != null && (bd5Var = (r45.bd5) y23Var.getCustom(70)) != null) {
                ce0Var = (r45.ce0) bd5Var.getCustom(2);
            }
            ce0Var = null;
        } else {
            if (y23Var != null) {
                ce0Var = (r45.ce0) y23Var.getCustom(9);
            }
            ce0Var = null;
        }
        if (ce0Var == null || (x7Var = (bw5.x7) ce0Var.getCustom(10)) == null) {
            z18 = false;
            z19 = false;
            str = "";
        } else {
            byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
            kotlin.jvm.internal.o.d(s07);
            java.lang.String str2 = "live_bubble:" + ((mm2.e1) live.a(mm2.e1.class)).f328988r.getLong(0) + ':' + ((mm2.c1) live.a(mm2.c1.class)).f328852o + "::" + ((mm2.c1) live.a(mm2.c1.class)).f328861p2 + ':' + s07 + ':' + ((mm2.c1) live.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) live.a(mm2.c1.class)).f328791d3;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.getClass();
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            y4Var.f328306n = str2;
            p52.c cVar = p52.h.f352016a;
            java.lang.String obj = s07.toString();
            bw5.u7 f17 = x7Var.f();
            java.lang.String appid = f17 != null ? f17.getAppid() : null;
            n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
            long j18 = ((mm2.e1) live.a(mm2.e1.class)).f328988r.getLong(0);
            ((m30.m) rVar).getClass();
            java.lang.String q17 = b52.b.q(j18);
            n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
            long j19 = ((mm2.c1) live.a(mm2.c1.class)).f328861p2;
            ((m30.m) rVar2).getClass();
            cVar.g(obj, appid, q17, "", b52.b.q(j19));
            bw5.x7 x7Var2 = new bw5.x7();
            x7Var2.f34983q = x7Var.b();
            boolean[] zArr = x7Var2.f34984r;
            zArr[11] = true;
            x7Var2.f34979m = x7Var.f34979m;
            zArr[7] = true;
            x7Var2.f34973d = 4;
            zArr[1] = true;
            x7Var2.j(new java.util.LinkedList(kz5.b0.c("wxa")));
            bw5.u7 u7Var = new bw5.u7();
            u7Var.e(ce0Var.getString(0));
            u7Var.f(ce0Var.getString(1));
            u7Var.g(1177);
            u7Var.i(str2);
            u7Var.f33760m = true;
            boolean[] zArr2 = u7Var.f33768u;
            zArr2[7] = true;
            u7Var.f33761n = 1;
            zArr2[8] = true;
            u7Var.f33764q = z17;
            zArr2[11] = true;
            bw5.t7 t7Var = new bw5.t7();
            t7Var.f33282d = z17;
            boolean[] zArr3 = t7Var.f33287i;
            zArr3[1] = true;
            t7Var.f33286h = ce0Var.getBoolean(8);
            zArr3[5] = true;
            t7Var.f33283e = true;
            zArr3[2] = true;
            u7Var.f33766s = t7Var;
            zArr2[13] = true;
            x7Var2.k(u7Var);
            pq.a aVar = new pq.a(context);
            if (z17) {
                str = "";
                z18 = false;
            } else {
                dk2.ah ahVar = new dk2.ah();
                java.lang.String str3 = ((mm2.c1) live.a(mm2.c1.class)).f328852o;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                ahVar.f233217m = str3;
                java.lang.String string = y23Var != null ? y23Var.getString(13) : null;
                if (string == null) {
                    string = "";
                }
                ahVar.f233211d = string;
                if (y23Var != null) {
                    z18 = false;
                    j17 = y23Var.getLong(0);
                } else {
                    z18 = false;
                    j17 = 0;
                }
                ahVar.f233212e = j17;
                str = "";
                ahVar.f233215h = str;
                ahVar.f233220p = 3;
                ahVar.f233221q = s07;
                ahVar.f233224t = z18;
                ahVar.f233218n = ce0Var.getInteger(6) == 1 ? true : z18;
                ahVar.f233227w = ce0Var.getBoolean(8) ? true : z18;
                ahVar.f233219o = "bubble";
                aVar.b(ahVar.b());
            }
            aVar.f357554d.f357556a = new st2.e(new java.lang.ref.WeakReference(context), ce0Var, Y0, live, y23Var);
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var2, null, 4, null);
            z19 = true;
        }
        if (z19) {
            m0Var2 = m0Var;
            com.tencent.mm.plugin.finder.live.util.y.m(ea0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.r90(ea0Var, m0Var2, y23Var, null), 3, null);
            z27 = true;
        } else {
            m0Var2 = m0Var;
            z27 = z18;
        }
        if (z27) {
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String string2 = y23Var.getString(26);
        jSONObject.put("cookies", string2 == null ? str : string2);
        appBrandLaunchReferrer.f77322d = 1;
        appBrandLaunchReferrer.f77325g = jSONObject.toString();
        b1Var.f317041s = appBrandLaunchReferrer;
        r45.ce0 i17 = zl2.q4.f473933a.i(b1Var);
        com.tencent.mm.plugin.appbrand.config.l e17 = b1Var.G.e();
        st2.c2 c2Var = st2.c2.f412249a;
        e17.f77541u = c2Var.b(ea0Var.S0(), m0Var2.f43368v, i17);
        b1Var.G = e17.a();
        c2Var.k(b1Var);
        com.tencent.mm.plugin.finder.live.util.y.m(ea0Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.q90(z17, ea0Var, m0Var, b1Var, y23Var, null), 3, null);
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, boolean z17) {
        yz5.l lVar;
        boolean x07 = ea0Var.x0();
        boolean L9 = ((mm2.c1) ea0Var.S0().a(mm2.c1.class)).L9();
        boolean y17 = com.tencent.mm.ui.bk.y();
        com.tencent.mars.xlog.Log.i(ea0Var.f112390t, "onShoppingBubbleClick btnClick:" + z17 + " isLandscape:" + x07 + " supportRotate:" + L9 + " inMagicWindowMode:" + y17);
        so2.j5 j5Var = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f329049w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        if (tVar != null && (lVar = ea0Var.f112388r) != null) {
            lVar.invoke(tVar);
        }
        if (x07 && L9 && !y17) {
            com.tencent.mm.plugin.finder.live.plugin.l.s1(ea0Var, "PORTRAIT_ACTION_BUBBLE_CLICK", java.lang.Boolean.valueOf(z17), 0, 4, null);
        } else {
            ea0Var.B1(z17, false);
        }
    }

    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, boolean z17, cm2.m0 m0Var, l81.b1 b1Var) {
        ea0Var.getClass();
        r45.y23 y23Var = m0Var.f43368v;
        r45.gt3 gt3Var = (r45.gt3) y23Var.getCustom(61);
        boolean z18 = true;
        java.lang.String string = gt3Var != null ? gt3Var.getString(1) : null;
        int i17 = ((string == null || string.length() == 0) ? 1 : 0) ^ 1;
        st2.g3 g3Var = st2.g3.f412326a;
        org.json.JSONObject k17 = g3Var.k(y23Var);
        g3Var.h(k17, m0Var.f43368v.getList(54));
        k17.put("click_type", z17 ? 1 : 0);
        if (z17) {
            k17.put("buy_btn_word", ea0Var.y1().getActionBtn().getText().toString());
        }
        k17.put("if_explaining", y23Var.getInteger(10));
        k17.put("product_flag", ea0Var.z1(m0Var));
        k17.put("is_gift_show", i17);
        r45.bd5 bd5Var = (r45.bd5) y23Var.getCustom(70);
        java.lang.String string2 = bd5Var != null ? bd5Var.getString(0) : null;
        if (string2 != null && string2.length() != 0) {
            z18 = false;
        }
        if (z18) {
            string2 = y23Var.getString(15);
        }
        k17.put("buy_btn_word", string2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on click, product_button_info button_wording:");
        r45.bd5 bd5Var2 = (r45.bd5) y23Var.getCustom(70);
        sb6.append(bd5Var2 != null ? bd5Var2.getString(0) : null);
        sb6.append(", button_wording:");
        sb6.append(y23Var.getString(15));
        com.tencent.mars.xlog.Log.i(ea0Var.f112390t, sb6.toString());
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f327432f, b1Var != null ? b1Var.f317034l : null, java.lang.String.valueOf(y23Var.getLong(0)), null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112389s;
    }

    public final void A1(cm2.m0 m0Var, boolean z17, boolean z18) {
        r45.ce0 ce0Var;
        r45.y23 y23Var = m0Var.f43368v;
        if ((zl2.r4.f473950a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) && !z18 && !z17) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", y23Var.getLong(0));
            this.f112387q.statusChange(qo0.b.f365349f2, bundle);
            return;
        }
        r45.bd5 bd5Var = (r45.bd5) y23Var.getCustom(70);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (bd5Var == null || (ce0Var = (r45.ce0) bd5Var.getCustom(2)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ce0Var.getCustom(9);
        r45.bd5 bd5Var2 = (r45.bd5) y23Var.getCustom(70);
        java.lang.String string = bd5Var2 != null ? bd5Var2.getString(0) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shopping bubble click, btnClick:");
        sb6.append(z17);
        sb6.append(", productId:");
        sb6.append(y23Var.getLong(0));
        sb6.append(",buy appId:");
        r45.ce0 ce0Var2 = (r45.ce0) y23Var.getCustom(8);
        sb6.append(ce0Var2 != null ? ce0Var2.getString(0) : null);
        sb6.append(",buy path:");
        r45.ce0 ce0Var3 = (r45.ce0) y23Var.getCustom(8);
        sb6.append(ce0Var3 != null ? ce0Var3.getString(1) : null);
        sb6.append(",detail appId:");
        r45.ce0 ce0Var4 = (r45.ce0) y23Var.getCustom(9);
        sb6.append(ce0Var4 != null ? ce0Var4.getString(0) : null);
        sb6.append(" detail path:");
        r45.ce0 ce0Var5 = (r45.ce0) y23Var.getCustom(9);
        sb6.append(ce0Var5 != null ? ce0Var5.getString(1) : null);
        sb6.append(", detail stockId: ");
        sb6.append(y23Var.getString(14));
        sb6.append(", detail disCountPrice: ");
        sb6.append(y23Var.getInteger(18));
        sb6.append(",buttonWording = ");
        sb6.append(string);
        sb6.append(", jumpInfo = ");
        sb6.append(finderJumpInfo);
        com.tencent.mars.xlog.Log.i(this.f112390t, sb6.toString());
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.p90(finderJumpInfo, this, z17, m0Var, y23Var, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "PORTRAIT_ACTION_BUBBLE_CLICK")) {
            com.tencent.mm.plugin.finder.live.plugin.s90 s90Var = new com.tencent.mm.plugin.finder.live.plugin.s90(this, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(s90Var, j17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if ((r10.length() > 0) == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ea0.B1(boolean, boolean):void");
    }

    public final void C1() {
        if (this.f112387q.getLiveRole() != 2) {
            return;
        }
        so2.j5 j5Var = ((mm2.f6) P0(mm2.f6.class)).f329049w;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.z90(this, m0Var, null), 3, null);
    }

    public final void D1(cm2.k0 newCouponItem) {
        kotlin.jvm.internal.o.g(newCouponItem, "newCouponItem");
        com.tencent.mars.xlog.Log.i(this.f112390t, "[updateCouponBubble] " + newCouponItem);
        qo0.b bVar = qo0.b.N2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 J2 = zl2.r4.f473950a.J2(newCouponItem);
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.toByteArray() : null);
        this.f112387q.statusChange(bVar, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w(this.f112390t, "setVisible return for isTeenMode");
        } else {
            if (((mm2.c1) P0(mm2.c1.class)).a8() || i17 != 0) {
                super.K0(i17);
                return;
            }
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).n(this.f112386p, i17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        mm2.f6 f6Var;
        mm2.y5 y5Var;
        r45.y23 y23Var;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 85) {
            if (ordinal != 90) {
                return;
            }
            so2.j5 j5Var = ((mm2.f6) S0().a(mm2.f6.class)).f329049w;
            if (j5Var instanceof cm2.k0) {
                D1((cm2.k0) j5Var);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f112390t, "shopping panel hide → replay pending subsidy anim if needed");
        xt2.e3 y17 = y1();
        gk2.e eVar = y17.R;
        if (eVar == null || (y5Var = (f6Var = (mm2.f6) eVar.a(mm2.f6.class)).I) == null) {
            return;
        }
        java.lang.Long l17 = null;
        f6Var.I = null;
        so2.j5 j5Var2 = f6Var.f329049w;
        cm2.m0 m0Var = j5Var2 instanceof cm2.m0 ? (cm2.m0) j5Var2 : null;
        java.lang.String str = y17.f456706h;
        long j17 = y5Var.f329574a;
        if (m0Var == null || m0Var.f43368v.getLong(0) != j17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subsidyAnim replay skipped: productId changed (");
            sb6.append(j17);
            sb6.append(" → ");
            if (m0Var != null && (y23Var = m0Var.f43368v) != null) {
                l17 = java.lang.Long.valueOf(y23Var.getLong(0));
            }
            sb6.append(l17);
            sb6.append(')');
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            return;
        }
        long j18 = y5Var.f329575b.getLong(4);
        long c17 = c01.id.c() / 1000;
        if (j18 > c17) {
            synchronized (xt2.e3.f456700y0) {
                xt2.e3.f456699l1.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            com.tencent.mm.plugin.finder.live.util.y.m(y17.f456705g, null, null, new xt2.v2(y17, m0Var, y5Var, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "subsidyAnim replay skipped: subsidy expired, productId=" + j17 + ", endTime=" + j18 + ", now=" + c17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView couponView = y1().getCouponView();
        boolean z17 = false;
        if (couponView != null && couponView.isShown()) {
            z17 = true;
        }
        return z17 ? com.tencent.mm.R.id.bzl : com.tencent.mm.R.id.bys;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.da0(data, this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f112386p;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        y1().n(S0(), data);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.unregisterPlugin(com.tencent.mm.plugin.finder.live.plugin.ea0.class);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView couponView = y1().getCouponView();
        boolean z17 = false;
        if (couponView != null && couponView.isShown()) {
            z17 = true;
        }
        return z17 ? com.tencent.mm.R.id.ckg : com.tencent.mm.R.id.hhj;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void w1(boolean z17) {
        so2.j5 j5Var = ((mm2.f6) S0().a(mm2.f6.class)).f329049w;
        java.lang.String str = this.f112390t;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "stop syncCouponOrGoods " + this.f112391u);
            so2.j5 j5Var2 = this.f112391u;
            if (j5Var2 instanceof cm2.m0) {
                dk2.ef efVar = dk2.ef.f233372a;
                dk2.ef.f233392k.f(2);
            } else if (j5Var2 instanceof cm2.k0) {
                dk2.ef efVar2 = dk2.ef.f233372a;
                dk2.ef.f233392k.f(1);
            }
            this.f112391u = null;
            return;
        }
        if ((j5Var instanceof cm2.k0) && !kotlin.jvm.internal.o.b(j5Var, this.f112391u)) {
            if (this.f112391u instanceof cm2.m0) {
                dk2.ef efVar3 = dk2.ef.f233372a;
                dk2.ef.f233392k.f(2);
            }
            this.f112391u = j5Var;
            com.tencent.mars.xlog.Log.i(str, "start SyncCoupon " + this.f112391u);
            r45.my2 my2Var = new r45.my2();
            my2Var.set(0, ((cm2.k0) j5Var).f43362x);
            dk2.ef efVar4 = dk2.ef.f233372a;
            dk2.ef.f233392k.e(1, my2Var, new com.tencent.mm.plugin.finder.live.plugin.k90(this, r45.ny2.class), false);
            return;
        }
        if (!(j5Var instanceof cm2.m0) || kotlin.jvm.internal.o.b(j5Var, this.f112391u)) {
            return;
        }
        if (this.f112391u instanceof cm2.k0) {
            dk2.ef efVar5 = dk2.ef.f233372a;
            dk2.ef.f233392k.f(1);
        }
        this.f112391u = j5Var;
        r45.xy2 xy2Var = new r45.xy2();
        xy2Var.set(0, java.lang.Long.valueOf(((cm2.m0) j5Var).f43369w));
        xy2Var.set(1, ((mm2.c1) P0(mm2.c1.class)).P3);
        xy2Var.set(2, 1);
        com.tencent.mars.xlog.Log.i(str, "start SyncGoods " + this.f112391u);
        dk2.ef efVar6 = dk2.ef.f233372a;
        dk2.ef.f233392k.e(2, xy2Var, new com.tencent.mm.plugin.finder.live.plugin.l90(xy2Var, this, r45.yy2.class), false);
    }

    public final void x1(yz5.a aVar) {
        java.lang.String str;
        so2.j5 j5Var = ((mm2.f6) P0(mm2.f6.class)).f329049w;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var == null) {
            return;
        }
        qo0.c cVar = this.f112387q;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        mm2.e1 e1Var = (mm2.e1) ((com.tencent.mm.plugin.finder.live.view.k0) cVar).getBuContext().a(mm2.e1.class);
        long j17 = e1Var.f328983m;
        long j18 = e1Var.f328988r.getLong(0);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        byte[] bArr = ((mm2.e1) S0().a(mm2.e1.class)).f328985o;
        java.lang.String str2 = m0Var.f43387f;
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(m0Var.f43368v.toByteArray());
        java.lang.String f17 = zl2.r4.f473950a.f1(S0(), null);
        java.lang.String str3 = ((mm2.e1) P0(mm2.e1.class)).f328993w;
        gk2.e eVar = gk2.e.f272471n;
        if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f328791d3) == null) {
            str = "";
        }
        pq5.g l17 = new ke2.v(j17, j18, 5, e17, bArr, str2, gVar, f17, str3, str).l();
        l17.K(new com.tencent.mm.plugin.finder.live.plugin.m90(aVar, m0Var, this));
        android.content.Context context2 = this.f365323d.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
        if (mMActivity != null) {
            l17.f(mMActivity);
        }
    }

    public final xt2.e3 y1() {
        return (xt2.e3) ((jz5.n) this.f112392v).getValue();
    }

    public final org.json.JSONArray z1(cm2.m0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.LinkedList list = item.f43368v.getList(54);
        kotlin.jvm.internal.o.f(list, "getShow_box_item_lists(...)");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.LinkedList<r45.p56> list2 = ((r45.q56) it.next()).getList(0);
            kotlin.jvm.internal.o.f(list2, "getShow_box_items(...)");
            for (r45.p56 p56Var : list2) {
                try {
                    jSONArray.put(new org.json.JSONObject(p56Var.getString(3)));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(this.f112390t, e17, "parse report data " + p56Var.getString(3) + " failed", new java.lang.Object[0]);
                }
            }
        }
        return jSONArray;
    }
}
