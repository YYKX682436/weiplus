package nz0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341528e = str;
        this.f341529f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nz0.n(this.f341528e, this.f341529f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nz0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f341527d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nz0.d dVar = nz0.d.f341496a;
            this.f341527d = 1;
            obj = dVar.c(this.f341528e, this.f341529f, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.io3 io3Var = (r45.io3) obj;
        if (io3Var != null) {
            return io3Var.f377213d;
        }
        return null;
    }
}
