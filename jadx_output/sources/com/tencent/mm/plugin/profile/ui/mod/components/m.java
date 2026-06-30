package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f153951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f153950d = j0Var;
        this.f153951e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153950d;
        mr3.n n76 = j0Var.n7();
        final androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f153951e;
        return new xm3.t0(n76, appCompatActivity, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.mod.components.ModImageDescriptionUI$adapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    kotlinx.coroutines.y0 b17 = v65.m.b(androidx.appcompat.app.AppCompatActivity.this);
                    com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var2 = j0Var;
                    return new mr3.j(b17, new com.tencent.mm.plugin.profile.ui.mod.components.i(j0Var2), (mr3.d) ((jz5.n) j0Var2.f153935w).getValue(), new com.tencent.mm.plugin.profile.ui.mod.components.j(j0Var));
                }
                kotlinx.coroutines.y0 b18 = v65.m.b(androidx.appcompat.app.AppCompatActivity.this);
                com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var3 = j0Var;
                int i17 = com.tencent.mm.plugin.profile.ui.mod.components.j0.A;
                boolean Y6 = j0Var3.Y6();
                com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var4 = j0Var;
                return new mr3.v(b18, Y6, new com.tencent.mm.plugin.profile.ui.mod.components.k(j0Var4), new com.tencent.mm.plugin.profile.ui.mod.components.l(j0Var4));
            }
        }, false, 8, null);
    }
}
