package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class p extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f207949d = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.conversation.o(this), false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q f207950e;

    public p(com.tencent.mm.ui.conversation.q qVar) {
        this.f207950e = qVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f207949d;
        if (b4Var != null) {
            b4Var.c(10L, 10L);
        }
    }
}
