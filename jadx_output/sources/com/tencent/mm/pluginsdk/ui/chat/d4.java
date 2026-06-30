package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f190262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190263e;

    public d4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.Runnable runnable) {
        this.f190263e = chatFooter;
        this.f190262d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f190263e.setAppPanelVisible(4);
        java.lang.Runnable runnable = this.f190262d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
