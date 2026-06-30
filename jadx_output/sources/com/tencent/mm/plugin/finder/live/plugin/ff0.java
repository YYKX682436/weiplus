package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ff0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f112547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112547e = jf0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.ff0(this.f112547e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ff0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112546d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            java.lang.String str = this.f112547e.Y().f410646a;
            this.f112546d = 1;
            obj = ((com.tencent.mm.feature.finder.live.z5) a1Var).Ri(str, 1, this);
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
