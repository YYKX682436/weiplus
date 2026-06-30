package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public final class w8 implements sb5.v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f208223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment f208224b;

    public w8(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
        this.f208224b = openImKefuChattingUIFragment;
    }

    @Override // sb5.v
    public void a(boolean z17) {
        if (this.f208223a) {
            return;
        }
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f208224b;
        ab5.i0 i0Var = openImKefuChattingUIFragment.P;
        kotlin.jvm.internal.o.d(i0Var);
        db5.d5 d5Var = i0Var.f2953f;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        ab5.i0 i0Var2 = openImKefuChattingUIFragment.P;
        kotlin.jvm.internal.o.d(i0Var2);
        gm0.j1.e().j(new ab5.g0(i0Var2));
        this.f208223a = true;
    }
}
