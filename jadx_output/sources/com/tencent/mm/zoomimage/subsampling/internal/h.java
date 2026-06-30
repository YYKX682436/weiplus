package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str) {
        super(0);
        this.f214955d = m0Var;
        this.f214956e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214955d;
        sb6.append(m0Var.f214992a);
        sb6.append(". cleanTileManager:");
        sb6.append(this.f214956e);
        sb6.append(". '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
