package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184387i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI f184389n;

    public d4(com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI, java.lang.String str, java.util.Map map, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f184389n = mMFTSSearchTabWebViewUI;
        this.f184382d = str;
        this.f184383e = map;
        this.f184384f = i17;
        this.f184385g = str2;
        this.f184386h = str3;
        this.f184387i = str4;
        this.f184388m = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI = this.f184389n;
        mMFTSSearchTabWebViewUI.F4.getFtsEditText().n(this.f184382d, new java.util.LinkedList());
        mMFTSSearchTabWebViewUI.F4.getFtsEditText().d();
        mMFTSSearchTabWebViewUI.U7();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            str = java.net.URLEncoder.encode(new org.json.JSONObject(this.f184383e).toString(), com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = "";
        }
        hashMap.put("parentSearchID", java.lang.String.format("%d:%s:%s:%s:%s", java.lang.Integer.valueOf(this.f184384f), this.f184385g, this.f184386h, this.f184387i, str));
        java.lang.String str2 = this.f184388m;
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap.put("mixerCommonContext", str2);
        }
        nw4.n nVar = mMFTSSearchTabWebViewUI.f183844p0;
        java.lang.String str3 = this.f184382d;
        nVar.d0(str3, str3, new org.json.JSONArray(), 0, hashMap);
    }
}
