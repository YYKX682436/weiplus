package in4;

/* loaded from: classes9.dex */
public class b implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f292944d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f292945e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f292946f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f292947g;

    public b(android.content.Context context) {
        this.f292944d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f292946f = rVar;
        this.f292945e = z3Var;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.g(com.tencent.mm.R.xml.f494858a2);
        gm0.j1.u().c().a(this);
        this.f292947g = (com.tencent.mm.ui.base.preference.CheckBoxPreference) h0Var.h("contact_info_top_story_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_go_to_top_story".equals(str);
        android.content.Context context = this.f292944d;
        if (equals) {
            o11.g gVar = wm4.u.f447309a;
            wm4.u.u(context, 0, new android.os.Bundle(), "", new java.util.HashMap());
        } else {
            if ("contact_info_top_story_install".equals(str)) {
                a(true);
            } else if ("contact_info_top_story_uninstall".equals(str)) {
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new in4.a(this), null);
            } else if ("contact_info_top_story_not_disturb".equals(str)) {
                int o17 = c01.z1.o();
                gm0.j1.u().c().w(40, java.lang.Integer.valueOf(this.f292947g.N() ? o17 & (-16777217) : o17 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62));
                r45.p53 p53Var = new r45.p53();
                p53Var.f382761d = 55;
                p53Var.f382762e = this.f292947g.N() ? 2 : 1;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(55, p53Var));
            }
        }
        return false;
    }

    public final void a(boolean z17) {
        int n17 = c01.z1.n();
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-67108865) : n17 | 67108864));
        r45.u85 u85Var = new r45.u85();
        u85Var.f387136d = 67108864;
        u85Var.f387137e = !z17 ? 1 : 0;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        b();
        if (!z17) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("topstoryapp");
            return;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("topstoryapp") == null) {
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.b2("topstoryapp");
            l4Var.l1(this.f292944d.getString(com.tencent.mm.R.string.f491004bj2));
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            l4Var.n1(java.lang.System.currentTimeMillis());
            l4Var.M1(0);
            l4Var.Y1(0);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
        }
    }

    public final void b() {
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f292946f).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f292945e.d1(), this.f292945e.g2(), this.f292944d.getString(com.tencent.mm.R.string.f491004bj2));
        if ((c01.z1.n() & 67108864) == 0) {
            helperHeaderPreference.N(1);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_top_story_install", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_top_story_uninstall", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_go_to_top_story", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_top_story_not_disturb", false);
        } else {
            helperHeaderPreference.N(0);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_top_story_install", false);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_top_story_uninstall", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_go_to_top_story", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f292946f).m("contact_info_top_story_not_disturb", true);
        }
        if ((c01.z1.o() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0) {
            this.f292947g.O(true);
        } else {
            this.f292947g.O(false);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            return;
        }
        if (o17 == 40 || o17 == 34 || o17 == 7) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        gm0.j1.u().c().e(this);
        return true;
    }
}
