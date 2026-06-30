package tt;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f421745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlinx.coroutines.flow.n2 n2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421745e = n2Var;
        this.f421746f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt.c(this.f421745e, this.f421746f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421744d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.n2 n2Var = this.f421745e;
            if (n2Var == null) {
                return jz5.f0.f302826a;
            }
            tt.b bVar = new tt.b(this.f421746f);
            this.f421744d = 1;
            if (n2Var.a(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
