package zf0;

/* loaded from: classes11.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f472403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f472404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472408i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kotlinx.coroutines.flow.n2 n2Var, zf0.v0 v0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472404e = n2Var;
        this.f472405f = v0Var;
        this.f472406g = str;
        this.f472407h = str2;
        this.f472408i = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zf0.e0(this.f472404e, this.f472405f, this.f472406g, this.f472407h, this.f472408i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472403d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.n2 n2Var = this.f472404e;
            if (n2Var == null) {
                return jz5.f0.f302826a;
            }
            zf0.d0 d0Var = new zf0.d0(this.f472405f, this.f472406g, this.f472407h, this.f472408i);
            this.f472403d = 1;
            if (n2Var.a(d0Var, this) == aVar) {
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
