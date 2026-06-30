package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes15.dex */
public class qn implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI f161485d;

    public qn(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI) {
        this.f161485d = settingsTrustFriendUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI settingsTrustFriendUI = this.f161485d;
        if (settingsTrustFriendUI.f160736f.getItemViewType(i17) == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("list_type", 12);
            intent.putExtra("titile", settingsTrustFriendUI.getString(com.tencent.mm.R.string.f489934fx));
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            intent.putExtra("max_limit_num", com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.f160733n);
            intent.putExtra("stay_in_wechat", true);
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(settingsTrustFriendUI.f160734d, ","));
            intent.putExtra("block_contact", c01.z1.r());
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206788i & (-257) & (-16777217));
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("without_openim", true);
            intent.putExtra("too_many_member_tip_string", settingsTrustFriendUI.getString(com.tencent.mm.R.string.f493100j06, java.lang.Integer.valueOf(com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.f160733n)));
            j45.l.v(settingsTrustFriendUI, ".ui.contact.SelectContactUI", intent, 1);
        } else if (settingsTrustFriendUI.f160736f.getItemViewType(i17) == 2) {
            if (!settingsTrustFriendUI.f160739i) {
                settingsTrustFriendUI.f160739i = true;
                settingsTrustFriendUI.f160736f.notifyDataSetChanged();
            }
        } else if (settingsTrustFriendUI.f160736f.getItemViewType(i17) == 0 && settingsTrustFriendUI.f160739i) {
            ((java.util.ArrayList) settingsTrustFriendUI.f160734d).remove(settingsTrustFriendUI.f160736f.getItem(i17));
            if (((java.util.ArrayList) settingsTrustFriendUI.f160734d).size() == 0) {
                settingsTrustFriendUI.f160739i = false;
            }
            settingsTrustFriendUI.f160736f.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
