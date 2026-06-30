package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class eh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ah f198972e;

    public eh(com.tencent.mm.ui.chatting.component.ah ahVar, com.tencent.mm.storage.f9 f9Var) {
        this.f198972e = ahVar;
        this.f198971d = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.ui.chatting.component.ah ahVar = this.f198972e;
        ahVar.m0(this.f198971d, ahVar.f198580d.x());
        if (((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) this.f198972e.f198580d.f460708c.a(sb5.k0.class))).s0()) {
            if (((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) this.f198972e.f198580d.f460708c.a(sb5.k0.class))).q0(this.f198971d.getMsgId())) {
                if (((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) this.f198972e.f198580d.f460708c.a(sb5.k0.class))).n0(this.f198971d.getMsgId()) >= 0) {
                    java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) this.f198972e.f198580d.f460708c.a(sb5.k0.class))).o0(this.f198971d.getMsgId())).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                        c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
                    }
                }
            }
        }
        if (((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) this.f198972e.f198580d.f460708c.a(sb5.g0.class))).u0() && te5.s1.f418747a.a()) {
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.na.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.na.class);
            }
            com.tencent.mm.storage.ma maVar = (com.tencent.mm.storage.ma) ((com.tencent.mm.storage.na) a17).P6(com.tencent.mm.storage.ma.class);
            com.tencent.mm.storage.f9 f9Var2 = this.f198971d;
            com.tencent.mm.storage.a9 a9Var = f9Var2.f193927g2;
            if (a9Var instanceof com.tencent.mm.storage.oa) {
                long j17 = ((com.tencent.mm.storage.oa) a9Var).field_groupId;
                long msgId = f9Var2.getMsgId();
                java.lang.String Q0 = this.f198971d.Q0();
                com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "deleteGroupItem groupId " + j17 + " msgId " + msgId + " talker " + Q0);
                p75.n0 n0Var = dm.da.f236423n;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList.add(dm.da.f236424o);
                p75.m0 i18 = dm.da.f236425p.i(java.lang.Long.valueOf(j17));
                p75.i0 g17 = dm.da.f236423n.g(linkedList);
                g17.f352657d = i18;
                g17.f352659f = linkedList2;
                g17.f352660g = linkedList3;
                p75.l0 a18 = g17.a();
                n75.b bVar = maVar.f193147g;
                java.util.List j18 = a18.j(bVar.Q4());
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) j18;
                    if (i19 >= arrayList.size()) {
                        break;
                    }
                    long longValue = ((java.lang.Long) arrayList.get(i19)).longValue();
                    if (longValue != msgId) {
                        c01.w9.f(longValue, Q0);
                    }
                    i19++;
                }
                p75.m0 i27 = dm.da.f236425p.i(java.lang.Long.valueOf(j17));
                p75.n0 n0Var2 = dm.da.f236423n;
                n0Var2.getClass();
                if (n0Var2 instanceof p75.z) {
                    throw new java.lang.IllegalArgumentException("Not support multi table delete");
                }
                java.lang.String table = n0Var2.f352676a;
                p75.h hVar = (p75.h) i27;
                java.lang.String b17 = hVar.b();
                java.lang.String[] e17 = hVar.e();
                kotlin.jvm.internal.o.g(table, "table");
                l75.k0 Q4 = bVar.Q4();
                if (Q4 != null) {
                    Q4.delete(table, b17, e17);
                    return;
                }
                return;
            }
            long msgId2 = f9Var2.getMsgId();
            p75.n0 n0Var3 = dm.da.f236423n;
            p75.i0 i28 = n0Var3.i();
            p75.d dVar = dm.da.f236424o;
            i28.f352657d = dVar.i(java.lang.Long.valueOf(msgId2));
            i28.f352656c = "MicroMsg.SDK.BaseServiceNotifyAggregationMsg";
            p75.l0 a19 = i28.a();
            n75.b bVar2 = maVar.f193147g;
            com.tencent.mm.storage.oa oaVar = (com.tencent.mm.storage.oa) a19.o(bVar2.Q4(), com.tencent.mm.storage.oa.class);
            if (oaVar == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "deleteSingleItem:" + oaVar.field_msgId + " foldCount: " + oaVar.field_foldCount);
            p75.m0 i29 = dVar.i(java.lang.Long.valueOf(oaVar.field_msgId));
            if (n0Var3 instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            java.lang.String table2 = n0Var3.f352676a;
            p75.h hVar2 = (p75.h) i29;
            java.lang.String b18 = hVar2.b();
            java.lang.String[] e18 = hVar2.e();
            kotlin.jvm.internal.o.g(table2, "table");
            l75.k0 Q42 = bVar2.Q4();
            if (Q42 != null) {
                Q42.delete(table2, b18, e18);
            }
            if (!((oaVar.field_showStatus & 1) == 1)) {
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                java.util.LinkedList linkedList5 = new java.util.LinkedList();
                java.util.LinkedList linkedList6 = new java.util.LinkedList();
                p75.m c17 = dm.da.f236425p.i(java.lang.Long.valueOf(oaVar.field_groupId)).c(dm.da.f236426q.g(1, 1));
                p75.i0 g18 = n0Var3.g(linkedList4);
                g18.f352657d = c17;
                g18.f352659f = linkedList5;
                g18.f352660g = linkedList6;
                com.tencent.mm.storage.oa oaVar2 = (com.tencent.mm.storage.oa) g18.a().o(bVar2.Q4(), com.tencent.mm.storage.oa.class);
                if (oaVar2 != null) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("foldCount", java.lang.Integer.valueOf(oaVar2.field_foldCount - 1));
                    contentValues.put("clusterNote", maVar.a7(oaVar2.field_clusterNote, oaVar.field_weappMsgId));
                    p75.m0 i37 = dVar.i(java.lang.Long.valueOf(oaVar2.field_msgId));
                    p75.h1 j19 = n0Var3.j(contentValues);
                    j19.f352651c = i37;
                    com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "deleteSingleItem: update header" + j19.a().f(bVar2.Q4()) + " foldCount: " + oaVar2.field_foldCount + " head msgId: " + oaVar2.field_msgId);
                    return;
                }
                return;
            }
            if (oaVar.field_foldCount < 2) {
                return;
            }
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            java.util.LinkedList linkedList8 = new java.util.LinkedList();
            java.util.LinkedList linkedList9 = new java.util.LinkedList();
            p75.m c18 = dm.da.f236425p.i(java.lang.Long.valueOf(oaVar.field_groupId)).c(dVar.x(java.lang.Long.valueOf(oaVar.field_msgId)));
            linkedList8.add(dVar.u());
            p75.i0 g19 = n0Var3.g(linkedList7);
            g19.f352657d = c18;
            g19.f352659f = linkedList8;
            g19.f352660g = linkedList9;
            g19.c(1, 0);
            com.tencent.mm.storage.oa oaVar3 = (com.tencent.mm.storage.oa) g19.a().o(bVar2.Q4(), com.tencent.mm.storage.oa.class);
            if (oaVar3 != null) {
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("foldCount", java.lang.Integer.valueOf(oaVar.field_foldCount - 1));
                contentValues2.put("showStatus", java.lang.Integer.valueOf(oaVar.field_showStatus));
                contentValues2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, oaVar.field_title);
                contentValues2.put("clusterNote", maVar.a7(oaVar.field_clusterNote, oaVar3.field_weappMsgId));
                p75.m0 i38 = dVar.i(java.lang.Long.valueOf(oaVar3.field_msgId));
                p75.h1 j27 = n0Var3.j(contentValues2);
                j27.f352651c = i38;
                com.tencent.mars.xlog.Log.i("ServiceNotifyAggregationMsgStorage", "deleteSingleItem: update new header" + j27.a().f(bVar2.Q4()) + " msgId: " + oaVar3.field_msgId);
            }
        }
    }
}
