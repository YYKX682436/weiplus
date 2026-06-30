package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.w1 f211100d;

    public v1(com.tencent.mm.ui.w1 w1Var) {
        this.f211100d = w1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckCanSubscribeBizUI", "getContactCallBack fail run");
        com.tencent.mm.ui.w1 w1Var = this.f211100d;
        com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI = w1Var.f211187a;
        checkCanSubscribeBizUI.f196625t = true;
        if (checkCanSubscribeBizUI.f196621p || checkCanSubscribeBizUI.isDestroyed()) {
            return;
        }
        com.tencent.mm.ui.CheckCanSubscribeBizUI.T6(w1Var.f211187a);
    }
}
