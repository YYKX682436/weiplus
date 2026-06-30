package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class u5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.w5 f205664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f205665e;

    public u5(com.tencent.mm.ui.chatting.viewitems.w5 w5Var, yz5.a aVar) {
        this.f205664d = w5Var;
        this.f205665e = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f205664d.clickArea.removeOnAttachStateChangeListener(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "post async runnable");
        boolean c17 = com.tencent.mm.sdk.platformtools.o3.c();
        yz5.a aVar = this.f205665e;
        if (c17) {
            com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(new com.tencent.mm.ui.chatting.viewitems.a6(aVar));
        } else {
            pm0.v.X(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
