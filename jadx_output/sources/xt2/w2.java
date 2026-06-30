package xt2;

/* loaded from: classes3.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f457085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(xt2.e3 e3Var, cm2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457084e = e3Var;
        this.f457085f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.w2(this.f457084e, this.f457085f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.w2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f457083d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f457084e.Q;
            this.f457083d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(0, 6);
            cm2.k0 k0Var2 = this.f457085f;
            f52Var.set(2, new com.tencent.mm.protobuf.g(k0Var2.f43360v.toByteArray()));
            f52Var.set(4, java.lang.Long.valueOf(k0Var2.f43385d));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        return jz5.f0.f302826a;
    }
}
