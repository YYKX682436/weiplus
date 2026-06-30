package hr3;

/* loaded from: classes9.dex */
public final class n8 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f283827d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283828e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283829f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f283830g;

    public n8(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f283827d = context;
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        this.f283829f = rVar;
        this.f283828e = z3Var;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494855dg);
        }
        java.lang.Object h17 = rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_schedule_msg_sticky") : null;
        this.f283830g = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, "contact_info_schedule_msg_sticky")) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f283830g;
            if (checkBoxPreference != null && checkBoxPreference.N()) {
                com.tencent.mm.storage.z3 z3Var = this.f283828e;
                c01.e2.t0(z3Var != null ? z3Var.d1() : null, true, true);
            } else {
                com.tencent.mm.storage.z3 z3Var2 = this.f283828e;
                c01.e2.B0(z3Var2 != null ? z3Var2.d1() : null, true, true);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str2 = pj5.u.f355407a;
            if (str2 == null) {
                str2 = "";
            }
            lVarArr[0] = new jz5.l("reminder_sessionid", str2);
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f283830g;
            lVarArr[1] = new jz5.l("pin_btn_clk", java.lang.Integer.valueOf(checkBoxPreference2 != null && checkBoxPreference2.N() ? 1 : 2));
            ((cy1.a) rVar).Hj("pin_reminder_btn", "view_clk", kz5.c1.k(lVarArr), 35684);
        } else if (kotlin.jvm.internal.o.b(str, "contact_info_schedule_msg_clear_data")) {
            android.content.Context context = this.f283827d;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context != null ? context.getString(com.tencent.mm.R.string.nlm) : null);
            u1Var.j(context != null ? context.getString(com.tencent.mm.R.string.nlk) : null);
            u1Var.n(context != null ? context.getString(com.tencent.mm.R.string.nll) : null);
            u1Var.b(new hr3.m8(this));
            u1Var.q(false);
        }
        return false;
    }

    public final void a() {
        com.tencent.mm.ui.base.preference.r rVar = this.f283829f;
        com.tencent.mm.ui.base.preference.Preference h17 = rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_header_helper") : null;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = h17 instanceof com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference ? (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) h17 : null;
        if (helperHeaderPreference == null) {
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.f283828e;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.tencent.mm.storage.z3 z3Var2 = this.f283828e;
        java.lang.String g27 = z3Var2 != null ? z3Var2.g2() : null;
        android.content.Context context = this.f283827d;
        helperHeaderPreference.M(d17, g27, context != null ? context.getString(com.tencent.mm.R.string.nln) : null);
        helperHeaderPreference.N(2);
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f283830g;
        if (checkBoxPreference == null) {
            return;
        }
        com.tencent.mm.storage.l8 r17 = c01.d9.b().r();
        com.tencent.mm.storage.z3 z3Var3 = this.f283828e;
        checkBoxPreference.O(((com.tencent.mm.storage.m4) r17).K(z3Var3 != null ? z3Var3.d1() : null));
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        return true;
    }
}
