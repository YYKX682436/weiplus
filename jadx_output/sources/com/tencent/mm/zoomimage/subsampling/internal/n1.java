package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f215031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f215032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f215033g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f215034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215035i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f215036m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String str, java.util.List list, boolean z17, int i17, int i18, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, float f17) {
        super(0);
        this.f215030d = str;
        this.f215031e = list;
        this.f215032f = z17;
        this.f215033g = i17;
        this.f215034h = i18;
        this.f215035i = v1Var;
        this.f215036m = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. refreshTiles:");
        sb6.append(this.f215030d);
        sb6.append(". interrupted, foregroundTiles is null or size is 1. foregroundTilesSize=");
        java.util.List list = this.f215031e;
        sb6.append(list != null ? list.size() : 0);
        sb6.append(", sampleSizeChanged=");
        sb6.append(this.f215032f);
        sb6.append(", sampleSize=");
        sb6.append(this.f215033g);
        sb6.append(" -> ");
        sb6.append(this.f215034h);
        sb6.append(", imageSize=");
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f215035i;
        sb6.append(zq5.h.f(v1Var.f215127e.f464591a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(v1Var.f215128f));
        sb6.append(", scale=");
        sb6.append(zq5.b.c(this.f215036m, 4));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(v1Var.f215129g));
        sb6.append(", tileGridMap=");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.q0.c(v1Var.f215142t));
        sb6.append(". '");
        sb6.append(v1Var.f215124b.a());
        sb6.append('\'');
        return sb6.toString();
    }
}
