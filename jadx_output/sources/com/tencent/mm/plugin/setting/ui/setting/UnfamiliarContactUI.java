package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class UnfamiliarContactUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public boolean f160786d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160787e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160788f;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494953ck;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(com.tencent.mm.R.string.j0i);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.iq(this));
        ((com.tencent.mm.ui.base.preference.CheckPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_half_year_not_chat")).S = 0;
        ((com.tencent.mm.ui.base.preference.CheckPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_has_not_same_chatroom")).S = 0;
        ((com.tencent.mm.ui.base.preference.CheckPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_half_year_not_response")).S = 0;
        ((com.tencent.mm.ui.base.preference.TextButtonPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_next_step")).w(false);
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference instanceof com.tencent.mm.ui.base.preference.CheckPreference) {
            com.tencent.mm.ui.base.preference.CheckPreference checkPreference = (com.tencent.mm.ui.base.preference.CheckPreference) preference;
            if (preference.f197780q.equals("settings_half_year_not_chat")) {
                boolean z17 = this.f160786d;
                checkPreference.L = !z17;
                this.f160786d = !z17;
            } else if (preference.f197780q.equals("settings_has_not_same_chatroom")) {
                boolean z18 = this.f160788f;
                checkPreference.L = !z18;
                this.f160788f = !z18;
            } else if (preference.f197780q.equals("settings_half_year_not_response")) {
                boolean z19 = this.f160787e;
                checkPreference.L = !z19;
                this.f160787e = !z19;
            }
            ((com.tencent.mm.ui.base.preference.TextButtonPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_next_step")).w(this.f160786d || this.f160788f || this.f160787e);
        } else if (preference.f197780q.equals("settings_next_step")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.class);
            intent.putExtra("half_year_not_chat", this.f160786d);
            intent.putExtra("half_year_not_response", this.f160787e);
            intent.putExtra("has_not_same_chatroom", this.f160788f);
            startActivityForResult(intent, 291);
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        return true;
    }
}
