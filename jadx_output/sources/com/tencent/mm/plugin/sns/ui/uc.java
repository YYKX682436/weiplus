package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes9.dex */
public class uc implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170576b;

    public uc(com.tencent.mm.plugin.sns.ui.vc vcVar, java.lang.String str, android.content.Context context) {
        this.f170575a = str;
        this.f170576b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.title = "test title";
        wXMediaMessage.description = "test desc";
        com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
        wXWebpageObject.canvasPageXml = "<xml></xml>";
        wXWebpageObject.webpageUrl = "http://www.baidu.com/";
        wXMediaMessage.mediaObject = wXWebpageObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adId_image_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150".getBytes()));
        java.lang.String str2 = Bi + sb6.toString();
        if (com.tencent.mm.vfs.w6.j(str2)) {
            bitmap = com.tencent.mm.sdk.platformtools.j.a(str2, 1.0f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            bitmap = null;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
        }
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        java.lang.String str3 = this.f170575a;
        jtVar.f7083d = str3;
        jtVar.f7084e = 49;
        jtVar.f7085f = "";
        jtVar.f7086g = "";
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
        android.content.Context context = this.f170576b;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490560yi));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
    }
}
