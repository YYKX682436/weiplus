package l41;

/* loaded from: classes15.dex */
public final class m0 implements j41.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315866a;

    public m0(l41.j1 j1Var) {
        this.f315866a = j1Var;
    }

    @Override // j41.x
    public void a(int i17, android.os.Bundle bundle) {
        l41.j1 j1Var = this.f315866a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "createOpenImKfConversation success cancelled: %s", java.lang.Boolean.valueOf(j1Var.f315852k));
        j1Var.o();
        l41.k0 k0Var = l41.j1.f315841t;
        java.lang.Long valueOf = bundle != null ? java.lang.Long.valueOf(bundle.getInt("key_op_contact_result_time_cost")) : null;
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        int i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, pInt, pInt2) ? pInt2.value : 0;
        int k17 = j1Var.k();
        j41.u uVar = j1Var.f315845d;
        java.lang.String a17 = l41.k0.a(k0Var, valueOf, java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(uVar != null ? ((k41.g0) uVar).field_kefuType : 0), java.lang.Integer.valueOf(i18), null, null, null, null, null, null, 1008, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "EcsOpenImKfLoadResult report value=2 (addKefuConversation success), extra=%s", a17);
        y02.v0 a18 = y02.x0.f458634d.a();
        if (a18 != null) {
            a18.p1(bw5.d5.EcsOpenImKfLoadResult, 2, a17);
        }
    }

    @Override // j41.x
    public void b(int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConfirmController", "createOpenImKfConversation failed errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str);
        this.f315866a.n();
    }
}
