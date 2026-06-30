package is;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements js.r0, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public js.p0 f294329d;

    public void Ai(java.lang.String username) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "clearNoPwdInfo：username[%s]", username);
        android.content.SharedPreferences sharedPreferences = c01.uc.f37514c.f37516a;
        try {
            if (sharedPreferences.contains(username)) {
                java.lang.String string = sharedPreferences.getString(username, "");
                jSONObject = !com.tencent.mm.sdk.platformtools.t8.K0(string) ? new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 0))) : new org.json.JSONObject();
            } else {
                jSONObject = new org.json.JSONObject();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0("last_logout_no_pwd_ticket_for_one_click") || !jSONObject.has("last_logout_no_pwd_ticket_for_one_click")) {
                return;
            }
            jSONObject.remove("last_logout_no_pwd_ticket_for_one_click");
            com.tencent.mars.xlog.Log.i("MicroMsg.SwitchAccountInfo", "delete key %s, jsonStr %s", "last_logout_no_pwd_ticket_for_one_click", jSONObject.toString());
            sharedPreferences.edit().putString(username, android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 0)).commit();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SwitchAccountInfo", "save account info %s about %s failed, error: %s", "last_logout_no_pwd_ticket_for_one_click", username, e17.getMessage());
        }
    }

    public void Bi(js.a type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.sdk.platformtools.o4 Ui = Ui();
        if (Ui != null) {
            Ui.A(Ni(type), Ui.o(Ni(type), 0) + 1);
        }
    }

    public long Di(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "getLoginTypeCfg：curUserName[%s]", username);
        java.lang.String c17 = c01.uc.f37514c.c(username, "last_login_type_exp");
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return 0L;
        }
        kotlin.jvm.internal.o.d(c17);
        return java.lang.Long.parseLong(c17);
    }

    public final java.lang.String Ni(js.a aVar) {
        int ordinal = aVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? "" : "key_logout_fingerprint_entry_show_times" : "key_logout_no_pwd_entry_show_times";
    }

    public boolean Ri() {
        java.lang.String r17 = c01.z1.r();
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "getNoPwdPermissionStatus， curUserName[%s]", r17);
        return kotlin.jvm.internal.o.b(c01.uc.f37514c.c(r17, "last_logout_no_pwd_permission_status"), "1");
    }

    public final com.tencent.mm.sdk.platformtools.o4 Ui() {
        return com.tencent.mm.sdk.platformtools.o4.M("account_" + gm0.m.i() + "_login_mmkv");
    }

    public boolean Vi(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        long Di = Di(username);
        ls.k[] kVarArr = ls.k.f320780d;
        boolean z17 = (Di & 16) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "isFastSwitchDynamicConfigEnable [%b]", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean Zi(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        long Di = Di(username);
        ls.k[] kVarArr = ls.k.f320780d;
        return (Di & 8) != 0;
    }

    public boolean aj(js.a type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.sdk.platformtools.o4 Ui = Ui();
        return Ui != null && Ui.o(Ni(type), 0) < 3;
    }

    public boolean bj(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        long Di = Di(username);
        ls.k[] kVarArr = ls.k.f320780d;
        return (Di & 2) != 0;
    }

    public boolean cj() {
        return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("TrustedFriendFuncEntry"), 0) != 0;
    }

    public void fj(de0.f fVar, java.lang.String saveKey, boolean z17) {
        kotlin.jvm.internal.o.g(saveKey, "saveKey");
        if (z17) {
            boolean Ri = Ri();
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "saveLastNoPwdTicket judgePermission[%b]", java.lang.Boolean.valueOf(Ri));
            if (!Ri) {
                return;
            }
        }
        java.lang.String str = fVar != null ? ((r45.kd4) ((com.tencent.mm.modelsimple.r0) fVar).f71402e.f70711b.f70700a).f378600d : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "no pwd ticket is null!");
        }
        java.lang.String r17 = c01.z1.r();
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "logout return username[%s]", r17);
        c01.uc.f37514c.h(r17, saveKey, str);
    }

    public void hj(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        c01.uc.f37514c.h(username, "last_logout_fingerprint_permission_status", z17 ? "1" : "0");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        js.p0 p0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "onSceneEnd errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (m1Var == null || m1Var.getType() != 145) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            js.p0 p0Var2 = this.f294329d;
            if (p0Var2 != null) {
                ((com.tencent.mm.plugin.account.ui.v6) p0Var2).a(null, null);
                return;
            }
            return;
        }
        if (!(m1Var instanceof h11.e) || (p0Var = this.f294329d) == null) {
            return;
        }
        h11.e eVar = (h11.e) m1Var;
        ((com.tencent.mm.plugin.account.ui.v6) p0Var).a(((h11.d) eVar.f278071d).f278069b.f342925a.f373513h, eVar.P());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object wi(android.content.Context r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is.f.wi(android.content.Context, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
