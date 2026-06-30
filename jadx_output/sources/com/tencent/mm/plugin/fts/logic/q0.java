package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class q0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137652q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.fts.logic.l lVar, p13.u uVar) {
        super(uVar);
        this.f137652q = lVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchChatroomMemberTask";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0161. Please report as an issue. */
    @Override // p13.t
    public void p(p13.v vVar) {
        java.lang.String string;
        vVar.f351159d = p13.r.b(this.f351135n.f351141c, true);
        vVar.f351160e = new java.util.ArrayList();
        w13.b bVar = this.f137652q.f137588g;
        java.lang.String str = this.f351135n.f351142d;
        p13.r rVar = vVar.f351159d;
        bVar.getClass();
        android.database.Cursor dVar = rVar.a() ? new d95.d() : ((com.tencent.mm.plugin.fts.o) bVar.f342198f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMChatroomMember(%s) AS Offsets FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 AND subtype = 38 AND aux_index = ? ;", bVar.r(), bVar.o(), bVar.o(), bVar.r(), bVar.r(), bVar.o(), bVar.o(), rVar.f()), new java.lang.String[]{str});
        if (dVar.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(dVar);
            zVar.a();
            vVar.f351160e.add(zVar);
        }
        dVar.close();
        android.database.Cursor f17 = gm0.j1.u().f273153f.f("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new java.lang.String[]{this.f351135n.f351142d}, 2);
        java.lang.String[] strArr = null;
        if (f17.moveToFirst() && (string = f17.getString(0)) != null) {
            strArr = o13.c.f342208a.split(string);
        }
        f17.close();
        java.util.HashSet hashSet = new java.util.HashSet(this.f351135n.f351148j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Arrays.sort(strArr, new com.tencent.mm.plugin.fts.logic.o0(this, (o13.z) i95.n0.c(o13.z.class)));
        if (strArr == null || vVar.f351160e.isEmpty() || ((p13.y) vVar.f351160e.get(0)).f351196n == null) {
            return;
        }
        for (p13.l lVar : ((p13.y) vVar.f351160e.get(0)).f351196n) {
            int i17 = lVar.f351110a;
            if (i17 < strArr.length) {
                java.lang.String str2 = strArr[i17];
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    lVar.f351114e = str2;
                    com.tencent.mm.storage.z3 e07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e0(str2);
                    if (e07 == null) {
                        e07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str2);
                    }
                    if (e07 != null && (this.f351135n.f351149k.isEmpty() || this.f351135n.f351149k.contains(str2))) {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String d17 = e07.d1();
                        java.lang.String str3 = this.f351135n.f351142d;
                        ((sg3.a) v0Var).getClass();
                        java.lang.String f18 = c01.a2.f(d17, str3);
                        switch (lVar.f351111b) {
                            case 31:
                                lVar.f351119j = true;
                            case 30:
                                lVar.f351118i = true;
                            case 29:
                                lVar.f351115f = f18;
                                break;
                            case 32:
                                lVar.f351115f = e07.f236589y1;
                                lVar.f351116g = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492943id2);
                                break;
                            case 33:
                                lVar.f351115f = lVar.f351112c;
                                lVar.f351116g = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ict);
                                lVar.f351115f = lVar.f351112c;
                                break;
                            case 36:
                                lVar.f351119j = true;
                            case 35:
                                lVar.f351118i = true;
                            case 34:
                                lVar.f351115f = e07.P0();
                                if (!e07.P0().equals(f18)) {
                                    lVar.f351116g = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.icz);
                                    break;
                                }
                                break;
                            case 37:
                                lVar.f351115f = o13.n.f(str2, e07.t0());
                                lVar.f351116g = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.icz);
                                break;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(lVar.f351115f)) {
                            if (lVar.f351115f.contains(vVar.f351159d.f351129a)) {
                                lVar.f351117h += 10;
                            }
                            if (hashSet.add(str2)) {
                                arrayList.add(lVar);
                            }
                        }
                    }
                }
            }
        }
        java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.fts.logic.p0(this));
        ((p13.y) vVar.f351160e.get(0)).f351196n = arrayList;
    }
}
