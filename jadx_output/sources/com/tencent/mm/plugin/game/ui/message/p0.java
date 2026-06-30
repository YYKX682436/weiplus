package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class p0 implements com.tencent.mm.plugin.game.ui.message.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.t0 f141615a;

    public p0(com.tencent.mm.plugin.game.ui.message.t0 t0Var) {
        this.f141615a = t0Var;
    }

    @Override // com.tencent.mm.plugin.game.ui.message.i1
    public void a() {
        com.tencent.mm.plugin.game.ui.message.s sVar;
        com.tencent.mm.plugin.game.ui.message.t0 t0Var = this.f141615a;
        com.tencent.mm.plugin.game.ui.message.r0 r0Var = t0Var.f141641d2;
        if (r0Var == null) {
            return;
        }
        r0Var.f141623g = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1);
        android.database.Cursor i17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().i1(1);
        t0Var.f141641d2.x(i17);
        if ((i17 == null || i17.getCount() == 0) && (sVar = t0Var.f141644g2) != null) {
            sVar.a();
        }
    }
}
