package zy4;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabAppInfoUI f477676d;

    public d(com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI) {
        this.f477676d = welabAppInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI = this.f477676d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            int h17 = gm0.j1.b().h();
            java.lang.String encode = java.net.URLEncoder.encode(o45.wf.f343026d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String encode2 = java.net.URLEncoder.encode("" + com.tencent.mm.sdk.platformtools.t8.k0(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String encode3 = java.net.URLEncoder.encode(wo.w0.g(true), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String encode4 = java.net.URLEncoder.encode(o45.wf.f343024b, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String encode5 = java.net.URLEncoder.encode(o45.wf.f343025c, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String encode6 = java.net.URLEncoder.encode(wo.q.f447784e, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            gm0.j1.b();
            java.lang.String encode7 = java.net.URLEncoder.encode(gm0.m.e(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String encode8 = java.net.URLEncoder.encode(com.tencent.mm.sdk.platformtools.t8.j0(com.tencent.mm.sdk.platformtools.x2.f193071a), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("&uin=");
            sb6.append(h17);
            sb6.append("&deviceName=");
            sb6.append(encode);
            sb6.append("&timeZone=");
            sb6.append(encode2);
            sb6.append("&imei=");
            sb6.append(encode3);
            sb6.append("&deviceBrand=");
            sb6.append(encode4);
            sb6.append("&deviceModel=");
            sb6.append(encode5);
            sb6.append("&ostype=");
            sb6.append(encode6);
            sb6.append("&clientSeqID=");
            sb6.append(encode7);
            sb6.append("&signature=");
            sb6.append(encode8);
            sb6.append("&scene=");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.K0("") ? 0 : 1);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = (("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index") + "&from=" + java.net.URLEncoder.encode(welabAppInfoUI.f188083e.field_expId + "|" + welabAppInfoUI.f188082d) + "&version=" + o45.wf.f343029g + "&rev=" + java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.z.f193109e).trim() + "&lang=" + com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a) + "&" + sb7) + "#/comment/4134";
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", str);
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "意见反馈");
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
            intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
            j45.l.j(welabAppInfoUI, "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("WelabAppInfoUI", "[oneliang]UnsupportedEncodingException:%s", e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
