package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f198956e;

    public e2(com.tencent.mm.ui.chatting.component.q2 q2Var, java.lang.String str) {
        this.f198956e = q2Var;
        this.f198955d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f198956e.f198580d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "[getChatroomInfoDetail] mChattingContext is null!");
        } else {
            c01.v1.c(this.f198955d);
        }
    }
}
