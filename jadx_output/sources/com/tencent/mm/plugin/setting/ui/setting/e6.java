package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class e6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f160980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f160981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI f160982f;

    public e6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, boolean z17) {
        this.f160982f = settingsAboutSystemUI;
        this.f160980d = checkBoxPreference;
        this.f160981e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f160980d.O(this.f160981e);
        ((com.tencent.mm.ui.base.preference.h0) this.f160982f.f160276g).notifyDataSetChanged();
    }
}
