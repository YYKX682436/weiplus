package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.k1 f158405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.ringtone.uic.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158405d = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.f1(this.f158405d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.ringtone.uic.f1 f1Var = (com.tencent.mm.plugin.ringtone.uic.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.ringtone.uic.k1 k1Var = this.f158405d;
        kotlinx.coroutines.l.d(k1Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.h1(k1Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
