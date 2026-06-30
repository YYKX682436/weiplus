package kb0;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.g2 f306197a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f306198b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f306199c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f306200d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f306201e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f306202f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f306203g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f306204h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f306205i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f306206j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f306207k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.ref.WeakReference f306208l;

    public g(com.tencent.mm.pluginsdk.model.g2 params, java.util.Map map, java.util.List appList) {
        java.lang.Boolean bool;
        java.lang.Object obj;
        xj.m mVar;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(appList, "appList");
        this.f306197a = params;
        this.f306198b = map;
        this.f306199c = appList;
        this.f306200d = "MicroMsg.OpenWayListReporter";
        this.f306201e = kb0.j.f306209a.b(params);
        int i17 = 2;
        this.f306202f = kz5.n0.t0(kz5.c0.i(2, 3, 4, 5), d() ? kz5.b0.c(6) : kz5.p0.f313996d);
        this.f306203g = jz5.h.b(new kb0.c(this));
        this.f306204h = jz5.h.b(kb0.e.f306195d);
        this.f306205i = new java.util.LinkedHashSet();
        this.f306206j = new java.util.LinkedHashSet();
        this.f306207k = new java.util.HashMap();
        java.util.Iterator it = appList.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.pluginsdk.ui.otherway.w) obj).f191019i) {
                    break;
                }
            }
        }
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
        if (wVar != null && (mVar = wVar.f191022o) != null) {
            bool = java.lang.Boolean.valueOf(mVar.f454760h);
        }
        if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
                i17 = 1;
            } else {
                if (bool != null) {
                    throw new jz5.j();
                }
                i17 = 0;
            }
        }
        this.f306201e.put("yuanbao_user_state", java.lang.Integer.valueOf(i17));
    }

    public final jz5.l a(com.tencent.mm.pluginsdk.ui.otherway.w wVar, com.tencent.mm.pluginsdk.model.a aVar) {
        java.lang.Object m521constructorimpl;
        r45.mk5 b17;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.pluginsdk.ui.otherway.i0 i0Var = com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a;
            xj.m mVar = wVar.f191022o;
            b17 = i0Var.b(mVar != null ? mVar.f454753a : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (b17 == null) {
            return null;
        }
        long c17 = c01.id.c();
        lb0.d dVar = lb0.d.f317669a;
        long f17 = dVar.f();
        com.tencent.mm.pluginsdk.model.g2 g2Var = this.f306197a;
        m521constructorimpl = kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Long.valueOf(java.lang.Math.max(0L, ((f17 == 0 ? 0L : dVar.e(g2Var.f189315h, aVar) / f17) - ((c17 - b17.f380605d) / 86400000)) - 1)), java.lang.Long.valueOf(java.lang.Math.max(0L, ((f17 == 0 ? 0L : dVar.b(g2Var.f189315h, aVar) / f17) - ((c17 - b17.f380606e) / 86400000)) - 1))));
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = new jz5.l(0L, 0L);
        }
        return (jz5.l) m521constructorimpl;
    }

    public final java.lang.String b(com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        xj.m mVar;
        java.lang.String str;
        java.lang.String b17 = wVar.b();
        if (!(!r26.n0.N(b17))) {
            b17 = null;
        }
        return b17 == null ? (!d() || !wVar.f191019i || (mVar = wVar.f191022o) == null || (str = mVar.f454758f) == null) ? "" : str : b17;
    }

    public final java.lang.String c(com.tencent.mm.pluginsdk.ui.otherway.w wVar, int i17) {
        com.tencent.mm.pluginsdk.model.a c17;
        jz5.l a17;
        if (!((java.util.ArrayList) this.f306202f).contains(java.lang.Integer.valueOf(wVar.h())) || kotlin.jvm.internal.o.b(wVar.b(), "common_local_app")) {
            return null;
        }
        if (!wVar.f191019i || !d() || (c17 = lb0.d.f317669a.c(wVar.f191021n)) == null || (a17 = a(wVar, c17)) == null) {
            return wVar.a() + ':' + g(wVar) + ':' + i17;
        }
        return wVar.a() + ':' + g(wVar) + ':' + i17 + ':' + ((java.lang.Number) a17.f302833d).longValue() + ':' + ((java.lang.Number) a17.f302834e).longValue();
    }

    public final boolean d() {
        return ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(this.f306197a.f189315h);
    }

    public final void e(com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        jz5.l a17;
        if (wVar != null) {
            boolean z17 = wVar.f191019i;
            java.util.HashMap hashMap = this.f306201e;
            if (z17 && !d()) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbo_ad_component", "view_clk", hashMap, 35480);
                return;
            }
            if (!((java.util.ArrayList) this.f306202f).contains(java.lang.Integer.valueOf(wVar.h()))) {
                if (kotlin.jvm.internal.o.b(wVar.b(), "common_local_app")) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_mobile_app_item", "view_clk", hashMap, 35480);
                    return;
                }
                return;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.putAll(hashMap);
            hashMap2.put("app_name", wVar.a());
            int i17 = (java.lang.Integer) this.f306207k.get(wVar.b());
            if (i17 == null) {
                i17 = -1;
            }
            kotlin.jvm.internal.o.d(i17);
            hashMap2.put("app_index", i17);
            hashMap2.put("app_type", java.lang.Integer.valueOf(g(wVar)));
            boolean z18 = wVar.f191019i;
            java.lang.String str = this.f306200d;
            if (z18 && d()) {
                com.tencent.mm.pluginsdk.model.a c17 = lb0.d.f317669a.c(wVar.f191021n);
                jz5.f0 f0Var = null;
                if (c17 != null && (a17 = a(wVar, c17)) != null) {
                    long longValue = ((java.lang.Number) a17.f302833d).longValue();
                    long longValue2 = ((java.lang.Number) a17.f302834e).longValue();
                    hashMap2.put("n_days", java.lang.Long.valueOf(longValue));
                    hashMap2.put("m_days", java.lang.Long.valueOf(longValue2));
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e(str, "adBusinessType is null");
                }
            }
            com.tencent.mars.xlog.Log.i(str, "click app: " + hashMap2);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_other_app_item", "view_clk", hashMap2, 35480);
        }
    }

    public final void f(boolean z17) {
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("has_install_yuanbao", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) this.f306204h).getValue()).intValue())), new jz5.l("popup_action_type", java.lang.Integer.valueOf(z17 ? 1 : 0)));
        i17.putAll(this.f306201e);
        java.util.Map map = this.f306198b;
        if (map != null) {
            i17.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_yuanbao_popup", "view_clk", i17, 35480);
    }

    public final int g(com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        int h17 = wVar.h();
        int i17 = 2;
        if (h17 == 2) {
            return 1;
        }
        if (h17 != 3) {
            i17 = 4;
            if (h17 == 4) {
                return 3;
            }
            if (h17 == 5) {
                return 1;
            }
            if (h17 != 6) {
                return 0;
            }
        }
        return i17;
    }
}
