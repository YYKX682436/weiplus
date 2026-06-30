package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u6 f199256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(java.lang.String str, com.tencent.mm.ui.chatting.component.u6 u6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199255e = str;
        this.f199256f = u6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.j6(this.f199255e, this.f199256f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.j6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f199254d;
        java.lang.String talker = this.f199255e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gc0.y0 y0Var = gc0.y0.f270365a;
            kotlin.jvm.internal.o.f(talker, "$talker");
            this.f199254d = 1;
            obj = y0Var.b(talker, true, false, this);
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
            com.tencent.mm.ui.chatting.component.u6.m0(this.f199256f, talker, true, tVar);
        }
        return jz5.f0.f302826a;
    }
}
