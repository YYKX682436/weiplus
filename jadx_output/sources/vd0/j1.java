package vd0;

/* loaded from: classes11.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f435441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f435442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(vd0.v1 v1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435441e = v1Var;
        this.f435442f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.j1(this.f435441e, this.f435442f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f435440d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f435442f;
            this.f435440d = 1;
            this.f435441e.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            cu5.b.e(new vd0.n1(new com.tencent.mm.feature.setting.api.AuthKeyParam(0, null, null, 7, null), new vd0.o1(rVar)), z17, true, 920, null, null);
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
