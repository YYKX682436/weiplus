package com.tencent.mm.plugin.webview.ui.tools.media;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/h0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class h0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable data = (com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        r45.ee eeVar = data.f185733h;
        boolean z17 = false;
        if (eeVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MPVideoTransmit", "doSendAppMsg msgInfo is null");
        } else {
            com.tencent.mm.pluginsdk.model.app.q3 q3Var = new com.tencent.mm.pluginsdk.model.app.q3();
            q3Var.webpageUrl = eeVar.f373347o;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
            wXMediaMessage.mediaObject = q3Var;
            wXMediaMessage.title = eeVar.f373342g;
            dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.media.i0(eeVar));
            com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
            am.jt jtVar = sendAppMsgEvent.f54749g;
            jtVar.f7080a = wXMediaMessage;
            jtVar.f7083d = data.f185729d;
            jtVar.f7084e = 2;
            jtVar.f7085f = eeVar.f373348p;
            jtVar.f7086g = eeVar.f373349q;
            try {
                java.lang.String str = eeVar.f373350r;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                jtVar.f7091l = str;
                java.lang.String a17 = c01.n2.a(str);
                c01.l2 c17 = c01.n2.d().c(a17, true);
                kotlin.jvm.internal.o.d(c17);
                c17.i("sendAppMsgScene", 2);
                c17.i("preChatName", eeVar.f373351s);
                c17.i("prePublishId", eeVar.f373350r);
                c17.i("preUsername", eeVar.f373352t);
                c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                c17.i("_tmpl_webview_transfer_scene", 11);
                c17.i("_DATA_CENTER_VID", eeVar.f373341f);
                c17.i("_DATA_CENTER__DULATION", java.lang.Integer.valueOf(eeVar.f373344i));
                c17.i("_DATA_CENTER_VIDEO_WIDTH", java.lang.Integer.valueOf(eeVar.f373345m));
                c17.i("_DATA_CENTER_VIDEO_HEIGHT", java.lang.Integer.valueOf(eeVar.f373346n));
                c17.i("_DATA_CENTER_COVER_URL", eeVar.f373343h);
                c17.i("_DATA_CENTER_VIDEO_PLAY_URL", eeVar.f373340e);
                c17.i("_DATA_CENTER_VIDEO_MP_URL", eeVar.f373339d);
                c17.i("_DATA_CENTER_IS_MP_SHARE_VIDEO", java.lang.Boolean.TRUE);
                jtVar.f7096q = a17;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MPVideoTransmit", "init bunddata failed : %s", e17.getMessage());
            }
            boolean e18 = sendAppMsgEvent.e();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(data.f185731f)) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                java.lang.String str2 = data.f185729d;
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = str2;
                mtVar.f7363b = data.f185731f;
                mtVar.f7364c = c01.e2.C(str2);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            z17 = e18;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("ret", z17);
        callback.a(bundle);
    }
}
