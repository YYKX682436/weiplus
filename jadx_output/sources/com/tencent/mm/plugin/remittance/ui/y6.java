package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f158051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f158052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f158054g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h45.i f158055h;

    public y6(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog, h45.i iVar) {
        this.f158052e = activity;
        this.f158053f = str;
        this.f158054g = dialog;
        this.f158055h = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[jumpToLqtSaveKinda] WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f158051d));
        if (!this.f158051d) {
            com.tencent.mm.plugin.remittance.ui.z6.f158065a.a(this.f158052e, this.f158053f, this.f158054g, this.f158055h);
        }
        this.f158051d = true;
    }
}
