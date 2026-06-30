package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f120525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f120526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, r45.z53 z53Var) {
        super(2);
        this.f120525d = d6Var;
        this.f120526e = z53Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.u24 it = (r45.u24) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f120525d;
        com.tencent.mars.xlog.Log.i(d6Var.f118062d, "select value:" + it.getInteger(1) + ", tip:" + it.getString(0));
        androidx.lifecycle.j0 j0Var = ((mm2.c1) d6Var.f118061c.P0(mm2.c1.class)).f328833k6;
        java.lang.String string = it.getString(0);
        if (string == null) {
            string = "";
        }
        j0Var.postValue(string);
        r45.z53 z53Var = this.f120526e;
        if (z53Var != null) {
            z53Var.set(12, java.lang.Integer.valueOf(it.getInteger(1)));
        }
        return jz5.f0.f302826a;
    }
}
