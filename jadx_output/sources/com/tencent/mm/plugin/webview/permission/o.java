package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.s f183434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.webview.permission.s sVar, int i17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f183434d = sVar;
        this.f183435e = i17;
        this.f183436f = str;
        this.f183437g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183434d.f183455a.get();
        if (aVar != null) {
            aVar.a(this.f183435e, this.f183436f, this.f183437g);
        }
        return jz5.f0.f302826a;
    }
}
