package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class id extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f112959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        super(0);
        this.f112959d = adVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f112959d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(adVar.f365323d.getContext());
        android.view.ViewGroup viewGroup = adVar.f365323d;
        u1Var.g(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d_8));
        u1Var.n(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d9w));
        u1Var.j(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.l(new com.tencent.mm.plugin.finder.live.plugin.hd(adVar));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
