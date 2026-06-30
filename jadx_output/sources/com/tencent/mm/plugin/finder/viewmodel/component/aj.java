package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class aj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f133780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f133781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133781e = blVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.aj(this.f133781e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.aj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f133780d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f133780d = 1;
            x17 = bVar.x1(3, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        kotlin.Result.m524exceptionOrNullimpl(x17);
        this.f133781e.f133902r = false;
        return jz5.f0.f302826a;
    }
}
