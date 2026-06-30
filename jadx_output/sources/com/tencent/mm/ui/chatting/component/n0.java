package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k0 f199528a;

    public n0(com.tencent.mm.ui.chatting.component.k0 k0Var) {
        this.f199528a = k0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotComponent", "msg.what = %s", java.lang.Integer.valueOf(message.what));
        int i17 = message.what;
        com.tencent.mm.ui.chatting.component.k0 k0Var = this.f199528a;
        if (i17 == 1) {
            k0Var.m0(true);
            return;
        }
        if (i17 == 2) {
            k0Var.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            k0Var.f199332h = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotComponent", "setTypingChattingTitle, tick = %s", java.lang.Long.valueOf(currentTimeMillis));
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) k0Var.f198580d.f460708c.a(sb5.z0.class))).A0(com.tencent.mm.R.string.b67);
            com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) k0Var.f198580d.f460708c.a(sb5.z0.class));
            peVar.getClass();
            if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(peVar.f198580d.x())) {
                android.widget.ImageView imageView = (android.widget.ImageView) peVar.f198580d.f460717l.findViewById(com.tencent.mm.R.id.vfy);
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                peVar.f198580d.f460717l.setMMSubTitle("");
            }
        }
    }
}
