package on2;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(on2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f346924e = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new on2.h0(this.f346924e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        on2.v0 v0Var;
        java.lang.Object a17;
        boolean z18;
        r45.yl4 yl4Var;
        r45.zl4 zl4Var;
        r45.am4 am4Var;
        r45.zl4 zl4Var2;
        r45.am4 am4Var2;
        r45.zl4 zl4Var3;
        r45.am4 am4Var3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f346923d;
        on2.v0 v0Var2 = this.f346924e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.q4 q4Var = mm2.v4.f329475p;
            java.lang.String W6 = v0Var2.W6();
            long j17 = v0Var2.K;
            long j18 = v0Var2.f347028J;
            r45.gn3 gn3Var = new r45.gn3();
            gn3Var.set(0, 3);
            r45.h02 h02Var = new r45.h02();
            h02Var.f375703d = 1;
            h02Var.f375704e = v0Var2.I;
            h02Var.f375705f = "";
            h02Var.f375706g = "";
            gn3Var.set(1, new com.tencent.mm.protobuf.g(h02Var.toByteArray()));
            this.f346923d = 1;
            z17 = true;
            v0Var = v0Var2;
            a17 = q4Var.a("FinderLiveLotteryAudienceUIC", W6, null, j17, j18, gn3Var, r45.i02.class, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
            z17 = true;
            v0Var = v0Var2;
        }
        r45.i02 i02Var = (r45.i02) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page resume,coupon updateInfo:");
        sb6.append(pm0.b0.b(i02Var != 0 ? i02Var : ""));
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", sb6.toString());
        if ((i02Var != 0 ? i02Var.f376613e : null) != null) {
            v0Var.g7(i02Var.f376612d == 2 ? z17 ? 1 : 0 : false);
            r45.ht1 ht1Var = v0Var.R;
            r45.yl4 yl4Var2 = (ht1Var == null || (zl4Var3 = (r45.zl4) ht1Var.getCustom(11)) == null || (am4Var3 = (r45.am4) zl4Var3.getCustom(z17 ? 1 : 0)) == null) ? null : (r45.yl4) am4Var3.getCustom(0);
            if (yl4Var2 != null) {
                yl4Var2.set(z17 ? 1 : 0, java.lang.Integer.valueOf(i02Var.f376612d));
            }
            r45.ht1 ht1Var2 = v0Var.R;
            r45.yl4 yl4Var3 = (ht1Var2 == null || (zl4Var2 = (r45.zl4) ht1Var2.getCustom(11)) == null || (am4Var2 = (r45.am4) zl4Var2.getCustom(z17 ? 1 : 0)) == null) ? null : (r45.yl4) am4Var2.getCustom(0);
            if (yl4Var3 != null) {
                r45.zd4 zd4Var = i02Var.f376613e;
                yl4Var3.set(3, zd4Var != null ? zd4Var.f391935g : null);
            }
            r45.ht1 ht1Var3 = v0Var.R;
            if (ht1Var3 == null || (zl4Var = (r45.zl4) ht1Var3.getCustom(11)) == null || (am4Var = (r45.am4) zl4Var.getCustom(z17 ? 1 : 0)) == null) {
                z18 = false;
                yl4Var = null;
            } else {
                z18 = false;
                yl4Var = (r45.yl4) am4Var.getCustom(0);
            }
            if (yl4Var != null) {
                r45.zd4 zd4Var2 = i02Var.f376613e;
                yl4Var.set(2, zd4Var2 != null ? zd4Var2.f391934f : null);
            }
            r45.zd4 zd4Var3 = i02Var.f376613e;
            java.lang.String str = zd4Var3 != null ? zd4Var3.f391934f : null;
            if (str != null && str.length() != 0) {
                z17 = z18;
            }
            if (z17) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("page resume,button_text:");
                r45.zd4 zd4Var4 = i02Var.f376613e;
                sb7.append(zd4Var4 != null ? zd4Var4.f391934f : null);
                sb7.append('!');
                com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", sb7.toString());
            } else {
                android.widget.TextView S6 = v0Var.S6();
                r45.zd4 zd4Var5 = i02Var.f376613e;
                S6.setText(zd4Var5 != null ? zd4Var5.f391934f : null);
            }
        }
        return jz5.f0.f302826a;
    }
}
