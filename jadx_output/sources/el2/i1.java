package el2;

/* loaded from: classes3.dex */
public final class i1 extends xt2.m6 implements jf2.o, jf2.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f253812d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f253813e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f253814f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f253815g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f253816h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f253817i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f253818m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f253819n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f253820o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f253821p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f253822q;

    /* renamed from: r, reason: collision with root package name */
    public int f253823r;

    /* renamed from: s, reason: collision with root package name */
    public final long f253824s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f253825t;

    /* renamed from: u, reason: collision with root package name */
    public r45.kv1 f253826u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f253827v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f253828w;

    public i1(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f253812d = root;
        this.f253813e = statusMonitor;
        this.f253814f = basePlugin;
        this.f253815g = "Micro.FinderLiveOuterGiftWidget";
        this.f253816h = jz5.h.b(new el2.u0(this));
        this.f253817i = jz5.h.b(new el2.s0(this));
        this.f253818m = jz5.h.b(new el2.m0(this));
        this.f253819n = jz5.h.b(new el2.h1(this));
        this.f253820o = jz5.h.b(new el2.t0(this));
        this.f253824s = 100L;
    }

    public static final void k(el2.i1 i1Var, r45.kv1 kv1Var, boolean z17) {
        java.lang.Object obj;
        android.view.ViewGroup J1;
        i1Var.f253826u = kv1Var;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) i1Var.f253814f.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        i1Var.f253823r = ag0Var != null ? ag0Var.I1(i1Var.f253812d) : 0;
        boolean z18 = ((mm2.c1) i1Var.f253814f.P0(mm2.c1.class)).T;
        boolean z19 = ((mm2.n0) i1Var.f253814f.P0(mm2.n0.class)).f329273r;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var2 = (com.tencent.mm.plugin.finder.live.plugin.ag0) i1Var.f253814f.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        boolean isShown = (ag0Var2 == null || (J1 = ag0Var2.J1()) == null) ? false : J1.isShown();
        java.lang.String str = i1Var.f253815g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gift:");
        if (kv1Var == null || (obj = pm0.b0.g(kv1Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        sb6.append(", visibleSize:");
        sb6.append(i1Var.f253823r);
        sb6.append(", isAssistant:");
        sb6.append(z18);
        sb6.append(", isCoLiveInviteeAnchor:");
        sb6.append(z19);
        sb6.append(", isGiftEntranceVisible:");
        sb6.append(isShown);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!isShown || kv1Var == null || z18 || z19) {
            i1Var.f253825t = false;
            i1Var.o(false);
            return;
        }
        if (i1Var.f253812d.getVisibility() == 0) {
            java.lang.Object tag = i1Var.f253812d.getTag();
            if (kotlin.jvm.internal.o.b(tag instanceof java.lang.String ? (java.lang.String) tag : null, kv1Var.getString(0))) {
                com.tencent.mars.xlog.Log.i(i1Var.f253815g, "outerGift: " + kv1Var.getString(0) + " already show, return");
                return;
            }
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(kv1Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) i1Var.f253816h).getValue();
        kotlin.jvm.internal.o.f(imageView, "<get-imgView>(...)");
        ((wo0.b) a17).c(imageView);
        i1Var.f253812d.setOnTouchListener(new el2.e1(i1Var, kv1Var, z17));
        i1Var.f253825t = true;
        i1Var.f253812d.setTag(kv1Var.getString(0));
        android.view.View view = (android.view.View) ((jz5.n) i1Var.f253820o).getValue();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget", "onUpdateOuterGift", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget", "onUpdateOuterGift", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void l(el2.i1 i1Var, r45.kv1 kv1Var, int i17, boolean z17) {
        boolean z18;
        java.lang.String str = "[openSendAgainView] notify2OpenSendAgainViewAlready:" + i1Var.f253822q;
        java.lang.String str2 = i1Var.f253815g;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_OUTER_GUIDE_SHOWN_BOOLEAN_SYNC;
        boolean o17 = c17.o(u3Var, false);
        com.tencent.mars.xlog.Log.i(str2, "[checkAndShowGuide] hasShownGuide:" + o17);
        if (o17 || z17) {
            z18 = false;
        } else {
            android.view.ViewGroup viewGroup = i1Var.f253812d;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(viewGroup.getContext(), 1, false);
            android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.f488950df2, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(viewGroup.getContext(), 12), com.tencent.mm.ui.zk.a(viewGroup.getContext(), 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f2w);
            android.widget.TextView textView3 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484639q56);
            android.widget.TextView textView4 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            android.view.View findViewById = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            kotlin.jvm.internal.o.d(textView4);
            com.tencent.mm.ui.fk.a(textView4);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            kotlin.jvm.internal.o.d(textView3);
            com.tencent.mm.ui.fk.a(textView3);
            textView2.setText(java.lang.String.valueOf((int) kv1Var.getFloat(9)));
            textView4.setOnClickListener(new el2.n0(k0Var, i1Var, kv1Var));
            findViewById.setOnClickListener(new el2.o0(i1Var, kv1Var, z17, k0Var));
            k0Var.f211872n = new el2.p0(k0Var, roundedCornerFrameLayout);
            k0Var.e(true);
            java.lang.String string = kv1Var.getString(0);
            if (string == null) {
                string = "";
            }
            i1Var.p(23, string, -1);
            k0Var.v();
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            z18 = true;
        }
        if (z18 || i1Var.f253822q) {
            return;
        }
        i1Var.f253822q = true;
        qo0.b bVar = qo0.b.f365326a2;
        qo0.c cVar = i1Var.f253813e;
        qo0.c.a(cVar, bVar, null, 2, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", kv1Var.getString(0));
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_SEND_BY_OUTER", true);
        bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i17);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_FREE_GIFT", z17);
        cVar.statusChange(qo0.b.Z1, bundle);
    }

    public static final void m(el2.i1 i1Var) {
        i1Var.n().animate().alpha(1.0f).setDuration(500L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(new el2.g1(i1Var)).start();
    }

    @Override // jf2.o
    public void b() {
        java.lang.String str;
        android.view.ViewGroup viewGroup = this.f253812d;
        if (viewGroup.getVisibility() != 0) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f253814f;
            if (((mm2.c1) lVar.P0(mm2.c1.class)).f328880s3 <= 0) {
                com.tencent.mm.plugin.finder.live.util.y.g(lVar, oz5.m.f350329d, kotlinx.coroutines.a1.DEFAULT, new el2.r0(this, null));
            }
        }
        viewGroup.setVisibility(0);
        r45.kv1 kv1Var = this.f253826u;
        if (kv1Var == null || (str = kv1Var.getString(0)) == null) {
            str = "";
        }
        p(21, str, -1);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return (android.view.View) ((jz5.n) this.f253818m).getValue();
    }

    @Override // jf2.o
    public void g() {
        this.f253812d.setVisibility(8);
        o(false);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f253812d;
    }

    @Override // jf2.o
    public boolean i() {
        return this.f253825t;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f253816h).getValue();
        kotlin.jvm.internal.o.f(imageView, "<get-imgView>(...)");
        return imageView;
    }

    public final com.tencent.mm.view.MMPAGView n() {
        return (com.tencent.mm.view.MMPAGView) ((jz5.n) this.f253819n).getValue();
    }

    public final void o(boolean z17) {
        if (z17) {
            if (this.f253828w) {
                return;
            }
            n().animate().alpha(0.0f).setDuration(1000L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(new el2.c1(this)).start();
            this.f253828w = true;
            return;
        }
        n().setVisibility(8);
        kotlinx.coroutines.r2 r2Var = this.f253827v;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        n().n();
    }

    public final void p(int i17, java.lang.String str, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("giftid", str);
        if (i18 > 0) {
            jSONObject.put("num", i18);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i(this.f253815g, "[report] json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327282z, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // jf2.o
    public int type() {
        return 22;
    }
}
