package pk2;

/* loaded from: classes3.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f356035d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f356036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.q5 f356037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356038g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(pk2.q5 q5Var, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356037f = q5Var;
        this.f356038g = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.n5 n5Var = new pk2.n5(this.f356037f, this.f356038g, continuation);
        n5Var.f356036e = ((java.lang.Boolean) obj).booleanValue();
        return n5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.n5) create(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f356035d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f356036e;
        pk2.q5 q5Var = this.f356037f;
        qk2.f.f(q5Var, false, 1, null);
        this.f356035d = 1;
        q5Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        pk2.o9 o9Var = this.f356038g;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "switchDesignedGift isEnable:" + z17);
        long j18 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q;
        if (z17) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            j17 = 4294967296L | j18;
        } else {
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            j17 = (-4294967297L) & j18;
        }
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        pk2.p5 p5Var = new pk2.p5(o9Var, nVar, j18);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("DesignedGift", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q);
        dk2.xf f17 = o9Var.f();
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e(o9Var.f356072a, "switchDesignedGift finderLiveAssistant is null, abort");
            ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j18);
            nVar.a(java.lang.Boolean.FALSE);
        } else {
            dk2.xf.h(f17, ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) o9Var.c(mm2.e1.class)).f328983m, j17, 4294967296L, 0, p5Var, 16, null);
        }
        java.lang.Object j19 = rVar.j();
        return j19 == aVar ? aVar : j19;
    }
}
