package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str) {
        super(0);
        this.f215103d = m0Var;
        this.f215104e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f215103d;
        sb6.append(m0Var.f214992a);
        sb6.append(". refreshTiles:");
        sb6.append(this.f215104e);
        sb6.append(". interrupted, stopped. '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
