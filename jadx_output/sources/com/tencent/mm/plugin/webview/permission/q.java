package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.s f183444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f183448h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.webview.permission.s sVar, int i17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(0);
        this.f183444d = sVar;
        this.f183445e = i17;
        this.f183446f = str;
        this.f183447g = str2;
        this.f183448h = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183444d.f183455a.get();
        if (aVar != null) {
            aVar.e(this.f183445e, this.f183446f, this.f183447g, this.f183448h);
        }
        return jz5.f0.f302826a;
    }
}
