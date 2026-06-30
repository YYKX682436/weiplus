package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class MailAddrProfileUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f154877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154878e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154879f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f154880g;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494900b1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.g1s);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f154877d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("mail_receiver_info_name")).H(this.f154878e);
        ((com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f154877d).h("mail_receiver_info_addr")).H(getIntent().getStringExtra("addr"));
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f154877d).h("mail_compose_btn");
        if (!this.f154880g) {
            ((com.tencent.mm.ui.base.preference.h0) this.f154877d).v(h17);
        }
        setBackBtn(new os3.g2(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154878e = getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        this.f154879f = getIntent().getStringExtra("addr");
        this.f154880g = getIntent().getBooleanExtra("can_compose", false);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.equals("mail_compose_btn")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.ComposeUI.class);
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new java.lang.String[]{this.f154878e + " " + this.f154879f});
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAddrProfileUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrProfileUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        }
        return false;
    }
}
