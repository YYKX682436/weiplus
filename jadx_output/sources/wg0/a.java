package wg0;

/* loaded from: classes8.dex */
public final class a implements tg0.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f445708a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f445709b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, java.util.Map map) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (jbVar == null) {
            hashMap = null;
        } else {
            hashMap = new java.util.HashMap();
            hashMap.put("view_id", "websearch_reddot");
            hashMap.put("tipsid", jbVar.field_tipsId);
            hashMap.put("ctrl_type", java.lang.Integer.valueOf(jbVar.getType()));
            hashMap.put("object_id", pm0.v.u(jbVar.W0().getLong(0)));
            java.lang.String str4 = jbVar.field_ctrInfo.f388499t;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("ext_reportinfo", str4);
        }
        if (hashMap != null) {
            if (!(!hashMap.isEmpty())) {
                hashMap = null;
            }
            if (hashMap != null) {
                hashMap3.putAll(hashMap);
            }
        }
        if (f03Var == null) {
            hashMap2 = null;
        } else {
            hashMap2 = new java.util.HashMap();
            java.lang.String str5 = f03Var.f373892i;
            if (str5 == null) {
                str5 = "";
            }
            hashMap2.put("show_path", str5);
            java.lang.String str6 = f03Var.f373893m;
            hashMap2.put("show_parent_path", str6 != null ? str6 : "");
            hashMap2.put("show_type", java.lang.Integer.valueOf(f03Var.f373887d));
            hashMap2.put("message_num", java.lang.Integer.valueOf(f03Var.f373888e));
            hashMap2.put("limit_expose_count", java.lang.Integer.valueOf(f03Var.f373900t));
            hashMap2.put("limit_expose_strategy", java.lang.Integer.valueOf(f03Var.f373901u));
        }
        if (hashMap2 != null) {
            if (!(!hashMap2.isEmpty())) {
                hashMap2 = null;
            }
            if (hashMap2 != null) {
                hashMap3.putAll(hashMap2);
            }
        }
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("Search.Entrance");
        if (L0 != null && (str3 = L0.field_tipsId) != null) {
            hashMap4.put("current_entrance_path_id", str3);
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = nk6.L0("Search.MentionEntrance");
        if (L02 != null && (str2 = L02.field_tipsId) != null) {
            hashMap4.put("current_mention_path_id", str2);
        }
        if (!(!hashMap4.isEmpty())) {
            hashMap4 = null;
        }
        if (hashMap4 != null) {
            hashMap3.putAll(hashMap4);
        }
        if (map != null) {
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                hashMap3.putAll(map);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, hashMap3, 8, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportEvent, eventId: ");
        sb6.append(str);
        sb6.append(", path: ");
        sb6.append(f03Var != null ? f03Var.f373892i : null);
        sb6.append(", ctrInfo: ");
        sb6.append(jbVar);
        sb6.append(", showInfo: ");
        sb6.append(f03Var);
        sb6.append(", reportParams: ");
        sb6.append(hashMap3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotReporter", sb6.toString());
    }

    public void b(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        java.lang.String str = f03Var != null ? f03Var.f373892i : null;
        java.lang.String str2 = jbVar != null ? jbVar.field_tipsId : null;
        if (jbVar == null || f03Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchRedDotReporter", "reportExpose, invalid params, path: " + str + ", ctrInfo: " + jbVar + ", showInfo: " + f03Var);
            return;
        }
        java.util.Map map = this.f445708a;
        java.lang.String str3 = str != null ? (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(str) : null;
        if (str3 == null || !kotlin.jvm.internal.o.b(str3, jbVar.field_tipsId)) {
            if (str != null && str2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, str2);
            }
            a("view_exp", jbVar, f03Var, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotReporter", "reportExpose, duplicated, path: " + str + " ctrInfo: " + jbVar + ", showInfo: " + f03Var);
    }

    public void c(r45.vt2 vt2Var) {
        if (vt2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearchRedDotReporter", "reportExpired, invalid params, revokeTabTips is null");
            return;
        }
        java.util.LinkedList list = vt2Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getRevoke_tab_tips_info(...)");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((r45.wt2) it.next()).getString(0);
            if (string != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tab_tips_revoke_id", string);
                a("red_dot_revoked", null, null, hashMap);
            }
        }
    }
}
