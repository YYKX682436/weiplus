package is;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.f f294307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.t f294308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ js.p0 f294310g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(is.f fVar, com.tencent.mm.ui.mmfb.sdk.t tVar, java.lang.String str, js.p0 p0Var) {
        super(1);
        this.f294307d = fVar;
        this.f294308e = tVar;
        this.f294309f = str;
        this.f294310g = p0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData) obj;
        js.p0 p0Var = this.f294310g;
        if (getMobileRespData != null) {
            java.lang.String str = this.f294309f;
            com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData getMobileReqData = getMobileRespData.f73185d;
            getMobileReqData.f73183d.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("second check masked mobile: ");
            r45.fn4 fn4Var = getMobileRespData.f73186e;
            sb6.append(fn4Var != null ? fn4Var.f374463e : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", sb6.toString());
            if (r26.i0.q(this.f294308e.f209231a, fn4Var != null ? fn4Var.f374463e : null, false, 2, null)) {
                gm0.j1.d().a(145, this.f294307d);
                r45.b66 b66Var = new r45.b66();
                com.tencent.mm.plugin.account.gatewayreg.GateWayRespData gateWayRespData = getMobileReqData.f73183d;
                b66Var.f370576d = gateWayRespData.f73175d;
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                byte[] bytes = getMobileReqData.f73184e.getBytes(UTF_8);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                b66Var.f370577e = android.util.Base64.encodeToString(bytes, 2);
                r45.c66 c66Var = new r45.c66();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(b66Var);
                c66Var.f371338e = linkedList;
                c66Var.f371337d = linkedList.size();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.c(gateWayRespData.f73182n);
                gm0.j1.d().g(new h11.e(str, 33, "", 0, "", 0, cu5Var, c66Var));
            } else {
                ((com.tencent.mm.plugin.account.ui.v6) p0Var).a(null, null);
            }
        } else {
            ((com.tencent.mm.plugin.account.ui.v6) p0Var).a(null, null);
        }
        return jz5.f0.f302826a;
    }
}
