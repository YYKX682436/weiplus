package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String str, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var) {
        super(0);
        this.f215070d = str;
        this.f215071e = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "TileManager. updateTileSnapshotList:" + this.f215070d + ". skipped, notifyTileSnapshotListJob is running. '" + this.f215071e.f215124b.a() + '\'';
    }
}
