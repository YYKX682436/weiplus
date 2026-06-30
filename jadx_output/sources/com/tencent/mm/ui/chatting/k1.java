package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class k1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f201878d;

    public k1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f201878d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f201878d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[doResume] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
        baseChattingUIFragment.f198153g.x();
        baseChattingUIFragment.f198159p = java.lang.System.currentTimeMillis();
        baseChattingUIFragment.f198152f.f460730y = false;
    }
}
