package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ga extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f200963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200963d = h0Var;
        this.f200964e = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.ga(this.f200963d, this.f200964e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.gallery.ga gaVar = (com.tencent.mm.ui.chatting.gallery.ga) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(c35.m.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f200963d.f310123d = c35.m.p8((c35.m) c17, this.f200964e, false, 2, null);
        return jz5.f0.f302826a;
    }
}
