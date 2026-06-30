package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class p7 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.q7 f180574a;

    public p7(com.tencent.mm.plugin.wallet_core.ui.q7 q7Var) {
        this.f180574a = q7Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: on flash end");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet_core.ui.o7(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: on flash start");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet_core.ui.n7(this));
    }
}
