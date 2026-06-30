package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124845a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f124846b;

    /* renamed from: c, reason: collision with root package name */
    public final vb2.f0 f124847c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124848d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f124849e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f124850f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f124851g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f124852h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f124853i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f124854j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f124855k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f124856l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f124857m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f124858n;

    public z2(android.view.View header, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124845a = activity;
        this.f124846b = "";
        this.f124847c = vb2.f0.a(header);
        this.f124848d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.v2(this));
        this.f124849e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.k2(this));
        this.f124850f = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.j2(this));
        this.f124851g = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.o2(this));
        this.f124852h = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.n2(this));
        this.f124853i = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.q2(this));
        this.f124854j = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.p2(this));
        this.f124855k = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.s2(this));
        this.f124856l = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.r2(this));
        this.f124857m = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.u2(this));
        this.f124858n = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.t2(this));
    }

    public final void a(r45.bq2 bq2Var, android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, android.widget.TextView textView2, r45.cq2 cq2Var) {
        java.lang.String str = bq2Var.f370985g;
        if (!(str == null || str.length() == 0)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().b(new mn2.q3(bq2Var.f370985g, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329965s)).c(weImageView);
        }
        java.lang.String str2 = bq2Var.f370983e;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        java.lang.String str3 = bq2Var.f370984f;
        textView2.setText(str3 != null ? str3 : "");
        androidx.appcompat.app.AppCompatActivity context = this.f124845a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("cluster_id", pm0.v.u(bq2Var.f370982d));
        lVarArr[4] = new jz5.l("cluster_reason_recommendation", bq2Var.f370984f);
        lVarArr[5] = new jz5.l("cluster_cover_feedid", pm0.v.u(bq2Var.f370986h));
        d2Var.n(view, "profile_cluster_card", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.c1.k(lVarArr), (r20 & 128) != 0 ? null : null);
    }

    public final java.util.Map b() {
        androidx.appcompat.app.AppCompatActivity context = this.f124845a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr[1] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        lVarArr[3] = new jz5.l("cluster_id_list", this.f124846b);
        return kz5.c1.k(lVarArr);
    }

    public final android.widget.LinearLayout c() {
        return (android.widget.LinearLayout) ((jz5.n) this.f124848d).getValue();
    }

    public final void d(java.lang.String username, boolean z17, boolean z18) {
        int i17;
        r45.fr2 fr2Var;
        kotlin.jvm.internal.o.g(username, "username");
        if (!z17 || !z18) {
            e("not self");
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
        if (!(o4Var != null ? o4Var.i("KEY_FINDER_PROFILE_POST_PLAY_BANNER_STATUS", true) : true)) {
            e("close by user");
            return;
        }
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(username);
        r45.cq2 cq2Var = (l2Var == null || (fr2Var = l2Var.F) == null) ? null : fr2Var.f374574e;
        if (cq2Var != null) {
            java.util.LinkedList linkedList = cq2Var.f371784d;
            if (!(linkedList == null || linkedList.isEmpty())) {
                c().setVisibility(0);
                androidx.appcompat.app.AppCompatActivity activity = this.f124845a;
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).O6("if_have_cluster", 1);
                java.lang.String str = cq2Var.f371785e;
                boolean z19 = str == null || str.length() == 0;
                jz5.g gVar = this.f124849e;
                if (z19) {
                    ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText("发表灵感");
                } else {
                    ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(str);
                }
                com.tencent.mm.ui.bk.r0(((android.widget.TextView) ((jz5.n) gVar).getValue()).getPaint(), 0.8f);
                jz5.g gVar2 = this.f124850f;
                ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.profile.widget.l2(this));
                this.f124846b = "";
                int size = linkedList.size();
                jz5.g gVar3 = this.f124851g;
                if (size > 0) {
                    java.lang.Object obj = linkedList.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) gVar3).getValue();
                    kotlin.jvm.internal.o.f(linearLayout, "<get-item1Layout>(...)");
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f124852h).getValue();
                    kotlin.jvm.internal.o.f(weImageView, "<get-item1Cover>(...)");
                    android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f124853i).getValue();
                    kotlin.jvm.internal.o.f(textView, "<get-item1Title>(...)");
                    android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) this.f124854j).getValue();
                    kotlin.jvm.internal.o.f(textView2, "<get-item1Subtitle>(...)");
                    i17 = 8;
                    a((r45.bq2) obj, linearLayout, weImageView, textView, textView2, cq2Var);
                    ((android.widget.LinearLayout) ((jz5.n) gVar3).getValue()).setVisibility(0);
                    this.f124846b += pm0.v.u(((r45.bq2) linkedList.get(0)).f370982d);
                } else {
                    i17 = 8;
                    ((android.widget.LinearLayout) ((jz5.n) gVar3).getValue()).setVisibility(8);
                }
                int size2 = linkedList.size();
                jz5.g gVar4 = this.f124855k;
                if (size2 > 1) {
                    java.lang.Object obj2 = linkedList.get(1);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ((jz5.n) gVar4).getValue();
                    kotlin.jvm.internal.o.f(linearLayout2, "<get-item2Layout>(...)");
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f124856l).getValue();
                    kotlin.jvm.internal.o.f(weImageView2, "<get-item2Cover>(...)");
                    android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) this.f124857m).getValue();
                    kotlin.jvm.internal.o.f(textView3, "<get-item2Title>(...)");
                    android.widget.TextView textView4 = (android.widget.TextView) ((jz5.n) this.f124858n).getValue();
                    kotlin.jvm.internal.o.f(textView4, "<get-item2Subtitle>(...)");
                    a((r45.bq2) obj2, linearLayout2, weImageView2, textView3, textView4, cq2Var);
                    ((android.widget.LinearLayout) ((jz5.n) gVar4).getValue()).setVisibility(0);
                    this.f124846b += '#' + pm0.v.u(((r45.bq2) linkedList.get(1)).f370982d);
                } else {
                    ((android.widget.LinearLayout) ((jz5.n) gVar4).getValue()).setVisibility(i17);
                }
                c().setOnClickListener(new com.tencent.mm.plugin.finder.profile.widget.m2(this, cq2Var));
                com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                android.widget.LinearLayout c18 = c();
                kotlin.jvm.internal.o.f(c18, "<get-postPlayBannerLayout>(...)");
                d2Var.n(c18, "profile_cluster_area", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : b(), (r20 & 128) != 0 ? null : null);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) gVar2).getValue();
                kotlin.jvm.internal.o.f(weImageView3, "<get-bannerClose>(...)");
                d2Var.n(weImageView3, "profile_cluster_close", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : b(), (r20 & 128) != 0 ? null : null);
                com.tencent.mars.xlog.Log.i("HeaderPostPlayBannerWidget", "handlePostPlayBanner show, ideaList.size=" + linkedList.size() + ", wording=" + str);
                return;
            }
        }
        e("data empty");
    }

    public final void e(java.lang.String str) {
        c().setVisibility(8);
        androidx.appcompat.app.AppCompatActivity activity = this.f124845a;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).O6("if_have_cluster", 0);
        com.tencent.mars.xlog.Log.i("HeaderPostPlayBannerWidget", "handlePostPlayBanner hide, " + str);
    }
}
