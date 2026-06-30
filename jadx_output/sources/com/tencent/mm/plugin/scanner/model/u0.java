package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes12.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f159071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context) {
        super(1);
        this.f159071d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        l30.f request = (l30.f) obj;
        kotlin.jvm.internal.o.g(request, "$this$request");
        com.tencent.mm.plugin.expansions.w wVar = (com.tencent.mm.plugin.expansions.w) request;
        wVar.f99777a = new com.tencent.mm.plugin.scanner.model.s0(this.f159071d);
        wVar.getClass();
        return jz5.f0.f302826a;
    }
}
