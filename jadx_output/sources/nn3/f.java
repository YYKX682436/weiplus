package nn3;

@j95.b
/* loaded from: classes8.dex */
public class f extends i95.w implements ra0.x {

    /* renamed from: s, reason: collision with root package name */
    public static com.tencent.mm.pointers.PBool f338680s;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338681d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f338682e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f338683f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f338684g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f338685h = 0L;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f338686i = 0L;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f338687m = "topstory_unknown_reddot";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f338688n = "newlife_reddot";

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f338689o = "long_video_reddot";

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f338690p = "k1k_reddot";

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f338691q = "websearch_reddot";

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f338692r;

    public f() {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f338692r = hashSet;
        hashSet.add("newlife_reddot");
        hashSet.add("ws_reddot");
        hashSet.add("long_video_reddot");
        hashSet.add("k1k_reddot");
    }

    public static java.lang.String Ai(nn3.f fVar, java.util.Map map) {
        java.util.Map map2;
        fVar.getClass();
        if (map != null && map.size() != 0) {
            try {
                if (map.containsKey("udf_kv") && (map2 = (java.util.Map) map.get("udf_kv")) != null && map2.containsKey("session_id")) {
                    java.lang.Object obj = map2.get("session_id");
                    if (obj instanceof java.lang.String) {
                        return (java.lang.String) obj;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static java.lang.Boolean wi(nn3.f fVar, java.lang.String str, java.util.Map map) {
        fVar.getClass();
        if (map == null || map.size() == 0) {
            return java.lang.Boolean.TRUE;
        }
        try {
            if (map.containsKey("udf_kv")) {
                java.util.Map map2 = (java.util.Map) map.get("udf_kv");
                java.lang.String str2 = "session_in".equals(str) ? "in_type" : "out_type";
                if (map2 != null && map2.containsKey(str2)) {
                    java.lang.Object obj = map2.get(str2);
                    java.lang.String str3 = "";
                    if (obj instanceof java.lang.Integer) {
                        str3 = java.lang.String.valueOf(obj);
                    } else if (obj instanceof java.lang.String) {
                        str3 = (java.lang.String) obj;
                    }
                    if (str3.equals("1")) {
                        return java.lang.Boolean.FALSE;
                    }
                }
            }
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.TRUE;
        }
    }

    public final int Bi(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        if (jbVar == null) {
            return 0;
        }
        if (jbVar.f1()) {
            return 1;
        }
        if (jbVar.e1()) {
            return 7;
        }
        return jbVar.Q0(false) == 9 ? 8 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map Di(java.lang.String r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn3.f.Di(java.lang.String, java.util.Map):java.util.Map");
    }

    public void Ni(java.lang.String str, java.lang.Object obj, java.util.Map map, boolean z17) {
        java.util.Map Di = Di(str, map);
        ij(str, map);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, obj, Di, 3, z17);
    }

    public final void Ri(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, int i17) {
        Ui(str, jbVar, f03Var, new java.util.HashMap(), false, i17);
    }

    public void Ui(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, java.util.HashMap hashMap, boolean z17, int i17) {
        java.lang.String str2;
        if (jbVar == null) {
            str2 = this.f338687m;
        } else if (jbVar.f1()) {
            str2 = this.f338689o;
        } else if (jbVar.e1()) {
            str2 = this.f338690p;
        } else {
            str2 = jbVar.Q0(false) == 9 ? this.f338691q : this.f338688n;
        }
        hashMap.put("view_id", str2);
        hashMap.put("tipsid", jbVar.field_tipsId);
        hashMap.put("tips_uuid", jbVar.field_tips_uuid);
        hashMap.put("ctrlinfo_business_type", java.lang.Integer.valueOf(jbVar.Q0(false)));
        hashMap.put("ctrl_type", java.lang.Integer.valueOf(jbVar.getType()));
        if (f03Var != null) {
            hashMap.put("show_path", f03Var.f373892i);
            hashMap.put("show_parent_path", f03Var.f373893m);
            hashMap.put("show_type", java.lang.Integer.valueOf(f03Var.f373887d));
            hashMap.put("message_num", java.lang.Integer.valueOf(f03Var.f373888e));
            hashMap.put("limit_expose_count", java.lang.Integer.valueOf(f03Var.f373900t));
            hashMap.put("limit_expose_strategy", java.lang.Integer.valueOf(f03Var.f373901u));
            hashMap.put("show_txt", f03Var.f373889f);
        }
        hashMap.put("object_id", pm0.v.u(jbVar.W0().getLong(0)));
        hashMap.put("ext_reportinfo", jbVar.field_ctrInfo.f388499t);
        hashMap.put("tab_tips_revoke_id", jbVar.field_revokeId);
        hashMap.put("if_in_newlife_doubleflow", java.lang.Boolean.valueOf(z17));
        hashMap.put("android_report_source", java.lang.Integer.valueOf(i17));
        java.util.Map Di = Di(str, hashMap);
        ij(str, hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(str, null, Di, Bi(jbVar), false);
    }

    public final void Vi(java.lang.String str, int i17) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(str);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(str);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(L0 != null);
        objArr[2] = java.lang.Boolean.valueOf(I0 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotClick [%s] [%b] [%b]", objArr);
        if (L0 == null || I0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewLifeReporter", "report newlife reddot click but ctrInfo or showInfo is null");
        } else {
            Ri("view_clk", L0, I0, i17);
        }
    }

    public void Zi(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, java.lang.String str, boolean z17, int i17) {
        if (jbVar == null || f03Var == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewLifeReporter", null, "report newlife reddot covered but ctrInfo or showInfo is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String str2 = jbVar.field_tipsId;
        java.util.HashSet hashSet = this.f338683f;
        if (!hashSet.contains(str2) || z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                hashMap.put("base64_cover_reddot_info", str);
            }
            Ui("red_dot_covered", jbVar, f03Var, hashMap, false, i17);
            hashSet.add(str2);
        }
    }

    public void aj(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, boolean z17, java.lang.String str, int i17) {
        if (jbVar == null || f03Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotExpose ignoreDuplicatedId:%b path:%s source:%d", java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
        java.lang.String str2 = jbVar.field_tipsId;
        java.util.HashSet hashSet = this.f338682e;
        if (!hashSet.contains(str2) || z17) {
            Ri("view_exp", jbVar, f03Var, i17);
            hashSet.add(str2);
        }
    }

    public final void bj(java.lang.String str, boolean z17, int i17) {
        aj(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(str), ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(str), z17, str, i17);
    }

    public void cj(boolean z17, boolean z18, boolean z19, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotExpose isNewLifeRedDotEntranceShow:%b isNewLifeRedDotMentionEntranceShow:%b source:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17));
        if (z17) {
            bj("NewLife.Entrance", z19, i17);
        }
        if (z18) {
            bj("NewLife.MentionEntrance", z19, i17);
            bj("NewLife.OfficialMsgEntrance", z19, i17);
            bj("K1k.MentionEntrance", z19, i17);
        }
    }

    public void fj(r45.vt2 vt2Var) {
        java.util.Iterator it = vt2Var.getList(0).iterator();
        while (it.hasNext()) {
            r45.wt2 wt2Var = (r45.wt2) it.next();
            int Bi = Bi(((c61.l7) i95.n0.c(c61.l7.class)).nk().c(wt2Var.getString(0)));
            com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotRevoked [%s]", wt2Var.getString(0));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", this.f338688n);
            hashMap.put("tab_tips_revoke_id", wt2Var.getString(0));
            java.util.Map Di = Di("red_dot_revoked", hashMap);
            ij("red_dot_revoked", hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("red_dot_revoked", null, Di, Bi, false);
        }
    }

    public void hj(int i17, java.lang.String str, boolean z17) {
        java.util.HashSet hashSet = this.f338682e;
        if (!hashSet.contains(str) || z17) {
            hashSet.add(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "ws_reddot");
            hashMap.put("tipsid", str);
            hashMap.put("show_path", "wesee");
            hashMap.put("message_num", java.lang.Integer.valueOf(i17));
            Ni("view_exp", null, hashMap, false);
        }
    }

    public final void ij(java.lang.String str, java.util.Map map) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if ("view_clk".equals(str)) {
            java.lang.String str2 = (java.lang.String) map.get("view_id");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !((java.util.HashSet) this.f338692r).contains(str2)) {
                return;
            }
            java.lang.String str3 = (java.lang.String) map.get("show_path");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return;
            }
            java.lang.String replaceAll = str3.replaceAll("\\.", "_");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("tipsid", map.get("tipsid"));
                jSONObject.put("ext_reportinfo", map.get("ext_reportinfo"));
                jSONObject.put("object_id", map.get("object_id"));
                jSONObject.put("message_num", map.get("message_num"));
                jSONObject.put("ctrl_type", map.get("ctrl_type"));
                jSONObject.put("show_type", map.get("show_type"));
                java.lang.String trim = jSONObject.toString().trim();
                java.lang.String encodeToString = android.util.Base64.encodeToString(trim.getBytes(java.nio.charset.StandardCharsets.UTF_8), 2);
                this.f338681d.put(java.lang.String.format("%s_%s", "newlife_publish", replaceAll), encodeToString);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "setNewLifeRedDotParams [%d] [%s] [%s] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), replaceAll, encodeToString, trim);
            } catch (org.json.JSONException | java.lang.Exception unused) {
            }
        }
    }
}
