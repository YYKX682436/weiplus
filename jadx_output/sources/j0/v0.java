package j0;

/* loaded from: classes14.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.f f296589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0.d5 f296592h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.v f296593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(g0.f fVar, g2.e0 e0Var, j0.c5 c5Var, j0.d5 d5Var, g2.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296589e = fVar;
        this.f296590f = e0Var;
        this.f296591g = c5Var;
        this.f296592h = d5Var;
        this.f296593i = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j0.v0(this.f296589e, this.f296590f, this.f296591g, this.f296592h, this.f296593i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        d1.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296588d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j0.k3 k3Var = this.f296591g.f296233a;
            a2.k1 k1Var = this.f296592h.f296265a;
            this.f296588d = 1;
            int e17 = a2.m1.e(this.f296590f.f267694b);
            ((g2.t) this.f296593i).getClass();
            if (e17 < k1Var.f765a.f754a.length()) {
                gVar = k1Var.b(e17);
            } else if (e17 != 0) {
                gVar = k1Var.b(e17 - 1);
            } else {
                gVar = new d1.g(0.0f, 0.0f, 1.0f, p2.q.b(j0.u3.a(k3Var.f296404b, k3Var.f296408f, k3Var.f296409g, j0.u3.f296581a, 1)));
            }
            java.lang.Object a17 = ((g0.h) this.f296589e).a(gVar, this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
