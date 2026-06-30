package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class c0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.h0 f202140d;

    public c0(com.tencent.mm.ui.chatting.presenter.h0 h0Var) {
        this.f202140d = h0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        de5.a aVar = de5.a.f229396a;
        com.tencent.mm.ui.chatting.presenter.h0 h0Var = this.f202140d;
        aVar.l(h0Var.f202240i);
        aVar.k(4, 7, 8);
        h0Var.c();
        return false;
    }
}
