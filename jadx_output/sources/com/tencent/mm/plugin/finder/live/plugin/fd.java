package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f112540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        super(0);
        this.f112539d = str;
        this.f112540e = adVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f112539d;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f112540e;
        if (z17) {
            str = adVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.d8o);
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(adVar.f365323d.getContext());
        u1Var.g(str);
        u1Var.n(adVar.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.dhn));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
