package dk2;

/* loaded from: classes14.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233500d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f233501e;

    /* renamed from: f, reason: collision with root package name */
    public int f233502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.i5 f233503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(dk2.i5 i5Var, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233503g = i5Var;
        this.f233504h = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.g5(this.f233503g, this.f233504h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.g5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233502f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.i5 i5Var = this.f233503g;
            this.f233500d = i5Var;
            android.content.Intent intent = this.f233504h;
            this.f233501e = intent;
            this.f233502f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            dk2.e5 e5Var = new dk2.e5(nVar, i5Var, h0Var);
            h0Var.f310123d = e5Var;
            com.tencent.mm.ui.MMActivity mMActivity = i5Var.f233609a;
            com.tencent.mm.ui.MMActivity mMActivity2 = i5Var.f233609a;
            mMActivity.registerMMOnFragmentActivityResult(e5Var);
            rVar.m(new dk2.f5(i5Var, h0Var));
            try {
                mMActivity2.startActivityForResult(intent, 18193);
            } catch (java.lang.Exception e17) {
                mMActivity2.unregisterMMOnFragmentActivityResult((com.tencent.mm.ui.xc) h0Var.f310123d);
                com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveCTIDAuthHelper", e17, "[launchCtidAuth] startActivityForResult failed", new java.lang.Object[0]);
                nVar.a(new dk2.d5("C0412002", "国家网络身份认证App尚未安装", null, null));
            }
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
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
