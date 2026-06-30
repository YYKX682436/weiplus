package x44;

/* loaded from: classes4.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.g f451793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451797h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451798i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f451799m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f451800n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f451801o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f451802p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451803q;

    public c(x44.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, boolean z17, int i17, boolean z18, java.lang.String str6) {
        this.f451793d = gVar;
        this.f451794e = str;
        this.f451795f = str2;
        this.f451796g = str3;
        this.f451797h = str4;
        this.f451798i = str5;
        this.f451799m = j17;
        this.f451800n = z17;
        this.f451801o = i17;
        this.f451802p = z18;
        this.f451803q = str6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3$1");
        dialogInterface.dismiss();
        x44.g gVar = this.f451793d;
        java.lang.String appId = this.f451794e;
        kotlin.jvm.internal.o.f(appId, "$appId");
        java.lang.String pkg = this.f451795f;
        kotlin.jvm.internal.o.f(pkg, "$pkg");
        java.lang.String md52 = this.f451796g;
        kotlin.jvm.internal.o.f(md52, "$md5");
        java.lang.String url = this.f451797h;
        kotlin.jvm.internal.o.f(url, "$url");
        java.lang.String filename = this.f451798i;
        kotlin.jvm.internal.o.f(filename, "$filename");
        long j17 = this.f451799m;
        boolean z17 = this.f451800n;
        int i18 = this.f451801o;
        boolean z18 = this.f451802p;
        java.lang.String wxAppId = this.f451803q;
        kotlin.jvm.internal.o.f(wxAppId, "$wxAppId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        long p17 = gVar.p(appId, pkg, md52, url, filename, j17, z17, i18, z18, wxAppId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_ID, p17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        x44.g gVar2 = this.f451793d;
        gVar2.m(jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        gVar2.b(jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3$1");
    }
}
