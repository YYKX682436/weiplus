package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.n7 f199677d;

    public p7(com.tencent.mm.ui.chatting.component.n7 n7Var) {
        this.f199677d = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        com.tencent.mm.ui.chatting.component.n7 n7Var = this.f199677d;
        yb5.d dVar = n7Var.f198580d;
        if (dVar == null || (baseChattingUIFragment = dVar.f460717l) == null || baseChattingUIFragment.getBodyView() == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.t8.t0(n7Var.f198580d.f460717l.getBodyView());
    }
}
