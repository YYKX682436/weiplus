package zi2;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f473139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xg2.h hVar, kotlin.coroutines.Continuation continuation, zi2.w wVar, boolean z17, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f473137e = hVar;
        this.f473138f = wVar;
        this.f473139g = z17;
        this.f473140h = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.r(this.f473137e, continuation, this.f473138f, this.f473139g, this.f473140h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zi2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473136d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f473137e).f454381b;
            com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "updateMicSeatInfo fail: " + aVar2);
            rm0.j jVar = aVar2.f454379a;
            zi2.w wVar = this.f473138f;
            if (jVar == null || (string = jVar.f397426g) == null) {
                string = wVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f491780e75);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            if (this.f473139g) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                zi2.u uVar = new zi2.u(wVar, string, null);
                this.f473136d = 1;
                if (kotlinx.coroutines.l.g(g3Var, uVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f473140h.f310112d = false;
        return jz5.f0.f302826a;
    }
}
