package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class e1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f200452d;

    public e1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f200452d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f200452d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[onExitBegin] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
        baseChattingUIFragment.getClass();
        baseChattingUIFragment.f198152f.f460730y = true;
        baseChattingUIFragment.f198153g.K();
    }
}
