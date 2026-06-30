package xx5;

/* loaded from: classes13.dex */
public abstract class o {
    public static void a(xx5.m mVar) {
        java.lang.String str;
        try {
            if (mVar == null) {
                by5.c4.c("KVReportForPluginUpdate", "reportPluginConfigUpdate error, data is null");
                return;
            }
            if ("5".equals(mVar.f458053b)) {
                by5.c4.f("KVReportForPluginUpdate", "reportPluginConfigUpdate, checkType is config only, skip report");
                return;
            }
            if (mVar.f458057f == null) {
                zx5.t tVar = new zx5.t();
                mVar.f458057f = tVar;
                tVar.f477259a = "";
                tVar.f477260b = "";
                tVar.f477261c = 0;
                tVar.f477262d = -1;
                zx5.t tVar2 = mVar.f458057f;
                tVar2.f477263e = -1;
                tVar2.f477264f = -1L;
                tVar2.f477265g = -1L;
                tVar2.f477266h = -1;
            }
            android.content.Context context = org.xwalk.core.XWalkEnvironment.f347970c;
            java.lang.String packageName = context != null ? context.getPackageName() : "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mVar.f458052a);
            sb6.append(",");
            if (packageName == null) {
                packageName = "";
            }
            sb6.append(packageName);
            sb6.append(",20260502,");
            java.lang.String str2 = mVar.f458053b;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(",");
            java.lang.String str3 = mVar.f458054c;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(",");
            java.lang.String str4 = mVar.f458055d;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(",");
            java.lang.String str5 = mVar.f458056e;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(",");
            sb6.append(mVar.f458057f.f477261c);
            sb6.append(",");
            sb6.append(mVar.f458057f.f477262d);
            sb6.append(",");
            sb6.append(mVar.f458057f.f477263e);
            sb6.append(",");
            sb6.append(mVar.f458057f.f477264f);
            sb6.append(",");
            sb6.append(mVar.f458057f.f477265g);
            sb6.append(",");
            sb6.append(mVar.f458057f.f477266h);
            sb6.append(",");
            java.lang.StringBuilder sb7 = mVar.f458058g;
            sb6.append(sb7 != null ? sb7.toString() : "");
            java.lang.String sb8 = sb6.toString();
            by5.c4.f("KVReportForPluginUpdate", "reportPluginConfigUpdate, key = 26264, value = " + sb8);
            by5.s0.t(26264, sb8);
            if (mVar.f458052a == 0 || (str = mVar.f458054c) == null || str.isEmpty()) {
                return;
            }
            by5.c4.f("KVReportForPluginUpdate", "reportPluginConfigUpdate, config error, single plugin is not empty, try reportPluginUpdate");
            xx5.n nVar = new xx5.n();
            nVar.f458065g = mVar;
            java.lang.String str6 = mVar.f458054c;
            nVar.f458060b = str6;
            cy5.h d17 = cy5.m.d(str6);
            if (d17 != null) {
                nVar.f458061c = d17.f224879a;
            }
            nVar.f458059a = -1;
            b(nVar);
        } catch (java.lang.Exception e17) {
            by5.c4.c("KVReportForPluginUpdate", "reportPluginConfigUpdate error: " + e17.getMessage());
        }
    }

    public static void b(xx5.n nVar) {
        int i17;
        try {
            if (nVar == null) {
                by5.c4.c("KVReportForPluginUpdate", "reportPluginUpdate error, data is null");
                return;
            }
            xx5.m mVar = nVar.f458065g;
            if (mVar == null) {
                by5.c4.c("KVReportForPluginUpdate", "reportPluginUpdate error, configReportData is null");
                return;
            }
            if ("5".equals(mVar.f458053b)) {
                by5.c4.f("KVReportForPluginUpdate", "reportPluginUpdate, checkType is config only, skip report");
                return;
            }
            com.tencent.xweb.c2 c2Var = nVar.f458066h;
            long j17 = -1;
            if (c2Var == null) {
                com.tencent.xweb.c2 c2Var2 = new com.tencent.xweb.c2();
                nVar.f458066h = c2Var2;
                i17 = -1;
                c2Var2.f220225c = -1;
                c2Var2.f220226d = "";
                c2Var2.f220227e = "";
                c2Var2.f220228f = -1L;
                c2Var2.f220229g = -1;
                c2Var2.f220230h = false;
                c2Var2.f220231i = -1L;
                c2Var2.f220232j = false;
                c2Var2.f220233k = -1;
                c2Var2.f220234l = -1;
            } else {
                i17 = c2Var.f220230h ? 1 : 0;
            }
            long j18 = nVar.f458070l;
            long j19 = nVar.f458069k;
            if (j18 > j19 && j19 > 0) {
                j17 = j18 - j19;
            }
            android.content.Context context = org.xwalk.core.XWalkEnvironment.f347970c;
            java.lang.String packageName = context != null ? context.getPackageName() : "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(nVar.f458059a);
            sb6.append(",");
            if (packageName == null) {
                packageName = "";
            }
            sb6.append(packageName);
            sb6.append(",20260502,");
            java.lang.String str = nVar.f458060b;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(",");
            sb6.append(nVar.f458061c);
            sb6.append(",");
            sb6.append(nVar.f458062d);
            sb6.append(",");
            sb6.append(nVar.f458063e);
            sb6.append(",");
            java.lang.String str2 = nVar.f458064f;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(",");
            java.lang.String str3 = nVar.f458065g.f458053b;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(",");
            java.lang.String str4 = nVar.f458065g.f458054c;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(",");
            java.lang.String str5 = nVar.f458065g.f458055d;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(",");
            java.lang.String str6 = nVar.f458065g.f458056e;
            sb6.append(str6 != null ? str6 : "");
            sb6.append(",");
            sb6.append(nVar.f458065g.f458052a);
            sb6.append(",");
            sb6.append(nVar.f458066h.f220224b);
            sb6.append(",");
            sb6.append(nVar.f458066h.f220225c);
            sb6.append(",");
            sb6.append(nVar.f458066h.f220229g);
            sb6.append(",");
            sb6.append(nVar.f458066h.f220234l);
            sb6.append(",");
            sb6.append(nVar.f458067i);
            sb6.append(",");
            sb6.append(nVar.f458066h.f220231i);
            sb6.append(",");
            sb6.append(i17);
            sb6.append(",");
            sb6.append(nVar.f458068j);
            sb6.append(",");
            sb6.append(j17);
            java.lang.String sb7 = sb6.toString();
            by5.c4.f("KVReportForPluginUpdate", "reportPluginUpdate, key = 26265, value = " + sb7);
            by5.s0.t(26265, sb7);
        } catch (java.lang.Exception e17) {
            by5.c4.c("KVReportForPluginUpdate", "reportPluginUpdate error: " + e17.getMessage());
        }
    }
}
