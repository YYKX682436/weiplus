package df2;

/* loaded from: classes3.dex */
public final class s9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231321e;

    /* renamed from: f, reason: collision with root package name */
    public int f231322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.t9 f231323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f231324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wh2.b f231325i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(df2.t9 t9Var, int i17, wh2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231323g = t9Var;
        this.f231324h = i17;
        this.f231325i = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.s9(this.f231323g, this.f231324h, this.f231325i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.s9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231322f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.t9 t9Var = this.f231323g;
            this.f231320d = t9Var;
            wh2.b bVar = this.f231325i;
            this.f231321e = bVar;
            this.f231322f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            java.lang.String str = t9Var.f231426m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay, count:");
            int i18 = this.f231324h;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null) {
                java.lang.String i19 = com.tencent.mm.vfs.w6.i(bVar.f445945a, false);
                df2.r9 r9Var = new df2.r9(c0Var, t9Var, i18, rVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "setInteractiveGiftEffect " + i19);
                w0Var.f420771r.l(new tn0.s(w0Var, i19, r9Var));
            }
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
