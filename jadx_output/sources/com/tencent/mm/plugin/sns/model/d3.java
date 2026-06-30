package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class d3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164136d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164137e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164138f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164139g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f164140h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f164141i;

    public d3(int i17) {
        this.f164137e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.na6();
        lVar.f70665b = new r45.oa6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnstaglist";
        lVar.f70667d = 292;
        lVar.f70668e = 116;
        lVar.f70669f = 1000000116;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164136d = a17;
        java.lang.String str = com.tencent.mm.plugin.sns.model.l4.Ej().J0("@__weixintsnstag").field_md5;
        str = str == null ? "" : str;
        this.f164138f = str;
        r45.na6 na6Var = (r45.na6) a17.f70710a.f70684a;
        na6Var.f381210d = i17;
        na6Var.f381211e = str;
    }

    public java.util.List H(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f164140h;
        if (linkedList2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return linkedList;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            r45.ma6 ma6Var = (r45.ma6) it.next();
            if (ma6Var.f380311d == j17) {
                java.util.Iterator it6 = ma6Var.f380314g.iterator();
                while (it6.hasNext()) {
                    linkedList.add(((r45.du5) it6.next()).f372756d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                return linkedList;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return linkedList;
    }

    public com.tencent.mm.plugin.sns.storage.q2 I(com.tencent.mm.plugin.sns.storage.q2 q2Var, r45.ma6 ma6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tagToInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        q2Var.field_tagId = ma6Var.f380311d;
        java.lang.String str = ma6Var.f380312e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        q2Var.field_tagName = str;
        q2Var.field_count = ma6Var.f380313f;
        q2Var.t0(ma6Var.f380314g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tagToInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return q2Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        this.f164139g = u0Var;
        int dispatch = dispatch(sVar, this.f164136d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        return 292;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        java.util.Iterator it;
        boolean z18;
        boolean z19;
        boolean z27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
        if (i18 != 0 || i19 != 0) {
            this.f164139g.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return;
        }
        r45.oa6 oa6Var = (r45.oa6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f164141i = oa6Var.f382107h;
        java.util.LinkedList linkedList = oa6Var.f382106g;
        this.f164140h = linkedList;
        java.lang.String str2 = oa6Var.f382104e;
        if (this.f164138f.equals(str2)) {
            this.f164139g.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            return;
        }
        java.util.List z07 = com.tencent.mm.plugin.sns.model.l4.Lj().z0();
        if (this.f164137e != 3) {
            java.util.Iterator it6 = ((java.util.ArrayList) z07).iterator();
            while (it6.hasNext()) {
                java.lang.Long l17 = (java.lang.Long) it6.next();
                java.util.Iterator it7 = linkedList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z27 = false;
                        break;
                    }
                    if (l17.longValue() == ((r45.ma6) it7.next()).f380311d) {
                        z27 = true;
                        break;
                    }
                }
                if (!z27) {
                    it6.remove();
                    com.tencent.mm.plugin.sns.model.l4.Lj().y0(l17.longValue());
                }
            }
        }
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            r45.ma6 ma6Var = (r45.ma6) it8.next();
            java.lang.Long valueOf = java.lang.Long.valueOf(ma6Var.f380311d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
            java.util.Iterator it9 = ((java.util.ArrayList) z07).iterator();
            while (true) {
                if (!it9.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    z17 = false;
                    break;
                } else if (((java.lang.Long) it9.next()).longValue() == valueOf.longValue()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isListContainId", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(ma6Var.f380311d);
                java.lang.String str3 = D0.field_tagName;
                if ((str3 == null || str3.equals(ma6Var.f380312e)) && D0.field_count == ma6Var.f380313f) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMemberListChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    java.lang.String[] split = D0.field_memberList.split(",");
                    java.util.Iterator it10 = ma6Var.f380314g.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            it = it8;
                            z18 = false;
                            break;
                        }
                        r45.du5 du5Var = (r45.du5) it10.next();
                        it = it8;
                        int i27 = 0;
                        while (true) {
                            if (i27 >= split.length) {
                                z19 = false;
                                break;
                            } else {
                                if (split[i27].equals(du5Var)) {
                                    z19 = true;
                                    break;
                                }
                                i27++;
                            }
                        }
                        if (!z19) {
                            z18 = true;
                            break;
                        }
                        it8 = it;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMemberListChange", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                    if (!z18) {
                    }
                } else {
                    it = it8;
                }
                I(D0, ma6Var);
                com.tencent.mm.plugin.sns.model.l4.Lj().d1(D0);
            } else {
                com.tencent.mm.plugin.sns.storage.q2 q2Var = new com.tencent.mm.plugin.sns.storage.q2();
                I(q2Var, ma6Var);
                com.tencent.mm.plugin.sns.model.l4.Lj().d1(q2Var);
                it = it8;
            }
            it8 = it;
        }
        com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0("@__weixintsnstag");
        J0.field_md5 = str2;
        com.tencent.mm.plugin.sns.model.l4.Ej().k1(J0);
        this.f164139g.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
    }
}
