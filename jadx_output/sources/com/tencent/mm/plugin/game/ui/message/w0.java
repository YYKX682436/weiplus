package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.c1 f141652d;

    public w0(com.tencent.mm.plugin.game.ui.message.c1 c1Var) {
        this.f141652d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.b1 b1Var = this.f141652d.f141536d2;
        b1Var.getClass();
        b1Var.f141526g = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2);
        android.database.Cursor i17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().i1(2);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.message.v0(this, i17));
    }
}
