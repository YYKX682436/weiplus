package uy3;

/* loaded from: classes8.dex */
public final class r0 implements com.tencent.mm.ui.da {

    /* renamed from: e, reason: collision with root package name */
    public static android.os.Bundle f431991e;

    /* renamed from: f, reason: collision with root package name */
    public static uy3.o0 f431992f;

    /* renamed from: d, reason: collision with root package name */
    public static final uy3.r0 f431990d = new uy3.r0();

    /* renamed from: g, reason: collision with root package name */
    public static final uy3.p0 f431993g = new uy3.p0();

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        boolean e17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String string2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data == null: ");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxShareHelper", sb6.toString());
        if (i17 == 1) {
            java.lang.String str6 = "";
            if (i18 != -1) {
                if (i18 != 0) {
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult cancel");
                android.os.Bundle bundle = f431991e;
                if (bundle == null || (str4 = bundle.getString("enter_session")) == null) {
                    str4 = "";
                }
                if (bundle == null || (str5 = bundle.getString("tab_session")) == null) {
                    str5 = "";
                }
                if (bundle != null && (string2 = bundle.getString("scan_session")) != null) {
                    str6 = string2;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21537, str5, str6, 3, str4);
                return;
            }
            uy3.o0 o0Var = f431992f;
            if (o0Var == null || o0Var.f431986a == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult shareInfo invalid");
                return;
            }
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult fail, toUser is null");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            uy3.o0 o0Var2 = f431992f;
            kotlin.jvm.internal.o.d(o0Var2);
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = o0Var2.f431986a;
            uy3.o0 o0Var3 = f431992f;
            java.lang.String str7 = o0Var3 != null ? o0Var3.f431987b : null;
            if (wXMediaMessage == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage appMsg is null");
                e17 = false;
            } else {
                android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str7);
                if (Bi != null && !Bi.isRecycled()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage thumbImage is not null");
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
                }
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
                if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXWebpageObject) {
                    kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXWebpageObject");
                    str = ((com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject).webpageUrl;
                } else {
                    str = "";
                }
                com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
                am.jt jtVar = sendAppMsgEvent.f54749g;
                jtVar.f7080a = wXMediaMessage;
                jtVar.f7081b = null;
                jtVar.f7082c = "";
                jtVar.f7083d = stringExtra;
                jtVar.f7084e = 2;
                jtVar.f7085f = null;
                jtVar.f7086g = null;
                jtVar.f7088i = str;
                jtVar.f7089j = str;
                jtVar.f7090k = null;
                e17 = sendAppMsgEvent.e();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                    am.mt mtVar = sendMsgEvent.f54752g;
                    mtVar.f7362a = stringExtra;
                    mtVar.f7363b = stringExtra2;
                    mtVar.f7364c = c01.e2.C(stringExtra);
                    mtVar.f7365d = 0;
                    sendMsgEvent.e();
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult sendOk: %b", java.lang.Boolean.valueOf(e17));
            if (e17) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                uy3.q0 q0Var = uy3.q0.f431989d;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(q0Var, 200L, false);
            }
            boolean R4 = com.tencent.mm.storage.z3.R4(stringExtra);
            android.os.Bundle bundle2 = f431991e;
            if (e17) {
                if (bundle2 == null || (str2 = bundle2.getString("enter_session")) == null) {
                    str2 = "";
                }
                if (bundle2 == null || (str3 = bundle2.getString("tab_session")) == null) {
                    str3 = "";
                }
                if (bundle2 != null && (string = bundle2.getString("scan_session")) != null) {
                    str6 = string;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21537, str3, str6, java.lang.Integer.valueOf(R4 ? 1 : 2), str2);
            }
        }
    }
}
