package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ve extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f136244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar) {
        super(0);
        this.f136244d = yeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f136244d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = "触发投放实时回收";
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
