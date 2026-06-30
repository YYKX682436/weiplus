package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class n implements zg0.s2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f183322a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.webkit.ValueCallback f183323b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f183324c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f183325d = false;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f183326e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Pair f183327f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f183328g;

    public n() {
        boolean z17 = false;
        if (gm0.j1.a() || !com.tencent.mm.sdk.platformtools.x2.n()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.webview.RepairerConfigChooseFromWx()) == 1) {
                z17 = true;
            }
        }
        this.f183326e = z17;
        this.f183327f = null;
    }

    public final void a(android.net.Uri[] uriArr) {
        try {
            android.webkit.ValueCallback valueCallback = this.f183323b;
            if (valueCallback != null) {
                if (uriArr == null) {
                    valueCallback.onReceiveValue(null);
                } else {
                    valueCallback.onReceiveValue(uriArr);
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.FileChooser", "callbackOnReceiveValue get exception %s", e17);
        }
    }

    public void b() {
        this.f183323b = null;
        this.f183322a = null;
        this.f183327f = null;
        this.f183324c = 0;
        this.f183325d = false;
    }

    public void c(android.app.Activity activity, com.tencent.mm.plugin.webview.permission.w wVar, android.webkit.ValueCallback valueCallback, java.lang.String[] strArr, java.lang.String str, android.content.Intent intent, int i17) {
        java.lang.String str2;
        android.content.Intent[] intentArr;
        boolean z17;
        android.content.Intent intent2;
        boolean z18;
        boolean z19;
        android.content.Intent[] intentArr2;
        android.content.Intent[] intentArr3;
        java.lang.String str3 = str;
        android.content.Intent intent3 = intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.FileChooser", "openFileChooser with wvPerm(%s), callbackLL(%s), acceptType(%s), capture(%s)", wVar, valueCallback, strArr, str);
        b();
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser fail, wvPerm is null");
            a(null);
            return;
        }
        if (!wVar.c().f(56)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.FileChooser", "open file chooser failed, permission fail");
            a(null);
            return;
        }
        this.f183324c = i17;
        this.f183323b = valueCallback;
        this.f183322a = java.lang.System.currentTimeMillis() + "";
        if ("user".equalsIgnoreCase(str3) || "environment".equalsIgnoreCase(str3)) {
            str3 = "true";
        }
        java.lang.String str4 = this.f183322a;
        java.util.HashMap hashMap = com.tencent.mm.plugin.webview.model.o5.f183050a;
        if (intent3 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "createOpenFileChooserIntent type: %s, action: %s", intent.getType(), intent.getAction());
            if (!"android.intent.action.GET_CONTENT".equalsIgnoreCase(intent.getAction())) {
                intent3.setAction("android.intent.action.GET_CONTENT");
            }
            if (intent.getCategories() == null || !intent.getCategories().contains("android.intent.category.OPENABLE")) {
                intent3.addCategory("android.intent.category.OPENABLE");
            }
            if (!(intent3.resolveActivity(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager()) != null)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebviewJSSDKUtil", "createOpenFileChooserIntent fileIntent resolve failed");
                intent3.setType("*/*");
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str2 = "MicroMsg.WebViewUI.FileChooser";
            if (fp.h.a(16)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "android API version is below 16.");
                intentArr = new android.content.Intent[]{com.tencent.mm.plugin.webview.model.o5.b(str4)};
                z17 = false;
            }
            z17 = false;
            intentArr = null;
        } else {
            if ("camera".equalsIgnoreCase(str3)) {
                intentArr3 = new android.content.Intent[]{com.tencent.mm.plugin.webview.model.o5.b(str4)};
            } else if ("camcorder".equalsIgnoreCase(str3)) {
                intentArr3 = new android.content.Intent[]{new android.content.Intent("android.media.action.VIDEO_CAPTURE")};
            } else if ("microphone".equalsIgnoreCase(str3)) {
                android.content.Intent intent4 = new android.content.Intent("android.provider.MediaStore.RECORD_SOUND");
                if (intent4.resolveActivity(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager()) == null) {
                    intent4 = null;
                }
                if (intent4 != null) {
                    str2 = "MicroMsg.WebViewUI.FileChooser";
                    intentArr = new android.content.Intent[]{intent4};
                    z17 = false;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebviewJSSDKUtil", "createChooserIntent no sound recorder");
                    str2 = "MicroMsg.WebViewUI.FileChooser";
                    z17 = true;
                    intentArr = null;
                }
            } else if ("*".equalsIgnoreCase(str3) || "true".equalsIgnoreCase(str3) || "false".equalsIgnoreCase(str3)) {
                str2 = "MicroMsg.WebViewUI.FileChooser";
                if (com.tencent.mm.plugin.webview.model.o5.f(strArr, com.tencent.mm.plugin.webview.model.o5.f183050a, "image/*")) {
                    intentArr2 = new android.content.Intent[]{com.tencent.mm.plugin.webview.model.o5.b(str4)};
                } else {
                    if (strArr != null) {
                        int length = strArr.length;
                        int i18 = 0;
                        while (i18 < length) {
                            int i19 = length;
                            if (strArr[i18].equalsIgnoreCase("audio/*")) {
                                z18 = true;
                                break;
                            } else {
                                i18++;
                                length = i19;
                            }
                        }
                    }
                    z18 = false;
                    if (z18) {
                        android.content.Intent intent5 = new android.content.Intent("android.provider.MediaStore.RECORD_SOUND");
                        if (intent5.resolveActivity(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager()) == null) {
                            intent5 = null;
                        }
                        if (intent5 != null) {
                            intentArr2 = new android.content.Intent[]{intent5};
                        } else {
                            z19 = true;
                            com.tencent.mars.xlog.Log.w("MicroMsg.WebviewJSSDKUtil", "createChooserIntent no sound recorder");
                            intentArr2 = null;
                        }
                    } else if (com.tencent.mm.plugin.webview.model.o5.f(strArr, com.tencent.mm.plugin.webview.model.o5.f183051b, "video/*")) {
                        intentArr2 = new android.content.Intent[]{new android.content.Intent("android.media.action.VIDEO_CAPTURE")};
                    } else {
                        z19 = false;
                        intentArr2 = null;
                    }
                    if (!"false".equalsIgnoreCase(str3) || "*".equalsIgnoreCase(str3)) {
                        intentArr = intentArr2;
                        z17 = true;
                    } else {
                        z17 = z19;
                        intentArr = intentArr2;
                    }
                }
                z19 = false;
                if ("false".equalsIgnoreCase(str3)) {
                }
                intentArr = intentArr2;
                z17 = true;
            } else {
                str2 = "MicroMsg.WebViewUI.FileChooser";
                z17 = false;
                intentArr = null;
            }
            intentArr = intentArr3;
            str2 = "MicroMsg.WebViewUI.FileChooser";
            z17 = false;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(intentArr != null ? intentArr.length : 0);
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewJSSDKUtil", "createChooseIntent intents size: %d, addLocalFile: %s", objArr);
        if (z17 || intentArr == null) {
            intent2 = new android.content.Intent("android.intent.action.CHOOSER");
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            intent2.putExtra("android.intent.extra.TITLE", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493694lb4));
            if (intent3 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebviewJSSDKUtil", "createChooseIntent fileIntent null");
                intent3 = new android.content.Intent("android.intent.action.GET_CONTENT");
                intent3.addCategory("android.intent.category.OPENABLE");
                intent3.setType("*/*");
            }
            intent2.putExtra("android.intent.extra.INTENT", intent3);
        } else {
            intent2 = intentArr[0];
        }
        android.content.Intent intent6 = intent2;
        if (this.f183324c == 1) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                intent6.putExtra("android.provider.extra.PICK_IMAGES_MAX", android.provider.MediaStore.getPickImagesMaxLimit());
            } else {
                intent6.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
        }
        java.lang.String str5 = str2;
        com.tencent.mars.xlog.Log.i(str5, "openFileChooser action: %s", intent6.getAction());
        if (e(intent6)) {
            h(activity, intent6);
            return;
        }
        if (!"android.intent.action.CHOOSER".equals(intent6.getAction())) {
            d(activity, intent6);
            return;
        }
        android.content.Intent[] intentArr4 = (android.content.Intent[]) intent6.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Integer.valueOf(intentArr4 != null ? intentArr4.length : 0);
        com.tencent.mars.xlog.Log.i(str5, "openFileChooser originIntentList: %d", objArr2);
        if (intentArr4 != null && intentArr4.length > 0) {
            for (android.content.Intent intent7 : intentArr4) {
                if (e(intent7)) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
                    this.f183328g = k0Var;
                    k0Var.f211872n = new com.tencent.mm.plugin.webview.modeltools.o(this);
                    k0Var.f211854d = new com.tencent.mm.plugin.webview.modeltools.p(this);
                    k0Var.C = new com.tencent.mm.plugin.webview.modeltools.q(this);
                    k0Var.f211881s = new com.tencent.mm.plugin.webview.modeltools.r(this, activity, intent7, strArr, intent6, intentArr4);
                    k0Var.v();
                    return;
                }
            }
        }
        d(activity, intent6);
    }

    public void d(android.app.Activity activity, android.content.Intent intent) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(201);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/FileChooserHelper", "doOpenFileChooserByIntent", "(Landroid/app/Activity;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser e = %s", e17);
        }
    }

    public final boolean e(android.content.Intent intent) {
        return "android.media.action.IMAGE_CAPTURE".equals(intent.getAction()) || "android.media.action.VIDEO_CAPTURE".equals(intent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b6, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.app.Activity r7, int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.modeltools.n.f(android.app.Activity, int, int, android.content.Intent):void");
    }

    public boolean g(android.app.Activity activity, int i17, java.lang.String[] strArr, int[] iArr) {
        android.util.Pair pair = this.f183327f;
        if (pair == null) {
            b();
            return false;
        }
        if (119 != i17) {
            return true;
        }
        if (iArr[0] != 0) {
            this.f183327f = null;
            f(activity, 201, 0, null);
            return true;
        }
        android.content.Intent intent = (android.content.Intent) pair.first;
        int intValue = ((java.lang.Integer) pair.second).intValue();
        this.f183327f = null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/FileChooserHelper", "onRequestPermissionsResult", "(Landroid/app/Activity;I[Ljava/lang/String;[I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    public final void h(android.app.Activity activity, android.content.Intent intent) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(activity, "android.permission.CAMERA", true)) {
            d(activity, intent);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.i(activity, "android.permission.CAMERA", 119);
        this.f183327f = android.util.Pair.create(intent, 201);
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser takePhotoFromSystemCamera no camera Permission");
    }
}
