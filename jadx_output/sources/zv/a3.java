package zv;

/* loaded from: classes11.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f475902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f475903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f475904g;

    public a3(yz5.l lVar, long j17, boolean z17, boolean z18) {
        this.f475901d = lVar;
        this.f475902e = j17;
        this.f475903f = z17;
        this.f475904g = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.List W0;
        java.util.Iterator it;
        com.tencent.pigeon.biz_base.MassSendCardMsg massSendCardMsg;
        java.lang.String str;
        java.lang.Boolean bool;
        java.util.LinkedList linkedList;
        java.util.Iterator it6;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        zv.q qVar = zv.q.f476079a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (this.f475903f) {
            W0 = r01.q3.nj().P0(10, 285212721);
        } else {
            boolean z17 = this.f475904g;
            long j17 = this.f475902e;
            W0 = z17 ? r01.q3.nj().W0(j17, 285212721) : r01.q3.nj().f1(10, j17, 285212721);
        }
        for (java.util.Iterator it7 = W0.iterator(); it7.hasNext(); it7 = it) {
            com.tencent.mm.storage.s1 s1Var = (com.tencent.mm.storage.s1) it7.next();
            if (s1Var.v0()) {
                if (s1Var.v0()) {
                    java.lang.String str2 = s1Var.field_talker;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                    ot0.r0 r0Var = (ot0.r0) ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(s1Var.field_msgId, s1Var.field_content);
                    long j18 = s1Var.field_orderFlag;
                    long j19 = s1Var.field_msgId;
                    long j27 = s1Var.field_msgSvrId;
                    boolean z18 = s1Var.field_isExpand;
                    long j28 = s1Var.field_createTime;
                    if (n17 != null) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        str = c01.a2.e(str2);
                    } else {
                        str = null;
                    }
                    if (n17 != null) {
                        bool = java.lang.Boolean.valueOf(n17.w2());
                        it = it7;
                    } else {
                        it = it7;
                        bool = null;
                    }
                    java.lang.Boolean bool2 = bool;
                    int i17 = 1;
                    massSendCardMsg = new com.tencent.pigeon.biz_base.MassSendCardMsg(str2, str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Boolean.valueOf(s1Var.field_isRead == 1), java.lang.Boolean.valueOf(s1Var.field_isValidExposed), java.lang.Boolean.valueOf(z18), bool2, java.lang.Long.valueOf(j28), null, java.lang.Boolean.valueOf((1 & s1Var.field_bitFlag) != 0), new java.util.LinkedList(), 1024, null);
                    java.util.LinkedList linkedList3 = r0Var.f348581i;
                    if (linkedList3 != null) {
                        java.util.Iterator it8 = linkedList3.iterator();
                        while (it8.hasNext()) {
                            ot0.s0 s0Var = (ot0.s0) it8.next();
                            java.util.List<com.tencent.pigeon.biz_base.MassSendCardMsgItem> items = massSendCardMsg.getItems();
                            java.util.LinkedList linkedList4 = items instanceof java.util.LinkedList ? (java.util.LinkedList) items : null;
                            if (linkedList4 != null) {
                                java.lang.String str3 = s0Var.f348761d;
                                java.lang.String str4 = s0Var.f348762e;
                                java.lang.String m17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).m(s0Var.f348762e);
                                java.lang.String str5 = s0Var.f348766i;
                                java.lang.String str6 = s0Var.D;
                                java.lang.String str7 = s0Var.f348769n;
                                long j29 = s0Var.f348770o;
                                boolean z19 = s0Var.I == i17 ? i17 : 0;
                                long j37 = s0Var.C;
                                linkedList = linkedList2;
                                it6 = it8;
                                linkedList4.add(new com.tencent.pigeon.biz_base.MassSendCardMsgItem(str3, str4, m17, java.lang.Long.valueOf(s0Var.f348765h), str5, str6, str7, java.lang.Long.valueOf(j29), java.lang.Long.valueOf(s0Var.f348774q), s0Var.f348785z, s0Var.A, s0Var.G, java.lang.Long.valueOf(j37), java.lang.Long.valueOf(s0Var.E), java.lang.Long.valueOf(s0Var.F), java.lang.Boolean.valueOf(z19)));
                            } else {
                                linkedList = linkedList2;
                                it6 = it8;
                            }
                            i17 = 1;
                            linkedList2 = linkedList;
                            it8 = it6;
                        }
                    }
                    linkedList2 = linkedList2;
                } else {
                    it = it7;
                    massSendCardMsg = new com.tencent.pigeon.biz_base.MassSendCardMsg(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                }
                linkedList2.add(massSendCardMsg);
            } else {
                it = it7;
            }
        }
        this.f475901d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.n0.V0(linkedList2))));
    }
}
