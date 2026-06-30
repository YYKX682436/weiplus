package t14;

/* loaded from: classes11.dex */
public final class q extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f414589d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.base.preference.g0 f414590e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f414591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f414589d = jz5.h.b(new t14.n(this, activity));
        jz5.h.b(t14.o.f414586d);
        this.f414590e = new t14.m(this);
        this.f414591f = jz5.h.b(new t14.p(this, activity));
    }

    public final java.lang.String T6() {
        return (java.lang.String) ((jz5.n) this.f414589d).getValue();
    }

    public final java.util.Map U6(com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        int m17 = preference.m();
        java.lang.String l17 = preference.l();
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("page_name_kv", T6());
        lVarArr[1] = new jz5.l("view_name_kv", str);
        lVarArr[2] = new jz5.l("switch_button_type", java.lang.Integer.valueOf(m17));
        lVarArr[3] = new jz5.l("switch_status_current", l17);
        lVarArr[4] = new jz5.l("setting_sessionid", u24.n.b());
        android.content.Intent intent = getActivity().getIntent();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference mMReportPreference = activity instanceof com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference ? (com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference) activity : null;
        lVarArr[5] = new jz5.l("setting_level", java.lang.Integer.valueOf(intent.getIntExtra("setting_level", mMReportPreference != null ? mMReportPreference.V6() : 0)));
        lVarArr[6] = new jz5.l("ui_version", java.lang.Integer.valueOf(getActivity().getIntent().getIntExtra("ui_version", 1)));
        lVarArr[7] = new jz5.l("cell_source_type", 2);
        lVarArr[8] = new jz5.l("setting_from_source", java.lang.Integer.valueOf(getActivity().getIntent().getIntExtra("setting_from_source", 2)));
        return kz5.c1.l(lVarArr);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        T6();
        cy1.a aVar = (cy1.a) rVar;
        if (aVar.Zi(getActivity()) <= 0) {
            aVar.ak(getActivity(), iy1.c.SettingsUIX);
        }
        if (aVar.aj(getActivity()) == null) {
            aVar.dk(getActivity(), T6());
        }
        aVar.ik(getActivity(), (getActivity() instanceof com.tencent.mm.plugin.setting.ui.setting.SettingsUI ? 32 : 0) | 12, 33328);
        aVar.Ai(getActivity(), new t14.k(this));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = activity instanceof com.tencent.mm.ui.base.preference.MMPreference ? (com.tencent.mm.ui.base.preference.MMPreference) activity : null;
        if (mMPreference != null) {
            com.tencent.mm.ui.base.preference.r preferenceScreen = mMPreference.getPreferenceScreen();
            com.tencent.mm.ui.base.preference.h0 h0Var = preferenceScreen instanceof com.tencent.mm.ui.base.preference.h0 ? (com.tencent.mm.ui.base.preference.h0) preferenceScreen : null;
            if (h0Var != null) {
                h0Var.a(this.f414590e);
            }
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new t14.l(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }
}
