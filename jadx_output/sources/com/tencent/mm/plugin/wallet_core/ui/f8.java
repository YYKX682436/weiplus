package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class f8 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.g8 f180274a;

    public f8(com.tencent.mm.plugin.wallet_core.ui.g8 g8Var) {
        this.f180274a = g8Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: on flash end");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet_core.ui.e8(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: on flash start");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet_core.ui.d8(this));
    }
}
