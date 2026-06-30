package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f199348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u6 f199349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(java.lang.String str, boolean z17, com.tencent.mm.ui.chatting.component.u6 u6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199347e = str;
        this.f199348f = z17;
        this.f199349g = u6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.k6(this.f199347e, this.f199348f, this.f199349g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.k6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f199346d;
        java.lang.String talker = this.f199347e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gc0.y0 y0Var = gc0.y0.f270365a;
            kotlin.jvm.internal.o.f(talker, "$talker");
            this.f199346d = 1;
            obj = y0Var.b(talker, false, this.f199348f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        uc0.t tVar = (uc0.t) obj;
        if (tVar != null) {
            kotlin.jvm.internal.o.d(talker);
            com.tencent.mm.ui.chatting.component.u6.m0(this.f199349g, talker, true, tVar);
        }
        return jz5.f0.f302826a;
    }
}
