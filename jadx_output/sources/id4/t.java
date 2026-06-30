package id4;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final id4.t f290949a = new id4.t();

    public final java.lang.String a(zc4.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return "null";
        }
        java.lang.String b17 = b(bVar.n().Q0());
        java.lang.String b18 = b(bVar.n().Y0());
        java.lang.String str = ca4.z0.t0(bVar.n().y0()) + '-' + b17 + '-' + b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        return str;
    }

    public final java.lang.String b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return "";
        }
        if (str.length() <= 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r26.p0.A0(str));
        sb6.append('*');
        sb6.append(str.length());
        sb6.append('*');
        sb6.append(r26.p0.D0(str));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineUtils");
        return sb7;
    }
}
