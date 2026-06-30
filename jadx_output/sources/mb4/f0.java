package mb4;

/* loaded from: classes4.dex */
public abstract class f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f325401f = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.f0.class, "pagThumbUrl", "getPagThumbUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.f0.class, "pagUrl", "getPagUrl()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325402a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325403b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f325404c;

    /* renamed from: d, reason: collision with root package name */
    public int f325405d;

    /* renamed from: e, reason: collision with root package name */
    public int f325406e;

    public f0() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f325402a = new com.tencent.mm.plugin.sns.storage.r0();
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f325403b = new com.tencent.mm.plugin.sns.storage.t0();
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        java.lang.String str = this.f325404c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) this.f325402a).a(this, f325401f[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        return str;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.t0) this.f325403b).a(this, f325401f[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        return str;
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPAGInfoValid", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.N0(b(), c(), this.f325404c) && this.f325405d > 0 && this.f325406e > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPAGInfoValid", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        return z17;
    }

    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        this.f325406e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        this.f325404c = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
    }

    public final void g(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        ((com.tencent.mm.plugin.sns.storage.r0) this.f325402a).b(this, f325401f[0], str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagThumbUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
    }

    public final void h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        ((com.tencent.mm.plugin.sns.storage.t0) this.f325403b).b(this, f325401f[1], str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
    }

    public final void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
        this.f325405d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWidth", "com.tencent.mm.plugin.sns.storage.adsocial.PagInfo");
    }
}
