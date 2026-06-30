package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f135735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f135736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        super(0);
        this.f135735d = appCompatActivity;
        this.f135736e = ptVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qd2.k0 k0Var = new qd2.k0(this.f135735d, new com.tencent.mm.plugin.finder.viewmodel.component.ot(this.f135736e.K));
        qd2.g0 g0Var = k0Var.f361786c;
        android.hardware.Sensor sensor = g0Var.f361739c;
        if (sensor != null && !g0Var.f361741e) {
            g0Var.f361738b.registerListener(g0Var.f361740d, sensor, g0Var.f361742f);
            g0Var.f361741e = true;
        }
        return k0Var;
    }
}
