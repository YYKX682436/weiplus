package on2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(on2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f346913e = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new on2.g0(this.f346913e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        on2.v0 v0Var;
        java.lang.Object a17;
        r45.im4 im4Var;
        r45.en5 en5Var;
        java.lang.String str;
        r45.im4 im4Var2;
        r45.en5 en5Var2;
        r45.im4 im4Var3;
        r45.im4 im4Var4;
        r45.en5 en5Var3;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f346912d;
        on2.v0 v0Var2 = this.f346913e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.q4 q4Var = mm2.v4.f329475p;
            java.lang.String W6 = v0Var2.W6();
            long j17 = v0Var2.K;
            long j18 = v0Var2.f347028J;
            r45.gn3 gn3Var = new r45.gn3();
            gn3Var.set(0, 1);
            r45.ht1 ht1Var = v0Var2.R;
            gn3Var.set(1, (ht1Var == null || (im4Var = (r45.im4) ht1Var.getCustom(12)) == null || (en5Var = (r45.en5) im4Var.getCustom(1)) == null) ? null : en5Var.getByteString(2));
            this.f346912d = 1;
            i17 = 1;
            v0Var = v0Var2;
            a17 = q4Var.a("FinderLiveLotteryAudienceUIC", W6, null, j17, j18, gn3Var, r45.i52.class, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
            i17 = 1;
            v0Var = v0Var2;
        }
        r45.i52 i52Var = (r45.i52) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page resume,red packet is_received from:");
        r45.ht1 ht1Var2 = v0Var.R;
        sb6.append((ht1Var2 == null || (im4Var4 = (r45.im4) ht1Var2.getCustom(12)) == null || (en5Var3 = (r45.en5) im4Var4.getCustom(i17)) == null) ? null : java.lang.Boolean.valueOf(en5Var3.getBoolean(0)));
        sb6.append(" to ");
        sb6.append(i52Var != null ? java.lang.Boolean.valueOf(i52Var.getBoolean(0)) : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", sb6.toString());
        if (i52Var != null) {
            r45.ht1 ht1Var3 = v0Var.R;
            r45.en5 en5Var4 = (ht1Var3 == null || (im4Var3 = (r45.im4) ht1Var3.getCustom(12)) == null) ? null : (r45.en5) im4Var3.getCustom(i17);
            if (en5Var4 != null) {
                en5Var4.set(0, java.lang.Boolean.valueOf(i52Var.getBoolean(0)));
            }
            r45.ht1 ht1Var4 = v0Var.R;
            if (ht1Var4 == null || (im4Var2 = (r45.im4) ht1Var4.getCustom(12)) == null || (en5Var2 = (r45.en5) im4Var2.getCustom(i17)) == null || (str = en5Var2.getString(4)) == null) {
                str = "";
            }
            v0Var.f7(str, i52Var.getBoolean(0));
        }
        return jz5.f0.f302826a;
    }
}
