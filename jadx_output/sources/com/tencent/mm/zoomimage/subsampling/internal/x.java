package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f215154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yq5.c f215155g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yq5.k f215156h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str, long j17, yq5.c cVar, yq5.k kVar) {
        super(0);
        this.f215152d = m0Var;
        this.f215153e = str;
        this.f215154f = j17;
        this.f215155g = cVar;
        this.f215156h = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f215152d.f214992a + ". resetTileDecoder:" + this.f215153e + ". success. contentSize=" + zq5.h.f(this.f215154f) + ", imageInfo=" + this.f215155g.a() + ". '" + this.f215156h.a() + '\'';
    }
}
