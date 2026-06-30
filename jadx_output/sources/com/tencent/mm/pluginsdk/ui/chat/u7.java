package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190680d;

    public u7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190680d = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190680d;
        c8Var.v();
        c8Var.w();
    }
}
