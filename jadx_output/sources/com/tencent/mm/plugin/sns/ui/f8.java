package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class f8 {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.component.p0 f168317g;

    /* renamed from: a, reason: collision with root package name */
    public long f168311a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f168312b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f168313c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f168314d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f168315e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f168316f = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashSet f168318h = new java.util.HashSet();

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanResume", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        this.f168311a = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanResume", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
    }

    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        long j17 = this.f168311a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ResumeSnsControl", "resume time %d", java.lang.Long.valueOf(elapsedRealtime));
        com.tencent.mars.xlog.Log.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s, unreadBottomSeq:%s, unreadTopSeq:%s, timeFirstId:%s, upLimitSeq:%s, isPullDownMode:%s", java.lang.Long.valueOf(this.f168311a), "", "", java.lang.Long.valueOf(this.f168315e), java.lang.Integer.valueOf(this.f168313c), java.lang.Integer.valueOf(this.f168314d), "", "", java.lang.Long.valueOf(this.f168316f), this.f168312b, java.lang.Boolean.FALSE);
        this.f168318h = new java.util.HashSet();
        if (com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").getBoolean("SnsMMKVDeleteTable", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResumeSnsControl", "already delete table, need refresh");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        if (elapsedRealtime >= 180000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", java.lang.Long.valueOf(this.f168315e));
        if (this.f168315e == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        if (this.f168313c == 0 && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(68377, null))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        com.tencent.mm.plugin.sns.model.l4.Kj().u(this.f168315e, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return true;
    }
}
