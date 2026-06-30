package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.i f115510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f115514h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.live.util.i iVar, android.graphics.Bitmap bitmap, java.lang.String str, android.view.View view, yz5.l lVar) {
        super(1);
        this.f115510d = iVar;
        this.f115511e = bitmap;
        this.f115512f = str;
        this.f115513g = view;
        this.f115514h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.util.f(this.f115510d, this.f115511e, this.f115512f, (android.graphics.Bitmap) obj, this.f115513g, this.f115514h));
        return jz5.f0.f302826a;
    }
}
