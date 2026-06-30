package xx5;

/* loaded from: classes13.dex */
public abstract class h {
    public static void a(com.tencent.xweb.c2 c2Var, zx5.f fVar) {
        java.lang.String str;
        int i17 = fVar.f477228a != null ? !zx5.p.Z().r().equalsIgnoreCase(fVar.f477228a.r()) ? 1 : 0 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(fVar.f477231d ? 2 : 1);
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.d());
        sb6.append(",");
        sb6.append(fVar.f477235h);
        sb6.append(",20260502,");
        sb6.append(c2Var.f220224b);
        sb6.append(",");
        sb6.append(c2Var.f220229g);
        sb6.append(",");
        sb6.append(c2Var.f220234l);
        sb6.append(",");
        sb6.append(java.lang.System.currentTimeMillis() - c2Var.f220228f);
        sb6.append(",");
        sb6.append(c2Var.f220231i);
        sb6.append(",");
        sb6.append(c2Var.f220225c);
        sb6.append(",");
        sb6.append(c2Var.f220230h ? 1 : 0);
        sb6.append(",");
        sb6.append(c2Var.f220226d);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.dumpAppInfo());
        sb6.append(",");
        sb6.append(org.xwalk.core.XWalkEnvironment.f347970c.getPackageName());
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        sb6.append(fVar.f477239l == 1 ? "1" : "2");
        sb6.append(",");
        com.tencent.xweb.b.m().getClass();
        sb6.append(com.tencent.xweb.b.f220208b);
        sb6.append(",");
        try {
            str = fVar.b();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",");
        java.lang.String str2 = fVar.f477240m;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "None";
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForDownloadRuntime", "report:" + sb7);
        zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
        by5.s0.t(15124, sb7);
    }
}
