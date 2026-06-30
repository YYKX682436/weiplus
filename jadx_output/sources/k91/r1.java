package k91;

/* loaded from: classes4.dex */
public abstract class r1 {
    public static java.lang.String a(java.lang.String str, int i17, int i18, k91.q1 q1Var, boolean z17) {
        if (com.tencent.mm.plugin.appbrand.app.r9.Ui() == null) {
            return "";
        }
        boolean z18 = false;
        int P = com.tencent.mm.plugin.appbrand.app.r9.Ui() == null ? 0 : com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(java.lang.String.format("%s_%s_local_version", str, java.lang.Integer.valueOf(i17)), "0"), 0);
        int P2 = com.tencent.mm.plugin.appbrand.app.r9.Ui() == null ? 0 : com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(java.lang.String.format("%s_%s_server_version", str, java.lang.Integer.valueOf(i17)), "0"), 0);
        java.lang.String b17 = k91.o1.b(str, i17);
        if (P2 != 0 && (com.tencent.mm.sdk.platformtools.t8.K0(b17) || P2 > P)) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonConfigManager", "getConfig the server_version is %d ,the local_version is %d", java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(P));
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonConfigManager", "the config is \n %s \n isShouldSyncFromServer:%b", b17, java.lang.Boolean.valueOf(z18));
        if (z18) {
            if (z17) {
                k91.m1 m1Var = new k91.m1(q1Var, str);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.s93 s93Var = new r45.s93();
                s93Var.f385578d = str;
                s93Var.f385579e = i17;
                s93Var.f385580f = P2;
                s93Var.f385581g = i18;
                linkedList.add(s93Var);
                c(linkedList, m1Var);
            }
        } else if (q1Var != null) {
            q1Var.a(b17);
        }
        return b17;
    }

    public static void b(java.lang.String str, java.util.LinkedList linkedList, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonConfigManager", "setVersion, app_id is null");
            return;
        }
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonConfigManager", "setVersion, versionItems is empty");
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.yy6 yy6Var = (r45.yy6) it.next();
            int i17 = yy6Var.f391514e;
            int P = com.tencent.mm.plugin.appbrand.app.r9.Ui() != null ? com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(java.lang.String.format("%s_%s_local_version", str, java.lang.Integer.valueOf(yy6Var.f391513d)), "0"), 0) : 0;
            int i18 = yy6Var.f391514e;
            k91.o1.d(str, yy6Var.f391513d, i18);
            if (i18 != 0) {
                if (i18 > P) {
                    int i19 = yy6Var.f391513d;
                    int i27 = yy6Var.f391514e;
                    r45.s93 s93Var = new r45.s93();
                    s93Var.f385578d = str;
                    s93Var.f385579e = i19;
                    s93Var.f385580f = i27;
                    linkedList2.add(s93Var);
                } else if (i18 != P) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CommonConfigManager", "local_version:%d, server_version:%d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(i18));
                    if (com.tencent.mm.sdk.platformtools.t8.K0(k91.o1.b(str, yy6Var.f391513d))) {
                        int i28 = yy6Var.f391513d;
                        int i29 = yy6Var.f391514e;
                        r45.s93 s93Var2 = new r45.s93();
                        s93Var2.f385578d = str;
                        s93Var2.f385579e = i28;
                        s93Var2.f385580f = i29;
                        linkedList2.add(s93Var2);
                    }
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(k91.o1.b(str, yy6Var.f391513d))) {
                    int i37 = yy6Var.f391513d;
                    int i38 = yy6Var.f391514e;
                    r45.s93 s93Var3 = new r45.s93();
                    s93Var3.f385578d = str;
                    s93Var3.f385579e = i37;
                    s93Var3.f385580f = i38;
                    linkedList2.add(s93Var3);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonConfigManager", "setVersion appid:%s,versionItems.size:%d,getAppConfigItems.size:%d", str, java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(linkedList2.size()));
        if (!z17 || linkedList2.size() == 0) {
            return;
        }
        c(linkedList2, new k91.l1(str));
    }

    public static void c(java.util.LinkedList linkedList, k91.p1 p1Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.lbs.w.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxausrevent/getappconfig";
        lVar.f70665b = new r45.u93();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.t93 t93Var = new r45.t93();
        t93Var.f386214d = linkedList;
        lVar.f70664a = t93Var;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new k91.n1(p1Var), true);
    }
}
