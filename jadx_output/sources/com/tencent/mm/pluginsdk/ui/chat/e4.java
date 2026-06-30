package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f190296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190297e;

    public e4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.Runnable runnable) {
        this.f190297e = chatFooter;
        this.f190296d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f190297e.f189981f.setVisibility(4);
        java.lang.Runnable runnable = this.f190296d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
