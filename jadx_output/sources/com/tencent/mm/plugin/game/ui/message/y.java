package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f141659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView f141660e;

    public y(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, android.content.Context context) {
        this.f141660e = interactiveMsgMRecycleView;
        this.f141659d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int u17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1);
        android.database.Cursor k17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().k1(1, 0, 15);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.message.x(this, k17, u17));
    }
}
