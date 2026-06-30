package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class w extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f124444a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f124445b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f124446c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124447d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f124448e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.b0 f124449f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer f124450g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f124451h;

    /* renamed from: i, reason: collision with root package name */
    public int f124452i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f124453j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124454k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f124455l;

    public w(android.app.Activity context, android.view.View header, r45.qt2 qt2Var, int i17, kotlin.jvm.internal.i iVar) {
        qt2Var = (i17 & 4) != 0 ? null : qt2Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(header, "header");
        this.f124444a = context;
        this.f124445b = qt2Var;
        this.f124446c = jz5.h.b(new com.tencent.mm.plugin.finder.profile.p(header));
        this.f124447d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.r(header));
        this.f124448e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.q(header));
        this.f124452i = -1;
        this.f124453j = "";
        this.f124454k = true;
    }

    public static void h(com.tencent.mm.plugin.finder.profile.w wVar, java.util.List list, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = null;
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        wVar.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        if (z18 && wVar.f124455l) {
            return;
        }
        if (!z18) {
            wVar.f124455l = true;
        }
        java.lang.String str = wVar.f124453j;
        if (str != null) {
            if (!(str.length() == 0)) {
                pm0.v.K(null, new com.tencent.mm.plugin.finder.profile.v(list, str));
            }
        }
        wVar.i((r45.v96) ((r45.ro2) list.get(0)).getCustom(0));
        if (list.size() == 1) {
            return;
        }
        ((android.widget.RelativeLayout) ((jz5.n) wVar.f124448e).getValue()).setVisibility(0);
        ((android.widget.LinearLayout) ((jz5.n) wVar.f124446c).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.profile.l(wVar, z17, list));
    }

    @Override // ym5.q3
    public void b(int i17) {
        l(true);
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public final void f(boolean z17) {
        com.tencent.mm.plugin.finder.profile.b0 b0Var = this.f124449f;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        if (b0Var != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = b0Var.f123314e;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout = refreshLoadMoreLayout2;
        }
        if (refreshLoadMoreLayout == null) {
            return;
        }
        refreshLoadMoreLayout.setEnableLoadMore(z17);
    }

    public final android.widget.TextView g() {
        return (android.widget.TextView) ((jz5.n) this.f124447d).getValue();
    }

    public final void i(r45.v96 v96Var) {
        java.lang.String str;
        r45.e95 e95Var;
        java.util.LinkedList linkedList;
        r45.t13 t13Var;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = v96Var;
        if (v96Var == null) {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(this.f124453j);
            java.util.LinkedList<r45.v96> list = (l2Var == null || (t13Var = l2Var.f123921j) == null) ? null : t13Var.getList(0);
            if (list == null || list.isEmpty()) {
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList();
                for (r45.v96 v96Var2 : list) {
                    r45.ro2 ro2Var = new r45.ro2();
                    ro2Var.set(0, v96Var2);
                    linkedList.add(ro2Var);
                }
            }
            if (linkedList == null || linkedList.isEmpty()) {
                return;
            } else {
                h0Var.f310123d = (r45.v96) ((r45.ro2) linkedList.get(0)).getCustom(0);
            }
        }
        if (h0Var.f310123d == null) {
            return;
        }
        boolean z17 = this.f124454k;
        jz5.g gVar = this.f124446c;
        if (!z17 || ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
            return;
        }
        this.f124454k = false;
        ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(0);
        android.widget.TextView g17 = g();
        r45.l95 l95Var = ((r45.v96) h0Var.f310123d).f388009d;
        g17.setText((l95Var == null || (e95Var = l95Var.f379241d) == null) ? null : e95Var.f373165e);
        ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.profile.m(this, h0Var));
        java.lang.String str2 = this.f124453j;
        if (str2 != null) {
            if (!(str2.length() == 0)) {
                pm0.v.K(null, new com.tencent.mm.plugin.finder.profile.o(str2, this));
            }
        }
        l(false);
        java.lang.CharSequence text = g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        k(0, str, this.f124453j);
    }

    public final void j(android.content.Context context, r45.e95 e95Var) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.n95 n95Var = e95Var != null ? e95Var.f373166f : null;
        if (n95Var == null) {
            return;
        }
        r45.f96 f96Var = new r45.f96();
        f96Var.set(2, e95Var.f373173p);
        f96Var.set(1, java.lang.Float.valueOf(n95Var.f381184e));
        f96Var.set(0, java.lang.Float.valueOf(n95Var.f381183d));
        f96Var.set(4, e95Var.f373168h);
        f96Var.set(3, e95Var.f373165e);
        f96Var.set(5, e95Var.f373164d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_location", f96Var.toByteArray());
        intent.putExtra("key_from_type", zy2.o9.f477517e);
        com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer repairerConfigLocationPoiDrawer = new com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer();
        if (j62.e.g().c(repairerConfigLocationPoiDrawer) == 1 || bm5.o1.f22719a.h(repairerConfigLocationPoiDrawer) == 1 || ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.b1().r()).intValue() == 0) {
            java.lang.String string = f96Var.getString(5);
            if (!(string != null && r26.i0.y(string, "foursquare_", false))) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.ub.w2((c61.ub) c17, context, intent, f96Var, 0, 8, null);
                return;
            }
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Uk(context, intent);
    }

    public final void k(int i17, java.lang.String str, java.lang.String str2) {
        r45.qt2 qt2Var;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("poi_name", str);
        jSONObject.put("finderusername", str2);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        r45.qt2 qt2Var2 = this.f124445b;
        if (qt2Var2 == null) {
            android.app.Activity context = this.f124444a;
            kotlin.jvm.internal.o.g(context, "context");
            if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar == null) {
                qt2Var = null;
                com.tencent.mm.plugin.finder.report.o3.ij(o3Var, i17, "channel_profile_poi", t17, qt2Var, null, 16, null);
            }
            qt2Var2 = nyVar.V6();
        }
        qt2Var = qt2Var2;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, i17, "channel_profile_poi", t17, qt2Var, null, 16, null);
    }

    public final void l(boolean z17) {
        if (!z17 || this.f124452i != 0) {
            new db2.b4(this.f124453j, this.f124451h).l().K(new com.tencent.mm.plugin.finder.profile.u(this, z17));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[requestUserPoi] no load more");
        com.tencent.mm.plugin.finder.profile.b0 b0Var = this.f124449f;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        if (b0Var != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = b0Var.f123314e;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.N(0);
        }
        com.tencent.mm.plugin.finder.profile.b0 b0Var2 = this.f124449f;
        if (b0Var2 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = b0Var2.f123314e;
            if (refreshLoadMoreLayout3 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout = refreshLoadMoreLayout3;
        }
        if (refreshLoadMoreLayout == null) {
            return;
        }
        refreshLoadMoreLayout.setEnableLoadMore(false);
    }
}
