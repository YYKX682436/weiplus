package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes15.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f182265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.c2 f182266g;

    public b2(com.tencent.mm.plugin.webview.luggage.jsapi.c2 c2Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f182266g = c2Var;
        this.f182263d = i17;
        this.f182264e = i18;
        this.f182265f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str2;
        int i17 = this.f182263d;
        com.tencent.mm.plugin.webview.luggage.jsapi.c2 c2Var = this.f182266g;
        if (i17 != 0 || this.f182264e != 0) {
            c2Var.f182279d.a("check fail", null);
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f182265f.f70711b.f70700a;
        int i18 = l14Var.f379071e;
        if (i18 != 0) {
            if (i18 != 2) {
                c2Var.f182279d.a("check fail", null);
                return;
            } else {
                c2Var.f182279d.a("check fail forbidden scene", null);
                return;
            }
        }
        lt.q0 q0Var = (lt.q0) i95.n0.c(lt.q0.class);
        com.tencent.mm.plugin.webview.luggage.jsapi.a2 a2Var = new com.tencent.mm.plugin.webview.luggage.jsapi.a2(this);
        ((kt.q0) q0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.d5 d5Var = new com.tencent.mm.pluginsdk.model.app.d5(a2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f379072f), java.lang.Integer.valueOf(l14Var.f379071e));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f182280e)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(c2Var.f182280e));
            intent.addFlags(268435456);
            java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(c2Var.f182281f, intent);
            if ((w17 != null && !w17.isEmpty()) || com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    str2 = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo);
                } else {
                    str2 = intent.getPackage();
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(str2)) {
                    d5Var.b(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(c2Var.f182281f, intent, null, l14Var.f379072f, d5Var, c2Var.f182282g));
                    return;
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f182283h) && !com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f182284i) && (a17 = com.tencent.mm.pluginsdk.model.app.c.a(c2Var.f182281f, c2Var.f182283h, false)) != null && (signature = a17[0]) != null) {
            java.lang.String g17 = kk.k.g(signature.toByteArray());
            if (g17 == null || !g17.equalsIgnoreCase(c2Var.f182284i)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication signature not match");
            } else {
                try {
                    android.content.Intent launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(c2Var.f182283h);
                    if (launchIntentForPackage != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        com.tencent.mm.pluginsdk.model.app.j1.i(bundle, c2Var.f182285m);
                        launchIntentForPackage.putExtras(bundle);
                        launchIntentForPackage.addFlags(268435456);
                        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.content.Context context = c2Var.f182281f;
                        android.os.Bundle bundle2 = c2Var.f182282g;
                        ((kt.c) i0Var2).getClass();
                        d5Var.b(com.tencent.mm.pluginsdk.model.app.w.v(context, launchIntentForPackage, null, d5Var, bundle2));
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                }
            }
        }
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = c2Var.f182286n;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = c2Var.f182286n;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
        am.ki kiVar = launch3RdAppEvent.f54461g;
        kiVar.f7149a = wXMediaMessage;
        kiVar.f7150b = c2Var.f182287o;
        kiVar.f7151c = l14Var.f379072f;
        kiVar.f7152d = c2Var.f182281f;
        kiVar.f7154f = c2Var.f182282g;
        kiVar.f7153e = d5Var;
        launch3RdAppEvent.e();
        boolean z17 = launch3RdAppEvent.f54462h.f7248a;
        if (!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f182287o) && !com.tencent.mm.sdk.platformtools.t8.K0(c2Var.f182285m)) {
            java.lang.String str4 = c2Var.f182287o + "://" + c2Var.f182285m;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
            intent2.addFlags(268435456);
            java.util.List w18 = com.tencent.mm.sdk.platformtools.t8.w1(c2Var.f182281f, intent2);
            if ((w18 != null && !w18.isEmpty()) || com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                if (android.text.TextUtils.isEmpty(intent2.getPackage()) && w18 != null && w18.size() == 1) {
                    lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) w18.get(0);
                    ((kt.c) i0Var3).getClass();
                    str = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo2);
                } else {
                    str = intent2.getPackage();
                }
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (!(str5 != null ? str5 : "").equals(str)) {
                    d5Var.reset();
                    lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.Context context2 = c2Var.f182281f;
                    android.os.Bundle bundle3 = c2Var.f182282g;
                    ((kt.c) i0Var4).getClass();
                    z17 = com.tencent.mm.pluginsdk.model.app.w.v(context2, intent2, null, d5Var, bundle3);
                }
            }
        }
        d5Var.b(z17);
    }
}
