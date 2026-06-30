package com.tencent.mm.plugin.profile.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OpenIMKefuProfileSettingUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f153739f = 0;

    /* renamed from: d, reason: collision with root package name */
    public cr3.d0 f153740d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153741e = jz5.h.b(new hr3.vb(this));

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494909bb;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("openim_kefu_setting_need_report");
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        boolean z17 = false;
        if (checkBoxPreference != null) {
            checkBoxPreference.O(getIntent().getBooleanExtra("need_location_report", false));
            hr3.sb sbVar = hr3.sb.f283974d;
            checkBoxPreference.T = sbVar;
            android.view.View view = checkBoxPreference.S;
            if (view != null) {
                view.setOnClickListener(sbVar);
            }
        }
        jz5.g gVar = this.f153741e;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).getValue();
        if (str != null) {
            k41.g0 c17 = k41.o0.c(str);
            if (c17 != null && java.lang.Boolean.valueOf(c17.field_hasSetReport).booleanValue()) {
                z17 = true;
            }
            if (!z17) {
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("openim_kefu_setting_need_report", true);
                ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("openim_kefu_setting_small_category", true);
            }
        }
        com.tencent.mm.storage.z3 l17 = c01.e2.l((java.lang.String) ((jz5.n) gVar).getValue());
        if (l17 == null) {
            com.tencent.stubs.logger.Log.e(com.tencent.mm.ui.base.preference.MMPreference.TAG, "ContactStorageLogic.getContactWithInit return null? username = %s", (java.lang.String) ((jz5.n) gVar).getValue());
            finish();
        }
        this.f153740d = new cr3.d0(this, l17);
        setMMTitle((java.lang.CharSequence) getString(com.tencent.mm.R.string.g0m));
        setBackBtn(new hr3.tb(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference == null) {
            return false;
        }
        if (!kotlin.jvm.internal.o.b(preference.f197780q, "openim_kefu_setting_need_report")) {
            if (!kotlin.jvm.internal.o.b(preference.f197780q, "openim_kefu_setting_recommend")) {
                return false;
            }
            cr3.d0 d0Var = this.f153740d;
            if (d0Var != null) {
                d0Var.c();
            }
            return true;
        }
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getString(com.tencent.mm.R.string.f490604zq), false, 3, null);
        java.lang.String str = (java.lang.String) ((jz5.n) this.f153741e).getValue();
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference : null;
        if (str != null && checkBoxPreference != null) {
            l41.y1 y1Var = l41.y1.f315970a;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            y1Var.a(context, str, checkBoxPreference.N(), new hr3.ub(f17, checkBoxPreference, this, str));
        }
        return true;
    }
}
