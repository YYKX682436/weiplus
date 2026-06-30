package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUI f202068d;

    public o8(com.tencent.mm.ui.chatting.ChattingUI chattingUI) {
        this.f202068d = chattingUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ChattingUI chattingUI = this.f202068d;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = chattingUI.f198254h;
        if (chattingUIFragment != null) {
            o25.n1.d(chattingUI, chattingUIFragment.getBodyView());
        }
        zo.e.g(chattingUI.f198254h.getContext());
    }
}
