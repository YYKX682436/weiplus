package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yq5.k f215113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f215114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f215115h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str, yq5.k kVar, long j17, kotlinx.coroutines.y0 y0Var) {
        super(0);
        this.f215111d = m0Var;
        this.f215112e = str;
        this.f215113f = kVar;
        this.f215114g = j17;
        this.f215115h = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f215111d.f214992a + ". resetTileDecoder:" + this.f215112e + ". skipped. parameters are not ready yet. subsamplingImage=" + this.f215113f + ", contentSize=" + zq5.h.f(this.f215114g) + ", coroutineScope=" + this.f215115h;
    }
}
