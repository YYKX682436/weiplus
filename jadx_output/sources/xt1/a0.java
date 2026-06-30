package xt1;

/* loaded from: classes8.dex */
public class a0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456439d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f456441f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f456442g = new java.util.LinkedList();

    public a0(java.util.LinkedList linkedList) {
        this.f456441f = linkedList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ff();
        lVar.f70665b = new r45.gf();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchgetcarditem";
        lVar.f70667d = 1074;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456439d = a17;
        r45.ff ffVar = (r45.ff) a17.f70710a.f70684a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null && linkedList.size() != 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                xt1.r0 r0Var = (xt1.r0) it.next();
                if (r0Var != null) {
                    linkedList2.add(r0Var.field_cardUserId);
                }
            }
        }
        ffVar.f374269d = linkedList2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456440e = u0Var;
        return dispatch(sVar, this.f456439d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1074;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        java.util.Iterator it;
        int i28;
        boolean update;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.f456440e.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = ((r45.gf) this.f456439d.f70711b.f70700a).f375181d;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
            this.f456440e.onSceneEnd(4, -1, null, this);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList c17 = lu1.t.c(str2);
        if (c17 != null) {
            java.util.LinkedList linkedList = this.f456442g;
            java.util.LinkedList linkedList2 = this.f456441f;
            if (linkedList2 != null) {
                linkedList.addAll(linkedList2);
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            java.util.Iterator it6 = c17.iterator();
            int i29 = 0;
            int i37 = 0;
            while (it6.hasNext()) {
                com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) it6.next();
                int i38 = i37 + 1;
                if (cardInfo == null) {
                    it = it6;
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "processCardObject fail, card is null");
                    i28 = i38;
                    update = false;
                } else {
                    it = it6;
                    i28 = i38;
                    com.tencent.mm.plugin.card.model.CardInfo z07 = xt1.t0.cj().z0("" + cardInfo.field_card_id);
                    if (z07 == null) {
                        update = xt1.t0.cj().insert(cardInfo);
                        if (!update) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "processCardObject, insert fail");
                        }
                    } else {
                        cardInfo.field_stickyIndex = z07.field_stickyIndex;
                        cardInfo.field_stickyEndTime = z07.field_stickyEndTime;
                        cardInfo.field_stickyAnnouncement = z07.field_stickyAnnouncement;
                        update = xt1.t0.cj().update(cardInfo, new java.lang.String[0]);
                    }
                }
                if (!update) {
                    i29++;
                    if (cardInfo != null) {
                        xt1.r0 r0Var = new xt1.r0();
                        r0Var.field_cardUserId = cardInfo.field_card_id;
                        linkedList.remove(r0Var);
                    }
                }
                it6 = it;
                i37 = i28;
            }
            gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd do transaction use time %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, deal CardObject %d fail of %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
            lu1.a0.J();
            if (c17.size() > 0) {
                int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(281);
                iDKey.SetKey(43);
                iDKey.SetValue(1L);
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(281);
                iDKey2.SetKey(44);
                iDKey2.SetValue(currentTimeMillis3);
                com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
                iDKey3.SetID(281);
                iDKey3.SetKey(45);
                iDKey3.SetValue(c17.size());
                com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
                iDKey4.SetID(281);
                iDKey4.SetKey(47);
                iDKey4.SetValue(currentTimeMillis3 / c17.size());
                arrayList.add(iDKey);
                arrayList.add(iDKey2);
                arrayList.add(iDKey3);
                arrayList.add(iDKey4);
                i27 = 0;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
                this.f456440e.onSceneEnd(i27, i27, str, this);
            }
        }
        i27 = 0;
        this.f456440e.onSceneEnd(i27, i27, str, this);
    }
}
