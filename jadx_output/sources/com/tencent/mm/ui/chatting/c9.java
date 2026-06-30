package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f198519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f198520e;

    public c9(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment, boolean z17) {
        this.f198520e = chattingUIFragment;
        this.f198519d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
        this.f198520e.m1(this.f198519d);
    }
}
