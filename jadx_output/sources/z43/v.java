package z43;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f470131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f470132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f470133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z43.w f470134g;

    public v(z43.w wVar, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f470134g = wVar;
        this.f470131d = i17;
        this.f470132e = i18;
        this.f470133f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str2;
        int i17;
        int i18 = this.f470131d;
        z43.w wVar = this.f470134g;
        if (i18 != 0 || this.f470132e != 0) {
            wVar.f470144p.f143443f.a("check fail");
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f470133f.f70711b.f70700a;
        if (wVar.f470135d.booleanValue() && (i17 = l14Var.f379071e) != 0) {
            if (i17 != 2) {
                wVar.f470144p.f143443f.a("check fail");
                return;
            } else {
                wVar.f470144p.f143443f.a("check fail forbidden scene");
                return;
            }
        }
        lt.q0 q0Var = (lt.q0) i95.n0.c(lt.q0.class);
        z43.t tVar = new z43.t(this);
        ((kt.q0) q0Var).getClass();
        z43.u uVar = new z43.u(this, new com.tencent.mm.pluginsdk.model.app.d5(tVar));
        com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f379072f), java.lang.Integer.valueOf(l14Var.f379071e));
        android.content.Context c17 = wVar.f470144p.c();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(wVar.f470136e)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(wVar.f470136e));
            intent.addFlags(268435456);
            java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(c17, intent);
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
                    uVar.b(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(c17, intent, null, l14Var.f379072f, uVar, wVar.f470137f));
                    return;
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(wVar.f470138g) && !com.tencent.mm.sdk.platformtools.t8.K0(wVar.f470139h) && (a17 = com.tencent.mm.pluginsdk.model.app.c.a(c17, wVar.f470138g, false)) != null && (signature = a17[0]) != null) {
            java.lang.String g17 = kk.k.g(signature.toByteArray());
            if (g17 == null || !g17.equalsIgnoreCase(wVar.f470139h)) {
                com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchApplication", "launchApplication signature not match");
            } else {
                try {
                    android.content.Intent launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(wVar.f470138g);
                    if (launchIntentForPackage != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        com.tencent.mm.pluginsdk.model.app.j1.i(bundle, wVar.f470140i);
                        launchIntentForPackage.putExtras(bundle);
                        launchIntentForPackage.addFlags(268435456);
                        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle2 = wVar.f470137f;
                        ((kt.c) i0Var2).getClass();
                        uVar.b(com.tencent.mm.pluginsdk.model.app.w.v(c17, launchIntentForPackage, null, uVar, bundle2));
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                }
            }
        }
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = wVar.f470141m;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = wVar.f470141m;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
        am.ki kiVar = launch3RdAppEvent.f54461g;
        kiVar.f7149a = wXMediaMessage;
        kiVar.f7150b = wVar.f470142n;
        kiVar.f7151c = l14Var.f379072f;
        kiVar.f7152d = c17;
        kiVar.f7154f = wVar.f470137f;
        kiVar.f7155g = wVar.f470138g;
        kiVar.f7156h = wVar.f470143o.booleanValue();
        kiVar.f7153e = uVar;
        launch3RdAppEvent.e();
        boolean z17 = launch3RdAppEvent.f54462h.f7248a;
        if (!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(wVar.f470142n) && !com.tencent.mm.sdk.platformtools.t8.K0(wVar.f470140i)) {
            java.lang.String str4 = wVar.f470142n + "://" + wVar.f470140i;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            com.tencent.mars.xlog.Log.i("LiteAppJsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
            intent2.addFlags(268435456);
            java.util.List w18 = com.tencent.mm.sdk.platformtools.t8.w1(c17, intent2);
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
                    uVar.reset();
                    lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.os.Bundle bundle3 = wVar.f470137f;
                    ((kt.c) i0Var4).getClass();
                    z17 = com.tencent.mm.pluginsdk.model.app.w.v(c17, intent2, null, uVar, bundle3);
                }
            }
        }
        uVar.b(z17);
    }
}
