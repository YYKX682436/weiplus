package i64;

/* loaded from: classes4.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f289113a;

    /* renamed from: b, reason: collision with root package name */
    public int f289114b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f289115c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f289116d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f289117e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f289118f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f289119g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f289120h = 0;

    /* renamed from: i, reason: collision with root package name */
    public j64.b f289121i = new j64.b();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f289122j = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public long f289123k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f289124l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f289125m;

    public c1(java.lang.String str) {
        this.f289113a = "MicroMsg.SnsAdVideoStatistic";
        this.f289113a = "MicroMsg.SnsAdVideoStatistic:" + str;
    }

    public synchronized void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j17 = this.f289124l;
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        this.f289124l = 0L;
        j64.b bVar = this.f289121i;
        if (bVar != null) {
            bVar.f297916h += elapsedRealtime;
            com.tencent.mars.xlog.Log.i(this.f289113a, "calcPauseTime, thisPauseTime=" + elapsedRealtime + ", total=" + this.f289121i.f297916h);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f289123k = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j17 = this.f289123k;
        if (j17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f289117e += android.os.SystemClock.elapsedRealtime() - j17;
        this.f289123k = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public synchronized java.lang.String d() {
        int elapsedRealtime;
        java.lang.String stringBuffer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pullXml", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j17 = this.f289116d;
        if (j17 == 0) {
            elapsedRealtime = 0;
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j17);
        }
        this.f289115c = elapsedRealtime;
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        stringBuffer2.append("<viewinfo>");
        stringBuffer2.append("<downloadstatus>");
        stringBuffer2.append(this.f289114b);
        stringBuffer2.append("</downloadstatus>");
        stringBuffer2.append("<staytotaltime>");
        stringBuffer2.append(this.f289115c);
        stringBuffer2.append("</staytotaltime>");
        java.util.LinkedList linkedList = this.f289122j;
        stringBuffer2.append(java.lang.String.format("<playitemlist count=\"%d\">", java.lang.Integer.valueOf(linkedList.size())));
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            j64.b bVar = (j64.b) linkedList.get(i17);
            stringBuffer2.append("<playitem>");
            stringBuffer2.append(java.lang.String.format("<playcount>%d</playcount>", java.lang.Integer.valueOf(bVar.f297910b)));
            stringBuffer2.append(java.lang.String.format("<playtotaltime>%d</playtotaltime>", java.lang.Integer.valueOf(bVar.f297911c)));
            stringBuffer2.append(java.lang.String.format("<videototaltime>%d</videototaltime>", java.lang.Integer.valueOf(bVar.f297912d * 1000)));
            stringBuffer2.append(java.lang.String.format("<playmode>%d</playmode>", java.lang.Integer.valueOf(bVar.f297913e)));
            stringBuffer2.append(java.lang.String.format("<playorientation>%d</playorientation>", java.lang.Integer.valueOf(bVar.f297914f)));
            stringBuffer2.append("</playitem>");
            i64.u1.a(120, bVar.f297910b);
            i64.u1.a(19, bVar.f297911c);
        }
        stringBuffer2.append("</playitemlist>");
        stringBuffer2.append("</viewinfo>");
        stringBuffer = stringBuffer2.toString();
        com.tencent.mars.xlog.Log.i(this.f289113a, "xml " + stringBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullXml", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        return stringBuffer;
    }

    public synchronized void e(int i17) {
        int elapsedRealtime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushPlayItem", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        j64.b bVar = this.f289121i;
        if (bVar.f297911c <= 0) {
            long j17 = bVar.f297915g;
            if (j17 == 0) {
                elapsedRealtime = 0;
            } else {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j17);
            }
            bVar.f297911c = elapsedRealtime;
            a();
            java.lang.String str = this.f289113a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("endPlay, playTotaltime=");
            sb6.append(this.f289121i.f297911c);
            sb6.append(", pauseTotalTime=");
            sb6.append(this.f289121i.f297916h);
            sb6.append(", playTime=");
            sb6.append(r0.f297911c - this.f289121i.f297916h);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            j64.b bVar2 = this.f289121i;
            int i18 = bVar2.f297911c;
            long j18 = bVar2.f297916h;
            if (i18 - j18 > 0) {
                bVar2.f297911c = (int) (i18 - j18);
            }
        }
        if (i17 != 0) {
            this.f289121i.f297912d = i17;
        }
        com.tencent.mars.xlog.Log.i(this.f289113a, "pushplayitem duration " + this.f289121i.f297911c + " " + this.f289121i.f297914f);
        this.f289122j.add(this.f289121i);
        this.f289121i = new j64.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushPlayItem", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("settlePlayitemsStatistics", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        this.f289118f = 0;
        this.f289119g = 0;
        this.f289120h = 0;
        java.util.LinkedList linkedList = this.f289122j;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            j64.b bVar = (j64.b) it.next();
            this.f289118f += bVar.f297909a;
            this.f289119g += bVar.f297910b;
            this.f289120h += bVar.f297911c;
        }
        j64.b bVar2 = this.f289121i;
        if (bVar2 != null && !linkedList.contains(bVar2)) {
            int i17 = this.f289118f;
            j64.b bVar3 = this.f289121i;
            this.f289118f = i17 + bVar3.f297909a;
            this.f289119g += bVar3.f297910b;
            this.f289120h += bVar3.f297911c;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("settlePlayitemsStatistics", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }
}
