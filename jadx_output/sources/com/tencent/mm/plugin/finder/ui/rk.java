package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class rk extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment f129783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment finderWxConversationFragment) {
        super(2);
        this.f129783d = finderWxConversationFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qb2.t conv = (qb2.t) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(conv, "conv");
        com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment fragment = this.f129783d;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        dv2.h hVar = (dv2.h) pf5.z.f353948a.b(fragment).a(dv2.h.class);
        dv2.c cVar = dv2.c.f243820e;
        java.lang.String field_sessionId = conv.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        hVar.P6(cVar, field_sessionId, ((c61.l7) i95.n0.c(c61.l7.class)).Kj().L0(1, 3, ""));
        return jz5.f0.f302826a;
    }
}
