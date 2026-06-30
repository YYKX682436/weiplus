package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes4.dex */
public class AddMoreFriendsByOtherWayUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f172417d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494829b;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f489834d2);
        this.f172417d = getPreferenceScreen();
        setBackBtn(new gg4.c(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if ("find_friends_by_mobile".equals(preference.f197780q)) {
            if (r61.q0.b() != js.x0.SUCC) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
                intent.putExtra("key_upload_scene", 6);
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
                return true;
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.MobileFriendUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (!"find_friends_by_google_account".equals(preference.f197780q)) {
            return false;
        }
        if (!(!android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().l(208903, null)))) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.class);
            intent3.putExtra("enter_scene", 1);
            com.tencent.mm.ui.MMWizardActivity.X6(this, intent3);
            return true;
        }
        android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.class);
        intent4.putExtra("enter_scene", 1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsByOtherWayUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f172417d).h("find_friends_by_google_account")) != null) {
            if (!((c01.z1.n() & 8388608) == 0) || !com.tencent.mm.sdk.platformtools.t8.P0(this)) {
                ((com.tencent.mm.ui.base.preference.h0) this.f172417d).w("find_friends_by_google_account");
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f172417d).notifyDataSetChanged();
    }
}
