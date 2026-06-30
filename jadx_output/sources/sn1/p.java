package sn1;

/* loaded from: classes9.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f410068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f410071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, java.util.function.Consumer consumer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410068e = linkedList;
        this.f410069f = str;
        this.f410070g = str2;
        this.f410071h = consumer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sn1.p(this.f410068e, this.f410069f, this.f410070g, this.f410071h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sn1.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410067d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sn1.z zVar = sn1.z.f410116a;
            this.f410067d = 1;
            bw5.n2 n2Var = new bw5.n2();
            java.util.LinkedList linkedList = this.f410068e;
            n2Var.f30457d = linkedList.size();
            boolean[] zArr = n2Var.f30466p;
            zArr[2] = true;
            n2Var.f30458e = linkedList;
            zArr[3] = true;
            n2Var.f30459f = wo.w0.m();
            zArr[4] = true;
            n2Var.f30460g = gm0.j1.b().k();
            zArr[5] = true;
            n2Var.f30461h = 2;
            zArr[6] = true;
            n2Var.f30462i = 0L;
            zArr[7] = true;
            n2Var.f30463m = this.f410069f;
            zArr[8] = true;
            n2Var.f30464n = this.f410070g;
            zArr[9] = true;
            byte[] bArr = kn1.f.f309602h;
            kotlin.jvm.internal.o.f(bArr, "getBackupAuthKey(...)");
            obj = zVar.c(n2Var, bArr, this);
            if (obj == aVar) {
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
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        sn1.o oVar = new sn1.o(this.f410071h, (sn1.j) obj, null);
        this.f410067d = 2;
        if (kotlinx.coroutines.l.g(g3Var, oVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
