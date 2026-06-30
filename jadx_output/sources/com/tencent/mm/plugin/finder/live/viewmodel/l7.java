package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class l7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117221e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.l7(this.f117221e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.l7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117220d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mm.plugin.finder.live.widget.u70 T6 = this.f117221e.T6();
            java.lang.String d76 = T6 != null ? T6.d7() : "";
            this.f117220d = 1;
            obj = r4Var.V(d76, this);
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
