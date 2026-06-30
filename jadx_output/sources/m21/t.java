package m21;

/* loaded from: classes4.dex */
public class t implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.fa6 f323000a = new r45.fa6();

    @Override // m21.u
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsScanCodeInfoObject");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (this.f323000a != null) {
                sb6.append("<code_info>");
                sb6.append("<code_content>");
                sb6.append(ot0.q.g(this.f323000a.f374150d));
                sb6.append("</code_content>");
                sb6.append("<src_type>");
                sb6.append(this.f323000a.f374151e);
                sb6.append("</src_type>");
                sb6.append("</code_info>");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsScanCodeInfoObject", e17, "makeContent exception", new java.lang.Object[0]);
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsScanCodeInfoObject");
        return sb7;
    }
}
