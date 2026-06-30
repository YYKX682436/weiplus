package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationFragment f129718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment) {
        super(2);
        this.f129718d = finderConversationFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qb2.t conv = (qb2.t) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(conv, "conv");
        com.tencent.mm.plugin.finder.ui.FinderConversationFragment fragment = this.f129718d;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        dv2.h hVar = (dv2.h) pf5.z.f353948a.b(fragment).a(dv2.h.class);
        dv2.c cVar = dv2.c.f243821f;
        java.lang.String field_sessionId = conv.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        hVar.P6(cVar, field_sessionId, intValue);
        return jz5.f0.f302826a;
    }
}
