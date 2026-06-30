package df2;

/* loaded from: classes10.dex */
public final class f9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230127d;

    /* renamed from: e, reason: collision with root package name */
    public int f230128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.k9 f230129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(df2.k9 k9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230129f = k9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.f9(this.f230129f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.f9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230128e;
        df2.k9 k9Var = this.f230129f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.view.MMPAGView mMPAGView = k9Var.f230565s;
            if (mMPAGView != null) {
                mMPAGView.setVisibility(0);
            }
            this.f230127d = k9Var;
            this.f230128e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            com.tencent.mm.view.MMPAGView mMPAGView2 = k9Var.f230565s;
            if (mMPAGView2 != null) {
                mMPAGView2.a(new df2.e9(k9Var, c0Var, rVar));
            }
            com.tencent.mars.xlog.Log.i(k9Var.f230559m, "start hot comment animation, playOnce!");
            com.tencent.mm.view.MMPAGView mMPAGView3 = k9Var.f230565s;
            if (mMPAGView3 != null) {
                mMPAGView3.g();
            }
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(k9Var.f230559m, "stop hot comment animation");
        com.tencent.mm.view.MMPAGView mMPAGView4 = k9Var.f230565s;
        if (mMPAGView4 != null) {
            mMPAGView4.n();
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = k9Var.f230565s;
        if (mMPAGView5 != null) {
            mMPAGView5.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
