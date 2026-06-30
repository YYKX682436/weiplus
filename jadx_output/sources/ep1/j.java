package ep1;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp1.b f255643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pv.y f255644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f255645i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f255646m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f255647n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qn5.a f255648o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ep1.k kVar, android.view.View view, fp1.b bVar, pv.y yVar, android.graphics.Point point, android.graphics.Point point2, int i17, qn5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255641e = kVar;
        this.f255642f = view;
        this.f255643g = bVar;
        this.f255644h = yVar;
        this.f255645i = point;
        this.f255646m = point2;
        this.f255647n = i17;
        this.f255648o = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ep1.j(this.f255641e, this.f255642f, this.f255643g, this.f255644h, this.f255645i, this.f255646m, this.f255647n, this.f255648o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ep1.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255640d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ep1.k kVar = this.f255641e;
            android.view.View view = this.f255642f;
            fp1.b bVar = this.f255643g;
            this.f255640d = 1;
            ep1.k.a(kVar, view, bVar, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new ep1.i(this.f255644h, this.f255645i, this.f255646m, this.f255643g, this.f255641e, this.f255647n, this.f255642f, this.f255648o));
        return f0Var;
    }
}
