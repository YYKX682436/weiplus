package com.tencent.mm.plugin.setting.ui.setting.report;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/report/MMReportPreference;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "t14/r", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class MMReportPreference extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public static final t14.r f161506e = new t14.r(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f161507f = kz5.c0.i(t14.q.class, t14.j.class);

    /* renamed from: d, reason: collision with root package name */
    public long f161508d;

    public abstract int V6();

    public final void W6(com.tencent.mm.ui.base.preference.r rVar, java.lang.String selectViewId) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(selectViewId, "selectViewId");
        com.tencent.mm.ui.base.preference.Preference h17 = rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h(selectViewId) : null;
        if (h17 == null || !((com.tencent.mm.ui.base.preference.h0) rVar).q(selectViewId)) {
            return;
        }
        boolean z17 = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference;
        t14.r rVar2 = f161506e;
        if (z17) {
            rVar2.a(this, selectViewId, ((com.tencent.mm.ui.base.preference.CheckBoxPreference) h17).N() ? "1" : "0", 1);
            return;
        }
        java.lang.CharSequence n17 = h17.n();
        if (n17 == null || (str = n17.toString()) == null) {
            str = "";
        }
        rVar2.a(this, selectViewId, str, h17.m());
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public void dispatchClick(com.tencent.mm.ui.base.preference.h0 h0Var, com.tencent.mm.ui.base.preference.Preference preference) {
        super.dispatchClick(h0Var, preference);
        t14.q qVar = (t14.q) component(t14.q.class);
        if (preference == null) {
            qVar.getClass();
            return;
        }
        java.util.Map U6 = qVar.U6(preference);
        U6.put("view_id", preference.f197780q);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = u24.n.b();
        java.lang.String substring = b17.substring(r26.n0.O(b17, '_', 0, false, 6, null) + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.Long j17 = r26.h0.j(substring);
        androidx.appcompat.app.AppCompatActivity activity = qVar.getActivity();
        com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference mMReportPreference = activity instanceof com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference ? (com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference) activity : null;
        if (mMReportPreference != null) {
            U6.put("before_clk_page_duration", java.lang.Long.valueOf(currentTimeMillis - mMReportPreference.f161508d));
        }
        if (j17 != null) {
            U6.put("before_clk_session_duration", java.lang.Long.valueOf(currentTimeMillis - j17.longValue()));
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(h0Var);
            U6.toString();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", U6, 33328);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long c17 = c01.id.c();
        this.f161508d = c17;
        u24.n.a(c17);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j17 = this.f161508d;
        java.lang.Long l17 = u24.n.f424131b;
        if (l17 != null && j17 == l17.longValue()) {
            u24.n.f424130a = null;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.addAll(f161507f);
    }
}
