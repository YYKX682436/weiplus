package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class n implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PByteArray f192308h;

    public n(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.pointers.PByteArray pByteArray) {
        this.f192304d = i17;
        this.f192305e = str;
        this.f192306f = str2;
        this.f192307g = str3;
        this.f192308h = pByteArray;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MMBugReporter";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.p4.a(32);
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb6.append(java.lang.Integer.toHexString(o45.wf.f343029g));
        sb6.append("&devicetype=");
        sb6.append(wo.q.f447780a);
        sb6.append("&filelength=");
        sb6.append(this.f192304d);
        sb6.append("&sum=");
        sb6.append(this.f192305e);
        sb6.append("&reporttype=1&NewReportType=");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) com.tencent.mm.sandbox.monitor.f.f192291a.get(this.f192306f)));
        java.lang.String str2 = this.f192307g;
        if (str2 != null && !str2.isEmpty()) {
            sb6.append("&username=");
            sb6.append(str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBugReporter", "full url = " + sb6.toString());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.pointers.PByteArray pByteArray = this.f192308h;
        boolean a17 = com.tencent.mm.sandbox.monitor.m.a(sb7, pByteArray.value);
        if (!a17) {
            a17 = com.tencent.mm.sandbox.monitor.m.a(sb7, pByteArray.value);
        }
        if (a17) {
            com.tencent.mm.app.p4.a(33);
        } else {
            com.tencent.mm.app.p4.a(34);
        }
    }
}
