package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class vb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f136234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f136235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f136236f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, long j17) {
        super(0);
        this.f136234d = ncVar;
        this.f136235e = finderObject;
        this.f136236f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f136234d.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = "start fetch feed:" + pm0.v.u(this.f136235e.getId()) + " comment:" + pm0.v.u(this.f136236f);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
