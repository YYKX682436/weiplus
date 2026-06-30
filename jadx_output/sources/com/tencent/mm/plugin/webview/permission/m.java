package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.s f183428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183430f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.webview.permission.s sVar, int i17, java.lang.String str) {
        super(0);
        this.f183428d = sVar;
        this.f183429e = i17;
        this.f183430f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.permission.a aVar = (com.tencent.mm.plugin.webview.permission.a) this.f183428d.f183455a.get();
        if (aVar != null) {
            aVar.f(this.f183429e, this.f183430f);
        }
        return jz5.f0.f302826a;
    }
}
