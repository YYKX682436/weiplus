package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class d implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PByteArray f192289h;

    public d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.pointers.PByteArray pByteArray) {
        this.f192285d = i17;
        this.f192286e = str;
        this.f192287f = str2;
        this.f192288g = str3;
        this.f192289h = pByteArray;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "CrashUpload_upload";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.p4.a(32);
        boolean z17 = false;
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb6.append(java.lang.Integer.toHexString(o45.wf.f343029g));
        sb6.append("&devicetype=");
        sb6.append(wo.q.f447780a);
        sb6.append("&filelength=");
        sb6.append(this.f192285d);
        sb6.append("&sum=");
        sb6.append(this.f192286e);
        sb6.append("&reporttype=1&NewReportType=");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) com.tencent.mm.sandbox.monitor.f.f192291a.get(this.f192287f)));
        java.lang.String str2 = this.f192288g;
        if (str2 != null && !str2.equals("")) {
            sb6.append("&username=");
            sb6.append(str2);
        }
        try {
            if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_crash_upload_retry_open_v2", "1", false, true), 0) == 1) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CrashUpload", "get retry x error" + sb6.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashUpload", e17, "", new java.lang.Object[0]);
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.pointers.PByteArray pByteArray = this.f192289h;
        boolean a17 = com.tencent.mm.sandbox.monitor.f.a(sb7, pByteArray.value);
        if (!a17 && z17) {
            a17 = com.tencent.mm.sandbox.monitor.f.a(sb7, pByteArray.value);
        }
        if (a17) {
            com.tencent.mm.app.p4.a(33);
        } else {
            com.tencent.mm.app.p4.a(34);
        }
    }
}
