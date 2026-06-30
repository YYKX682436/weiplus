package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f215147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f215149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yq5.k f215150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, java.lang.String str, java.lang.Object obj, yq5.k kVar) {
        super(0);
        this.f215147d = m0Var;
        this.f215148e = str;
        this.f215149f = obj;
        this.f215150g = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f215147d.f214992a + ". resetTileDecoder:" + this.f215148e + ". failed. " + kotlin.Result.m524exceptionOrNullimpl(this.f215149f) + ". '" + this.f215150g.a() + '\'';
    }
}
