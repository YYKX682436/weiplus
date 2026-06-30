package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v0 f215105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.zoomimage.subsampling.internal.v0 v0Var) {
        super(0);
        this.f215105d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileDecoder. useDecoder. regionDecoderCount=");
        com.tencent.mm.zoomimage.subsampling.internal.v0 v0Var = this.f215105d;
        sb6.append(v0Var.f215121i);
        sb6.append(". ");
        sb6.append(v0Var.f215117e);
        return sb6.toString();
    }
}
