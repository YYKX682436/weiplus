package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class we extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136339d;

    /* renamed from: e, reason: collision with root package name */
    public int f136340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f136341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f136342g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136341f = c0Var;
        this.f136342g = yeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.we(this.f136341f, this.f136342g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.we) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136340e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.c0 c0Var2 = this.f136341f;
            this.f136339d = c0Var2;
            this.f136340e = 1;
            java.lang.Object O6 = com.tencent.mm.plugin.finder.viewmodel.component.ye.O6(this.f136342g, this);
            if (O6 == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            obj = O6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f136339d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c0Var.f310112d = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f302826a;
    }
}
