package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes15.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f185516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 f185517g;

    public x1(com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var, int i17, int i18, com.tencent.mm.modelbase.o oVar) {
        this.f185517g = y1Var;
        this.f185514d = i17;
        this.f185515e = i18;
        this.f185516f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        if (this.f185514d != 0 || this.f185515e != 0) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var = this.f185517g;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = y1Var.f185557q;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J3(c1Var, y1Var.f185547d, c1Var.f184984o, 3);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var2 = this.f185517g;
            y1Var2.f185557q.i5(y1Var2.f185548e, "launchApplication:fail_check fail", null);
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f185516f.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f379072f), java.lang.Integer.valueOf(l14Var.f379071e));
        if (l14Var.f379071e != 0) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var3 = this.f185517g;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var2 = y1Var3.f185557q;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J3(c1Var2, y1Var3.f185547d, c1Var2.f184984o, 3);
        }
        int i17 = l14Var.f379071e;
        if (i17 != 0) {
            if (i17 == 2) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var4 = this.f185517g;
                y1Var4.f185557q.i5(y1Var4.f185548e, "launchApplication:fail_check fail forbidden scene", null);
                return;
            } else if (i17 != 3) {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var5 = this.f185517g;
                y1Var5.f185557q.i5(y1Var5.f185548e, "launchApplication:fail_check fail", null);
                return;
            } else {
                com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var6 = this.f185517g;
                y1Var6.f185557q.i5(y1Var6.f185548e, "launchApplication:fail", null);
                return;
            }
        }
        android.content.Context context = this.f185517g.f185557q.f184975d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var7 = this.f185517g;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var3 = y1Var7.f185557q;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J3(c1Var3, y1Var7.f185547d, c1Var3.f184984o, 2);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var8 = this.f185517g;
            y1Var8.f185557q.i5(y1Var8.f185548e, "launchApplication:fail_cancel", null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication activity finished");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.i8 i8Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.i8(new com.tencent.mm.plugin.webview.ui.tools.jsapi.w1(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f185517g.f185551h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.f185517g.f185551h));
            intent.addFlags(268435456);
            java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(this.f185517g.f185557q.f184975d, intent);
            if ((w17 == null || w17.isEmpty()) && !com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                android.os.Bundle bundle = this.f185517g.f185552i;
                ((kt.c) i0Var).getClass();
                com.tencent.mm.pluginsdk.model.app.w.z(bundle);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl: list is avaliable");
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var2).getClass();
                    str2 = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo);
                } else {
                    str2 = intent.getPackage();
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl: launchAppByWeChat, pkg is %s", str2);
                    lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                    com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var9 = this.f185517g;
                    i8Var.b(((kt.c) i0Var3).cj(y1Var9.f185557q.f184975d, intent, null, l14Var.f379072f, i8Var, y1Var9.f185552i));
                    return;
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f185517g.f185553m) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f185517g.f185554n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle pkg");
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var10 = this.f185517g;
            android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(y1Var10.f185557q.f184975d, y1Var10.f185553m, false);
            if (a17 != null && a17[0] != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle pkg: pkgSigns is avaliable");
                java.lang.String g17 = kk.k.g(a17[0].toByteArray());
                if (g17 == null || !g17.equalsIgnoreCase(this.f185517g.f185554n)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication signature not match");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(this.f185517g.f185553m);
                        if (launchIntentForPackage != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle pkg: launchAppByWeChat");
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            com.tencent.mm.pluginsdk.model.app.j1.i(bundle2, this.f185517g.f185555o);
                            launchIntentForPackage.putExtras(bundle2);
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var11 = this.f185517g;
                            android.content.Context context2 = y1Var11.f185557q.f184975d;
                            android.os.Bundle bundle3 = y1Var11.f185552i;
                            ((kt.c) i0Var4).getClass();
                            i8Var.b(com.tencent.mm.pluginsdk.model.app.w.v(context2, launchIntentForPackage, null, i8Var, bundle3));
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                    }
                }
            }
        }
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = this.f185517g.f185556p;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = this.f185517g.f185556p;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
        am.ki kiVar = launch3RdAppEvent.f54461g;
        kiVar.f7149a = wXMediaMessage;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var12 = this.f185517g;
        kiVar.f7150b = y1Var12.f185549f;
        kiVar.f7151c = l14Var.f379072f;
        kiVar.f7152d = y1Var12.f185557q.f184975d;
        kiVar.f7154f = y1Var12.f185552i;
        kiVar.f7153e = i8Var;
        launch3RdAppEvent.e();
        boolean z17 = launch3RdAppEvent.f54462h.f7248a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "1" : "0";
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter, r = %s", objArr);
        if (!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f185517g.f185549f) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f185517g.f185555o)) {
            java.lang.String str4 = this.f185517g.f185549f + "://" + this.f185517g.f185555o;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
            intent2.addFlags(268435456);
            java.util.List w18 = com.tencent.mm.sdk.platformtools.t8.w1(this.f185517g.f185557q.f184975d, intent2);
            if ((w18 != null && !w18.isEmpty()) || com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter: list is avaliable");
                if (android.text.TextUtils.isEmpty(intent2.getPackage()) && w18 != null && w18.size() == 1) {
                    lt.i0 i0Var5 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) w18.get(0);
                    ((kt.c) i0Var5).getClass();
                    str = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo2);
                } else {
                    str = intent2.getPackage();
                }
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (!(str5 != null ? str5 : "").equals(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter: launchAppByWeChat, pkg is %s", str);
                    i8Var.f185199d = false;
                    i8Var.f185197b = false;
                    i8Var.f185200e = false;
                    i8Var.f185196a = false;
                    lt.i0 i0Var6 = (lt.i0) i95.n0.c(lt.i0.class);
                    com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var13 = this.f185517g;
                    android.content.Context context3 = y1Var13.f185557q.f184975d;
                    android.os.Bundle bundle4 = y1Var13.f185552i;
                    ((kt.c) i0Var6).getClass();
                    z17 = com.tencent.mm.pluginsdk.model.app.w.v(context3, intent2, null, i8Var, bundle4);
                }
            }
        }
        i8Var.b(z17);
    }
}
