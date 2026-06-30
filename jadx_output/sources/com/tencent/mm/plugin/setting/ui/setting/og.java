package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class og implements com.tencent.mm.plugin.setting.ui.setting.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f161392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f161393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.qg f161394c;

    public og(com.tencent.mm.plugin.setting.ui.setting.qg qgVar, long j17, long j18) {
        this.f161394c = qgVar;
        this.f161392a = j17;
        this.f161393b = j18;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.tg
    public void a(boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageFindMoreUI", "showTipDialog, yes.");
            v24.o0.a(this.f161394c.f161475d, 1, 1, this.f161392a, this.f161393b, new com.tencent.mm.plugin.setting.ui.setting.ng(this), false);
        }
    }
}
