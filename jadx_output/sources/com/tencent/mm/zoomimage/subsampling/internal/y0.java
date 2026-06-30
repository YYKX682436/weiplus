package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f215163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, int i17) {
        super(0);
        this.f215162d = v1Var;
        this.f215163e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. init. imageSize=");
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f215162d;
        sb6.append(zq5.h.f(v1Var.f215127e.f464591a));
        sb6.append(", contentSize=");
        sb6.append(zq5.h.f(v1Var.f215128f));
        sb6.append(", preferredTileSize=");
        sb6.append(zq5.h.f(v1Var.f215129g));
        sb6.append(", maxSampleSize=");
        sb6.append(this.f215163e);
        sb6.append(", sortedTileGridMap=");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.q0.c(v1Var.f215142t));
        sb6.append(". '");
        sb6.append(v1Var.f215124b.a());
        sb6.append('\'');
        return sb6.toString();
    }
}
