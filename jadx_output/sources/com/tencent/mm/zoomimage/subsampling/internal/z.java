package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yq5.k f215166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f215167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f215168h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v0 f215169i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str, yq5.k kVar, long j17, long j18, com.tencent.mm.zoomimage.subsampling.internal.v0 v0Var) {
        super(0);
        this.f215164d = m0Var;
        this.f215165e = str;
        this.f215166f = kVar;
        this.f215167g = j17;
        this.f215168h = j18;
        this.f215169i = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f215164d;
        sb6.append(m0Var.f214992a);
        sb6.append(". resetTileManager:");
        sb6.append(this.f215165e);
        sb6.append(". skipped. parameters are not ready yet. subsamplingImage=");
        sb6.append(this.f215166f);
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(this.f215167g));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(this.f215168h));
        sb6.append(", tileDecoder=");
        sb6.append(this.f215169i);
        sb6.append(", '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
