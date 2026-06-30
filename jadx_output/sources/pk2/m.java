package pk2;

/* loaded from: classes3.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355971d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355972e;

    /* renamed from: f, reason: collision with root package name */
    public int f355973f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f355974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355975h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.o f355976i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pk2.o9 o9Var, pk2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355975h = o9Var;
        this.f355976i = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.m mVar = new pk2.m(this.f355975h, this.f355976i, continuation);
        mVar.f355974g = ((java.lang.Boolean) obj).booleanValue();
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.m) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355973f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f355974g;
            pk2.o9 o9Var = this.f355975h;
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "check: " + z17);
            this.f355971d = o9Var;
            pk2.o oVar = this.f355976i;
            this.f355972e = oVar;
            this.f355974g = z17;
            this.f355973f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, z17, oVar.n(), new pk2.l(o9Var, z17, new v65.n(rVar)));
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
