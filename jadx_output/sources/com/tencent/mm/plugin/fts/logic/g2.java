package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class g2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.fts.logic.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f137549q = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchLimitGroupMessage";
    }

    @Override // p13.c
    public int k() {
        return 24;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        android.database.Cursor o18;
        o("start");
        p13.r c17 = p13.r.c(this.f351135n.f351141c, false, this.f137549q.f137618t);
        vVar.f351159d = c17;
        w13.h hVar = this.f137549q.f137609h;
        hVar.getClass();
        if (c17.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = c17.f();
            o17 = ((com.tencent.mm.plugin.fts.o) hVar.f342198f).o(java.lang.String.format("SELECT type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0" + hVar.q() + " ORDER BY timestamp desc;", hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17), null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (o17.moveToNext()) {
            java.lang.String string = o17.getString(3);
            if (hashSet.add(string)) {
                com.tencent.mm.plugin.fts.logic.f2 f2Var = new com.tencent.mm.plugin.fts.logic.f2(this, null);
                f2Var.f137534a = o17.getInt(0);
                f2Var.f137535b = o17.getInt(1);
                f2Var.f137536c = o17.getLong(2);
                f2Var.f137537d = o17.getString(3);
                f2Var.f137538e = o17.getLong(4);
                arrayList.add(f2Var);
                arrayList2.add(string);
            }
            if (arrayList.size() > this.f351135n.f351147i) {
                break;
            }
        }
        o17.close();
        vVar.f351160e = new java.util.LinkedList();
        o("findUsername");
        if (arrayList2.size() > 0) {
            w13.h hVar2 = this.f137549q.f137609h;
            p13.r rVar = vVar.f351159d;
            hVar2.getClass();
            if (rVar.a()) {
                o18 = new d95.d();
            } else {
                java.lang.String f18 = rVar.f();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    stringBuffer.append("'");
                    stringBuffer.append(str);
                    stringBuffer.append("',");
                }
                java.lang.String substring = stringBuffer.substring(0, stringBuffer.length() - 1);
                o18 = ((com.tencent.mm.plugin.fts.o) hVar2.f342198f).o(java.lang.String.format("SELECT MessageCount(%d, aux_index) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index IN (%s) AND status >= 0" + hVar2.q() + ";", java.lang.Integer.valueOf(arrayList2.size()), hVar2.r(), hVar2.o(), hVar2.r(), hVar2.o(), hVar2.o(), f18, substring), null);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (o18.moveToNext()) {
                java.lang.String[] split = o18.getString(0).split(" ");
                for (int i17 = 0; i17 < split.length; i17 += 2) {
                    hashMap.put(split[i17], java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(split[i17 + 1], 0)));
                }
            }
            o18.close();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.fts.logic.f2 f2Var2 = (com.tencent.mm.plugin.fts.logic.f2) it6.next();
                p13.y yVar = new p13.y();
                yVar.f351184b = f2Var2.f137534a;
                yVar.f351185c = f2Var2.f137535b;
                yVar.f351186d = f2Var2.f137536c;
                java.lang.String str2 = f2Var2.f137537d;
                yVar.f351187e = str2;
                yVar.f351188f = f2Var2.f137538e;
                int intValue = hashMap.containsKey(str2) ? ((java.lang.Integer) hashMap.get(yVar.f351187e)).intValue() : 1;
                if (com.tencent.mm.storage.z3.C3(yVar.f351187e) || com.tencent.mm.storage.z3.o4(yVar.f351187e)) {
                    intValue = 0;
                }
                yVar.f351197o = java.lang.Integer.valueOf(intValue);
                vVar.f351160e.add(yVar);
            }
            o("findCount");
        }
        if (vVar.f351159d.f351132d.length <= 1 || vVar.f351160e.size() > 3) {
            return;
        }
        android.database.Cursor Q = ((w13.b) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(p13.r.b(vVar.f351159d.f351132d[0], true), null, o13.d.f342225k, o13.d.f342229o);
        if (Q.moveToNext()) {
            p13.y yVar2 = new p13.y();
            yVar2.f351187e = "create_talker_message\u200b";
            vVar.f351160e.add(yVar2);
        }
        Q.close();
        o("findTalkerConversation");
    }
}
