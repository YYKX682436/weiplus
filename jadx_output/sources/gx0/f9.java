package gx0;

/* loaded from: classes5.dex */
public final class f9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f276418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(gx0.p9 p9Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276417e = p9Var;
        this.f276418f = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.f9(this.f276417e, this.f276418f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.f9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276416d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.p9 p9Var = this.f276417e;
            ex0.a0 a0Var = p9Var.u7().f276642r;
            if (a0Var == null) {
                return f0Var;
            }
            for (ex0.r rVar : a0Var.f257097g.f257177e) {
                ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
                if (cVar != null) {
                    cVar.E(this.f276418f);
                }
            }
            p9Var.t7().c7();
            gx0.bf t76 = p9Var.t7();
            com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            this.f276416d = 1;
            if (gx0.bf.r7(t76, false, ZeroTime, 0, false, null, this, 29, null) == aVar) {
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
