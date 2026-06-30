package js3;

/* loaded from: classes.dex */
public class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("kv_report_key");
        int i18 = bundle.getInt("kv_report_value");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportKVTask", "report key %d, value %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
