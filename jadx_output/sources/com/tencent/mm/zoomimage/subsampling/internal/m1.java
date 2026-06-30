package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f215018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f215020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, java.lang.String str, com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var) {
        super(0);
        this.f215018d = i17;
        this.f215019e = str;
        this.f215020f = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "TileManager. refreshTiles:" + this.f215019e + ". interrupted, continuousTransformType is " + gr5.s.f274946a.a(this.f215018d) + ". '" + this.f215020f.f215124b.a() + '\'';
    }
}
