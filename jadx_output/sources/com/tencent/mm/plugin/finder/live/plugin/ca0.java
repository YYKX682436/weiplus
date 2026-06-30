package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ca0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f112130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var) {
        super(0);
        this.f112129d = viewGroup;
        this.f112130e = ea0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f112129d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.ViewGroup viewGroup = this.f112129d;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f112130e;
        android.view.ViewGroup viewGroup2 = ea0Var.f112386p;
        qo0.c cVar = ea0Var.f112387q;
        com.tencent.mm.plugin.finder.live.view.k0 R0 = ea0Var.R0();
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R0 : null;
        xt2.e3 e3Var = new xt2.e3(context, viewGroup, viewGroup2, cVar, finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null, this.f112130e);
        e3Var.setUserActionClick(new com.tencent.mm.plugin.finder.live.plugin.aa0(ea0Var));
        e3Var.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ba0(ea0Var));
        return e3Var;
    }
}
