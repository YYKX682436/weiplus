package gt;

/* loaded from: classes7.dex */
public class t5 extends com.tencent.mm.sdk.event.n {
    public t5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = (com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        shouldShowAppBrandEntranceInFindMoreEvent.f54780h.f7576a = com.tencent.mm.plugin.appbrand.appusage.r0.d();
        if (shouldShowAppBrandEntranceInFindMoreEvent.f54779g.f7462a) {
            am.ou ouVar = shouldShowAppBrandEntranceInFindMoreEvent.f54780h;
            ouVar.f7577b = false;
            ouVar.f7578c = false;
            if (com.tencent.mm.plugin.appbrand.appusage.r0.e()) {
                ouVar.f7578c = true;
            } else {
                boolean a17 = com.tencent.mm.plugin.appbrand.appusage.q2.a();
                com.tencent.mm.plugin.appbrand.appusage.i2 i2Var = com.tencent.mm.plugin.appbrand.appusage.i2.NONE;
                if (a17) {
                    int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_SHOWTYPE_INT, 0)).intValue();
                    com.tencent.mm.plugin.appbrand.appusage.i2[] values = com.tencent.mm.plugin.appbrand.appusage.i2.values();
                    int length = values.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            break;
                        }
                        com.tencent.mm.plugin.appbrand.appusage.i2 i2Var2 = values[i17];
                        if (i2Var2.f76466d == intValue) {
                            i2Var = i2Var2;
                            break;
                        }
                        i17++;
                    }
                }
                int ordinal = i2Var.ordinal();
                if (ordinal == 1) {
                    ouVar.f7577b = true;
                } else if (ordinal == 2) {
                    ouVar.f7578c = true;
                }
            }
            if (ouVar.f7577b || ouVar.f7578c) {
                com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
                if (gm0.j1.a()) {
                    com.tencent.mm.plugin.appbrand.appusage.p2 p2Var = com.tencent.mm.plugin.appbrand.appusage.p2.f76539a;
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_HAS_REPORTED_SEE_RED_DOT_BOOLEAN;
                    if (!((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                        p2Var.b((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 0, p2Var.a());
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    }
                }
            }
            com.tencent.mm.plugin.appbrand.appusage.n2 n2Var = com.tencent.mm.plugin.appbrand.appusage.q2.f76544a;
            com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr2 = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
            if (gm0.j1.a() && com.tencent.mm.modelbase.z2.c()) {
                long i18 = com.tencent.mm.sdk.platformtools.t8.i1();
                long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_END_TIME_SECOND_LONG, 0L)).longValue();
                long longValue2 = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_FREQUENCY_SECOND_LONG, java.lang.Long.valueOf(com.tencent.wcdb.core.Database.DictDefaultMatchValue))).longValue();
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_LOCATION_REPORT_LAST_TIME_SECOND_LONG;
                long longValue3 = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue() + longValue2;
                if (longValue3 > 0 && i18 < longValue && i18 >= longValue3) {
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.h e17 = i11.h.e();
                    com.tencent.mm.plugin.appbrand.appusage.m2 m2Var = new com.tencent.mm.plugin.appbrand.appusage.m2(n2Var);
                    ((java.util.HashSet) com.tencent.mm.plugin.appbrand.utils.s0.f90550a).add(m2Var);
                    e17.j(m2Var, true);
                    com.tencent.mm.plugin.report.service.b1.f(22, 10);
                    gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(i18));
                }
            }
            int i19 = com.tencent.mm.plugin.appbrand.appusage.r0.a(false) ? 1 : 2;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - com.tencent.mm.plugin.appbrand.appusage.s0.f76558e >= 1000) {
                com.tencent.mm.plugin.appbrand.appusage.s0.f76559f = true;
            } else {
                com.tencent.mm.plugin.appbrand.appusage.s0.f76559f = false;
            }
            if (com.tencent.mm.plugin.appbrand.appusage.s0.f76559f) {
                com.tencent.mm.plugin.appbrand.appusage.s0.f76558e = currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportFindMorePageExposed");
                com.tencent.mm.plugin.appbrand.appusage.s0.b(1, 0, "", "", i19, 0);
            }
        }
        return true;
    }
}
