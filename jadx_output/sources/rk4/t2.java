package rk4;

/* loaded from: classes.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(rk4.l3 l3Var, android.content.Context context, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396976e = l3Var;
        this.f396977f = context;
        this.f396978g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.t2(this.f396976e, this.f396977f, this.f396978g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396975d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396975d = 1;
                ((com.tencent.mm.plugin.ting.TingFlutterActivity) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rk4.s2 s2Var = new rk4.s2(this.f396978g);
        n13.r rVar = new n13.r();
        rVar.f334118b = this.f396976e.f396828s;
        rVar.f334119c = s2Var;
        rVar.f334126j = false;
        rVar.f334117a = false;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(this.f396977f, rVar);
        return f0Var;
    }
}
