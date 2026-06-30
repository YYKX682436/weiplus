package d24;

/* loaded from: classes11.dex */
public final class t0 implements com.tencent.mm.plugin.setting.ui.setting.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatRecordManageItem f225967a;

    public t0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatRecordManageItem settingGroupChatRecordManageItem) {
        this.f225967a = settingGroupChatRecordManageItem;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.b
    public void a(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatRecordManageItem settingGroupChatRecordManageItem = this.f225967a;
        if (drawable == null) {
            settingGroupChatRecordManageItem.f161880r = null;
            settingGroupChatRecordManageItem.f161881s = 8;
        } else if (settingGroupChatRecordManageItem.f161881s == 8) {
            settingGroupChatRecordManageItem.f161880r = drawable;
            settingGroupChatRecordManageItem.f161881s = 0;
        }
        settingGroupChatRecordManageItem.w7();
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.b
    public void b(java.lang.String str, java.lang.Integer num) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupChatRecordManageItem settingGroupChatRecordManageItem = this.f225967a;
        settingGroupChatRecordManageItem.f161878p = str;
        if (num != null) {
            settingGroupChatRecordManageItem.f161879q = num;
        }
        settingGroupChatRecordManageItem.w7();
    }
}
