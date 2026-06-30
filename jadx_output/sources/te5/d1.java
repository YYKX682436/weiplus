package te5;

/* loaded from: classes9.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f418626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418626e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te5.d1(this.f418626e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418625d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c50.p0 p0Var = (c50.p0) i95.n0.c(c50.p0.class);
            this.f418625d = 1;
            obj = ((c61.p2) p0Var).Di(this.f418626e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        return z17 ? te5.z0.f418778a : new te5.a1(str);
    }
}
