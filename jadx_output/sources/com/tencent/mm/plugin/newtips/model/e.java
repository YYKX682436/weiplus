package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public class e {
    public static java.util.List b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && !list.isEmpty()) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.newtips.model.k kVar = (com.tencent.mm.plugin.newtips.model.k) it.next();
                if (c(kVar) && (com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_lang) || kVar.field_lang.toLowerCase().contains(com.tencent.mm.sdk.platformtools.m2.d().toLowerCase()))) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.field_regCountry) || (!com.tencent.mm.sdk.platformtools.t8.K0(str) && kVar.field_regCountry.toLowerCase().contains(str.toLowerCase()))) {
                        arrayList.add(kVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean c(com.tencent.mm.plugin.newtips.model.k kVar) {
        if (kVar == null) {
            return false;
        }
        com.tencent.mm.plugin.newtips.model.j a17 = com.tencent.mm.plugin.newtips.model.f.a(kVar.field_tipId);
        int i17 = kVar.field_path;
        if (com.tencent.mm.plugin.newtips.model.f.f152374c == null) {
            com.tencent.mm.plugin.newtips.model.f.f152374c = new com.tencent.mm.plugin.newtips.model.f();
        }
        com.tencent.mm.plugin.newtips.model.f.f152374c.getClass();
        com.tencent.mm.plugin.newtips.model.q qVar = (com.tencent.mm.plugin.newtips.model.q) ((java.util.HashMap) com.tencent.mm.plugin.newtips.model.f.f152373b).get(java.lang.Integer.valueOf(i17));
        if (qVar == null) {
            qVar = (i17 == 46 || i17 == 59) ? new tn3.d() : null;
            if (qVar != null) {
                ((java.util.HashMap) com.tencent.mm.plugin.newtips.model.f.f152373b).put(java.lang.Integer.valueOf(i17), qVar);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsFilterPool", "Invalid pathId:%s", java.lang.Integer.valueOf(i17));
            }
        }
        if (a17 == null && qVar == null) {
            return true;
        }
        return (a17 == null || qVar == null) ? a17 != null ? a17.b(kVar) : qVar.a(kVar) : a17.b(kVar) && qVar.a(kVar);
    }

    public boolean a(com.tencent.mm.plugin.newtips.model.d dVar) {
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsManager", "can not show new  tips！！ tipsInfo is null !!");
            return false;
        }
        if (dVar.field_isExit && !dVar.field_hadRead && f(dVar)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTipsManager", "can not show tips, isExit:%s, hadRead:%s, timeEffective:%s", java.lang.Boolean.valueOf(dVar.field_isExit), java.lang.Boolean.valueOf(dVar.field_hadRead), java.lang.Boolean.valueOf(f(dVar)));
        return false;
    }

    public boolean d(com.tencent.mm.plugin.newtips.model.d dVar) {
        r45.rm6 rm6Var;
        r45.rm6 rm6Var2;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsManager", "check path, tipsInfo is null!!!");
            return false;
        }
        com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(dVar.field_tipId);
        if (y07 != null && (rm6Var = y07.field_tipsShowInfo) != null && (rm6Var2 = dVar.field_tipsShowInfo) != null) {
            java.lang.String str = rm6Var.f385020g;
            java.lang.String str2 = rm6Var2.f385020g;
            if (str == null && str2 == null) {
                return true;
            }
            if (str != null && str.equals(str2)) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTipsManager", "path illegal, localPath:%s, newPath:%s", str, str2);
        }
        return false;
    }

    public boolean e(int i17) {
        java.lang.String str;
        long j17;
        int i18;
        r45.rm6 rm6Var;
        com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsManager", "showDot, newTipsInfo is null !!");
            return false;
        }
        if (a(rn3.i.wi().y0(i17)) && (rm6Var = y07.field_tipsShowInfo) != null && rm6Var.f385017d == 0) {
            java.lang.String format = java.lang.String.format("newtips_show_%d-%d", java.lang.Integer.valueOf(y07.field_tipId), java.lang.Integer.valueOf(y07.field_tipVersion));
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getBoolean(format, false)) {
                return true;
            }
            int i19 = y07.field_tipId;
            int i27 = y07.field_tipVersion;
            int i28 = y07.field_tipType;
            long j18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).edit().putLong("newtips_realshow_time", currentTimeMillis).commit();
            r45.rm6 rm6Var2 = y07.field_tipsShowInfo;
            int i29 = rm6Var2 != null ? rm6Var2.f385017d : 0;
            java.lang.String str2 = rm6Var2 != null ? rm6Var2.f385018e : "";
            java.lang.String str3 = rm6Var2 != null ? rm6Var2.f385019f : "";
            java.lang.String str4 = rm6Var2 != null ? rm6Var2.f385020g : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTipsManager", "newtipsreport:%d", 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(j18), "", "", "", java.lang.Long.valueOf(currentTimeMillis), "", "", "", java.lang.Integer.valueOf(i29), str2, str3, str4, "", 1, "");
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).edit().putBoolean(format, true).commit();
            return true;
        }
        java.lang.String format2 = java.lang.String.format("newtips_dismiss_%d-%d", java.lang.Integer.valueOf(y07.field_tipId), java.lang.Integer.valueOf(y07.field_tipVersion));
        if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getBoolean(format2, false)) {
            return false;
        }
        int i37 = y07.field_tipId;
        int i38 = y07.field_tipVersion;
        int i39 = y07.field_tipType;
        long j19 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
        long j27 = y07.field_beginShowTime;
        long j28 = y07.field_overdueTime;
        long j29 = y07.field_disappearTime;
        long j37 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_realshow_time", 0L);
        long j38 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).getLong("newtips_makeread_time", 0L);
        long j39 = j38 - j37;
        long i110 = com.tencent.mm.sdk.platformtools.t8.i1();
        if (!d(y07) || !g(y07)) {
            str = "_newtips_report";
            j17 = j28;
            i18 = 1;
        } else if (y07.field_hadRead) {
            i18 = 4;
            str = "_newtips_report";
            j17 = j28;
        } else {
            long j47 = y07.field_disappearTime;
            if (j47 == 0 || i110 <= j47) {
                j17 = j28;
                long j48 = y07.field_overdueTime;
                if (j48 != 0) {
                    str = "_newtips_report";
                    long j49 = y07.field_beginShowTime + j48;
                    if (j49 <= j47 && i110 > j49) {
                        i18 = 2;
                    }
                } else {
                    str = "_newtips_report";
                }
                i18 = 0;
            } else {
                i18 = 3;
                j17 = j28;
                str = "_newtips_report";
            }
        }
        r45.rm6 rm6Var3 = y07.field_tipsShowInfo;
        int i47 = rm6Var3 != null ? rm6Var3.f385017d : 0;
        java.lang.String str5 = rm6Var3 != null ? rm6Var3.f385018e : "";
        java.lang.String str6 = rm6Var3 != null ? rm6Var3.f385019f : "";
        java.lang.String str7 = rm6Var3 != null ? rm6Var3.f385020g : "";
        long j57 = y07.field_pagestaytime;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTipsManager", "newtipsreport:%d", 2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(j39), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i47), str5, str6, str7, "", 2, java.lang.Long.valueOf(j57));
        if (i39 == 1) {
            vn3.a wi6 = rn3.i.wi();
            wi6.getClass();
            java.lang.String str8 = "delete from NewTipsInfo where tipId = " + y07.field_tipId;
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTipsCompatInfoStorage", "delete sql: " + str8);
            wi6.f438426d.A("NewTipsInfo", str8);
            wi6.doNotify(y07.field_tipId + "", 5, java.lang.Integer.valueOf(y07.field_tipId));
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + str, 0).edit().putBoolean(format2, true).commit();
        return false;
    }

    public boolean f(com.tencent.mm.plugin.newtips.model.d dVar) {
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsManager", "check time, tipsInfo is null!!!");
            return false;
        }
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        long j17 = dVar.field_overdueTime;
        if (j17 != 0 || dVar.field_disappearTime != 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Math.min(dVar.field_beginShowTime + j17, dVar.field_disappearTime));
            r9 = i17 >= dVar.field_beginShowTime && i17 <= valueOf.longValue();
            if (i17 > valueOf.longValue()) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", java.lang.System.currentTimeMillis()).commit();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTipsManager", "timeEffective current: %s, overdueTime: %s, disappearTime: %s, show:%s", java.lang.Long.valueOf(i17), java.lang.Long.valueOf(dVar.field_overdueTime), java.lang.Long.valueOf(dVar.field_disappearTime), java.lang.Boolean.valueOf(r9));
        return r9;
    }

    public boolean g(com.tencent.mm.plugin.newtips.model.d dVar) {
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTipsManager", "check version, tipsInfo is null!!!");
            return false;
        }
        com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(dVar.field_tipId);
        if (y07 != null) {
            int i17 = dVar.field_tipVersion;
            int i18 = y07.field_tipVersion;
            if (i17 > i18) {
                return true;
            }
            if (!dVar.field_hadRead && i17 == i18) {
                return true;
            }
        }
        return false;
    }
}
