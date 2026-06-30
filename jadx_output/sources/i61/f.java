package i61;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288908d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.i f288909e;

    /* renamed from: f, reason: collision with root package name */
    public r45.j f288910f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288911g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f288912h;

    public f(long j17, java.lang.String str, java.util.List list, int i17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i();
        lVar.f70665b = new r45.j();
        lVar.f70667d = 1624;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f288912h = str2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288908d = a17;
        r45.i iVar = (r45.i) a17.f70710a.f70684a;
        this.f288909e = iVar;
        a17.setIsUserCmd(true);
        if (list != null) {
            try {
                if (list.size() > 0) {
                    iVar.f376582d = list.size();
                    iVar.f376583e = j17;
                    iVar.f376584f = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    iVar.f376585g = linkedList2;
                    linkedList2.addAll(list);
                    iVar.f376586h = i17;
                    iVar.f376587i = str2;
                    iVar.f376588m = at4.g0.c();
                    iVar.f376589n = j18;
                    iVar.f376590o = str3;
                    iVar.f376591p = str4;
                    iVar.f376592q = str5;
                    iVar.f376593r = str6;
                    iVar.f376594s = z17;
                    iVar.f376595t = linkedList;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", e17.getMessage());
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(this.f288909e.f376582d);
        objArr[1] = java.lang.Long.valueOf(this.f288909e.f376583e);
        r45.i iVar2 = this.f288909e;
        objArr[2] = iVar2.f376584f;
        objArr[3] = iVar2.f376585g;
        objArr[4] = java.lang.Integer.valueOf(iVar2.f376586h);
        r45.i iVar3 = this.f288909e;
        objArr[5] = iVar3.f376587i;
        objArr[6] = java.lang.Long.valueOf(iVar3.f376589n);
        r45.i iVar4 = this.f288909e;
        java.lang.String str7 = iVar4.f376590o;
        objArr[7] = str7 == null ? "" : str7;
        java.lang.String str8 = iVar4.f376591p;
        objArr[8] = str8 == null ? "" : str8;
        java.lang.String str9 = iVar4.f376592q;
        objArr[9] = str9 == null ? "" : str9;
        java.lang.String str10 = iVar4.f376593r;
        objArr[10] = str10 != null ? str10 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s,pic_cdn_md5:%s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByMoney", "doScene");
        this.f288911g = u0Var;
        return dispatch(sVar, this.f288908d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1624;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByMoney", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.j jVar = (r45.j) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288910f = jVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(jVar.f377426d);
        r45.j jVar2 = this.f288910f;
        objArr[1] = jVar2.f377427e;
        objArr[2] = java.lang.Boolean.valueOf(jVar2.f377429g == null);
        objArr[3] = this.f288910f.f377428f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByMoney", "retcode: %s, retmsg: %s, msgxml==null: %s, billNo: %s", objArr);
        java.lang.String str2 = this.f288910f.f377429g;
        com.tencent.mm.modelbase.u0 u0Var = this.f288911g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public f(long j17, java.lang.String str, int i17, int i18, long j18, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i();
        lVar.f70665b = new r45.j();
        lVar.f70667d = 1624;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288908d = a17;
        r45.i iVar = (r45.i) a17.f70710a.f70684a;
        this.f288909e = iVar;
        this.f288912h = str2;
        try {
            iVar.f376582d = i17;
            iVar.f376583e = j17;
            iVar.f376584f = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            iVar.f376585g = new java.util.LinkedList();
            iVar.f376586h = i18;
            iVar.f376587i = str2;
            iVar.f376588m = at4.g0.c();
            iVar.f376589n = j18;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", e17.getMessage());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f288909e.f376582d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f288909e.f376583e);
        r45.i iVar2 = this.f288909e;
        java.lang.String str3 = iVar2.f376584f;
        java.util.LinkedList linkedList = iVar2.f376585g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(iVar2.f376586h);
        r45.i iVar3 = this.f288909e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp", valueOf, valueOf2, str3, linkedList, valueOf3, iVar3.f376587i, java.lang.Long.valueOf(iVar3.f376589n));
    }
}
