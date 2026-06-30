package k44;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public int f304100d;

    /* renamed from: e, reason: collision with root package name */
    public int f304101e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f304097a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f304098b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f304099c = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f304102f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f304103g = new java.util.ArrayList();

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        java.lang.String str = this.f304097a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        java.lang.String str = this.f304098b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        return str;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        java.lang.String str = this.f304099c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        return str;
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f304097a = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
    }

    public final void e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f304098b = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f304099c = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
    }
}
