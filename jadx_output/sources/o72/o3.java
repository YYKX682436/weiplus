package o72;

/* loaded from: classes4.dex */
public abstract class o3 {
    public static void a(o72.r2 r2Var) {
        r45.gp0 gp0Var;
        r45.jp0 jp0Var;
        java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
        if (linkedList == null || linkedList.isEmpty() || (jp0Var = (gp0Var = (r45.gp0) r2Var.field_favProto.f370964f.getFirst()).O1) == null) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", jp0Var.f378005n + ",");
        xVar.a("21uxinfo", jp0Var.f378004m + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(r2Var.field_type == 16 ? 1 : 2);
        sb7.append(",");
        xVar.a("23source_type", sb7.toString());
        xVar.a("24scene", "5,");
        xVar.a("25scene_chatname", ",");
        xVar.a("26scene_username", r2Var.field_fromUser + ",");
        xVar.a("27curr_publishid", ",");
        xVar.a("28curr_msgid", "0,");
        xVar.a("29curr_favid", r2Var.field_id + ",");
        xVar.a("30isdownload", "0,");
        xVar.a("31chatroom_membercount", "0,");
        p94.o0 o0Var = (p94.o0) i95.n0.c(p94.o0.class);
        java.lang.String str = gp0Var.R1;
        ((n34.p4) o0Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.plugin.sns.SnsStatService");
        com.tencent.mm.modelstat.k0.b(str, xVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.plugin.sns.SnsStatService");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVideoStatistic", "report snsad_video_exposure: " + xVar.c());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12989, xVar);
    }

    public static void b(o72.k3 k3Var, o72.r2 r2Var) {
        r45.jp0 jp0Var;
        java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
        if (linkedList == null || linkedList.isEmpty() || (jp0Var = ((r45.gp0) r2Var.field_favProto.f370964f.getFirst()).O1) == null) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", jp0Var.f378005n + ",");
        xVar.a("21uxinfo", jp0Var.f378004m + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(r2Var.field_type == 16 ? 1 : 2);
        sb7.append(",");
        xVar.a("24source_type", sb7.toString());
        xVar.a("25scene", "5,");
        xVar.a("26action_type", k3Var.f343390d + ",");
        xVar.a("27scene_chatname", ",");
        xVar.a("28scene_username", r2Var.field_fromUser + ",");
        xVar.a("29curr_publishid", ",");
        xVar.a("30curr_msgid", "0,");
        xVar.a("31curr_favid", r2Var.field_id + ",");
        xVar.a("32elapsed_time", "0,");
        xVar.a("33load_time", "0,");
        xVar.a("34is_load_complete", "0,");
        xVar.a("35destination", "0,");
        xVar.a("36chatroom_membercount", "0,");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVideoStatistic", "report snsad_video_action: " + xVar.c());
        ((p34.p) ((p94.f0) i95.n0.c(p94.f0.class))).Ai(12990, xVar);
    }

    public static void c(o72.m3 m3Var, o72.r2 r2Var, o72.n3 n3Var, int i17) {
        r45.jp0 jp0Var;
        java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
        if (linkedList == null || linkedList.isEmpty() || (jp0Var = ((r45.gp0) r2Var.field_favProto.f370964f.getFirst()).O1) == null) {
            return;
        }
        m21.x xVar = new m21.x();
        xVar.a("20source_publishid", jp0Var.f378005n + ",");
        xVar.a("21uxinfo", jp0Var.f378004m + ",");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",");
        xVar.a("22clienttime", sb6.toString());
        xVar.a("23video_statu", n3Var.f343423d + ",");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(r2Var.field_type == 16 ? 1 : 2);
        sb7.append(",");
        xVar.a("24source_type", sb7.toString());
        xVar.a("25scene", "5,");
        xVar.a("26action_type", m3Var.f343417d + ",");
        xVar.a("27scene_chatname", ",");
        xVar.a("28scene_username", r2Var.field_fromUser + ",");
        xVar.a("29curr_publishid", ",");
        xVar.a("30curr_msgid", "0,");
        xVar.a("31curr_favid", r2Var.field_id + ",");
        xVar.a("32chatroom_membercount", "0,");
        xVar.a("33chatroom_toMemberCount", i17 + ",");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("report snsad_video_spread: ");
        sb8.append(xVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavVideoStatistic", sb8.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12991, xVar);
    }
}
