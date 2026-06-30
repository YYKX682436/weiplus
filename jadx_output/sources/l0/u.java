package l0;

/* loaded from: classes14.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.e f314532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.v f314533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f314534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.m f314535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z.e eVar, l0.v vVar, float f17, c0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314532e = eVar;
        this.f314533f = vVar;
        this.f314534g = f17;
        this.f314535h = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l0.u(this.f314532e, this.f314533f, this.f314534g, this.f314535h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f314531d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f314532e;
            float f17 = ((p2.h) ((n0.q4) eVar.f468634e).getValue()).f351380d;
            l0.v vVar = this.f314533f;
            c0.m mVar = null;
            if (p2.h.a(f17, vVar.f314550b)) {
                mVar = new c0.r(d1.e.f225623b, null);
            } else if (p2.h.a(f17, vVar.f314552d)) {
                mVar = new c0.i();
            } else if (p2.h.a(f17, vVar.f314553e)) {
                mVar = new c0.d();
            }
            this.f314531d = 1;
            if (l0.b0.a(eVar, this.f314534g, mVar, this.f314535h, this) == aVar) {
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
