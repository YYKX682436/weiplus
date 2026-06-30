package com.tencent.mm.plugin.game.ui;

/* loaded from: classes14.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.e1 f141436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.game.ui.e1 e1Var) {
        super(1);
        this.f141436d = e1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.game.ui.v0 item = (com.tencent.mm.plugin.game.ui.v0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f141793a;
        int hashCode = str.hashCode();
        com.tencent.mm.plugin.game.ui.e1 e1Var = this.f141436d;
        if (hashCode != -1651158469) {
            if (hashCode != -1185862858) {
                if (hashCode == -390731183 && str.equals("reddot_mock")) {
                    com.tencent.mm.plugin.game.ui.j1 j1Var = com.tencent.mm.plugin.game.ui.j1.f141435b;
                    e1Var.getClass();
                    e1Var.f141371a.add(j1Var);
                }
            } else if (str.equals("reddot_control")) {
                com.tencent.mm.plugin.game.ui.i1 i1Var = com.tencent.mm.plugin.game.ui.i1.f141415b;
                e1Var.getClass();
                e1Var.f141371a.add(i1Var);
            }
        } else if (str.equals("reddot_switch")) {
            com.tencent.mm.plugin.game.ui.k1 k1Var = com.tencent.mm.plugin.game.ui.k1.f141443b;
            e1Var.getClass();
            e1Var.f141371a.add(k1Var);
        }
        return jz5.f0.f302826a;
    }
}
