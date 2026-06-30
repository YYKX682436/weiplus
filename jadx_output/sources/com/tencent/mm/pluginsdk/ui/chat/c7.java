package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190218d;

    public c7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190218d = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f190218d.f190221c.getSizeAnimController().a(true);
    }
}
