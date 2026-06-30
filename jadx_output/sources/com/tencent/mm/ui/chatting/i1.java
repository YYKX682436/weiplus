package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class i1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f201827d;

    public i1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f201827d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f201827d;
        yb5.d dVar = baseChattingUIFragment.f198152f;
        dVar.f460714i = true;
        dVar.P(true);
        yb5.d dVar2 = baseChattingUIFragment.f198152f;
        dVar2.f460728w = false;
        dVar2.V(false);
        baseChattingUIFragment.f198152f.f460730y = false;
        baseChattingUIFragment.f198153g.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[doCreate] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
    }
}
