package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f214990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(java.lang.String str, int i17, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var) {
        super(0);
        this.f214988d = str;
        this.f214989e = i17;
        this.f214990f = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "TileManager. refreshTiles:" + this.f214988d + ". interrupted, rotation is not a multiple of 90: " + this.f214989e + ". '" + this.f214990f.f215124b.a() + '\'';
    }
}
