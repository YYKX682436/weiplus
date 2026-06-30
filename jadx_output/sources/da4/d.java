package da4;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f227774a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f227775b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f227776c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f227777d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f227778e;

    /* renamed from: f, reason: collision with root package name */
    public int f227779f;

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[");
            sb6.append("brand=");
            sb6.append(this.f227776c);
            sb6.append(", appPkg=");
            sb6.append(this.f227777d);
            sb6.append(", name=");
            sb6.append(this.f227778e);
            sb6.append(", priority=");
            sb6.append(this.f227779f);
            java.util.List list = this.f227775b;
            if (list != null && list.size() > 0) {
                sb6.append(", pkgs=");
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb6.append((java.lang.String) it.next());
                    sb6.append("|");
                }
            }
            java.util.List list2 = this.f227774a;
            if (list2 != null && list2.size() > 0) {
                sb6.append(", urls=");
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    sb6.append((java.lang.String) it6.next());
                    sb6.append("|");
                }
            }
            sb6.append("]");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
            return sb7;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdAppMarketTagNode", "toString exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
            return "";
        }
    }
}
