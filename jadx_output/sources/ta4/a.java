package ta4;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416704b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f416705c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f416706d;

    /* renamed from: e, reason: collision with root package name */
    public ta4.j f416707e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f416708f;

    /* renamed from: g, reason: collision with root package name */
    public int f416709g;

    /* renamed from: h, reason: collision with root package name */
    public final org.json.JSONObject f416710h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f416711i;

    /* renamed from: j, reason: collision with root package name */
    public final ta4.l f416712j;

    /* renamed from: k, reason: collision with root package name */
    public final ta4.l f416713k;

    /* renamed from: l, reason: collision with root package name */
    public final ta4.l f416714l;

    /* renamed from: m, reason: collision with root package name */
    public final ta4.l f416715m;

    /* renamed from: n, reason: collision with root package name */
    public final ta4.l f416716n;

    /* renamed from: o, reason: collision with root package name */
    public long f416717o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f416718p;

    public a(java.lang.String mediaId, int i17, java.lang.String fromScene, boolean z17, ta4.j stage, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        kotlin.jvm.internal.o.g(stage, "stage");
        this.f416703a = mediaId;
        this.f416704b = i17;
        this.f416705c = fromScene;
        this.f416706d = z17;
        this.f416707e = stage;
        this.f416708f = str;
        this.f416709g = -1;
        this.f416710h = new org.json.JSONObject();
        this.f416712j = new ta4.l(0, 0, 0, 7, null);
        this.f416713k = new ta4.l(0, 0, 0, 7, null);
        this.f416714l = new ta4.l(0, 0, 0, 7, null);
        this.f416715m = new ta4.l(0, 0, 0, 7, null);
        this.f416716n = new ta4.l(0, 0, 0, 7, null);
        this.f416718p = "";
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.report.Data");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.report.Data");
        return this.f416703a;
    }

    public final ta4.j b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStage", "com.tencent.mm.plugin.sns.report.Data");
        ta4.j jVar = this.f416707e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStage", "com.tencent.mm.plugin.sns.report.Data");
        return jVar;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.report.Data");
        if (!(obj instanceof ta4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.Data");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(((ta4.a) obj).f416703a, this.f416703a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.Data");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.Data");
        int hashCode = ((((((((this.f416703a.hashCode() * 31) + java.lang.Integer.hashCode(this.f416704b)) * 31) + this.f416705c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f416706d)) * 31) + this.f416707e.hashCode()) * 31;
        java.lang.String str = this.f416708f;
        int hashCode2 = hashCode + (str == null ? 0 : str.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.Data");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.report.Data");
        java.lang.String str = "mediaId:" + this.f416703a + ", requestType:" + this.f416704b + ", from:" + this.f416705c + ", batchDownload:" + this.f416706d + ", stage:" + this.f416707e + ", stageCost:" + this.f416710h + ", startImageLoaderQueueSize:" + this.f416715m.a() + ", finishedImageLoaderQueueSize:" + this.f416716n.a() + ", enqueueQueueSize:" + this.f416712j + ", startDownloadQueueSize:" + this.f416713k + ", callbackUIQueueSize:" + this.f416714l + ", cdnRet:" + this.f416709g + ", isAd:" + this.f416711i + ", session:" + this.f416718p + " snsId:" + this.f416708f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.report.Data");
        return str;
    }
}
