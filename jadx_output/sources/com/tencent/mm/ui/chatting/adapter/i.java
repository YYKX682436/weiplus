package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes5.dex */
public final class i implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.k f198420d;

    public i(com.tencent.mm.ui.chatting.adapter.k kVar) {
        this.f198420d = kVar;
    }

    @Override // xg3.h0
    public final void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String str;
        if (m0Var == null || l0Var == null || (str = l0Var.f454410a) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.adapter.k kVar = this.f198420d;
        kVar.K.x();
        if (kotlin.jvm.internal.o.b(str, kVar.K.x())) {
            kVar.Q0();
        }
    }
}
