package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class zj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI f161830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f161831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI settingsPermissionIndexUI, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f161830d = settingsPermissionIndexUI;
        this.f161831e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object[] objArr = {"infopage", this.f161831e.f310123d};
        com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI settingsPermissionIndexUI = this.f161830d;
        java.lang.String string = settingsPermissionIndexUI.getString(com.tencent.mm.R.string.gba, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI.X6(settingsPermissionIndexUI, string);
        return jz5.f0.f302826a;
    }
}
