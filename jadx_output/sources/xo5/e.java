package xo5;

/* loaded from: classes7.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455779d;

    /* renamed from: e, reason: collision with root package name */
    public int f455780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xo5.n f455781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xo5.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455781f = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xo5.e(this.f455781f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xo5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r2 d17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f455780e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xo5.n nVar = this.f455781f;
            kotlinx.coroutines.r2 d18 = kotlinx.coroutines.l.d((kotlinx.coroutines.y0) nVar.f455797h.getValue(), null, null, new xo5.c(nVar, null), 3, null);
            d17 = kotlinx.coroutines.l.d((kotlinx.coroutines.y0) nVar.f455799m.getValue(), null, null, new xo5.d(nVar, null), 3, null);
            this.f455779d = d17;
            this.f455780e = 1;
            if (((kotlinx.coroutines.c3) d18).C(this) == aVar) {
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
            d17 = (kotlinx.coroutines.r2) this.f455779d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f455779d = null;
        this.f455780e = 2;
        if (d17.C(this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
