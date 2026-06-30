package u80;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f425395d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f425396e;

    /* renamed from: f, reason: collision with root package name */
    public final t80.f f425397f;

    public c(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList, t80.f fVar) {
        this.f425397f = fVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kn3();
        lVar.f70665b = new r45.ln3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/ops/get_liteapp_resource_description";
        lVar.f70667d = 4873;
        int i17 = 2;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f425396e = a17;
        r45.kn3 kn3Var = (r45.kn3) a17.f70710a.f70684a;
        kn3Var.BaseRequest = o45.bh.a(a17.getReqObj());
        r45.jn3 jn3Var = new r45.jn3();
        jn3Var.f377966d = str;
        jn3Var.f377967e = str2;
        jn3Var.f377968f = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        jn3Var.f377969g = linkedList2;
        r45.a55 a55Var = new r45.a55();
        a55Var.f369740d = "package_type";
        r45.ax6 ax6Var = new r45.ax6();
        ax6Var.f370342f = "wechat_android";
        a55Var.f369741e = ax6Var;
        linkedList2.add(a55Var);
        java.util.LinkedList linkedList3 = jn3Var.f377969g;
        r45.a55 a55Var2 = new r45.a55();
        a55Var2.f369740d = "uin";
        r45.ax6 ax6Var2 = new r45.ax6();
        ax6Var2.f370344h = java.lang.Long.parseLong(gm0.j1.b().j());
        a55Var2.f369741e = ax6Var2;
        linkedList3.add(a55Var2);
        java.util.LinkedList linkedList4 = jn3Var.f377969g;
        r45.a55 a55Var3 = new r45.a55();
        a55Var3.f369740d = "client_version";
        r45.ax6 ax6Var3 = new r45.ax6();
        ax6Var3.f370344h = com.tencent.mm.sdk.platformtools.z.f193112h;
        a55Var3.f369741e = ax6Var3;
        linkedList4.add(a55Var3);
        java.util.LinkedList linkedList5 = jn3Var.f377969g;
        r45.a55 a55Var4 = new r45.a55();
        a55Var4.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_OS_VERSION;
        r45.ax6 ax6Var4 = new r45.ax6();
        ax6Var4.f370342f = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        a55Var4.f369741e = ax6Var4;
        linkedList5.add(a55Var4);
        java.util.LinkedList linkedList6 = jn3Var.f377969g;
        r45.a55 a55Var5 = new r45.a55();
        a55Var5.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_MODEL;
        r45.ax6 ax6Var5 = new r45.ax6();
        ax6Var5.f370342f = java.lang.String.valueOf(o45.wf.f343025c);
        a55Var5.f369741e = ax6Var5;
        linkedList6.add(a55Var5);
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (java.util.Objects.equals(formatedNetType, "2G")) {
            i17 = 1;
        } else if (!java.util.Objects.equals(formatedNetType, "3G")) {
            i17 = java.util.Objects.equals(formatedNetType, "4G") ? 3 : java.util.Objects.equals(formatedNetType, "WIFI") ? 4 : 0;
        }
        java.util.LinkedList linkedList7 = jn3Var.f377969g;
        r45.a55 a55Var6 = new r45.a55();
        a55Var6.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE;
        r45.ax6 ax6Var6 = new r45.ax6();
        ax6Var6.f370344h = i17;
        a55Var6.f369741e = ax6Var6;
        linkedList7.add(a55Var6);
        kn3Var.f378844e = jn3Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f425395d = u0Var;
        return dispatch(sVar, this.f425396e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4873;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ln3 ln3Var = (r45.ln3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        t80.f fVar = this.f425397f;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.NetSceneGetPayLiteAppResource", "pay GetResourceDescriptionResp: %s", ln3Var);
            r45.xr5 xr5Var = ln3Var.f379658d;
            if (fVar != null) {
                fVar.b(xr5Var);
            }
        } else if (fVar != null) {
            fVar.a(i18, i19, str);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f425395d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
