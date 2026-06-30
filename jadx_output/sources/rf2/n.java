package rf2;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394824f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r45.f02 f02Var, rf2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394823e = f02Var;
        this.f394824f = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.n(this.f394823e, this.f394824f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394822d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.f02 f02Var = this.f394823e;
            r45.fm4 fm4Var = f02Var.f373880f;
            java.lang.Object[] objArr = fm4Var != null && fm4Var.f374448g == 1;
            rf2.q qVar = this.f394824f;
            if (objArr == true) {
                mm2.v4 v4Var = (mm2.v4) qVar.f394854e.business(mm2.v4.class);
                java.lang.String str = f02Var.f373878d;
                if (str == null) {
                    str = "";
                }
                java.lang.Object O6 = v4Var.O6(str);
                r45.i02 i02Var = O6 instanceof r45.i02 ? (r45.i02) O6 : null;
                java.lang.String str2 = qVar.f394855f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageResume cacheCouponInfo:");
                sb6.append(pm0.b0.g(i02Var != null ? i02Var : ""));
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                this.f394822d = 1;
                if (rf2.q.a(qVar, f02Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if ((fm4Var != null && fm4Var.f374448g == 0) != false) {
                    mm2.v4 v4Var2 = (mm2.v4) qVar.f394854e.business(mm2.v4.class);
                    java.lang.String str3 = f02Var.f373878d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.Object O62 = v4Var2.O6(str3);
                    r45.i52 i52Var = O62 instanceof r45.i52 ? (r45.i52) O62 : null;
                    java.lang.String str4 = qVar.f394855f;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onPageResume cacheRedPacketInfo:");
                    sb7.append(pm0.b0.g(i52Var != null ? i52Var : ""));
                    com.tencent.mars.xlog.Log.i(str4, sb7.toString());
                    if (!(i52Var != null && i52Var.getBoolean(0))) {
                        this.f394822d = 2;
                        if (rf2.q.c(qVar, f02Var, this) == aVar) {
                            return aVar;
                        }
                    }
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
