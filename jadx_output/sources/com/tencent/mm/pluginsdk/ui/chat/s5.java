package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class s5 extends com.tencent.mm.pluginsdk.ui.chat.c8 {
    public final jz5.g C;
    public final jz5.g D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, fl5.i oriEdt) {
        super(chatFooter, oriEdt);
        kotlin.jvm.internal.o.g(chatFooter, "chatFooter");
        kotlin.jvm.internal.o.g(oriEdt, "oriEdt");
        this.C = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.r5(this));
        this.D = jz5.h.b(new com.tencent.mm.pluginsdk.ui.chat.q5(this, chatFooter));
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.c8
    public void b(boolean z17) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        android.app.Activity f17 = f();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = f17 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) f17 : null;
        if (mMFragmentActivity == null || (swipeBackLayout = mMFragmentActivity.getSwipeBackLayout()) == null) {
            return;
        }
        swipeBackLayout.setEnableGesture(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.c8
    public android.view.View d() {
        java.lang.Object value = ((jz5.n) this.D).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.c8
    public android.app.Activity f() {
        android.app.Activity activity = this.f190220b.getActivity();
        kotlin.jvm.internal.o.f(activity, "getActivity(...)");
        return activity;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.c8
    public android.view.View i() {
        java.lang.Object value = ((jz5.n) this.C).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }
}
