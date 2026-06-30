package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class r9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI f208050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
        super(1);
        this.f208050d = openImKefuServiceConversationUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j41.u uVar = (j41.u) obj;
        com.tencent.mm.ui.conversation.u8 u8Var = com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.f207392n;
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI openImKefuServiceConversationUI = this.f208050d;
        int i17 = ((java.lang.Boolean) ((jz5.n) openImKefuServiceConversationUI.f207396h).getValue()).booleanValue() ? 24 : 23;
        k41.g0 g0Var = uVar instanceof k41.g0 ? (k41.g0) uVar : null;
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest X6 = openImKefuServiceConversationUI.X6();
        kotlin.jvm.internal.o.d(X6);
        q41.f.c(g0Var, i17, X6.f72274f, 0L, 8, null);
        if (uVar != null ? kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(((k41.g0) uVar).field_needReport), java.lang.Boolean.TRUE) : false) {
            l41.r1 r1Var = l41.r1.f315913a;
            k41.g0 g0Var2 = (k41.g0) uVar;
            java.lang.String str = g0Var2.field_username;
            kotlin.jvm.internal.o.f(str, "getUsername(...)");
            java.lang.String field_locationType = g0Var2.field_locationType;
            kotlin.jvm.internal.o.f(field_locationType, "field_locationType");
            l41.r1.b(r1Var, str, field_locationType, 1, null, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
