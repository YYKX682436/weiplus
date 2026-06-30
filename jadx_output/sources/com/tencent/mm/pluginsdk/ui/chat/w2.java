package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class w2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190704a;

    public w2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190704a = chatFooter;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190704a;
        chatFooter.f190039p.setBackgroundResource(com.tencent.mm.R.drawable.ahj);
        chatFooter.f190039p.setEnabled(true);
        if (chatFooter.S3) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter.p(chatFooter);
            db5.t7.i(chatFooter.getContext(), chatFooter.getContext().getResources().getString(com.tencent.mm.R.string.azu), com.tencent.mm.R.raw.voice_to_short);
        } else {
            db5.d5 d5Var = chatFooter.L1;
            if (d5Var != null) {
                d5Var.dismiss();
            }
        }
    }
}
