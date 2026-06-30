package l41;

/* loaded from: classes15.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315934d;

    public u0(l41.j1 j1Var) {
        this.f315934d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j41.i0 i0Var = new j41.i0();
        l41.j1 j1Var = this.f315934d;
        i0Var.f297643d = j1Var.f315845d;
        i0Var.f297644e = j1Var.f315846e;
        i0Var.f297640a = 0;
        i0Var.f297641b = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchConfirmInfo onFinish isValid: ");
        j41.u uVar = j1Var.f315845d;
        sb6.append(uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f303996p1) : null);
        sb6.append(", cancelled: ");
        sb6.append(j1Var.f315852k);
        sb6.append(", confirmType: ");
        sb6.append(i0Var.f297644e);
        sb6.append(", confirmPageType: ");
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = j1Var.f315844c;
        sb6.append(openIMKefuStartConversationRequest != null ? java.lang.Integer.valueOf(openIMKefuStartConversationRequest.f72276h) : null);
        sb6.append(", ");
        j41.u uVar2 = j1Var.f315845d;
        sb6.append(uVar2 != null ? ((k41.g0) uVar2).t0() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", sb6.toString());
        j41.u uVar3 = j1Var.f315845d;
        if (!(uVar3 != null && ((k41.g0) uVar3).f303996p1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConfirmController", "degraded getContact failed");
            j1Var.f315854m.a(3, -1, "degraded get contact failed");
            return;
        }
        l41.k0 k0Var = l41.j1.f315841t;
        java.lang.Long valueOf = java.lang.Long.valueOf(0);
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        int i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, pInt, pInt2) ? pInt2.value : 0;
        int k17 = j1Var.k();
        j41.u uVar4 = j1Var.f315845d;
        java.lang.String a17 = l41.k0.a(k0Var, valueOf, java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(uVar4 != null ? ((k41.g0) uVar4).field_kefuType : 0), java.lang.Integer.valueOf(i17), null, null, null, null, null, null, 1008, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "EcsOpenImKfLoadResult report value=1 (degraded getContact success), extra=%s", a17);
        y02.v0 a18 = y02.x0.f458634d.a();
        if (a18 != null) {
            a18.p1(bw5.d5.EcsOpenImKfLoadResult, 1, a17);
        }
        l41.r0 r0Var = j1Var.f315854m;
        r0Var.getClass();
        l41.j1 j1Var2 = r0Var.f315912a;
        l41.e2.c(j1Var2.l(), j1Var2.m(), true, 0, "");
        if (j1Var2.f315843b == null || !j41.g0.a(j1Var2.f315846e)) {
            int j17 = j1Var2.j();
            int i18 = j1Var2.f315846e;
            android.app.Activity context = j1Var2.f315842a;
            kotlin.jvm.internal.o.g(context, "context");
            v41.s bVar = !j41.g0.a(i18) ? new v41.b(context) : j17 == 1 ? new v41.m(context) : j17 == 2 ? new v41.q(context) : new v41.q(context);
            j1Var2.f315843b = bVar;
            bVar.d(j1Var2);
        }
        if (j41.g0.a(j1Var2.f315846e)) {
            j1Var2.e();
            android.os.ResultReceiver l17 = j1Var2.l();
            j1Var2.m();
            if (l17 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("result_key_action", 5);
                l17.send(0, bundle);
            }
        }
        v41.s sVar = j1Var2.f315843b;
        if (sVar != null) {
            sVar.c(j1Var2.f315846e, j1Var2.j(), i0Var);
        }
    }
}
