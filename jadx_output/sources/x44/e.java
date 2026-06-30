package x44;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.g f451816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451819h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451820i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451821m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f451822n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f451823o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f451824p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f451825q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451826r;

    public e(android.app.Activity activity, x44.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, boolean z17, int i17, boolean z18, java.lang.String str6) {
        this.f451815d = activity;
        this.f451816e = gVar;
        this.f451817f = str;
        this.f451818g = str2;
        this.f451819h = str3;
        this.f451820i = str4;
        this.f451821m = str5;
        this.f451822n = j17;
        this.f451823o = z17;
        this.f451824p = i17;
        this.f451825q = z18;
        this.f451826r = str6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3");
        android.app.Activity activity = this.f451815d;
        java.lang.String string = activity.getString(com.tencent.mm.R.string.l5x);
        android.app.Activity activity2 = this.f451815d;
        java.lang.String string2 = activity2.getString(com.tencent.mm.R.string.l5y);
        java.lang.String string3 = activity2.getString(com.tencent.mm.R.string.l5q);
        java.lang.String string4 = activity2.getString(com.tencent.mm.R.string.f490347sg);
        x44.g gVar = this.f451816e;
        db5.e1.D(activity, string, string2, string3, string4, false, new x44.c(gVar, this.f451817f, this.f451818g, this.f451819h, this.f451820i, this.f451821m, this.f451822n, this.f451823o, this.f451824p, this.f451825q, this.f451826r), new x44.d(gVar), com.tencent.mm.R.color.aaq);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3");
    }
}
