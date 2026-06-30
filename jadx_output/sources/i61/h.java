package i61;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288918d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.k f288919e;

    /* renamed from: f, reason: collision with root package name */
    public r45.l f288920f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288921g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f288922h;

    public h(java.lang.String str, int i17, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.k();
        lVar.f70665b = new r45.l();
        lVar.f70667d = 2831;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaalaunchbypayercustomize";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288918d = a17;
        r45.k kVar = (r45.k) a17.f70710a.f70684a;
        this.f288919e = kVar;
        a17.setIsUserCmd(true);
        try {
            kVar.f378236d = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
            kVar.f378237e = i17;
            kVar.f378238f = str2;
            kVar.f378239g = at4.g0.c();
            kVar.f378240h = j17;
            kVar.f378241i = str3;
            kVar.f378242m = str4;
            kVar.f378243n = str5;
            kVar.f378244o = str6;
            kVar.f378245p = z17;
            kVar.f378246q = linkedList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneAALaunchByPersonCustomize", "build NetSceneAALaunchByPerson request error: %s", e17.getMessage());
        }
        this.f288922h = str2;
        java.lang.Object[] objArr = new java.lang.Object[8];
        r45.k kVar2 = this.f288919e;
        objArr[0] = kVar2.f378236d;
        objArr[1] = java.lang.Integer.valueOf(kVar2.f378237e);
        r45.k kVar3 = this.f288919e;
        objArr[2] = kVar3.f378238f;
        objArr[3] = java.lang.Long.valueOf(kVar3.f378240h);
        r45.k kVar4 = this.f288919e;
        java.lang.String str7 = kVar4.f378241i;
        objArr[4] = str7 == null ? "" : str7;
        java.lang.String str8 = kVar4.f378242m;
        objArr[5] = str8 == null ? "" : str8;
        java.lang.String str9 = kVar4.f378243n;
        objArr[6] = str9 == null ? "" : str9;
        java.lang.String str10 = kVar4.f378244o;
        objArr[7] = str10 != null ? str10 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByPersonCustomize", "NetSceneAALaunchByPersonCustomize, title: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s , pic_cdn_md5: %s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f288921g = u0Var;
        return dispatch(sVar, this.f288918d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2831;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByPersonCustomize", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.l lVar = (r45.l) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288920f = lVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(lVar.f379051d);
        r45.l lVar2 = this.f288920f;
        objArr[1] = lVar2.f379052e;
        objArr[2] = lVar2.f379053f;
        objArr[3] = java.lang.Boolean.valueOf(lVar2.f379054g == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByPersonCustomize", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", objArr);
        java.lang.String str2 = this.f288920f.f379054g;
        com.tencent.mm.modelbase.u0 u0Var = this.f288921g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
