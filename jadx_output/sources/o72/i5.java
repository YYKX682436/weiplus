package o72;

/* loaded from: classes4.dex */
public class i5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f343365d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f343367f;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f343369h;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f343366e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f343368g = 0;

    public i5(java.util.LinkedList linkedList, java.util.Map map) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.te();
        lVar.f70665b = new r45.ue();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchdelfavitem";
        lVar.f70667d = 403;
        lVar.f70668e = 194;
        lVar.f70669f = 1000000194;
        this.f343365d = lVar.a();
        this.f343367f = linkedList;
        this.f343369h = map;
    }

    public final boolean H() {
        boolean z17 = false;
        java.util.LinkedList linkedList = this.f343367f;
        if (linkedList != null && this.f343368g < linkedList.size()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = this.f343367f;
        if (linkedList2 == null || linkedList2.isEmpty() || this.f343368g >= linkedList2.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", java.lang.Integer.valueOf(this.f343368g));
            return -1;
        }
        this.f343366e = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(this.f343368g), linkedList2);
        com.tencent.mm.modelbase.o oVar = this.f343365d;
        r45.te teVar = (r45.te) oVar.f70710a.f70684a;
        teVar.f386339e.clear();
        int i17 = this.f343368g;
        int i18 = 0;
        while (true) {
            int size = linkedList2.size();
            linkedList = teVar.f386341g;
            if (i17 >= size) {
                break;
            }
            int intValue = ((java.lang.Integer) linkedList2.get(i17)).intValue();
            if (intValue > 0) {
                teVar.f386339e.add(java.lang.Integer.valueOf(intValue));
                i18++;
                java.lang.String str = (java.lang.String) this.f343369h.get(java.lang.Integer.valueOf(intValue));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    r45.uo6 uo6Var = new r45.uo6();
                    uo6Var.f387537e = intValue;
                    uo6Var.f387536d = str;
                    linkedList.add(uo6Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "id = " + intValue + ", ctx = " + str);
                }
            }
            if (i18 >= 20) {
                break;
            }
            i17++;
        }
        this.f343368g = i17 + 1;
        teVar.f386338d = teVar.f386339e.size();
        teVar.f386340f = linkedList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "id size = " + teVar.f386338d + ", ctx size = " + teVar.f386340f);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", java.lang.Integer.valueOf(teVar.f386338d), teVar.f386339e);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 403;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f343368g), java.lang.Integer.valueOf(this.f343367f.size()), str);
        if (i18 != 0 || i19 != 0) {
            if (H()) {
                doScene(dispatcher(), this.f343366e);
                return;
            } else {
                this.f343366e.onSceneEnd(i18, i19, str, this);
                return;
            }
        }
        java.util.LinkedList linkedList = ((r45.ue) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f387279e;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
            if (H()) {
                doScene(dispatcher(), this.f343366e);
                return;
            } else {
                this.f343366e.onSceneEnd(i18, i19, str, this);
                return;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", java.lang.Integer.valueOf(linkedList.size()));
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            r45.bc0 bc0Var = (r45.bc0) linkedList.get(i27);
            if (bc0Var.f370663d < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", java.lang.Integer.valueOf(bc0Var.f370664e));
            } else {
                arrayList.add(java.lang.Integer.valueOf(bc0Var.f370664e));
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", java.lang.Integer.valueOf(bc0Var.f370664e));
            }
        }
        o72.x1.E0(arrayList);
        if (H()) {
            doScene(dispatcher(), this.f343366e);
        } else {
            this.f343366e.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
