package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f124571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.k0 f124572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.profile.widget.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124572e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.profile.widget.i0 i0Var = new com.tencent.mm.plugin.finder.profile.widget.i0(this.f124572e, continuation);
        i0Var.f124571d = obj;
        return i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.widget.i0 i0Var = (com.tencent.mm.plugin.finder.profile.widget.i0) create((com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) this.f124571d;
        if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.profile.widget.h0(this.f124572e, iResponse));
        }
        return jz5.f0.f302826a;
    }
}
