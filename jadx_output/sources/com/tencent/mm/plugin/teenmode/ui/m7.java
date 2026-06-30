package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI f173076e;

    public m7(com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI, int i17) {
        this.f173076e = teenModeVerifyPwdUI;
        this.f173075d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI = this.f173076e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(teenModeVerifyPwdUI.f172917m.getHeight());
        int i17 = this.f173075d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyPwdUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (teenModeVerifyPwdUI.f172917m.getHeight() > i17) {
            teenModeVerifyPwdUI.f172916i.scrollBy(0, teenModeVerifyPwdUI.f172917m.getHeight() - i17);
        }
    }
}
