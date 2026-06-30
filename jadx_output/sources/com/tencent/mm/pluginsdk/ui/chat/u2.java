package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190674d;

    public u2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190674d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById = this.f190674d.f189987g.findViewById(com.tencent.mm.R.id.f487617p71);
        findViewById.setFocusable(true);
        findViewById.setFocusableInTouchMode(true);
        findViewById.requestFocus();
        findViewById.sendAccessibilityEvent(128);
    }
}
