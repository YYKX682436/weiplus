package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class pe implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f202098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f202099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.qe f202100c;

    public pe(com.tencent.mm.ui.chatting.qe qeVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, com.tencent.mm.pluginsdk.model.app.m mVar) {
        this.f202100c = qeVar;
        this.f202098a = wXMediaMessage;
        this.f202099b = mVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        if (z17) {
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f202098a;
            int type = wXMediaMessage.getType();
            com.tencent.mm.ui.chatting.qe qeVar = this.f202100c;
            com.tencent.mm.pluginsdk.model.app.m mVar = this.f202099b;
            if (type != 8) {
                str2 = null;
            } else {
                if (wXMediaMessage.thumbData == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WXAppMessageReceiver", "code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
                    return;
                }
                str2 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).J(qeVar.f202629a.getContext(), wXMediaMessage, mVar.field_appId);
                if (str2 == null) {
                    return;
                }
            }
            java.lang.String str3 = str2;
            c01.sc.d().a(27, 1);
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = this.f202098a;
            java.lang.String str4 = wXMediaMessage2.messageAction;
            java.lang.String str5 = wXMediaMessage2.messageExt;
            com.tencent.mm.pluginsdk.model.app.k0.D(wXMediaMessage2, mVar.field_appId, mVar.field_appName, qeVar.f202630b.x(), 1, str3);
        }
    }
}
