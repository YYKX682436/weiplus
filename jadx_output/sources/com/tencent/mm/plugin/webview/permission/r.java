package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.s f183449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f183451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f183454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.webview.permission.s sVar, int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(0);
        this.f183449d = sVar;
        this.f183450e = i17;
        this.f183451f = z17;
        this.f183452g = str;
        this.f183453h = str2;
        this.f183454i = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183449d.f183455a.get();
        if (aVar != null) {
            aVar.h(this.f183450e, this.f183451f, this.f183452g, this.f183453h, this.f183454i);
        }
        return jz5.f0.f302826a;
    }
}
