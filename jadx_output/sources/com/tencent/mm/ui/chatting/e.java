package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public abstract class e {
    public static void a(com.tencent.mm.ui.chatting.a aVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        java.lang.String Q0 = f9Var.Q0();
        boolean R4 = com.tencent.mm.storage.z3.R4(Q0);
        java.lang.String r17 = f9Var.A0() == 1 ? c01.z1.r() : R4 ? c01.w9.s(f9Var.j()) : Q0;
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", str + ",");
        xVar.a("21uxinfo", str2 + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(f9Var.getType() != 62 ? 2 : 1);
        sb7.append(",");
        xVar.a("24source_type", sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(R4 ? 4 : 3);
        sb8.append(",");
        xVar.a("25scene", sb8.toString());
        xVar.a("26action_type", aVar.f198355d + ",");
        xVar.a("27scene_chatname", Q0 + ",");
        xVar.a("28scene_username", r17 + ",");
        xVar.a("29curr_publishid", ",");
        xVar.a("30curr_msgid", f9Var.I0() + ",");
        xVar.a("31curr_favid", "0,");
        xVar.a("32elapsed_time", "0,");
        xVar.a("33load_time", "0,");
        xVar.a("34is_load_complete", "0,");
        xVar.a("35destination", "0,");
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(Q0) : 0);
        sb9.append(",");
        xVar.a("36chatroom_membercount", sb9.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.AdVideoStatistic", "report snsad_video_action: " + xVar.c());
        ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Ai(12990, xVar);
    }

    public static boolean b(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pointers.PString pString, com.tencent.mm.pointers.PString pString2) {
        r45.uf6 uf6Var;
        if (f9Var.getType() == 62) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (h17 == null || (uf6Var = h17.E) == null || com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387339m)) {
                return false;
            }
            pString.value = uf6Var.f387340n;
            pString2.value = uf6Var.f387339m;
            return true;
        }
        if (f9Var.getType() == 49) {
            boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
            java.lang.String j17 = f9Var.j();
            if (R4 && f9Var.j() != null && f9Var.A0() == 0) {
                j17 = c01.w9.u(f9Var.j());
            }
            ot0.q v17 = ot0.q.v(j17);
            if (v17 != null && v17.f348666i == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(v17.f348637a2)) {
                pString.value = v17.f348665h2;
                pString2.value = v17.f348661g2;
                return true;
            }
        }
        return false;
    }

    public static void c(com.tencent.mm.ui.chatting.c cVar, com.tencent.mm.ui.chatting.d dVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
        if (b(f9Var, pString, pString2)) {
            java.lang.String str = pString.value;
            java.lang.String str2 = pString2.value;
            java.lang.String Q0 = f9Var.Q0();
            boolean R4 = com.tencent.mm.storage.z3.R4(Q0);
            java.lang.String r17 = f9Var.A0() == 1 ? c01.z1.r() : R4 ? c01.w9.s(f9Var.j()) : Q0;
            m21.x xVar = new m21.x();
            xVar.a("20source_publishid", str + ",");
            xVar.a("21uxinfo", str2 + ",");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(",");
            xVar.a("22clienttime", sb6.toString());
            xVar.a("23video_statu", dVar.f200408d + ",");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(f9Var.getType() != 62 ? 2 : 1);
            sb7.append(",");
            xVar.a("24source_type", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(R4 ? 4 : 3);
            sb8.append(",");
            xVar.a("25scene", sb8.toString());
            xVar.a("26action_type", cVar.f198509d + ",");
            xVar.a("27scene_chatname", Q0 + ",");
            xVar.a("28scene_username", r17 + ",");
            xVar.a("29curr_publishid", ",");
            xVar.a("30curr_msgid", f9Var.I0() + ",");
            xVar.a("31curr_favid", "0,");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(Q0) : 0);
            sb9.append(",");
            xVar.a("32chatroom_membercount", sb9.toString());
            xVar.a("33chatroom_toMemberCount", i17 + ",");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("report snsad_video_spread: ");
            sb10.append(xVar.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.AdVideoStatistic", sb10.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12991, xVar);
        }
    }
}
