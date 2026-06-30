package sp2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f410991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410991e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.c(this.f410991e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410990d;
        long j17 = this.f410991e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRedDotEnterLive: clear preload live play core, liveId=");
            sb6.append(pm0.v.u(j17));
            sb6.append(", playerPreloadJob=");
            int i18 = uc.n.f426265k1;
            sb6.append(uc.m.f426264a);
            com.tencent.mars.xlog.Log.i("FinderLiveSquareNewEntranceUI", sb6.toString());
            kotlinx.coroutines.r2 r2Var = uc.m.f426264a;
            if (r2Var != null) {
                this.f410990d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        co0.b.f43709e2.d(j17, true);
        return jz5.f0.f302826a;
    }
}
