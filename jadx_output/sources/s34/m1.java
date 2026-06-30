package s34;

/* loaded from: classes4.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402712a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402713b;

    /* renamed from: c, reason: collision with root package name */
    public int f402714c;

    /* renamed from: d, reason: collision with root package name */
    public int f402715d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f402716e;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f402711g = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.m1.class, "pagUrl", "getPagUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(s34.m1.class, "pagThumbUrl", "getPagThumbUrl()Ljava/lang/String;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public static final s34.l1 f402710f = new s34.l1(null);

    public m1() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402712a = new com.tencent.mm.plugin.sns.storage.t0();
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f402716e = new com.tencent.mm.plugin.sns.storage.r0();
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) this.f402716e).a(this, f402711g[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagThumbUrl", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagUrl", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.t0) this.f402712a).a(this, f402711g[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagUrl", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
        return str;
    }
}
