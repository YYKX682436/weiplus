package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingUI f202016d;

    public n8(com.tencent.mm.ui.chatting.ChattingUI chattingUI) {
        this.f202016d = chattingUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ChattingUI chattingUI = this.f202016d;
        java.lang.String string = chattingUI.getString(com.tencent.mm.R.string.hba);
        com.tencent.mm.ui.chatting.ChattingUI chattingUI2 = this.f202016d;
        db5.e1.A(chattingUI, string, "", chattingUI2.getString(com.tencent.mm.R.string.hbb), chattingUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.l8(this), new com.tencent.mm.ui.chatting.m8(this));
    }
}
