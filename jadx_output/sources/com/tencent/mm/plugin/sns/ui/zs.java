package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class zs implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f171711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.at f171713d;

    public zs(com.tencent.mm.plugin.sns.ui.at atVar, java.lang.String str, android.content.Context context, java.lang.String str2) {
        this.f171713d = atVar;
        this.f171710a = str;
        this.f171711b = context;
        this.f171712c = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
        android.content.Context context = this.f171711b;
        com.tencent.mm.plugin.sns.ui.at atVar = this.f171713d;
        if (!z17) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.j3u));
            atVar.f167791p.finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.title = atVar.f167783e;
        wXMediaMessage.description = atVar.f167785g;
        com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
        wXWebpageObject.canvasPageXml = this.f171710a;
        wXWebpageObject.webpageUrl = atVar.f167786h;
        wXMediaMessage.mediaObject = wXWebpageObject;
        int i18 = com.tencent.mm.plugin.sns.ui.SnsTransparentUI.f167480e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        com.tencent.mm.plugin.sns.ui.SnsTransparentUI snsTransparentUI = atVar.f167791p;
        java.util.Map map = snsTransparentUI.f167481d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        java.lang.String str2 = atVar.f167784f;
        if (!((java.util.HashMap) map).containsKey(str2)) {
            com.tencent.mm.sdk.platformtools.w2.a(str2);
            za4.t0.b("adId", atVar.f167784f, false, 1000000001, 0, new com.tencent.mm.plugin.sns.ui.ys(this, wXMediaMessage, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        java.util.Map map2 = snsTransparentUI.f167481d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.HashMap) map2).get(str2);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("SnsTransparentUI", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
        }
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        java.lang.String str3 = this.f171712c;
        jtVar.f7083d = str3;
        jtVar.f7084e = 49;
        jtVar.f7085f = "";
        jtVar.f7086g = "";
        jtVar.f7097r = atVar.f167787i;
        sendAppMsgEvent.e();
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
            am.mt mtVar = sendMsgEvent.f54752g;
            mtVar.f7362a = str3;
            mtVar.f7363b = str;
            mtVar.f7364c = c01.e2.C(str3);
            mtVar.f7365d = 0;
            sendMsgEvent.e();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openAdCanvasPage doTransmit confirm dialog in SnsTransparentUI, uxInfo is ");
        java.lang.String str4 = atVar.f167788m;
        sb6.append(str4);
        sb6.append(", selfUserName is ");
        sb6.append(atVar.f167789n);
        sb6.append(", sendUserName is ");
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", sb6.toString());
        o94.a.b(str3, str4, atVar.f167790o);
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490560yi));
        snsTransparentUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
    }
}
