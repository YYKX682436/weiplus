package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class e2 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChatFooterCustom f200453a;

    public e2(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        this.f200453a = chatFooterCustom;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f200453a;
        if (i17 == 0) {
            int i18 = com.tencent.mm.ui.chatting.ChatFooterCustom.G;
            chatFooterCustom.n();
        } else {
            if (i17 != 1) {
                return;
            }
            int i19 = com.tencent.mm.ui.chatting.ChatFooterCustom.G;
            chatFooterCustom.m();
        }
    }
}
