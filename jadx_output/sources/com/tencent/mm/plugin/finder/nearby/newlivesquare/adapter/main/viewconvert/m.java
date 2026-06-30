package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f121792d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f121793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f121794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f121794f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m mVar = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m(this.f121794f, continuation);
        mVar.f121793e = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f121792d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f121793e;
            this.f121792d = 1;
            if (this.f121794f.invoke(y0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
