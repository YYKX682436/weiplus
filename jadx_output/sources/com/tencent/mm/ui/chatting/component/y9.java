package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class y9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent f200306d;

    public y9(com.tencent.mm.ui.chatting.component.EmojiComponent$1 emojiComponent$1, com.tencent.mm.autogen.events.AppEmojiMsgProgressEvent appEmojiMsgProgressEvent) {
        this.f200306d = appEmojiMsgProgressEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.a0 a0Var = this.f200306d.f53987g;
        java.lang.String str = a0Var.f6110a;
        int i17 = a0Var.f6111b;
        int i18 = a0Var.f6112c;
        java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.ui.chatting.viewitems.h6.f204080i;
        if (!hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("AppMsgEmojiItemHolder", "no contain attchid:%s");
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.h6 h6Var = (com.tencent.mm.ui.chatting.viewitems.h6) ((java.lang.ref.WeakReference) hashMap.get(str)).get();
        if (h6Var != null) {
            if (i18 == 0) {
                h6Var.f204082c.setVisibility(0);
                h6Var.f204084e.setVisibility(8);
                h6Var.f204083d.setVisibility(8);
                h6Var.f204082c.setProgress(0);
                return;
            }
            if (i18 == 1) {
                h6Var.f204082c.setVisibility(8);
                h6Var.f204084e.setVisibility(8);
                h6Var.f204083d.setVisibility(8);
            } else {
                if (i18 != 2) {
                    return;
                }
                h6Var.f204082c.setVisibility(8);
                h6Var.f204084e.setVisibility(8);
                h6Var.f204083d.setVisibility(0);
                h6Var.f204082c.setProgress(i17);
                h6Var.f204083d.setImageResource(com.tencent.mm.R.drawable.emoji_download_failed_btn);
                com.tencent.mm.ui.chatting.viewitems.a0 a0Var2 = h6Var.chattingItem;
                if (a0Var2 instanceof com.tencent.mm.ui.chatting.viewitems.i6) {
                    ((com.tencent.mm.ui.chatting.viewitems.i6) a0Var2).f204167t = true;
                }
            }
        }
    }
}
