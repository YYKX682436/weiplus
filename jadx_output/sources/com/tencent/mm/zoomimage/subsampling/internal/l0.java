package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f214984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f214985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f214986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f214987h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, boolean z17, long j17, long j18, long j19) {
        super(0);
        this.f214983d = m0Var;
        this.f214984e = z17;
        this.f214985f = j17;
        this.f214986g = j18;
        this.f214987h = j19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214983d;
        sb6.append(m0Var.f214992a);
        sb6.append(". preferredTileSize. ");
        sb6.append(this.f214984e ? "changed" : "keep");
        sb6.append(". ");
        sb6.append(zq5.h.f(this.f214985f));
        sb6.append(" -> ");
        sb6.append(zq5.h.f(this.f214986g));
        sb6.append(", containerSize=");
        sb6.append(zq5.h.f(this.f214987h));
        sb6.append(". '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
