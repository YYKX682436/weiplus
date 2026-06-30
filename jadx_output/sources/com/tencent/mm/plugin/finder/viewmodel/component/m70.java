package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class m70 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n70 f135141a;

    public m70(com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var) {
        this.f135141a = n70Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.viewmodel.component.n70 n70Var = this.f135141a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.ga1 ga1Var = (r45.ga1) fVar.f70618d;
            n70Var.f135268d = ga1Var.getLong(4);
            n70Var.f135266b = ga1Var.getByteString(1);
            r45.yx2 yx2Var = (r45.yx2) ga1Var.getCustom(3);
            if (yx2Var != null) {
                n70Var.g(yx2Var);
                n70Var.f135269e = yx2Var.getInteger(0);
            }
        }
        n70Var.f135267c = false;
        return jz5.f0.f302826a;
    }
}
