package hn1;

/* loaded from: classes9.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f282458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282457e = str;
        this.f282458f = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hn1.k(this.f282457e, this.f282458f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hn1.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f282456d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(kv.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String str = this.f282457e;
            java.util.Map map = this.f282458f;
            this.f282456d = 1;
            if (kv.b0.n4((kv.b0) c17, str, null, 0.0f, map, this, 4, null) == aVar) {
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
