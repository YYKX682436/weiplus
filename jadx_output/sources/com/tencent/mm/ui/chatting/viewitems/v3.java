package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class v3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a4 f205827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f205828e;

    public v3(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, java.lang.Runnable runnable) {
        this.f205827d = a4Var;
        this.f205828e = runnable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f205827d.clickArea.removeOnAttachStateChangeListener(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2C", "post async runnable %s", this.f205828e);
        java.lang.Runnable runnable = this.f205828e;
        if (com.tencent.mm.sdk.platformtools.o3.c()) {
            com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(runnable);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
