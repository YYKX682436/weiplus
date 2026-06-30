package en5;

/* loaded from: classes14.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f255519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f255521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(g2.g0 g0Var, fn5.n0 n0Var, c1.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255519e = g0Var;
        this.f255520f = n0Var;
        this.f255521g = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new en5.v0(this.f255519e, this.f255520f, this.f255521g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((en5.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255518d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f255518d = 1;
            if (kotlinx.coroutines.k1.b(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        g2.g0 g0Var = this.f255519e;
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageQuerySearchBar", "input service is null");
        }
        this.f255520f.D = false;
        if (g0Var != null && g0Var.f267702b.get() != null) {
            ((u26.o) ((g2.p0) g0Var.f267701a).f267741j).e(g2.h0.ShowKeyboard);
        }
        this.f255521g.a();
        return jz5.f0.f302826a;
    }
}
