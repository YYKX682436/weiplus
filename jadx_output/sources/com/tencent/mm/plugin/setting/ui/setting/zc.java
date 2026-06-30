package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class zc implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f161823a;

    public zc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f161823a = settingsHearingAidInitUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.f160424r;
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI = this.f161823a;
            settingsHearingAidInitUI.getClass();
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).fj(v65.m.b(settingsHearingAidInitUI), wd0.g1.f444713e);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "updateXWebAudioHAidConfig, enable:false, haidType:o, haidDevice:0");
            com.tencent.xweb.a3.D(false, 0, 0, null);
            if (!j65.e.g() && !j65.e.f() && !j65.e.e()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsHearingAidInitUI.getContext());
                u1Var.g(settingsHearingAidInitUI.getString(com.tencent.mm.R.string.f492980ij4));
                u1Var.n(settingsHearingAidInitUI.getString(com.tencent.mm.R.string.f490454vi));
                u1Var.a(true);
                u1Var.l(new com.tencent.mm.plugin.setting.ui.setting.sc(settingsHearingAidInitUI));
                u1Var.q(false);
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidInitUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.o5b);
            e4Var.c();
            android.widget.Button button = settingsHearingAidInitUI.f160431m;
            if (button == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            button.setVisibility(8);
            android.widget.Button button2 = settingsHearingAidInitUI.f160430i;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("startBtn");
                throw null;
            }
            button2.setVisibility(0);
            settingsHearingAidInitUI.U6();
        }
    }
}
