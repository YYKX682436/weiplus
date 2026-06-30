package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190445d;

    public k4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190445d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190445d;
        try {
            hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
            chatFooter.q0();
            boolean z17 = chatFooter.f189970d2 == 3 || chatFooter.f190010k2;
            int a17 = (int) com.tencent.mm.ui.gk.a(i65.a.f(chatFooter.getContext(), z17 ? com.tencent.mm.R.dimen.f479696an0 : com.tencent.mm.R.dimen.f479701cx));
            int max = z17 ? java.lang.Math.max(a17, chatFooter.f190078v2) : a17;
            com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = chatFooter.f189982f2;
            boolean z18 = chattingScrollLayout != null && chattingScrollLayout.a(max);
            if (!z18 && z17 && chatFooter.f189982f2 != null) {
                android.view.View view = chatFooter.f190059s;
                int height = view == null ? 0 : view.getHeight();
                android.view.View view2 = chatFooter.f190083w;
                int height2 = view2 == null ? 0 : view2.getHeight();
                int i17 = chatFooter.f190078v2;
                int[] iArr = {i17 + height, i17 + height + height2, i17 + java.lang.Math.max(height, a17)};
                int i18 = 0;
                while (true) {
                    if (i18 >= 3) {
                        break;
                    }
                    int i19 = iArr[i18];
                    if (i19 > max && chatFooter.f189982f2.a(i19)) {
                        z18 = true;
                        max = i19;
                        break;
                    }
                    i18++;
                }
                if (!z18) {
                    max = java.lang.Math.max(max, chatFooter.f190078v2 + java.lang.Math.max(height, a17));
                    z18 = true;
                }
            }
            if (!z18) {
                chatFooter.A2 = false;
                return;
            }
            chatFooter.f190105z2 = max;
            int i27 = chatFooter.f189970d2;
            chatFooter.B2 = i27;
            chatFooter.A2 = true;
            if (i27 != 4) {
                chatFooter.E1(4, true, -1);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
