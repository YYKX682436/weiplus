package rv0;

/* loaded from: classes5.dex */
public final class w5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f400315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(rv0.z6 z6Var, float f17, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400314e = z6Var;
        this.f400315f = f17;
        this.f400316g = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.w5(this.f400314e, this.f400315f, this.f400316g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.w5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f400313d;
        rv0.z6 z6Var = this.f400314e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.maas.model.time.MJTime r76 = z6Var.r7(new java.lang.Double(this.f400315f));
            this.f400313d = 1;
            if (rv0.z6.n7(z6Var, r76, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ex0.r n17 = this.f400316g.n();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (n17 != null) {
            com.tencent.maas.model.time.MJTime add = n17.k().add(z6Var.s7());
            com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) z6Var.t7().f276258y.getValue();
            if (mJTime == null) {
                mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            }
            if (mJTime.isValid()) {
                gx0.bh bhVar = (gx0.bh) ((jz5.n) z6Var.f400359o).getValue();
                kotlin.jvm.internal.o.d(add);
                bhVar.i7(add, mJTime);
            }
        }
        return f0Var;
    }
}
