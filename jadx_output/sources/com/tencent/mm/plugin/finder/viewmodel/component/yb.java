package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class yb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f136551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar) {
        super(0);
        this.f136551d = ncVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f136551d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = "最终条数不够";
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
