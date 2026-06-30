package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class ys implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f171645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zs f171647c;

    public ys(com.tencent.mm.plugin.sns.ui.zs zsVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str) {
        this.f171647c = zsVar;
        this.f171645a = wXMediaMessage;
        this.f171646b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
        com.tencent.mm.plugin.sns.ui.zs zsVar = this.f171647c;
        android.content.Context context = zsVar.f171711b;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.j3u));
        zsVar.f171713d.f167791p.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        java.lang.String str2 = this.f171646b;
        com.tencent.mm.plugin.sns.ui.zs zsVar = this.f171647c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
        try {
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
            com.tencent.mm.plugin.sns.ui.at atVar = zsVar.f171713d;
            java.lang.String str3 = zsVar.f171712c;
            com.tencent.mm.plugin.sns.ui.at atVar2 = zsVar.f171713d;
            com.tencent.mm.plugin.sns.ui.SnsTransparentUI snsTransparentUI = atVar.f167791p;
            int i17 = com.tencent.mm.plugin.sns.ui.SnsTransparentUI.f167480e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            java.util.Map map = snsTransparentUI.f167481d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            ((java.util.HashMap) map).put(atVar2.f167784f, J2);
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f171645a;
            if (J2 != null && !J2.isRecycled()) {
                com.tencent.mars.xlog.Log.i("SnsTransparentUI", "thumb image is not null");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                J2.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
            }
            com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
            am.jt jtVar = sendAppMsgEvent.f54749g;
            jtVar.f7080a = wXMediaMessage;
            jtVar.f7083d = str3;
            jtVar.f7084e = 49;
            jtVar.f7085f = "";
            jtVar.f7086g = "";
            jtVar.f7097r = atVar2.f167787i;
            sendAppMsgEvent.e();
            if (!android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = str3;
                mtVar.f7363b = str2;
                mtVar.f7364c = c01.e2.C(str3);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit confirm dialog download ad img callback in SnsTransparentUI, uxInfo is " + atVar2.f167788m + ", selfUserName is " + atVar2.f167789n + ", sendUserName is " + str3);
            o94.a.b(str3, atVar2.f167788m, atVar2.f167790o);
            android.content.Context context = zsVar.f171711b;
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490560yi));
            atVar2.f167791p.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsTransparentUI", "this has a error : " + e17.toString());
            zsVar.f171713d.f167791p.finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
    }
}
