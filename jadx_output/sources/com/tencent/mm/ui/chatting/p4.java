package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class p4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f202081d;

    public p4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f202081d = h4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202081d;
        h4Var.f201636a.U1(((com.tencent.mm.modelbase.g1) h4Var.f201637b.b()).d());
        return true;
    }
}
