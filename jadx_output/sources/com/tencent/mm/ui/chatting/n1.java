package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class n1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f201993d;

    public n1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f201993d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f201993d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[doDestroy] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
        if (baseChattingUIFragment.J0(16) && !baseChattingUIFragment.J0(8)) {
            throw new java.lang.RuntimeException(java.lang.String.format("[doDestroy] never doPause, activity:%s isPreLoaded:%b isForeground:%b isFinishing:%b isNeverCreate:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i), java.lang.Boolean.valueOf(baseChattingUIFragment.f198152f.f460714i), java.lang.Boolean.valueOf(baseChattingUIFragment.isFinishing()), java.lang.Boolean.valueOf(baseChattingUIFragment.J0(2))));
        }
        yb5.d dVar = baseChattingUIFragment.f198152f;
        dVar.f460714i = false;
        dVar.P(false);
        yb5.d dVar2 = baseChattingUIFragment.f198152f;
        dVar2.f460728w = false;
        dVar2.V(false);
        baseChattingUIFragment.f198160q = 0;
    }
}
