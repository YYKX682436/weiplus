package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f141661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.c1 f141662e;

    public y0(com.tencent.mm.plugin.game.ui.message.c1 c1Var, android.content.Context context) {
        this.f141662e = c1Var;
        this.f141661d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int u17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2);
        android.database.Cursor i17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().i1(2);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.message.x0(this, i17, u17));
    }
}
