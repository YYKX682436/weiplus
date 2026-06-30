package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208099d;

    public u6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208099d = mainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f208099d;
        mainUI.f207380w.c();
        mainUI.f207381x.t();
    }
}
