package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class m1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f201940d;

    public m1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f201940d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f201940d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[doStop] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
        baseChattingUIFragment.f198152f.f460730y = true;
    }
}
