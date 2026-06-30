package com.tencent.mm.plugin.ringtone.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtonePrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class RingtonePrivacyUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f158333d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494915bh;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.o1.c(com.tencent.mm.plugin.ringtone.uic.a2.class));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(i65.a.r(this, com.tencent.mm.R.string.i2x));
        setBackBtn(new ay3.h(this));
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        kotlin.jvm.internal.o.f(preferenceScreen, "getPreferenceScreen(...)");
        this.f158333d = preferenceScreen;
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("recommend_switch");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) h17).O((((com.tencent.mm.plugin.ringtone.uic.a2) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).f158339d & 2048) == 0);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.plugin.ringtone.uic.a2) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).O6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (!kotlin.jvm.internal.o.b(preference != null ? preference.f197780q : null, "recommend_switch")) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePrivacyUI", "onRecommendSwitch");
        com.tencent.mm.ui.base.preference.r rVar2 = this.f158333d;
        if (rVar2 == null) {
            kotlin.jvm.internal.o.o("screen");
            throw null;
        }
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) rVar2).h("recommend_switch");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        ((com.tencent.mm.plugin.ringtone.uic.a2) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.ringtone.uic.a2.class)).P6(((com.tencent.mm.ui.base.preference.CheckBoxPreference) h17).N(), 2048L, 80);
        return true;
    }
}
