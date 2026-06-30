package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class a4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190175a;

    public a4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190175a = chatFooter;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        if (message.what != 1002) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190175a;
        if (chatFooter.f190021m == null || (obj = message.obj) == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            chatFooter.f190021m.setAlpha(1.0f);
        } else {
            chatFooter.f190021m.setAlpha(0.5f);
        }
        chatFooter.U0(booleanValue);
    }
}
