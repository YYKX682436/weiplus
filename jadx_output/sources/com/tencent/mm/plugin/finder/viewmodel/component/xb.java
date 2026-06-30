package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f136434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f136435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f136434d = ncVar;
        this.f136435e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f136434d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = "在回包前已经取消对应的互动操作，取消" + ((r45.a21) this.f136435e.f70618d).f369656d.size() + " 条强化流Feed的插入";
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
