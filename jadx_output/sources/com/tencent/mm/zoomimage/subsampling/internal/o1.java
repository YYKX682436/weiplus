package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215051h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String str, zq5.e eVar, zq5.e eVar2, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, zq5.e eVar3) {
        super(0);
        this.f215047d = str;
        this.f215048e = eVar;
        this.f215049f = eVar2;
        this.f215050g = v1Var;
        this.f215051h = eVar3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. refreshTiles:");
        sb6.append(this.f215047d);
        sb6.append(". interrupted, imageLoadRect is empty. imageLoadRect=");
        sb6.append(zq5.f.b(this.f215048e));
        sb6.append(" -> ");
        sb6.append(zq5.f.b(this.f215049f));
        sb6.append(", imageSize=");
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f215050g;
        sb6.append(zq5.h.f(v1Var.f215127e.f464591a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(v1Var.f215128f));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(v1Var.f215129g));
        sb6.append(", contentVisibleRect=");
        sb6.append(zq5.f.b(this.f215051h));
        sb6.append(", '");
        sb6.append(v1Var.f215124b.a());
        sb6.append('\'');
        return sb6.toString();
    }
}
