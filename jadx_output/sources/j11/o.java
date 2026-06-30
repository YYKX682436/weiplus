package j11;

/* loaded from: classes11.dex */
public class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j11.h f297139d;

    public o(j11.h hVar) {
        this.f297139d = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        boolean z17;
        java.lang.String str;
        int i18;
        boolean z18;
        java.lang.String str2;
        j11.h hVar = this.f297139d;
        int i19 = 0;
        if (((java.util.ArrayList) hVar.f297116e).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , wait doscene!");
            return false;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i27 = hVar.f297112a ? 5 : 15;
        java.util.ArrayList arrayList = new java.util.ArrayList(i27 * 2);
        int i28 = 0;
        while (i28 < i27) {
            java.util.List list = hVar.f297116e;
            j11.p pVar = (j11.p) ((java.util.ArrayList) list).get(i19);
            if (pVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , break and wait doscene!");
            } else {
                r45.od3 od3Var = pVar.f297140a;
                java.util.LinkedList linkedList = od3Var.f382164e;
                java.util.LinkedList linkedList2 = od3Var.f382165f;
                java.util.LinkedList linkedList3 = od3Var.f382167h;
                if (linkedList3 != null && linkedList3.size() > 0) {
                    java.util.Iterator it = linkedList3.iterator();
                    while (it.hasNext()) {
                        r45.gz5 gz5Var = (r45.gz5) it.next();
                        if (gz5Var != null) {
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r0(gz5Var.f375672d, gz5Var.f375673e);
                        }
                    }
                }
                int i29 = pVar.f297141b;
                if (linkedList2.size() != linkedList.size()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "find warn %s %s", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(linkedList.size()));
                }
                int min = java.lang.Math.min(linkedList2.size(), linkedList.size());
                if (min <= i29) {
                    j11.h.n(list);
                    if (((java.util.ArrayList) list).isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is empty break", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(min));
                        hVar.f297117f = 0L;
                        hVar.f297119h.c(0L, 0L);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is not empty continue next", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(min));
                        i18 = 0;
                    }
                } else {
                    r45.tn4 tn4Var = (r45.tn4) linkedList.get(i29);
                    int intValue = ((java.lang.Integer) linkedList2.get(i29)).intValue();
                    java.lang.String g17 = x51.j1.g(tn4Var.f386589d);
                    if (g17 == null) {
                        g17 = "";
                    }
                    java.lang.String str3 = tn4Var.f386586J;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = tn4Var.Z;
                    if (str4 == null) {
                        str4 = "";
                    }
                    boolean F3 = com.tencent.mm.storage.z3.F3(g17);
                    arrayList.add(g17);
                    arrayList.add(str3);
                    arrayList.add(str4);
                    str = "";
                    if (intValue == -477) {
                        i18 = 0;
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetContactService", "respHandler getFailed USERNAME_INVAILD :%d ErrName: %s %s %s %s %s", java.lang.Integer.valueOf(intValue), g17, str3, java.lang.Boolean.valueOf(j11.q.Ai().m0(g17)), java.lang.Boolean.valueOf(j11.q.Ai().m0(str3)), java.lang.Boolean.valueOf(c01.v1.O(g17)));
                        jx3.f.INSTANCE.idkeyStat(832L, 1L, 1L, false);
                        if (F3) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 6);
                        }
                        z18 = false;
                    } else if (intValue != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetContactService", "respHandler getFailed :%d ErrName: %s %s %s", java.lang.Integer.valueOf(intValue), g17, str3, java.lang.Boolean.valueOf(c01.v1.O(g17)));
                        jx3.f.INSTANCE.idkeyStat(832L, 2L, 1L, false);
                        if (F3) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 6);
                        }
                        z18 = false;
                        i18 = 0;
                    } else {
                        java.util.LinkedList linkedList4 = pVar.f297140a.f382166g;
                        if (linkedList4 == null || linkedList4.size() <= i29 || !g17.equals(((r45.oy6) pVar.f297140a.f382166g.get(i29)).f382620d)) {
                            java.lang.Object[] objArr = new java.lang.Object[3];
                            java.util.LinkedList linkedList5 = pVar.f297140a.f382166g;
                            i18 = 0;
                            objArr[0] = linkedList5 == null ? "null" : java.lang.Integer.valueOf(linkedList5.size());
                            objArr[1] = java.lang.Integer.valueOf(i29);
                            objArr[2] = g17;
                            com.tencent.mars.xlog.Log.w("MicroMsg.GetContactService", "get antispamticket from resp failed: list:%s idx:%d  user:%s", objArr);
                            str2 = str;
                        } else {
                            java.lang.String str5 = ((r45.oy6) pVar.f297140a.f382166g.get(i29)).f382621e;
                            str2 = str5 != null ? str5 : "";
                            i18 = 0;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "dkverify respHandler mod contact: %s %s %s %s", g17, str3, str2, java.lang.Integer.valueOf(pVar.f297142c));
                        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                        int i37 = pVar.f297142c;
                        ((com.tencent.mm.app.o7) wi6).getClass();
                        ((com.tencent.mm.plugin.messenger.foundation.d0) ((vg3.r3) i95.n0.c(vg3.r3.class))).getClass();
                        com.tencent.mm.plugin.messenger.foundation.v.b(tn4Var, str2, null, true, false, i37);
                        jx3.f.INSTANCE.idkeyStat(832L, 0L, 1L, false);
                        if (F3) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 10);
                        }
                        z18 = true;
                    }
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new j11.n(this, g17, str3, z18));
                    pVar.f297141b++;
                }
                i28++;
                i19 = i18;
            }
            z17 = false;
            i17 = 0;
            break;
        }
        i17 = i19;
        z17 = true;
        int size = arrayList.size();
        if (size > 0) {
            long F = c01.d9.b().s().F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            j11.g Ai = j11.q.Ai();
            for (int i38 = i17; i38 < size; i38++) {
                Ai.m0((java.lang.String) arrayList.get(i38));
            }
            c01.d9.b().s().w(java.lang.Long.valueOf(F));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetContactService", "tryStartNetscene respHandler onTimerExpired netSceneRunning : " + hVar.f297112a + " ret: " + z17 + " maxCnt: " + i27 + " deleteCount: " + size + " take: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return z17;
    }
}
