package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class xb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.yb f200225d;

    public xb(com.tencent.mm.ui.chatting.component.yb ybVar) {
        this.f200225d = ybVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f200225d.f200309d.f200366c.f199263e;
        android.widget.ImageButton imageButton = chatFooter.f190103z;
        if (imageButton == null || imageButton.getVisibility() != 0) {
            return;
        }
        chatFooter.r1(true);
    }
}
