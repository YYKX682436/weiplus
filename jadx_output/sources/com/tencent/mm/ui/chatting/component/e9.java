package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.g9 f198963d;

    public e9(com.tencent.mm.ui.chatting.component.g9 g9Var) {
        this.f198963d = g9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        com.tencent.mm.ui.chatting.component.g9 g9Var = this.f198963d;
        yb5.d dVar = g9Var.f198580d;
        if (dVar == null || (baseChattingUIFragment = dVar.f460717l) == null || baseChattingUIFragment.getBodyView() == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.t8.t0(g9Var.f198580d.f460717l.getBodyView());
    }
}
