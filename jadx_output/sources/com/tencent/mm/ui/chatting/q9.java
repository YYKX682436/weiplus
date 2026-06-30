package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class q9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f202620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f202621b;

    public q9(com.tencent.mm.ui.chatting.n9 n9Var, q80.d0 d0Var, android.app.Activity activity) {
        this.f202620a = d0Var;
        this.f202621b = activity;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "openLiteApp fail %s.", this.f202620a.f360649a);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.app.Activity activity = this.f202621b;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = activity.getResources().getString(com.tencent.mm.R.string.ggb);
        e4Var.c();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "openLiteApp success %s.", this.f202620a.f360649a);
    }
}
