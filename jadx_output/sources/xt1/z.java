package xt1;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456608d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456609e;

    public z(java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pe();
        lVar.f70665b = new r45.qe();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchdelcarditem";
        lVar.f70667d = mc1.l.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456608d = a17;
        ((r45.pe) a17.f70710a.f70684a).f382974d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456609e = u0Var;
        return dispatch(sVar, this.f456608d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return mc1.l.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            java.util.LinkedList linkedList = ((r45.qe) this.f456608d.f70711b.f70700a).f383878d;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd, resp list count = %d", objArr);
            if (linkedList == null || linkedList.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchDelCardItem", "onGYNetEnd fail, resp list is null");
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (android.text.TextUtils.isEmpty(str2)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem fail, id is null");
                    } else {
                        com.tencent.mm.plugin.card.model.CardInfo cardInfo = new com.tencent.mm.plugin.card.model.CardInfo();
                        cardInfo.field_card_id = str2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchDelCardItem", "processDelCardItem, delRet = %b", java.lang.Boolean.valueOf(xt1.t0.cj().delete(cardInfo, new java.lang.String[0])));
                    }
                }
            }
        }
        this.f456609e.onSceneEnd(i18, i19, str, this);
    }
}
