package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class tb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f129871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        super(0);
        this.f129871d = finderPostAtUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(ll6);
        e4Var.f211776c = "notify " + pm0.v.u(this.f129871d.f128650z) + " success";
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
