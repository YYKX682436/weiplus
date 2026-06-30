package so2;

/* loaded from: classes3.dex */
public final class q5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f410553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(so2.w5 w5Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410553e = w5Var;
        this.f410554f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.q5(this.f410553e, this.f410554f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.q5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410552d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f410552d = 1;
            this.f410553e.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            java.lang.String str = this.f410554f;
            com.tencent.mars.xlog.Log.i("Finder.SetProfileCoverViewModel", "cover file length %d KB", new java.lang.Long(com.tencent.mm.vfs.w6.k(str) / 1024));
            rVar.m(new so2.u5(rVar));
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            mv2.f0 f0Var = mv2.f0.f331561a;
            kotlin.jvm.internal.o.d(str);
            mv2.f0.f331562b.b(new mv2.i0(str), new so2.v5(rVar));
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
