package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.lz f135639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135639e = lzVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.pz(this.f135639e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.pz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135638d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            db2.v4 v4Var = new db2.v4(this.f135639e.f135100d);
            this.f135638d = 1;
            obj = rm0.h.b(v4Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
