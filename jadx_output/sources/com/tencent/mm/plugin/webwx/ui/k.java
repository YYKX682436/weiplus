package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f188019d;

    public k(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI) {
        this.f188019d = extDeviceWXLoginUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI = this.f188019d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "spam url %s", extDeviceWXLoginUI.f187974t);
        if (extDeviceWXLoginUI.f187961d != 0 || com.tencent.mm.sdk.platformtools.t8.K0(extDeviceWXLoginUI.f187974t)) {
            extDeviceWXLoginUI.W6();
        } else {
            java.lang.String str = extDeviceWXLoginUI.f187974t;
            extDeviceWXLoginUI.D = true;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
            intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
            j45.l.n(extDeviceWXLoginUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_CODEC_EXCEPTION);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
