package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class m20 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t20 f113457d;

    public m20(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var) {
        this.f113457d = t20Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (kotlin.jvm.internal.o.b((java.lang.Boolean) obj, java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = this.f113457d;
            java.lang.String str = ((mm2.c1) t20Var.P0(mm2.c1.class)).f328839l6;
            boolean z17 = str == null || str.length() == 0;
            jz5.g gVar = t20Var.f114334s;
            if (!z17) {
                ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.r20(t20Var));
                t20Var.x1(((mm2.c1) t20Var.P0(mm2.c1.class)).f328839l6, new com.tencent.mm.plugin.finder.live.plugin.k20(t20Var));
            }
            r45.rb rbVar = ((mm2.c1) t20Var.P0(mm2.c1.class)).f328776a3;
            if (kotlin.jvm.internal.o.b(rbVar != null ? rbVar.getString(0) : null, ((mm2.c1) t20Var.P0(mm2.c1.class)).f328781b3)) {
                return;
            }
            r45.rb rbVar2 = ((mm2.c1) t20Var.P0(mm2.c1.class)).f328776a3;
            ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.q20(t20Var, rbVar2 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) rbVar2.getCustom(2) : null));
            r45.rb rbVar3 = ((mm2.c1) t20Var.P0(mm2.c1.class)).f328776a3;
            java.lang.String string = rbVar3 != null ? rbVar3.getString(1) : null;
            if (string == null || string.length() == 0) {
                return;
            }
            t20Var.x1(string, new com.tencent.mm.plugin.finder.live.plugin.l20(t20Var));
        }
    }
}
