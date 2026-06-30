package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.MainUI f208047d;

    public r6(com.tencent.mm.ui.conversation.MainUI mainUI) {
        this.f208047d = mainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.MainUI mainUI = this.f208047d;
        if (mainUI.thisActivity() != null) {
            mainUI.thisActivity().supportInvalidateOptionsMenu();
        }
    }
}
