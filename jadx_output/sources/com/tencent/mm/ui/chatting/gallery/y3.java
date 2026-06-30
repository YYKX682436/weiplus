package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.d1 f201574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.r3 f201575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.ui.chatting.gallery.d1 d1Var, com.tencent.mm.ui.chatting.gallery.r3 r3Var) {
        super(1);
        this.f201574d = d1Var;
        this.f201575e = r3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String eventId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mm.ui.chatting.gallery.r3 r3Var = this.f201575e;
        this.f201574d.Y9(eventId, r3Var.f201326g.f71258d, r3Var.f201330k);
        return jz5.f0.f302826a;
    }
}
