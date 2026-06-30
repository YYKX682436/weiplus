package no2;

/* loaded from: classes10.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ no2.c f338738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f338739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f338740c;

    public b(no2.c cVar, int i17, java.util.List list) {
        this.f338738a = cVar;
        this.f338739b = i17;
        this.f338740c = list;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.wg2 wg2Var;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i17;
        java.lang.Object obj4;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i18 = fVar.f70615a;
        int i19 = fVar.f70616b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDiffData: ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(i19);
        sb6.append(", scene=");
        no2.c cVar = this.f338738a;
        sb6.append(cVar.f338741a);
        sb6.append(" tabIndex=");
        sb6.append(this.f338739b);
        com.tencent.mars.xlog.Log.i("CgiFinderBatchGetMentionInfo", sb6.toString());
        if (i18 == 0 && i19 == 0 && (wg2Var = (r45.wg2) ((r45.mv0) fVar.f70618d).getCustom(1)) != null) {
            com.tencent.mars.xlog.Log.i("CgiFinderBatchGetMentionInfo", "FinderMentionList size " + wg2Var.getList(0).size());
            kotlin.jvm.internal.o.f(wg2Var.getList(0), "getMentions(...)");
            if (!r3.isEmpty()) {
                java.util.LinkedList<r45.pg2> list = wg2Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getMentions(...)");
                for (r45.pg2 pg2Var : list) {
                    int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127622bc).getValue()).r()).intValue();
                    int i27 = 34;
                    int i28 = cVar.f338741a;
                    java.util.List list2 = this.f338740c;
                    if (intValue == 1) {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = i28;
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            i17 = i28;
                            if (pg2Var.getLong(i27) == ((so2.i) obj4).f410411d.field_svrMentionId) {
                                break;
                            }
                            i28 = i17;
                            i27 = 34;
                        }
                        so2.i iVar = (so2.i) obj4;
                        if (iVar != null) {
                            dm.pd pdVar = iVar.f410411d;
                            if ((pdVar.field_followFlag == pg2Var.getInteger(35) && pdVar.field_extFlag == pg2Var.getInteger(10) && kotlin.jvm.internal.o.b(pdVar.field_thankInfo, (r45.xg2) pg2Var.getCustom(38)) && kotlin.jvm.internal.o.b(pdVar.field_help_promotion_info, (r45.fb1) pg2Var.getCustom(54))) ? false : true) {
                                com.tencent.mars.xlog.Log.i("CgiFinderBatchGetMentionInfo", "requestDiffData update mentionId: " + pdVar.field_svrMentionId + ", extFlag: " + pdVar.field_extFlag + "->" + pg2Var.getInteger(10) + ", followFlag: " + pdVar.field_followFlag + "->" + pg2Var.getInteger(35) + ", thankInfo: " + pdVar.field_thankInfo + "->" + ((r45.xg2) pg2Var.getCustom(38)));
                            }
                            pdVar.field_followFlag = pg2Var.getInteger(35);
                            pdVar.field_extFlag = pg2Var.getInteger(10);
                            pdVar.field_thankInfo = (r45.xg2) pg2Var.getCustom(38);
                            pdVar.field_finderIdentity = (r45.ub1) pg2Var.getCustom(40);
                            pdVar.field_thankIconType = pg2Var.getInteger(52);
                            pdVar.field_help_promotion_info = (r45.fb1) pg2Var.getCustom(54);
                            pdVar.field_svrMention = pg2Var;
                            int i29 = i17;
                            com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "updateMention mentionId=" + pdVar.field_svrMentionId + " success=" + ((c61.l7) i95.n0.c(c61.l7.class)).fk(i29 != 1 ? i29 != 2 ? 0 : 1 : 2).update(pdVar.systemRowid, pdVar));
                        }
                    } else {
                        java.util.Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it6.next();
                            if (pg2Var.getLong(34) == ((so2.i) obj2).f410411d.field_svrMentionId) {
                                break;
                            }
                        }
                        so2.i iVar2 = (so2.i) obj2;
                        if (iVar2 != null) {
                            int integer = pg2Var.getInteger(35);
                            dm.pd pdVar2 = iVar2.f410411d;
                            pdVar2.field_followFlag = integer;
                            pdVar2.field_thankIconType = pg2Var.getInteger(52);
                            l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(i28 != 1 ? i28 != 2 ? 0 : 1 : 2);
                            char c17 = i28 != 1 ? i28 != 2 ? (char) 0 : (char) 1 : (char) 2;
                            int i37 = dm.x4.f241026a3;
                            java.lang.String str = c17 == 1 ? "WxIdentityMsg" : "FinderIdentityMsg";
                            java.lang.String str2 = "UPDATE " + str + " SET followFlag=" + pdVar2.field_followFlag + " WHERE id=" + pdVar2.field_id;
                            com.tencent.mars.xlog.Log.i("Finder.FinderMentionLogic", "updateMentionFollowFlag sql:" + str2 + ", success:" + fk6.execSQL(str, str2) + ", flag:" + pdVar2.field_followFlag);
                        }
                        java.util.Iterator it7 = list2.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            java.lang.Object next = it7.next();
                            if (pg2Var.getLong(34) == ((so2.i) next).f410411d.field_svrMentionId) {
                                obj3 = next;
                                break;
                            }
                        }
                        so2.i iVar3 = (so2.i) obj3;
                        if (iVar3 != null) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("requestDiffData updateExtFlag mentionId=");
                            dm.pd pdVar3 = iVar3.f410411d;
                            sb7.append(pdVar3.field_svrMentionId);
                            sb7.append(" originalFlag=");
                            sb7.append(pdVar3.field_extFlag);
                            sb7.append(" newFlag=");
                            sb7.append(pg2Var.getInteger(10));
                            com.tencent.mars.xlog.Log.i("CgiFinderBatchGetMentionInfo", sb7.toString());
                            pdVar3.field_extFlag = pg2Var.getInteger(10);
                            pdVar3.field_thankIconType = pg2Var.getInteger(52);
                            cu2.b0.f222371a.l(pdVar3, i28);
                        }
                    }
                }
                pm0.v.X(new no2.a(cVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
