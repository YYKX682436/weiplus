package i61;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288913d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.m f288914e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n f288915f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288916g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f288917h;

    public g(java.lang.String str, long j17, java.util.List list, int i17, java.lang.String str2, long j18, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.m();
        lVar.f70665b = new r45.n();
        lVar.f70667d = 1655;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaalaunchbyperson";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288913d = a17;
        r45.m mVar = (r45.m) a17.f70710a.f70684a;
        this.f288914e = mVar;
        a17.setIsUserCmd(true);
        try {
            mVar.f380016d = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
            mVar.f380017e = j17;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            mVar.f380018f = linkedList2;
            linkedList2.addAll(list);
            mVar.f380019g = i17;
            mVar.f380020h = str2;
            mVar.f380021i = at4.g0.c();
            mVar.f380022m = j18;
            mVar.f380023n = str3;
            mVar.f380024o = str4;
            mVar.f380025p = str5;
            mVar.f380026q = str6;
            mVar.f380027r = z17;
            mVar.f380028s = linkedList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneAALaunchByPerson", "build NetSceneAALaunchByPerson request error: %s", e17.getMessage());
        }
        this.f288917h = str2;
        java.lang.Object[] objArr = new java.lang.Object[10];
        r45.m mVar2 = this.f288914e;
        objArr[0] = mVar2.f380016d;
        objArr[1] = java.lang.Long.valueOf(mVar2.f380017e);
        r45.m mVar3 = this.f288914e;
        objArr[2] = mVar3.f380018f;
        objArr[3] = java.lang.Integer.valueOf(mVar3.f380019g);
        r45.m mVar4 = this.f288914e;
        objArr[4] = mVar4.f380020h;
        objArr[5] = java.lang.Long.valueOf(mVar4.f380022m);
        r45.m mVar5 = this.f288914e;
        java.lang.String str7 = mVar5.f380023n;
        objArr[6] = str7 == null ? "" : str7;
        java.lang.String str8 = mVar5.f380024o;
        objArr[7] = str8 == null ? "" : str8;
        java.lang.String str9 = mVar5.f380025p;
        objArr[8] = str9 == null ? "" : str9;
        java.lang.String str10 = mVar5.f380026q;
        objArr[9] = str10 != null ? str10 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByPerson", "NetSceneAALaunchByPerson, title: %s, total_pay_amount: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s , pic_cdn_md5:%s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f288916g = u0Var;
        return dispatch(sVar, this.f288913d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1655;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByPerson", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.n nVar = (r45.n) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288915f = nVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(nVar.f380960d);
        r45.n nVar2 = this.f288915f;
        objArr[1] = nVar2.f380961e;
        objArr[2] = nVar2.f380962f;
        objArr[3] = java.lang.Boolean.valueOf(nVar2.f380963g == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByPerson", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", objArr);
        java.lang.String str2 = this.f288915f.f380963g;
        com.tencent.mm.modelbase.u0 u0Var = this.f288916g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
