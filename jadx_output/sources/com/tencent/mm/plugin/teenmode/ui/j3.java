package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro f173039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro) {
        super(0);
        this.f173039d = settingsSysTeenModeIntro;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.teenmode.ui.a6 a6Var = new com.tencent.mm.plugin.teenmode.ui.a6();
        java.lang.String stringExtra = this.f173039d.getIntent().getStringExtra("IntentKey_TeenModeIntroData");
        if (stringExtra == null) {
            stringExtra = "";
        }
        a6Var.fromXml(stringExtra);
        return a6Var;
    }
}
