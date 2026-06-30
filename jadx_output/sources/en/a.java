package en;

@j95.b
/* loaded from: classes.dex */
public final class a extends jm0.o implements en.k {
    public boolean Zi(android.content.Context context, int i17, int i18, java.lang.String str) {
        if (i17 != 4) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiErrMsgFeatureService", "handleErrMsg errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 == null) {
            return false;
        }
        if (b17.f420400c != 8) {
            return b17.c(context, null, null);
        }
        java.lang.String str2 = b17.f420398a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }

    public void aj(android.content.Context context, java.lang.String str) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiErrMsgFeatureService", "showErrMsgToast errMsg:" + str);
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            dp.a.makeText(context, b17.f420399b, 1).show();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (str == null) {
                str = "";
            }
            dp.a.makeText(context, str, 1).show();
        }
    }
}
