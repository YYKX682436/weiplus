package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f134998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134998e = h00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.kz(this.f134998e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.viewmodel.component.kz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f134997d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f134998e;
            kotlinx.coroutines.flow.j2 j2Var = h00Var.f134568f;
            com.tencent.mm.plugin.finder.viewmodel.component.jz jzVar = new com.tencent.mm.plugin.finder.viewmodel.component.jz(h00Var);
            this.f134997d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(jzVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
