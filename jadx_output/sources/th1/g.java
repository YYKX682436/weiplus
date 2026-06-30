package th1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f419320d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f419321e;

    /* renamed from: f, reason: collision with root package name */
    public final th1.f f419322f;

    public g(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, int i19, int i27, int i28, th1.c cVar, java.lang.String str5, int i29, boolean z17, boolean z18, th1.f fVar) {
        long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSOperateWxData", "<init> hash[%d], pubVersionCode [%d], pubVersionName [%s], appId [%s], data [%s], grantScope [%s], versionType [%d], opt [%d], extScene [%d]  sessionId [%s]  avatarOpt [%d] routeType[%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), str, str2, str3, str4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str5, java.lang.Integer.valueOf(i29), cVar);
        com.tencent.mm.modelbase.o a17 = th1.d.a(cVar).a();
        this.f419320d = a17;
        r45.m24 m24Var = (r45.m24) a17.f70710a.f70684a;
        m24Var.f380089d = str2;
        m24Var.f380090e = new com.tencent.mm.protobuf.g(str3.getBytes() == null ? new byte[0] : str3.getBytes());
        m24Var.f380091f = str4;
        m24Var.f380093h = i18;
        m24Var.f380092g = i27;
        m24Var.f380095m = i19;
        m24Var.f380097o = i29;
        m24Var.f380096n = str5;
        m24Var.f380098p = z17;
        m24Var.f380099q = z18;
        r45.nd7 nd7Var = new r45.nd7();
        m24Var.f380094i = nd7Var;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                j17 = c01.id.c();
            } catch (java.lang.Exception unused) {
                j17 = -1;
            }
        } else {
            j17 = c01.id.b();
        }
        nd7Var.f381298g = j17;
        r45.pe7 pe7Var = new r45.pe7();
        pe7Var.f382991e = str;
        pe7Var.f382990d = i17;
        r45.nd7 nd7Var2 = m24Var.f380094i;
        nd7Var2.f381299h = pe7Var;
        if (i28 > 0) {
            nd7Var2.f381296e = i28;
        }
        this.f419322f = fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        com.tencent.mm.modelbase.o oVar = this.f419320d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSOperateWxData", "doScene hash=%d, funcid=%d", valueOf, java.lang.Integer.valueOf(oVar.f70713d));
        this.f419321e = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1133;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneJSOperateWxData", "onGYNetEnd, hash[%d] errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f419321e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        th1.f fVar = this.f419322f;
        if (fVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.i3) fVar).a(i18, i19, str, this);
        }
    }
}
