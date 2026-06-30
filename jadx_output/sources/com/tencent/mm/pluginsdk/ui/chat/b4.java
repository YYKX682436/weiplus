package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190189d;

    public b4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190189d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "withLastText: ");
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190189d;
        chatFooter.z1();
        chatFooter.U0(true);
    }
}
