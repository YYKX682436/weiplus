package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class wj implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161709d;

    public wj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161709d = settingsNotificationUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            db5.h4 h4Var = (db5.h4) g4Var.a(1, com.tencent.mm.R.string.f493062m53);
            int color = this.f161709d.getContext().getResources().getColor(com.tencent.mm.R.color.f478622ch);
            h4Var.f228376t = com.tencent.mm.R.string.f493062m53;
            h4Var.f228370n = color;
        }
    }
}
