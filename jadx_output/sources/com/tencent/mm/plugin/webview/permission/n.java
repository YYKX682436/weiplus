package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.s f183431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.webview.permission.s sVar, int i17, java.lang.String str) {
        super(0);
        this.f183431d = sVar;
        this.f183432e = i17;
        this.f183433f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183431d.f183455a.get();
        if (aVar != null) {
            aVar.d(this.f183432e, this.f183433f);
        }
        return jz5.f0.f302826a;
    }
}
