package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class g9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.h9 f161071b;

    public g9(com.tencent.mm.plugin.setting.ui.setting.h9 h9Var, boolean z17) {
        this.f161071b = h9Var;
        this.f161070a = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN;
            boolean z18 = this.f161070a;
            c17.x(u3Var, java.lang.Boolean.valueOf(z18));
            j65.e.o();
            com.tencent.mm.autogen.mmdata.rpt.CareModeSwitchStruct careModeSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.CareModeSwitchStruct();
            careModeSwitchStruct.f55580d = z18 ? 3L : 4L;
            careModeSwitchStruct.k();
            l14.a.a("listen_text_msg_btn", z18);
            com.tencent.mm.plugin.setting.ui.setting.h9 h9Var = this.f161071b;
            com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.V6(h9Var.f161100a);
            com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.T6(h9Var.f161100a);
        }
    }
}
