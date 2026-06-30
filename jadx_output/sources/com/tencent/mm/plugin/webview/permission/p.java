package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.s f183438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f183442h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183443i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.webview.permission.s sVar, int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        super(0);
        this.f183438d = sVar;
        this.f183439e = i17;
        this.f183440f = str;
        this.f183441g = i18;
        this.f183442h = i19;
        this.f183443i = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183438d.f183455a.get();
        if (aVar != null) {
            aVar.c(this.f183439e, this.f183440f, this.f183441g, this.f183442h, this.f183443i);
        }
        return jz5.f0.f302826a;
    }
}
