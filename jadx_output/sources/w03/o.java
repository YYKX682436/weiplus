package w03;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f441893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f441894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f441895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w03.u f441896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f441897i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, boolean z18, boolean z19, w03.u uVar, boolean z27, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441893e = z17;
        this.f441894f = z18;
        this.f441895g = z19;
        this.f441896h = uVar;
        this.f441897i = z27;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new w03.o(this.f441893e, this.f441894f, this.f441895g, this.f441896h, this.f441897i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((w03.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441892d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kd2.o0 o0Var = kd2.p1.N;
            o0Var.a().f93132d.f93058s = false;
            kd2.p1 a17 = o0Var.a();
            boolean z17 = this.f441893e;
            boolean z18 = this.f441894f;
            boolean z19 = this.f441895g;
            this.f441892d = 1;
            obj = kd2.p1.y0(a17, z17, false, z18, null, z19, this, 10, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z27 = this.f441897i;
        w03.u uVar = this.f441896h;
        if (booleanValue) {
            uVar.f441913q = true;
            if (z27) {
                uVar.O6().a7(false);
            } else {
                ep1.m.a(uVar.getActivity(), false);
                pv.g0 g0Var = (pv.g0) ((jz5.n) uVar.f441903d).getValue();
                if (g0Var != null ? ((ep1.k) g0Var).e(null, uVar.getActivity().getWindow().getDecorView(), null, null, new w03.p(uVar)) : false) {
                    uVar.O6().Z6();
                    androidx.appcompat.app.AppCompatActivity activity = uVar.getActivity();
                    com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
                    if (mMActivity != null) {
                        mMActivity.setNavigationbarColor(uVar.getResources().getColor(com.tencent.mm.R.color.f478490b));
                    }
                }
            }
        } else {
            uVar.O6().a7(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "addFloatBall: ret=" + booleanValue + ", isPassive=" + this.f441893e + ", addFromSwipe=" + z27);
        return jz5.f0.f302826a;
    }
}
