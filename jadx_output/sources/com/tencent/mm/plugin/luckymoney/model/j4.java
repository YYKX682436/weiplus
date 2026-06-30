package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f145352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f145353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f145355g;

    public j4(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog) {
        this.f145353e = activity;
        this.f145354f = str;
        this.f145355g = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[jumpToLqtSaveKinda] WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f145352d));
        if (!this.f145352d) {
            com.tencent.mm.plugin.luckymoney.model.l4.f145416a.b(this.f145353e, this.f145354f, this.f145355g);
        }
        this.f145352d = true;
    }
}
