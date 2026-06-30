package vh0;

/* loaded from: classes3.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f436927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f436928h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.content.Context context, java.lang.String str, com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436925e = context;
        this.f436926f = str;
        this.f436927g = f9Var;
        this.f436928h = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.o2(this.f436925e, this.f436926f, this.f436927g, this.f436928h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.o2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436924d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f436924d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            k70.x Di = ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di();
            zh0.b bVar = new zh0.b(rVar);
            rVar.m(new zh0.a(Di, bVar));
            m11.b0 b0Var = this.f436928h;
            ((m11.j) Di).c(b0Var.f322633a, tg3.l1.a(this.f436927g), b0Var.f322640h, null, 0, bVar);
            obj = rVar.j();
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
