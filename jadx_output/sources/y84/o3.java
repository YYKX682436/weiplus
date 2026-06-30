package y84;

/* loaded from: classes4.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f460172a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f460173b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f460174c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f460175d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460176e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f460177f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460178g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f460179h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460180i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.h1 f460181j;

    /* renamed from: k, reason: collision with root package name */
    public int f460182k;

    /* renamed from: l, reason: collision with root package name */
    public int f460183l;

    /* renamed from: m, reason: collision with root package name */
    public float f460184m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f460185n;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f460171p = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(y84.o3.class, "pedestalImageMedia", "getPedestalImageMedia()Lcom/tencent/mm/protocal/protobuf/MediaObj;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(y84.o3.class, "pedestalImageMediaDark", "getPedestalImageMediaDark()Lcom/tencent/mm/protocal/protobuf/MediaObj;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(y84.o3.class, "backgroundImageMedia", "getBackgroundImageMedia()Lcom/tencent/mm/protocal/protobuf/MediaObj;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(y84.o3.class, "starImageMedia", "getStarImageMedia()Lcom/tencent/mm/protocal/protobuf/MediaObj;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(y84.o3.class, "starDropImageMedia", "getStarDropImageMedia()Lcom/tencent/mm/protocal/protobuf/MediaObj;", 0))};

    /* renamed from: o, reason: collision with root package name */
    public static final y84.m3 f460170o = new y84.m3(null);

    public o3() {
        int i17 = com.tencent.mm.plugin.sns.storage.x0.f166166a;
        com.tencent.mm.plugin.sns.storage.t1[] t1VarArr = com.tencent.mm.plugin.sns.storage.t1.f166141d;
        this.f460174c = new com.tencent.mm.plugin.sns.storage.z();
        this.f460175d = new com.tencent.mm.plugin.sns.storage.z();
        this.f460177f = new com.tencent.mm.plugin.sns.storage.z();
        this.f460179h = new com.tencent.mm.plugin.sns.storage.z();
        this.f460181j = new com.tencent.mm.plugin.sns.storage.z();
        this.f460185n = new java.util.ArrayList();
    }

    public final r45.jj4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        r45.jj4 jj4Var = (r45.jj4) ((com.tencent.mm.plugin.sns.storage.z) this.f460177f).a(this, f460171p[2]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundImageMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        return jj4Var;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPedestalImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        java.lang.String str = this.f460173b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPedestalImageUrlDark", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo");
        return str;
    }
}
