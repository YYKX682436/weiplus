package f92;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f260244d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f92.i f260247g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, f92.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260246f = str;
        this.f260247g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        f92.g gVar = new f92.g(this.f260246f, this.f260247g, continuation);
        gVar.f260245e = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f92.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c47;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f260244d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f260245e;
            g92.b bVar = g92.b.f269769e;
            java.lang.String str = this.f260246f;
            this.f260245e = y0Var;
            this.f260244d = 1;
            c47 = bVar.c4(str, this);
            if (c47 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c47 = ((kotlin.Result) obj).getValue();
        }
        java.lang.String str2 = this.f260246f;
        f92.i iVar = this.f260247g;
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(c47);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("Finder.AccountLogicHandler", "[doFinderInit.onFailure] " + m524exceptionOrNullimpl.getMessage() + " source=" + str2);
            if (m524exceptionOrNullimpl instanceof rm0.j) {
                com.tencent.mm.protobuf.f fVar = ((rm0.j) m524exceptionOrNullimpl).f397427h;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderInitResponse");
                java.lang.Integer num = new java.lang.Integer(((r45.xb1) fVar).getInteger(16));
                wu5.c cVar = null;
                if (!(num.intValue() > 0)) {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                    t0Var.getClass();
                    cVar = t0Var.t(new f92.f(iVar, intValue), intValue * 1000, null);
                }
                if (cVar == null) {
                    com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "delay to next app foreground. ");
                    iVar.f260250d = 0L;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
