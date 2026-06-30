package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f181508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f181509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181511h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181512i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f181514n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.q0 f181515o;

    public g0(com.tencent.mm.plugin.websearch.q0 q0Var, int i17, java.util.Map map, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27) {
        this.f181515o = q0Var;
        this.f181507d = i17;
        this.f181508e = map;
        this.f181509f = i18;
        this.f181510g = i19;
        this.f181511h = str;
        this.f181512i = str2;
        this.f181513m = str3;
        this.f181514n = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData realTime, webviewID = %d", java.lang.Integer.valueOf(this.f181507d));
        gm0.j1.d().a(1048, this.f181515o);
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        long optLong = su4.o2.d("discoverSearchEntry").optLong("guideParam");
        this.f181515o.f181595h = new su4.z1(this.f181509f, this.f181510g, (!this.f181508e.containsKey("h5Version") || this.f181508e.get("h5Version") == null) ? com.tencent.mm.plugin.websearch.l2.a(0) : ((java.lang.Integer) this.f181508e.get("h5Version")).intValue(), this.f181507d, f17, optLong, this.f181511h, this.f181512i, this.f181513m, null, this.f181514n);
        gm0.j1.d().g(this.f181515o.f181595h);
    }
}
