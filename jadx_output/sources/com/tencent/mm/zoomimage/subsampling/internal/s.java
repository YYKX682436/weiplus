package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f215079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f215080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f215081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f215082i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f215083m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        super(0);
        this.f215077d = m0Var;
        this.f215078e = str;
        this.f215079f = z17;
        this.f215080g = z18;
        this.f215081h = z19;
        this.f215082i = z27;
        this.f215083m = z28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f215077d;
        sb6.append(m0Var.f214992a);
        sb6.append(". refreshReadyState:");
        sb6.append(this.f215078e);
        sb6.append(". ready=");
        sb6.append(this.f215079f);
        sb6.append(", imageInfoReady=");
        sb6.append(this.f215080g);
        sb6.append(", tileManagerReady=");
        sb6.append(this.f215081h);
        sb6.append(", tileDecoderReady=");
        sb6.append(this.f215082i);
        sb6.append(", stoppedReady=");
        sb6.append(this.f215083m);
        sb6.append(". '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
