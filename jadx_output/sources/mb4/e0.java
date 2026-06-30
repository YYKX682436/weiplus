package mb4;

/* loaded from: classes4.dex */
public abstract class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f325396e = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.e0.class, "pagThumbMedia", "getPagThumbMedia()Lcom/tencent/mm/protocal/protobuf/MediaObj;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(mb4.e0.class, "pagUrl", "getPagUrl()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f325397a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325398b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f325399c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f325400d;

    public e0() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f325398b = new com.tencent.mm.plugin.sns.storage.z();
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr2 = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f325399c = new com.tencent.mm.plugin.sns.storage.t0();
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str = this.f325400d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagMD5", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        return str;
    }

    public final r45.jj4 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagThumbMedia", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        r45.jj4 jj4Var = (r45.jj4) ((com.tencent.mm.plugin.sns.storage.z) this.f325398b).a(this, f325396e[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagThumbMedia", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        return jj4Var;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.t0) this.f325399c).a(this, f325396e[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagUrl", "com.tencent.mm.plugin.sns.storage.adsocial.MediaPagInfo");
        return str;
    }
}
