package hr3;

/* loaded from: classes9.dex */
public class r8 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f283943d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f283944e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f283945f;

    public r8(android.content.Context context) {
        this.f283944e = context;
    }

    public static void a(android.content.Context context, boolean z17, com.tencent.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f312615d).k(new hr3.q8(db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(z17 ? com.tencent.mm.R.string.iwq : com.tencent.mm.R.string.iww), true, true, null), new hr3.p8(z17, z9Var)), 1500L);
    }

    @Override // t25.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        boolean z18 = false;
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        if (d17 != null && d17.equalsIgnoreCase("voiceinputapp")) {
            z18 = true;
        }
        iz5.a.g(null, z18);
        c01.d9.b().p().a(this);
        this.f283945f = z3Var;
        this.f283943d = rVar;
        ((com.tencent.mm.ui.base.preference.h0) rVar).g(com.tencent.mm.R.xml.f494859a3);
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_voiceinput_install");
        android.content.Context context = this.f283944e;
        if (equals) {
            a(context, true, null);
            return true;
        }
        if (!str.equals("contact_info_voiceinput_uninstall")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetVoiceInput", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        android.content.Context context2 = this.f283944e;
        db5.e1.A(context2, context2.getString(com.tencent.mm.R.string.iws), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new hr3.o8(this), null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void b() {
        ?? r07 = (c01.z1.n() & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) == 0 ? 1 : 0;
        com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference helperHeaderPreference = (com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f283943d).h("contact_info_header_helper");
        helperHeaderPreference.M(this.f283945f.d1(), this.f283945f.g2(), this.f283944e.getString(com.tencent.mm.R.string.bje));
        helperHeaderPreference.N(r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f283943d).m("contact_info_voiceinput_install", r07);
        ((com.tencent.mm.ui.base.preference.h0) this.f283943d).m("contact_info_voiceinput_uninstall", r07 ^ 1);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetVoiceInput", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            b();
        }
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    public boolean onDetach() {
        c01.d9.b().p().e(this);
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
