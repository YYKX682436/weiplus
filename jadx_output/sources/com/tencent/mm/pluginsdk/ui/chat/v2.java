package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190690d;

    public v2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190690d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190690d;
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = chatFooter.f189987g;
        if (ibVar != null) {
            ibVar.f();
            chatFooter.f189987g.setVisibility(8);
        }
    }
}
