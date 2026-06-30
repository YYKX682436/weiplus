package com.tencent.mm.ui.tools;

@db5.a(3)
/* loaded from: classes11.dex */
public class AddFavoriteUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f209975p = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.autogen.events.DoFavoriteEvent f209978f;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f209976d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f209977e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f209979g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.net.Uri f209980h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f209981i = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f209982m = new com.tencent.mm.ui.tools.c0(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f209983n = new com.tencent.mm.ui.tools.d0(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f209984o = new com.tencent.mm.ui.tools.e0(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0308 A[Catch: Exception -> 0x0304, TryCatch #19 {Exception -> 0x0304, blocks: (B:161:0x0300, B:150:0x0308, B:152:0x030d), top: B:160:0x0300 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030d A[Catch: Exception -> 0x0304, TRY_LEAVE, TryCatch #19 {Exception -> 0x0304, blocks: (B:161:0x0300, B:150:0x0308, B:152:0x030d), top: B:160:0x0300 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0300 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e6 A[Catch: Exception -> 0x02e2, TryCatch #20 {Exception -> 0x02e2, blocks: (B:79:0x02de, B:71:0x02e6, B:73:0x02eb), top: B:78:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02eb A[Catch: Exception -> 0x02e2, TRY_LEAVE, TryCatch #20 {Exception -> 0x02e2, blocks: (B:79:0x02de, B:71:0x02e6, B:73:0x02eb), top: B:78:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02af A[Catch: Exception -> 0x02ab, TryCatch #0 {Exception -> 0x02ab, blocks: (B:92:0x02a7, B:84:0x02af, B:86:0x02b4), top: B:91:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b4 A[Catch: Exception -> 0x02ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:92:0x02a7, B:84:0x02af, B:86:0x02b4), top: B:91:0x02a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0278 A[Catch: Exception -> 0x0274, TryCatch #8 {Exception -> 0x0274, blocks: (B:105:0x0270, B:97:0x0278, B:99:0x027d), top: B:104:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027d A[Catch: Exception -> 0x0274, TRY_LEAVE, TryCatch #8 {Exception -> 0x0274, blocks: (B:105:0x0270, B:97:0x0278, B:99:0x027d), top: B:104:0x0270 }] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v17, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String T6(com.tencent.mm.ui.tools.AddFavoriteUI r19, android.net.Uri r20) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.AddFavoriteUI.T6(com.tencent.mm.ui.tools.AddFavoriteUI, android.net.Uri):java.lang.String");
    }

    public final void U6() {
        V6(0);
        dp.a.makeText(this, com.tencent.mm.R.string.j4b, 1).show();
    }

    public final void V6(int i17) {
        if (i17 != 1) {
            dp.a.makeText(this, com.tencent.mm.R.string.j4b, 1).show();
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.j49, 1).show();
        }
    }

    public final void W6(int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.modelsimple.c0 c0Var;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, filePath is empty");
            return;
        }
        long k17 = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "filelength: [%d]", java.lang.Long.valueOf(k17));
        if (k17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is 0");
            dp.a.makeText(this, com.tencent.mm.R.string.caw, 1).show();
            finish();
            return;
        }
        long qj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).qj(i17);
        int rj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).rj(i17);
        if (k17 > qj6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "dealWithFile fail, fileLength is too large");
            dp.a.makeText(this, getString(com.tencent.mm.R.string.cds, java.lang.Integer.valueOf(rj6)), 1).show();
            finish();
            return;
        }
        if (!c01.d9.h() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
            finish();
            a7();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.lang.String str3 = com.tencent.mm.vfs.w6.q(str) + "." + com.tencent.mm.vfs.w6.n(str);
        if (i17 == 2) {
            com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = new com.tencent.mm.opensdk.modelmsg.WXImageObject();
            wXImageObject.setImagePath(str);
            c0Var = new com.tencent.mm.modelsimple.c0(1, arrayList, getCallerPackage());
            com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 13, str);
            iMediaObject = wXImageObject;
        } else if (i17 != 4) {
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject wXFileObject = new com.tencent.mm.opensdk.modelmsg.WXFileObject(str);
            c0Var = new com.tencent.mm.modelsimple.c0(4, arrayList, getCallerPackage());
            com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 13, str, str3, "", "");
            iMediaObject = wXFileObject;
        } else {
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject wXVideoFileObject = new com.tencent.mm.opensdk.modelmsg.WXVideoFileObject(str);
            com.tencent.mm.modelsimple.c0 c0Var2 = new com.tencent.mm.modelsimple.c0(3, arrayList, getCallerPackage());
            com.tencent.mm.pluginsdk.model.a2.h(doFavoriteEvent, 13, str, null, 0, str3, "", z17);
            iMediaObject = wXVideoFileObject;
            c0Var = c0Var2;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(iMediaObject);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str5 = a17.f213279f;
        int lastIndexOf = str5.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str5 = str5.substring(lastIndexOf + 1);
        }
        wXMediaMessage.title = str5;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            wXMediaMessage.description = com.tencent.mm.sdk.platformtools.t8.f0(k17);
        } else {
            wXMediaMessage.description = str2;
        }
        if (k17 < 30720) {
            wXMediaMessage.thumbData = com.tencent.mm.vfs.w6.N(str, 0, -1);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "thumb data is exceed 30k, ignore");
        }
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.transaction = null;
        req.message = wXMediaMessage;
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = this;
        c4Var.f6329o = new com.tencent.mm.ui.tools.w(this);
        c4Var.f6330p = new com.tencent.mm.ui.tools.x(this);
        this.f209978f = doFavoriteEvent;
        gm0.j1.d().a(837, this);
        gm0.j1.d().g(c0Var);
        Z6();
    }

    public final void X6() {
        android.app.ProgressDialog progressDialog = this.f209976d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f209976d.dismiss();
    }

    public final int Y6(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "map : mimeType is null");
            return -1;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.contains("image") || lowerCase.equals("application/vnd.google.panorama360+jpg")) {
            return 2;
        }
        return lowerCase.contains("video") ? 4 : 8;
    }

    public final void Z6() {
        this.f209976d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.tools.y(this));
    }

    public final void a7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.AddFavoriteUI.class);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", com.tencent.mm.sdk.platformtools.t8.K0(this.f209979g) ? null : com.tencent.mm.sdk.platformtools.i1.b(getContext(), new com.tencent.mm.vfs.r6(this.f209979g)));
        intent.addFlags(268435456).addFlags(32768);
        intent.setType(getIntent().getType());
        com.tencent.mm.ui.MMWizardActivity.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String J2;
        boolean canRead;
        android.content.Intent intent = getIntent();
        this.f209977e = intent;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, intent is null");
            U6();
            finish();
            return;
        }
        java.lang.String action = intent.getAction();
        android.os.Bundle e17 = com.tencent.mm.sdk.platformtools.c2.e(this.f209977e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, action is null");
            U6();
            finish();
            return;
        }
        if (e17 != null) {
            android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
            if (parcelable instanceof android.net.Uri) {
                android.net.Uri uri = (android.net.Uri) parcelable;
                this.f209980h = uri;
                if (!com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, not accept, %s", this.f209980h);
                    U6();
                    finish();
                    return;
                }
            } else if (parcelable != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, uri check fail, %s", parcelable);
                U6();
                finish();
                return;
            }
        }
        if (action.equals("android.intent.action.SEND")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "send signal: ".concat(action));
            if (this.f209980h == null) {
                Z6();
                s75.d.b(new com.tencent.mm.ui.tools.z(this), "AddFavoriteUI_dealWithTextHandler");
                return;
            } else {
                Z6();
                s75.d.b(new com.tencent.mm.ui.tools.i0(this, this.f209980h, new com.tencent.mm.ui.tools.a0(this)), "AddFavoriteUI_getFilePath");
                return;
            }
        }
        if (!action.equals("android.intent.action.SEND_MULTIPLE") || e17 == null || !e17.containsKey("android.intent.extra.STREAM")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, uri is null");
            U6();
            finish();
            return;
        }
        java.lang.String resolveType = getIntent().resolveType(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "send multi: %s, mimeType %s", action, resolveType);
        if (resolveType == null) {
            resolveType = "";
        }
        if (!resolveType.contains("image")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, mimeType not contains image");
            V6(1);
            finish();
            return;
        }
        java.util.ArrayList parcelableArrayList = e17.getParcelableArrayList("android.intent.extra.STREAM");
        java.util.ArrayList arrayList = null;
        if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "getParcelableArrayList failed");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = parcelableArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    android.os.Parcelable parcelable2 = (android.os.Parcelable) it.next();
                    boolean z17 = false;
                    if (parcelable2 == null || !(parcelable2 instanceof android.net.Uri)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "getMultiSendFilePath failed, error parcelable, %s", parcelable2);
                    } else {
                        android.net.Uri uri2 = (android.net.Uri) parcelable2;
                        if (!com.tencent.mm.sdk.platformtools.t8.W0(uri2) || uri2.getScheme() == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "unaccepted uri: " + uri2);
                        } else {
                            if (fp.h.c(30) || ((u75.b.d() || u75.a.f425176a.a()) && fp.h.c(29))) {
                                J2 = com.tencent.mm.sdk.platformtools.t8.J(this, uri2);
                                if (J2 != null) {
                                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(J2);
                                    java.lang.String str = a17.f213279f;
                                    if (str != null) {
                                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                                        if (!str.equals(l17)) {
                                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                        }
                                    }
                                    com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                                    if (m17.a()) {
                                        com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
                                        java.lang.String str2 = m17.f213267b;
                                        java.lang.String D = q2Var.D(str2, false);
                                        canRead = D != null ? new java.io.File(D).canRead() : q2Var.F(str2);
                                    } else {
                                        canRead = false;
                                    }
                                    if (!canRead) {
                                        J2 = uri2.toString();
                                    }
                                }
                            } else {
                                J2 = com.tencent.mm.sdk.platformtools.t8.J(this, uri2);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "multiSend uri: %s, original filePath: %s version:%s", uri2.toString(), J2, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                            java.lang.String f17 = q35.e.f(J2);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                                if (com.tencent.mm.sdk.platformtools.t8.H0(f17) && com.tencent.mm.sdk.platformtools.y1.f(f17)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "multisend file path: " + f17);
                                    arrayList2.add(f17);
                                    z17 = true;
                                } else {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.AddFavoriteUI", "multisend tries to send illegal img: " + f17);
                                }
                            }
                        }
                    }
                    if (!z17) {
                        break;
                    }
                } else if (arrayList2.size() > 0) {
                    arrayList = arrayList2;
                }
            }
        }
        this.f209981i = arrayList;
        if (arrayList != null && arrayList.size() != 0) {
            Z6();
            s75.d.b(new com.tencent.mm.ui.tools.b0(this), "AddFavoriteUI_dealWithMultiItemHandler");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch : fail, filePathList is null");
            V6(1);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "on create");
        super.onCreate(bundle);
        setTitleVisibility(8);
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "wizard_activity_result_code", 0);
        if (g17 == -1 || g17 == 0) {
            com.tencent.mm.booter.NotifyReceiver.d();
            initView();
        } else {
            if (g17 == 1) {
                finish();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "on Destroy");
        c01.d9.e().q(837, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "on NewIntent");
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "on RestoreInstanceState");
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "on SaveInstanceState");
        super.onSaveInstanceState(bundle);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        X6();
        if (m1Var instanceof com.tencent.mm.modelsimple.c0) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = this.f209978f;
                if (doFavoriteEvent != null) {
                    doFavoriteEvent.e();
                    this.f209978f = null;
                    return;
                }
                return;
            }
            if (m1Var.getReqResp() != null) {
                r45.g20 g20Var = (r45.g20) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                if (g20Var == null || com.tencent.mm.sdk.platformtools.t8.K0(g20Var.f374833d)) {
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = this.f209978f;
                    if (doFavoriteEvent2 != null) {
                        doFavoriteEvent2.e();
                        this.f209978f = null;
                        return;
                    }
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", g20Var.f374833d);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                finish();
            }
        }
    }
}
