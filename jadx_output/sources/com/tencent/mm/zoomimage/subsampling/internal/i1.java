package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f214964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yq5.m f214965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f214966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.graphics.Bitmap bitmap, yq5.m mVar, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var) {
        super(0);
        this.f214964d = bitmap;
        this.f214965e = mVar;
        this.f214966f = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "TileManager. loadTile. canceled. bitmap=" + this.f214964d + ", " + this.f214965e + ". '" + this.f214966f.f215124b.a() + '\'';
    }
}
