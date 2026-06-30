package oq3;

/* loaded from: classes4.dex */
public final class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f347379d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f347380e;

    public d(java.util.List biz_reqs) {
        boolean isWifi;
        kotlin.jvm.internal.o.g(biz_reqs, "biz_reqs");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jc5();
        lVar.f70665b = new r45.kc5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/predownload_check";
        lVar.f70667d = 10910;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f347380e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrevDownloadCheckRequest");
        r45.jc5 jc5Var = (r45.jc5) fVar;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (isWifi) {
            jc5Var.f377701e = 1L;
        }
        java.util.Iterator it = biz_reqs.iterator();
        while (it.hasNext()) {
            jc5Var.f377700d.add((r45.bm) it.next());
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f347379d = callback;
        return dispatch(dispatcher, this.f347380e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 10910;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePredownloadCheck", "onGYNetEnd errType: %s, errCode: %s, errMsg: %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f347379d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
