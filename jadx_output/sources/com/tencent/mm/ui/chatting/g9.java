package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUIFragment f200525d;

    public g9(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        this.f200525d = chattingUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f200525d.f1(true, false, true);
    }
}
