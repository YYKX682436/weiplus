package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h50 implements com.tencent.mm.plugin.finder.live.plugin.q50 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112775a;

    public h50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f112775a = r60Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public boolean a(cm2.t data) {
        kotlin.jvm.internal.o.g(data, "data");
        return (data instanceof cm2.m0) || (data instanceof cm2.k0);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.q50
    public com.tencent.mm.plugin.finder.live.plugin.ep0 b(cm2.t promoteData) {
        kotlin.jvm.internal.o.g(promoteData, "promoteData");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f112775a;
        android.view.View findViewById = r60Var.f114095p.findViewById(com.tencent.mm.R.id.muu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(r60Var.f365323d.getContext()).inflate(com.tencent.mm.R.layout.das, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new com.tencent.mm.plugin.finder.live.plugin.ea0((android.view.ViewGroup) findViewById, (android.view.ViewGroup) inflate, r60Var.f114097r, r60Var.f114094J, promoteData);
    }
}
