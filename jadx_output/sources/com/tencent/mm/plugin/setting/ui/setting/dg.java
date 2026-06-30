package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class dg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f160945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f160946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f160947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f160948g;

    public dg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, boolean z17, boolean z18) {
        this.f160948g = settingsManageFindMoreUI;
        this.f160945d = checkBoxPreference;
        this.f160946e = z17;
        this.f160947f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f160945d;
        if (checkBoxPreference != null) {
            checkBoxPreference.O(false);
        }
        if (this.f160946e) {
            return;
        }
        this.f160948g.g7(this.f160947f, 2097152L, 50);
    }
}
