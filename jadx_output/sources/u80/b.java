package u80;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f425392d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f425393e;

    /* renamed from: f, reason: collision with root package name */
    public final t80.e f425394f;

    public b(java.util.List list, t80.e eVar) {
        this.f425394f = eVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uf();
        lVar.f70665b = new r45.vf();
        lVar.f70666c = "/cgi-bin/mmpay-bin/ops/batch_get_liteapp_resource_description";
        lVar.f70667d = 4570;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f425393e = a17;
        r45.uf ufVar = (r45.uf) a17.f70710a.f70684a;
        ufVar.BaseRequest = o45.bh.a(a17.getReqObj());
        r45.tf tfVar = new r45.tf();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t80.g gVar = (t80.g) it.next();
            java.util.Iterator it6 = it;
            r45.jn3 jn3Var = new r45.jn3();
            jn3Var.f377966d = gVar.f416349a;
            jn3Var.f377967e = gVar.f416350b;
            jn3Var.f377968f = gVar.f416351c;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            jn3Var.f377969g = linkedList;
            r45.a55 a55Var = new r45.a55();
            a55Var.f369740d = "package_type";
            r45.ax6 ax6Var = new r45.ax6();
            ax6Var.f370342f = "wechat_android";
            a55Var.f369741e = ax6Var;
            linkedList.add(a55Var);
            java.util.LinkedList linkedList2 = jn3Var.f377969g;
            r45.a55 a55Var2 = new r45.a55();
            a55Var2.f369740d = "uin";
            r45.ax6 ax6Var2 = new r45.ax6();
            ax6Var2.f370344h = java.lang.Long.parseLong(gm0.j1.b().j());
            a55Var2.f369741e = ax6Var2;
            linkedList2.add(a55Var2);
            java.util.LinkedList linkedList3 = jn3Var.f377969g;
            r45.a55 a55Var3 = new r45.a55();
            a55Var3.f369740d = "client_version";
            r45.ax6 ax6Var3 = new r45.ax6();
            ax6Var3.f370344h = com.tencent.mm.sdk.platformtools.z.f193112h;
            a55Var3.f369741e = ax6Var3;
            linkedList3.add(a55Var3);
            java.util.LinkedList linkedList4 = jn3Var.f377969g;
            r45.a55 a55Var4 = new r45.a55();
            a55Var4.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_OS_VERSION;
            r45.ax6 ax6Var4 = new r45.ax6();
            ax6Var4.f370342f = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
            a55Var4.f369741e = ax6Var4;
            linkedList4.add(a55Var4);
            java.util.LinkedList linkedList5 = jn3Var.f377969g;
            r45.a55 a55Var5 = new r45.a55();
            a55Var5.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_MODEL;
            r45.ax6 ax6Var5 = new r45.ax6();
            ax6Var5.f370342f = java.lang.String.valueOf(o45.wf.f343025c);
            a55Var5.f369741e = ax6Var5;
            linkedList5.add(a55Var5);
            java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = java.util.Objects.equals(formatedNetType, "2G") ? 1 : java.util.Objects.equals(formatedNetType, "3G") ? 2 : java.util.Objects.equals(formatedNetType, "4G") ? 3 : java.util.Objects.equals(formatedNetType, "WIFI") ? 4 : 0;
            java.util.LinkedList linkedList6 = jn3Var.f377969g;
            r45.a55 a55Var6 = new r45.a55();
            a55Var6.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE;
            r45.ax6 ax6Var6 = new r45.ax6();
            ax6Var6.f370344h = i17;
            a55Var6.f369741e = ax6Var6;
            linkedList6.add(a55Var6);
            tfVar.f386365d.add(jn3Var);
            it = it6;
        }
        ufVar.f387313e = tfVar;
        r45.lf5 lf5Var = new r45.lf5();
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        lf5Var.f379427d = linkedList7;
        r45.a55 a55Var7 = new r45.a55();
        a55Var7.f369740d = "package_type";
        r45.ax6 ax6Var7 = new r45.ax6();
        ax6Var7.f370342f = "wechat_android";
        a55Var7.f369741e = ax6Var7;
        linkedList7.add(a55Var7);
        java.util.LinkedList linkedList8 = lf5Var.f379427d;
        r45.a55 a55Var8 = new r45.a55();
        a55Var8.f369740d = "uin";
        r45.ax6 ax6Var8 = new r45.ax6();
        ax6Var8.f370344h = java.lang.Long.parseLong(gm0.j1.b().j());
        a55Var8.f369741e = ax6Var8;
        linkedList8.add(a55Var8);
        java.util.LinkedList linkedList9 = lf5Var.f379427d;
        r45.a55 a55Var9 = new r45.a55();
        a55Var9.f369740d = "client_version";
        r45.ax6 ax6Var9 = new r45.ax6();
        ax6Var9.f370344h = com.tencent.mm.sdk.platformtools.z.f193112h;
        a55Var9.f369741e = ax6Var9;
        linkedList9.add(a55Var9);
        java.util.LinkedList linkedList10 = lf5Var.f379427d;
        r45.a55 a55Var10 = new r45.a55();
        a55Var10.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_OS_VERSION;
        r45.ax6 ax6Var10 = new r45.ax6();
        ax6Var10.f370342f = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        a55Var10.f369741e = ax6Var10;
        linkedList10.add(a55Var10);
        java.util.LinkedList linkedList11 = lf5Var.f379427d;
        r45.a55 a55Var11 = new r45.a55();
        a55Var11.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_MODEL;
        r45.ax6 ax6Var11 = new r45.ax6();
        ax6Var11.f370342f = java.lang.String.valueOf(o45.wf.f343025c);
        a55Var11.f369741e = ax6Var11;
        linkedList11.add(a55Var11);
        java.lang.String formatedNetType2 = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = java.util.Objects.equals(formatedNetType2, "2G") ? 1 : java.util.Objects.equals(formatedNetType2, "3G") ? 2 : java.util.Objects.equals(formatedNetType2, "4G") ? 3 : java.util.Objects.equals(formatedNetType2, "WIFI") ? 4 : 0;
        java.util.LinkedList linkedList12 = lf5Var.f379427d;
        r45.a55 a55Var12 = new r45.a55();
        a55Var12.f369740d = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE;
        r45.ax6 ax6Var12 = new r45.ax6();
        ax6Var12.f370344h = i18;
        a55Var12.f369741e = ax6Var12;
        linkedList12.add(a55Var12);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 1000);
        java.util.LinkedList linkedList13 = lf5Var.f379427d;
        r45.a55 a55Var13 = new r45.a55();
        a55Var13.f369740d = "time_zone";
        r45.ax6 ax6Var13 = new r45.ax6();
        ax6Var13.f370342f = valueOf.toString();
        a55Var13.f369741e = ax6Var13;
        linkedList13.add(a55Var13);
        java.util.LinkedList linkedList14 = lf5Var.f379427d;
        r45.a55 a55Var14 = new r45.a55();
        a55Var14.f369740d = "oversea";
        r45.ax6 ax6Var14 = new r45.ax6();
        ax6Var14.f370340d = c01.e2.a0() ? 1L : 0L;
        a55Var14.f369741e = ax6Var14;
        linkedList14.add(a55Var14);
        java.util.LinkedList linkedList15 = lf5Var.f379427d;
        r45.a55 a55Var15 = new r45.a55();
        a55Var15.f369740d = "gp";
        r45.ax6 ax6Var15 = new r45.ax6();
        ax6Var15.f370340d = com.tencent.mm.sdk.platformtools.a0.c() ? 1L : 0L;
        a55Var15.f369741e = ax6Var15;
        linkedList15.add(a55Var15);
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        int i19 = fj6.r().field_is_reg == 2 ? 2 : fj6.r().field_is_reg == 1 ? 1 : 0;
        java.util.LinkedList linkedList16 = lf5Var.f379427d;
        r45.a55 a55Var16 = new r45.a55();
        a55Var16.f369740d = "pay_reg_flag";
        r45.ax6 ax6Var16 = new r45.ax6();
        ax6Var16.f370340d = i19;
        a55Var16.f369741e = ax6Var16;
        linkedList16.add(a55Var16);
        java.util.LinkedList linkedList17 = lf5Var.f379427d;
        r45.a55 a55Var17 = new r45.a55();
        a55Var17.f369740d = "pay_card_flag";
        r45.ax6 ax6Var17 = new r45.ax6();
        ax6Var17.f370340d = fj6.r().field_isDomesticUser ? 2L : 1L;
        a55Var17.f369741e = ax6Var17;
        linkedList17.add(a55Var17);
        java.util.ArrayList y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ri().y0();
        int i27 = (y07 == null || y07.size() <= 0) ? 0 : 1;
        java.util.LinkedList linkedList18 = lf5Var.f379427d;
        r45.a55 a55Var18 = new r45.a55();
        a55Var18.f369740d = "pay_had_card_flag";
        r45.ax6 ax6Var18 = new r45.ax6();
        ax6Var18.f370340d = i27;
        a55Var18.f369741e = ax6Var18;
        linkedList18.add(a55Var18);
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        if (i95.n0.h(u60.g.class)) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            if (e17 == null || !e17.h()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.NetSceneGetPayLiteAppResource", "isGetWgs84LocationIn10Minutes false");
            } else {
                e17.f(new u80.a(this, dArr2, dArr));
            }
        }
        java.util.LinkedList linkedList19 = lf5Var.f379427d;
        r45.a55 a55Var19 = new r45.a55();
        a55Var19.f369740d = "cred_info_type";
        r45.ax6 ax6Var19 = new r45.ax6();
        ax6Var19.f370342f = java.lang.String.format(java.util.Locale.CHINA, "%d", java.lang.Integer.valueOf(fj6.r().field_cre_type));
        a55Var19.f369741e = ax6Var19;
        linkedList19.add(a55Var19);
        java.util.LinkedList linkedList20 = lf5Var.f379427d;
        r45.a55 a55Var20 = new r45.a55();
        a55Var20.f369740d = "cred_info_name";
        r45.ax6 ax6Var20 = new r45.ax6();
        ax6Var20.f370342f = fj6.r().field_cre_name;
        a55Var20.f369741e = ax6Var20;
        linkedList20.add(a55Var20);
        ufVar.f387314f = lf5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f425392d = u0Var;
        return dispatch(sVar, this.f425393e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4570;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.vf vfVar = (r45.vf) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        t80.e eVar = this.f425394f;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.NetSceneGetPayLiteAppResource", "pay BatchGetResourceDescriptionResp: %s", vfVar);
            r45.mg mgVar = vfVar.f388181d;
            r45.mg mgVar2 = vfVar.f388182e;
            if (eVar != null) {
                eVar.b(mgVar, mgVar2);
            }
        } else if (eVar != null) {
            eVar.a(i18, i19, str);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f425392d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
