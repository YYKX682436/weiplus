package f12;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f258601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f258602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j17, f12.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258601e = j17;
        this.f258602f = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.e0(this.f258601e, this.f258602f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.j0 j0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258600d;
        f12.j0 j0Var2 = this.f258602f;
        try {
            try {
            } catch (b12.a e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SpringLuckyEggViewModel", "unable to accept money: " + e17.getMessage());
                j0Var2.f258622i.setValue(java.lang.Boolean.FALSE);
                j0Var = j0Var2.f258629s;
            }
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j17 = this.f258601e;
                java.lang.String str = j0Var2.f258620g;
                if (str == null) {
                    str = "";
                }
                c12.e eVar = new c12.e("", 1, j17, str);
                this.f258600d = 1;
                if (b12.d.a(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    j0Var2.f258622i.setValue(java.lang.Boolean.FALSE);
                    j0Var = j0Var2.f258629s;
                    j0Var.setValue(java.lang.Boolean.TRUE);
                    return jz5.f0.f302826a;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            long j18 = j0Var2.f258630t;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
            if (currentTimeMillis < 2000) {
                this.f258600d = 2;
                if (kotlinx.coroutines.k1.b(2000 - currentTimeMillis, this) == aVar) {
                    return aVar;
                }
            }
            j0Var2.f258622i.setValue(java.lang.Boolean.FALSE);
            j0Var = j0Var2.f258629s;
            j0Var.setValue(java.lang.Boolean.TRUE);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            j0Var2.f258622i.setValue(java.lang.Boolean.FALSE);
            j0Var2.f258629s.setValue(java.lang.Boolean.TRUE);
            throw th6;
        }
    }
}
