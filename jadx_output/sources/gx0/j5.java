package gx0;

/* loaded from: classes5.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f276570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(boolean z17, gx0.w8 w8Var, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276570e = z17;
        this.f276571f = w8Var;
        this.f276572g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.j5(this.f276570e, this.f276571f, this.f276572g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.j5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276569d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f276570e;
            gx0.w8 w8Var = this.f276571f;
            if (z17) {
                gx0.bf V6 = w8Var.V6();
                com.tencent.maas.model.time.MJTime mJTime = this.f276572g;
                this.f276569d = 1;
                if (gx0.bf.r7(V6, false, mJTime, 0, false, null, this, 29, null) == aVar) {
                    return aVar;
                }
            } else {
                gx0.bf V62 = w8Var.V6();
                this.f276569d = 2;
                if (gx0.bf.t7(V62, false, this, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
