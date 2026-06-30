package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class f4 extends com.tencent.mm.plugin.finder.profile.uic.f6 {
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123684e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f123685f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f123686g;

    /* renamed from: h, reason: collision with root package name */
    public az2.f f123687h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f123688i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f123689m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f123690n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f123691o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f123692p;

    /* renamed from: q, reason: collision with root package name */
    public int f123693q;

    /* renamed from: r, reason: collision with root package name */
    public int f123694r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f123695s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f123696t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f123697u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f123698v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.uic.x3 f123699w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f123700x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f123701y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f123702z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f123684e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.d4(this));
        this.f123685f = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.l3(this));
        this.f123686g = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.e4(this));
        this.f123690n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.p3(this));
        this.f123691o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.z3(this));
        this.f123693q = -1;
        this.f123694r = -1;
        this.f123696t = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.y3(this));
        this.f123697u = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.w3(this));
        this.f123698v = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.k3(this));
        this.f123699w = new com.tencent.mm.plugin.finder.profile.uic.x3(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        f4Var.getClass();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, f4Var.getActivity(), 13L, 1L, false, 0, 0, null, 120, null);
        boolean isChecked = f4Var.W6().isChecked();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = f4Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        if (isChecked != (((j37 != null ? j37.field_extFlag : 0) & 262144) != 0)) {
            f4Var.U6(isChecked);
        }
    }

    public static void a7(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, java.lang.String eid, int i17, java.lang.String feedId, int i18, java.lang.String songId, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            feedId = "";
        }
        if ((i19 & 8) != 0) {
            i18 = 78;
        }
        if ((i19 & 16) != 0) {
            songId = "";
        }
        f4Var.getClass();
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(songId, "songId");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String stringExtra = f4Var.getActivity().getIntent().getStringExtra("key_context_id");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            switch (eid.hashCode()) {
                case -780512022:
                    if (!eid.equals("music_card")) {
                        break;
                    }
                    jSONObject.put("feedid", feedId);
                    jSONObject.put("songid", songId);
                    break;
                case -780114674:
                    if (eid.equals("music_play")) {
                        jSONObject.put("feedid", feedId);
                        jSONObject.put("songid", songId);
                        break;
                    }
                    break;
                case 3497:
                    if (!eid.equals("mv")) {
                        break;
                    }
                    jSONObject.put("feedid", feedId);
                    jSONObject.put("songid", songId);
                    break;
                case 95844769:
                    if (!eid.equals("draft")) {
                        break;
                    }
                    jSONObject.put("draftid", feedId);
                    break;
                case 745112204:
                    if (!eid.equals("draftdelete")) {
                        break;
                    }
                    jSONObject.put("draftid", feedId);
                    break;
                case 1298526356:
                    if (!eid.equals("mvdelete")) {
                        break;
                    }
                    jSONObject.put("feedid", feedId);
                    jSONObject.put("songid", songId);
                    break;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, Ri, str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), valueOf, eid, jSONObject.toString());
    }

    public final void P6(int i17, int i18) {
        this.f123694r = i17;
        if (!this.A) {
            R6(i18);
            return;
        }
        this.A = false;
        S6(i18);
        com.tencent.mars.xlog.Log.i("FinderProfileEduUIC", "canNoLongerShowBtn: " + V6() + ", jumpToJustWatchedFeed");
        if (V6()) {
            return;
        }
        d7();
        Q6();
        int dimension = (int) Z6().getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479649bo);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.google.android.material.appbar.AppBarLayout X6 = ((com.tencent.mm.plugin.finder.profile.uic.o0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).X6();
        kotlin.jvm.internal.o.f(X6, "<get-appBarLayout>(...)");
        android.view.ViewGroup.LayoutParams layoutParams = X6.getLayoutParams();
        androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
        java.lang.Object obj = cVar != null ? cVar.f11006a : null;
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = obj instanceof com.google.android.material.appbar.AppBarLayout.Behavior ? (com.google.android.material.appbar.AppBarLayout.Behavior) obj : null;
        if (behavior != null) {
            behavior.B(X6.getHeight() * (-1));
        }
        Z6().postDelayed(new com.tencent.mm.plugin.finder.profile.uic.n3(this, dimension), 200L);
        b7("channel_profile_recentviewed", 1, 1);
    }

    public final void Q6() {
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = X6();
        if (X6 != null) {
            int i17 = com.tencent.mm.plugin.finder.view.FinderJumpAnchorView.f131165i;
            X6.a(null);
        }
    }

    public final void R6(int i17) {
        boolean z17;
        if (this.f123694r == -2) {
            d7();
            com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = X6();
            if (X6 != null) {
                X6.setLoading(false);
            }
            Q6();
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            S6(i17);
            com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X62 = X6();
            if (X62 == null) {
                return;
            }
            r45.so2 Y6 = Y6();
            java.lang.Long valueOf = Y6 != null ? java.lang.Long.valueOf(Y6.getLong(1)) : null;
            if (this.f123694r != -1) {
                X62.setClickable(true);
                X62.setTag(i17, new com.tencent.mm.plugin.finder.profile.uic.b4(this, valueOf));
            } else if (!this.f123695s) {
                Q6();
            } else {
                X62.setClickable(true);
                X62.setTag(i17, new com.tencent.mm.plugin.finder.profile.uic.c4(X62, this, valueOf));
            }
        }
    }

    public final void S6(int i17) {
        int i18;
        int i19;
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = X6();
        if (X6 == null) {
            return;
        }
        java.lang.Object tag = X6.getTag(com.tencent.mm.R.id.rld);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num != null) {
            i19 = num.intValue();
            i18 = i17;
        } else {
            i18 = i17;
            i19 = 0;
        }
        if (i18 != i19) {
            return;
        }
        r45.so2 Y6 = Y6();
        java.lang.Long valueOf = Y6 != null ? java.lang.Long.valueOf(Y6.getLong(1)) : null;
        int i27 = this.f123694r;
        if ((i27 != -1) || this.f123695s) {
            if (!(i27 >= 0 && i27 < 3)) {
                if (i27 != -1) {
                    if (6 >= i27) {
                        i27 = 6;
                    }
                    if (this.f123693q >= i27) {
                        d7();
                    }
                } else if (this.f123695s) {
                    com.tencent.mars.xlog.Log.i("FinderProfileEduUIC", "is clickToLoad no index");
                }
                if (V6()) {
                    Q6();
                    return;
                }
                if (X6.getVisibility() == 4) {
                    this.f123692p = true;
                    com.tencent.mm.plugin.finder.view.FinderJumpAnchorView.c(X6, null, 1, null);
                    if (valueOf == null) {
                        b7("channel_profile_recentviewed", 0, 1);
                    } else {
                        c7("view_exp");
                    }
                    long longExtra = getIntent().getLongExtra("finder_from_feed_id", 0L);
                    java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, getIntent().getStringExtra("finder_from_feed_dup_flag"), getIntent().getIntExtra("finder_from_feed_comment_scene", 0));
                    jz5.l[] lVarArr = new jz5.l[5];
                    lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(longExtra));
                    lVarArr[1] = new jz5.l("source_feed_sessionbuffer", ek6);
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    lVarArr[3] = new jz5.l("finder_context_id", b52.b.b());
                    androidx.appcompat.app.AppCompatActivity context = getActivity();
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    lVarArr[4] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
                    hc2.v0.e(X6, "watching", 0, 0, false, false, kz5.c1.k(lVarArr), null, 94, null);
                    return;
                }
                return;
            }
        }
        X6.setVisibility(4);
    }

    public final void T6(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = X6();
        java.lang.Object tag = X6 != null ? X6.getTag(com.tencent.mm.R.id.rld) : null;
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (i17 != (num != null ? num.intValue() : 0)) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.viewpager.widget.ViewPager viewPager = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class)).f133659h;
        if (viewPager != null && viewPager.getVisibility() == 0) {
            this.f123693q = z17 ? 0 : ((java.lang.Number) hc2.f1.s(recyclerView, false).f302834e).intValue();
            S6(i17);
        }
    }

    public final void U6(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderProfileEduUIC", "change isShowAtWxProfile, now:" + z17);
        az2.f fVar = this.f123687h;
        if (fVar != null) {
            fVar.b();
        }
        az2.f a17 = az2.c.a(az2.f.f16125d, getContext(), getContext().getString(com.tencent.mm.R.string.f490604zq), 500L, null, 8, null);
        this.f123687h = a17;
        a17.a();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.s0.f280090e.u(z17, this.f123699w, getUsername());
    }

    public final boolean V6() {
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = X6();
        java.lang.Object tag = X6 != null ? X6.getTag(com.tencent.mm.R.id.rla) : null;
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final android.widget.CheckBox W6() {
        return (android.widget.CheckBox) this.f123685f.getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6() {
        return (com.tencent.mm.plugin.finder.view.FinderJumpAnchorView) this.f123690n.getValue();
    }

    public final r45.so2 Y6() {
        return (r45.so2) this.f123697u.getValue();
    }

    public final androidx.recyclerview.widget.RecyclerView Z6() {
        java.lang.Object value = this.f123691o.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final void b7(java.lang.String eid, int i17, int i18) {
        kotlin.jvm.internal.o.g(eid, "eid");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, i18);
        jSONObject.put("watching_feedid", ((java.lang.Number) ((jz5.n) this.f123696t).getValue()).longValue());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String stringExtra = getActivity().getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, Ri, str, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf() ? 33 : 32), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), eid, t17);
    }

    public final void c7(java.lang.String str) {
        r45.so2 Y6 = Y6();
        if (Y6 == null) {
            return;
        }
        if (str.equals("view_exp")) {
            if (this.f123700x) {
                return;
            } else {
                this.f123700x = true;
            }
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("view_id", "profile_poi_locator");
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_tab_context_id", b52.b.c());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_context_id", b52.b.b());
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf() ? 33 : 32));
        lVarArr[4] = new jz5.l("author_finder_username", getUsername());
        lVarArr[5] = new jz5.l("poiid", Y6.getString(3));
        ((cy1.a) rVar).Ej(str, kz5.c1.k(lVarArr), 25496);
    }

    public final void d7() {
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView X6 = X6();
        if (X6 != null) {
            X6.setTag(com.tencent.mm.R.id.rla, java.lang.Boolean.TRUE);
        }
    }

    public final java.lang.String getUsername() {
        java.lang.String username;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        return (p2Var == null || (username = p2Var.getUsername()) == null) ? "" : username;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.f4.onCreateAfter(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.f4.onResume():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f123684e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.d4(this));
        this.f123685f = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.l3(this));
        this.f123686g = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.e4(this));
        this.f123690n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.p3(this));
        this.f123691o = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.z3(this));
        this.f123693q = -1;
        this.f123694r = -1;
        this.f123696t = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.y3(this));
        this.f123697u = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.w3(this));
        this.f123698v = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.k3(this));
        this.f123699w = new com.tencent.mm.plugin.finder.profile.uic.x3(this);
    }
}
