package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yq5.c f214912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f214913g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f214914h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yq5.k f214915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str, yq5.c cVar, long j17, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, yq5.k kVar) {
        super(0);
        this.f214910d = m0Var;
        this.f214911e = str;
        this.f214912f = cVar;
        this.f214913g = j17;
        this.f214914h = v1Var;
        this.f214915i = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f214910d.f214992a + ". resetTileManager:" + this.f214911e + ". success. imageInfo=" + this.f214912f.a() + ". preferredTileSize=" + zq5.h.f(this.f214913g) + ", tileGridMap=" + com.tencent.mm.zoomimage.subsampling.internal.q0.c(this.f214914h.f215142t) + ". '" + this.f214915i.a() + '\'';
    }
}
