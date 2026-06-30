package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f134050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n0 f134051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134051e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.viewmodel.component.d0 d0Var = new com.tencent.mm.plugin.finder.viewmodel.component.d0(this.f134051e, continuation);
        d0Var.f134050d = obj;
        return d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.d0 d0Var = (com.tencent.mm.plugin.finder.viewmodel.component.d0) create((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) this.f134050d;
        com.tencent.mm.protobuf.g lastBuffer = iResponse.getLastBuffer();
        com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var = this.f134051e;
        n0Var.f135238r = lastBuffer;
        kotlinx.coroutines.l.d(n0Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.c0(iResponse.getErrType() == 0 && iResponse.getErrCode() == 0, n0Var, iResponse, null), 3, null);
        return jz5.f0.f302826a;
    }
}
