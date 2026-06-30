package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class r2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161492d;

    public r2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161492d = selfQRCodeUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161492d;
        if (!selfQRCodeUI.A.e()) {
            selfQRCodeUI.A.d();
        }
        selfQRCodeUI.A.c(1000L, 1000L);
    }
}
