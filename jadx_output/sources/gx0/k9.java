package gx0;

/* loaded from: classes5.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f276621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276622f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(kotlin.jvm.internal.c0 c0Var, gx0.p9 p9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276621e = c0Var;
        this.f276622f = p9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.k9(this.f276621e, this.f276622f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.k9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276620d;
        gx0.p9 p9Var = this.f276622f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f276621e.f310112d) {
                gx0.bf t76 = p9Var.t7();
                this.f276620d = 1;
                if (gx0.bf.d7(t76, null, null, false, this, 7, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.bf t77 = p9Var.t7();
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.f276620d = 2;
        if (gx0.bf.r7(t77, false, ZeroTime, 0, false, null, this, 29, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
