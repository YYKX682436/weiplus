package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class ShareImgUI extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f210151w = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f210152d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f210153e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f210154f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f210155g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f210156h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f210157i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f210158m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.net.Uri f210159n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f210160o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Intent f210161p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210162q = false;

    /* renamed from: r, reason: collision with root package name */
    public final int f210163r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final int f210164s = 2;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f210165t = new com.tencent.mm.ui.tools.q9(this);

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f210166u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f210167v = false;

    /* JADX WARN: Removed duplicated region for block: B:128:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a7(com.tencent.mm.ui.tools.ShareImgUI r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareImgUI.a7(com.tencent.mm.ui.tools.ShareImgUI, boolean):void");
    }

    public static void b7(com.tencent.mm.ui.tools.ShareImgUI shareImgUI, com.tencent.mm.ui.tools.y9 y9Var, java.util.ArrayList arrayList) {
        shareImgUI.getClass();
        if (y9Var != null) {
            shareImgUI.runOnUiThread(new com.tencent.mm.ui.tools.t9(shareImgUI, y9Var, arrayList));
        }
    }

    public static java.lang.String c7(com.tencent.mm.ui.tools.ShareImgUI shareImgUI, android.net.Uri uri) {
        android.content.Intent intent;
        shareImgUI.getClass();
        if (uri == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "uri is null!");
            return null;
        }
        java.lang.String scheme = uri.getScheme();
        if (com.tencent.mm.sdk.platformtools.t8.K0(scheme)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "input uri error. %s", uri);
            return null;
        }
        if (scheme.equalsIgnoreCase("file")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getFilePath : scheme is SCHEME_FILE");
            java.lang.String path = uri.getPath();
            java.lang.String f17 = q35.e.f(path);
            if (f17 != null) {
                return f17;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "[-] getFilePath : fail, safePath is null.");
            throw new java.lang.IllegalAccessException("safePath is null while process path: " + path);
        }
        if (scheme.equalsIgnoreCase("content")) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getFilePath : scheme is SCHEME_CONTENT: " + uri.toString());
                android.database.Cursor query = shareImgUI.getContentResolver().query(uri, null, null, null, null);
                if (query == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "getFilePath : fail, cursor is null");
                    return null;
                }
                if (query.getCount() > 0 && query.moveToFirst()) {
                    java.lang.String lowerCase = uri.toString().toLowerCase();
                    if (!lowerCase.startsWith("content://com.android.contacts/contacts/as_vcard") && !lowerCase.startsWith("content://com.android.contacts/contacts/as_multi_vcard") && !lowerCase.startsWith("content://com.mediatek.calendarimporter") && (((intent = shareImgUI.f210154f) == null || !intent.getType().equals("text/x-vcalendar")) && wo.v1.f447833m.f447754l != 1)) {
                        query.close();
                        java.lang.String J2 = com.tencent.mm.sdk.platformtools.t8.J(shareImgUI, uri);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "Util.getFilePath ret:%s", J2);
                        return J2;
                    }
                    return shareImgUI.j7(uri, query);
                }
                query.close();
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
                return null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareImgUI", e17, "SCHEME_CONTENT", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "unknown scheme");
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShareImgUI", "not login");
        this.f210154f = getIntent();
        if (!com.tencent.mm.sdk.platformtools.a0.f192447j || !getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) {
            k7();
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void X6(com.tencent.mm.pluginsdk.ui.p pVar, android.content.Intent intent) {
        if (pVar.ordinal() != 0) {
            finish();
            db5.f.k(this);
            return;
        }
        this.f210154f = intent;
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "now permission = %d", java.lang.Integer.valueOf(P));
        if ((P & 1) > 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "now allowed to share to friend");
            finish();
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "android.intent.extra.TEXT");
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "postLogin, text = %s", l17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            k7();
            return;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/business/systemshare/?txt=%s", java.net.URLEncoder.encode(l17));
        m7();
        c01.d9.e().q(1200, this);
        c01.d9.e().a(1200, this);
        com.tencent.mm.modelsimple.h1 h1Var = new com.tencent.mm.modelsimple.h1(format, 15, null);
        c01.d9.e().g(h1Var);
        this.f210155g.add(h1Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void d7(android.content.Intent intent) {
        if (intent == null || !this.f210167v) {
            return;
        }
        intent.putExtra("Result_Recevier", new com.tencent.mm.ui.tools.ShareFileResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper()), this.f210157i));
    }

    public final void e7(int i17) {
        if (i17 == 1) {
            dp.a.makeText(this, com.tencent.mm.R.string.j49, 1).show();
        } else if (i17 != 2) {
            dp.a.makeText(this, com.tencent.mm.R.string.j4b, 1).show();
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.j48, 1).show();
        }
    }

    public final void f7(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "dealWithTextByOldWay");
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "android.intent.extra.TEXT");
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "android.intent.extra.SUBJECT");
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXTextObject(l17));
        wXMediaMessage.description = l17;
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.transaction = null;
        req.message = wXMediaMessage;
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        android.content.Intent o76 = o7(this, com.tencent.mm.ui.transmit.SelectConversationUI.class);
        o76.putExtra("Select_Conv_NextStep", o7(this, com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class).putExtras(bundle).putExtra("animation_pop_in", true));
        if (!c01.d9.h() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareImgUI", "not logged in, jump to simple login");
            com.tencent.mm.ui.MMWizardActivity.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class), getIntent().addFlags(67108864));
            return;
        }
        c01.d9.e().q(837, this);
        c01.d9.e().a(837, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(l18 + "|" + l17);
        com.tencent.mm.modelsimple.c0 c0Var = new com.tencent.mm.modelsimple.c0(5, arrayList, getCallerPackage());
        gm0.j1.d().g(c0Var);
        this.f210155g.add(c0Var);
        m7();
        this.f210161p = o76;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(java.lang.String r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareImgUI.g7(java.lang.String, android.os.Bundle):void");
    }

    public final java.lang.String h7(java.lang.String str, android.net.Uri uri, boolean z17) {
        java.io.Closeable closeable;
        if (this.f210166u == null) {
            boolean z18 = true;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_share_img_use_fileprovider_copy_path, 1) != 1) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (!z65.c.a()) {
                    z18 = false;
                }
            }
            this.f210166u = java.lang.Boolean.valueOf(z18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getShareFilePath useCopyFilePath == " + this.f210166u);
        if (!this.f210166u.booleanValue()) {
            com.tencent.mm.plugin.base.stub.e0.r(10);
            return str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && z17) {
            com.tencent.mm.plugin.base.stub.e0.r(17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getShareFilePath srcPath is exists and canRead, return srcPath:" + str);
            return str;
        }
        com.tencent.mm.plugin.base.stub.e0.r(11);
        java.io.InputStream inputStream = null;
        java.io.OutputStream outputStream = null;
        inputStream = null;
        try {
            java.io.InputStream openInputStream = getContentResolver().openInputStream(uri);
            try {
                if (openInputStream != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.String i76 = i7(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(i76)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "getShareFilePath tmpPath == null , use srcPath:" + str);
                        com.tencent.mm.plugin.base.stub.e0.r(12);
                        com.tencent.mm.sdk.platformtools.t8.v1(openInputStream);
                        return str;
                    }
                    if (com.tencent.mm.vfs.w6.j(i76)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getShareFilePath deleteFile:" + i76);
                        com.tencent.mm.vfs.w6.h(i76);
                    }
                    outputStream = com.tencent.mm.vfs.w6.K(i76, false);
                    byte[] bArr = new byte[4096];
                    long j17 = 0;
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr);
                        j17 += read;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getShareFilePath copy cost(ms):" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "  size(KB):" + (((float) j17) / 1024.0f));
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(i76));
                    if (r6Var.m() && r6Var.h()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "getShareFilePath tmpFile can use:" + i76);
                        com.tencent.mm.plugin.base.stub.e0.r(13);
                        str = i76;
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ShareImgUI", "getShareFilePath tmpFile can not use, use srcPath:" + str);
                        com.tencent.mm.plugin.base.stub.e0.r(14);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShareImgUI", "getShareFilePath inputStream == null, copy fail, use srcPath:" + str);
                    com.tencent.mm.plugin.base.stub.e0.r(15);
                }
                com.tencent.mm.sdk.platformtools.t8.v1(openInputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(outputStream);
            } catch (java.lang.Exception e17) {
                e = e17;
                inputStream = openInputStream;
                closeable = null;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShareImgUI", e, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "getShareFilePath copy exception, use srcPath:" + str);
                    com.tencent.mm.plugin.base.stub.e0.r(16);
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    return str;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                inputStream = openInputStream;
                closeable = null;
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            closeable = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            closeable = null;
        }
        return str;
    }

    public final java.lang.String i7(java.lang.String str) {
        return zo3.p.Vi() + com.tencent.mm.sdk.platformtools.w2.a(java.lang.System.currentTimeMillis() + "_" + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e6, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bc, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de A[Catch: Exception -> 0x01fb, TRY_ENTER, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e3 A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[Catch: Exception -> 0x01fb, TRY_ENTER, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9 A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186 A[Catch: Exception -> 0x01fb, TRY_ENTER, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b A[Catch: Exception -> 0x01fb, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2 A[Catch: Exception -> 0x01fa, TryCatch #15 {Exception -> 0x01fa, blocks: (B:92:0x01ed, B:85:0x01f2, B:87:0x01f7), top: B:91:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f7 A[Catch: Exception -> 0x01fa, TRY_LEAVE, TryCatch #15 {Exception -> 0x01fa, blocks: (B:92:0x01ed, B:85:0x01f2, B:87:0x01f7), top: B:91:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j7(android.net.Uri r18, android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareImgUI.j7(android.net.Uri, android.database.Cursor):java.lang.String");
    }

    public final void k7() {
        android.os.Parcelable parcelable;
        android.content.Intent intent = this.f210154f;
        boolean z17 = false;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "launch : fail, intent is null");
            e7(0);
            finish();
            return;
        }
        java.lang.String action = intent.getAction();
        android.os.Bundle extras = this.f210154f.getExtras();
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "launch : fail, action is null");
            e7(0);
            finish();
            return;
        }
        if (extras != null && (parcelable = extras.getParcelable("android.intent.extra.STREAM")) != null && (parcelable instanceof android.net.Uri)) {
            android.net.Uri uri = (android.net.Uri) parcelable;
            this.f210159n = uri;
            if (!com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "launch : fail, not accepted: %s", this.f210159n);
                e7(0);
                finish();
                return;
            }
        }
        android.net.Uri uri2 = this.f210159n;
        java.lang.String str = q35.e.f359976a;
        if (com.tencent.mm.sdk.platformtools.t8.e1(this, uri2)) {
            android.net.Uri uri3 = this.f210159n;
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(this.f210154f, "android.intent.extra.TEXT");
            if ("android.intent.action.SEND".equals(action) && uri3 == null && !com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                z17 = true;
            }
            if (!z17) {
                boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.tencent.mm.R.string.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.tencent.mm.R.string.fip) : getString(com.tencent.mm.R.string.msk));
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
                if (Di) {
                    g7(action, extras);
                    return;
                }
                return;
            }
        }
        g7(action, extras);
    }

    public final int l7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", "map : mimeType is null");
            return -1;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.equalsIgnoreCase("image/gif")) {
            return 5;
        }
        if (lowerCase.contains("image")) {
            return 0;
        }
        return lowerCase.contains("video") ? 1 : 3;
    }

    public final void m7() {
        android.app.ProgressDialog progressDialog = this.f210152d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            if (this.f210153e == null) {
                this.f210153e = new com.tencent.mm.ui.tools.w9(this);
            }
            this.f210152d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, this.f210153e);
        }
    }

    public final boolean n7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShareImgUI.class);
        if ("android.intent.action.SEND".equals(getIntent().getAction())) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f210157i)) {
                return false;
            }
            intent.putExtra("android.intent.extra.STREAM", com.tencent.mm.sdk.platformtools.i1.b(this, new com.tencent.mm.vfs.r6(this.f210157i)));
            intent.setAction("android.intent.action.SEND");
            intent.setType(getIntent().getType());
        } else {
            if (!"android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction()) || com.tencent.mm.sdk.platformtools.t8.L0(this.f210160o)) {
                return false;
            }
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.f210160o.size());
            java.util.Iterator it = this.f210160o.iterator();
            while (it.hasNext()) {
                arrayList.add(com.tencent.mm.sdk.platformtools.i1.b(this, new com.tencent.mm.vfs.r6((java.lang.String) it.next())));
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(getIntent().getType());
        }
        intent.addFlags(67108864);
        com.tencent.mm.ui.MMWizardActivity.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent);
        return true;
    }

    public final android.content.Intent o7(android.content.Context context, java.lang.Class cls) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        p7(intent);
        return intent;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onCreate %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(1200, this);
        c01.d9.e().q(837, this);
        android.app.ProgressDialog progressDialog = this.f210152d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f210152d.dismiss();
        }
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onDestroy %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onPause %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhi), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new com.tencent.mm.ui.tools.o9(this), new com.tencent.mm.ui.tools.p9(this));
            return;
        }
        if (this.f210154f == null) {
            this.f210154f = getIntent();
        }
        android.content.Intent intent = this.f210154f;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        g7(this.f210154f.getAction(), this.f210154f.getExtras());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onResume %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(m1Var != null ? m1Var.getType() : -1);
        objArr[4] = java.lang.Integer.valueOf(hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s, type: %d, hashCode: %d", objArr);
        if (m1Var != null) {
            this.f210155g.remove(m1Var);
        }
        android.app.ProgressDialog progressDialog = this.f210152d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f210152d.dismiss();
        }
        if (m1Var instanceof com.tencent.mm.modelsimple.h1) {
            if (i17 == 0 && i18 == 0) {
                k7();
            } else {
                finish();
            }
        }
        if (m1Var instanceof com.tencent.mm.modelsimple.c0) {
            if (i17 == 0 && i18 == 0) {
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                android.content.Intent intent = this.f210161p;
                if (intent == null) {
                    ec5.a aVar = new ec5.a();
                    aVar.l(this.f210157i);
                    n13.v vVar = n13.v.f334140a;
                    java.lang.String str2 = this.f210158m;
                    aVar.k(vVar.b(str2, com.tencent.mm.vfs.w6.n(str2), com.tencent.mm.vfs.w6.k(this.f210157i)));
                    e35.g.f247590a.a(this.f210158m, 103);
                    aVar.set(aVar.f43702d + 5, java.lang.Boolean.TRUE);
                    n13.r rVar = new n13.r();
                    rVar.f334117a = true;
                    rVar.f334120d.f334139a = 4;
                    rVar.f334128l = new n13.c0() { // from class: com.tencent.mm.ui.tools.ShareImgUI$$a
                        @Override // n13.c0
                        public final void a(android.content.Intent intent2) {
                            int i19 = com.tencent.mm.ui.tools.ShareImgUI.f210151w;
                            com.tencent.mm.ui.tools.ShareImgUI.this.p7(intent2);
                        }
                    };
                    ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(this, aVar, rVar);
                } else {
                    d7(intent);
                    try {
                        android.content.Intent intent2 = this.f210161p;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
            } else if (m1Var.getReqResp() != null) {
                r45.g20 g20Var = (r45.g20) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                if (g20Var == null || com.tencent.mm.sdk.platformtools.t8.K0(g20Var.f374833d)) {
                    d7(this.f210161p);
                    try {
                        android.content.Intent intent3 = this.f210161p;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent3);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Exception e18) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.ShareImgUI", com.tencent.mm.sdk.platformtools.z3.c(e18));
                    }
                } else {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("rawUrl", g20Var.f374833d);
                    intent4.putExtra("showShare", false);
                    intent4.putExtra("show_bottom", false);
                    intent4.putExtra("needRedirect", false);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent4, null);
                }
            }
            finish();
        }
    }

    public final android.content.Intent p7(android.content.Intent intent) {
        android.os.Bundle extras;
        try {
            android.content.Intent intent2 = this.f210154f;
            if (intent2 != null) {
                android.net.Uri uri = this.f210159n;
                if (uri == null && (extras = intent2.getExtras()) != null) {
                    java.lang.Object obj = extras.get("android.intent.extra.STREAM");
                    if (obj instanceof android.net.Uri) {
                        uri = (android.net.Uri) obj;
                    }
                }
                if (uri == null) {
                    uri = this.f210154f.getData();
                }
                if (uri != null) {
                    intent.setDataAndType(uri, getContentResolver().getType(uri));
                }
                if ((this.f210154f.getFlags() & 1) == 1) {
                    intent.addFlags(1);
                }
                if ((this.f210154f.getFlags() & 2) == 2) {
                    intent.addFlags(2);
                }
                if ((this.f210154f.getFlags() & 64) == 64) {
                    intent.addFlags(64);
                }
                if ((this.f210154f.getFlags() & 128) == 128) {
                    intent.addFlags(128);
                }
            }
        } catch (java.lang.Throwable th6) {
            ap.a.a(1, "errTransitiveIntent", th6, null, th6.getMessage());
        }
        return intent;
    }
}
