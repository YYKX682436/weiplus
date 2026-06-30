package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public int f166089a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166090b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166091c;

    /* renamed from: d, reason: collision with root package name */
    public int f166092d = 30;

    /* renamed from: e, reason: collision with root package name */
    public int f166093e;

    /* renamed from: f, reason: collision with root package name */
    public int f166094f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166096h;

    public void a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSphereCardInfo");
        this.f166089a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".displayType"), 0);
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        if (str2 == null) {
            str2 = "";
        }
        this.f166090b = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".description");
        if (str3 == null) {
            str3 = "";
        }
        this.f166091c = str3;
        this.f166092d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".markMaxAlpha"), 30);
        this.f166093e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".titlePosition"), 0);
        this.f166094f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".gestureDelayTime"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".sphereThumbUrl");
        if (str4 == null) {
            str4 = "";
        }
        this.f166096h = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".sphereImageUrl");
        this.f166095g = str5 != null ? str5 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSphereCardInfo");
    }
}
