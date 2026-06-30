package em4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a */
    public static final em4.c f255213a = new em4.c();

    /* renamed from: b */
    public static final java.util.Map f255214b = new java.util.concurrent.ConcurrentHashMap();

    public static final java.util.Map a(r45.vs2 ctrInfo, r45.f03 f03Var, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
        jbVar.t0(ctrInfo);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (!(str == null || str.length() == 0)) {
            linkedHashMap.put("view_id", str);
        }
        linkedHashMap.put("ctrlinfo_business_type", 10);
        java.lang.String str5 = jbVar.field_tipsId;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("tipsid", str5);
        java.lang.String str6 = jbVar.field_tips_uuid;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("tips_uuid", str6);
        linkedHashMap.put("ctrl_type", java.lang.Integer.valueOf(jbVar.getType()));
        if (f03Var == null || (str2 = f03Var.f373892i) == null) {
            str2 = "";
        }
        linkedHashMap.put("show_path", str2);
        if (f03Var == null || (str3 = f03Var.f373893m) == null) {
            str3 = "";
        }
        linkedHashMap.put("show_parent_path", str3);
        linkedHashMap.put("show_type", java.lang.Integer.valueOf(f03Var != null ? f03Var.f373887d : 0));
        linkedHashMap.put("message_num", java.lang.Integer.valueOf(f03Var != null ? f03Var.f373888e : 0));
        linkedHashMap.put("limit_expose_count", java.lang.Integer.valueOf(f03Var != null ? f03Var.f373900t : 0));
        linkedHashMap.put("limit_expose_strategy", java.lang.Integer.valueOf(f03Var != null ? f03Var.f373901u : 0));
        if (f03Var == null || (str4 = f03Var.f373889f) == null) {
            str4 = "";
        }
        linkedHashMap.put("show_txt", str4);
        linkedHashMap.put("object_id", pm0.v.u(jbVar.W0().getLong(0)));
        java.lang.String str7 = jbVar.field_ctrInfo.f388499t;
        linkedHashMap.put("ext_reportinfo", str7 != null ? str7 : "");
        return linkedHashMap;
    }

    public static /* synthetic */ java.util.Map b(r45.vs2 vs2Var, r45.f03 f03Var, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = "tyt_reddot";
        }
        return a(vs2Var, f03Var, str);
    }

    public static final void d(java.lang.String str, java.util.Map map) {
        java.util.Objects.toString(ri.l0.a(map));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, map, 9, false);
    }

    public final boolean c(java.lang.String str) {
        return kotlin.jvm.internal.o.b(str, "Listen.Entrance") || kotlin.jvm.internal.o.b(str, "Listen.MentionEntrance");
    }
}
