package s72;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404024d;

    /* renamed from: e, reason: collision with root package name */
    public int f404025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kq0 f404026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.kq0 kq0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404026f = kq0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.f(this.f404026f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404025e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.kq0 kq0Var = this.f404026f;
            this.f404024d = kq0Var;
            this.f404025e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = kq0Var;
            lVar.f70665b = new r45.lq0();
            lVar.f70666c = "/cgi-bin/micromsg-bin/favsync";
            lVar.f70667d = 400;
            lVar.f70668e = 195;
            lVar.f70669f = 1000000195;
            lVar.f70670g = false;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavSyncRequest");
            r45.kq0 kq0Var2 = (r45.kq0) fVar;
            kq0Var2.f378899d = kq0Var.f378899d;
            kq0Var2.f378900e = kq0Var.f378900e;
            gm0.j1.d().g(new s72.d(a17, new s72.g(new s72.e(rVar, "/cgi-bin/micromsg-bin/favsync"))));
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
