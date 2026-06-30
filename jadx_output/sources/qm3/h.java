package qm3;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f364780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.a f364781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f364782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm3.i f364783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qm3.a aVar, kp4.a aVar2, qm3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f364781e = aVar;
        this.f364782f = aVar2;
        this.f364783g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qm3.h(this.f364781e, this.f364782f, this.f364783g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qm3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f364780d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f364780d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qm3.a aVar2 = this.f364781e;
        java.util.List F0 = kz5.n0.F0(kz5.n0.S0(aVar2.f364760b), new qm3.g());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kp4.a aVar3 = this.f364782f;
        sb6.append(aVar3);
        sb6.append(" request ");
        java.lang.String arrays = java.util.Arrays.toString(F0.toArray(new java.lang.Long[0]));
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", size:[");
        sb6.append(aVar3.f311071a);
        sb6.append(',');
        sb6.append(aVar3.f311072b);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.ThumbCachedLoader", sb6.toString());
        aVar2.f364761c.addAll(F0);
        aVar2.f364760b.clear();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        qm3.f fVar = new qm3.f(this.f364781e, this.f364783g, this.f364782f, F0, null);
        this.f364780d = 2;
        if (kotlinx.coroutines.l.g(p0Var, fVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
