package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
/* loaded from: classes.dex */
public class OpenFileChooserUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f183623x = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f183624d;

    /* renamed from: e, reason: collision with root package name */
    public int f183625e;

    /* renamed from: f, reason: collision with root package name */
    public int f183626f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f183627g;

    /* renamed from: h, reason: collision with root package name */
    public int f183628h;

    /* renamed from: i, reason: collision with root package name */
    public int f183629i;

    /* renamed from: m, reason: collision with root package name */
    public int f183630m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f183631n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f183632o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f183633p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f183634q;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f183635r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f183636s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f183637t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f183638u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f183639v = true;

    /* renamed from: w, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f183640w = null;

    public static void T6(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI, java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var;
        if (openFileChooserUI.f183630m == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "don't need thumb image");
            return;
        }
        if (android.text.TextUtils.isEmpty(openFileChooserUI.f183632o)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "thumbFilePath is empty!");
            r6Var = null;
        } else {
            r6Var = new com.tencent.mm.vfs.r6(openFileChooserUI.f183632o);
        }
        if (r6Var != null && r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "file is exist!, path:%s", openFileChooserUI.f183632o);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "file == null or file not exist for path:%s!", openFileChooserUI.f183632o);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        java.lang.String substring = (android.text.TextUtils.isEmpty(str3) || !str3.contains(".")) ? null : str3.substring(0, str3.lastIndexOf("."));
        if (android.text.TextUtils.isEmpty(substring)) {
            openFileChooserUI.f183632o = openFileChooserUI.Y6() + ("microMsg_" + java.lang.System.currentTimeMillis()) + ".jpeg";
        } else if (openFileChooserUI.Y6() == null || !openFileChooserUI.Y6().endsWith("/")) {
            openFileChooserUI.f183632o = openFileChooserUI.Y6() + "/" + substring + ".jpeg";
        } else {
            openFileChooserUI.f183632o = openFileChooserUI.Y6() + substring + ".jpeg";
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(openFileChooserUI.f183632o);
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "file is exist for path:%s!", openFileChooserUI.f183632o);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "file not exist for path:%s!", openFileChooserUI.f183632o);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "create new thumb path:%s!", openFileChooserUI.f183632o);
        android.graphics.Bitmap D = com.tencent.mm.sdk.platformtools.x.D(str, 1, -1);
        if (D == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "createVideoThumbnail bitmap fail for path:%s!", openFileChooserUI.f183632o);
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(android.media.ThumbnailUtils.extractThumbnail(D, uc1.w1.CTRL_INDEX, 400, 2), 30, android.graphics.Bitmap.CompressFormat.JPEG, openFileChooserUI.f183632o, true);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "saveBitmapToImage exist IOException:" + e17.getMessage());
        }
    }

    public static java.lang.String U6(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        if (android.text.TextUtils.isEmpty(openFileChooserUI.f183632o)) {
            return "";
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(openFileChooserUI.f183632o);
        d17.f182737f = openFileChooserUI.f183632o;
        d17.f182748t = true;
        d17.f182742n = 1;
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
        return d17.f182736e;
    }

    public final void V6(android.content.Intent intent) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_liteapp_business_scene");
        if (stringExtra != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "liteapp business scene:%s", stringExtra);
            intent.putExtra("album_business_by_real_scene", stringExtra);
        }
    }

    public final void W6(java.lang.String str) {
        X6(str, com.eclipsesource.mmv8.Platform.UNKNOWN);
    }

    public final void X6(java.lang.String str, java.lang.String str2) {
        this.f183640w = new com.tencent.mm.plugin.webview.ui.tools.x(this);
        this.f183635r = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.l6d), true, true, this.f183640w);
        gm0.j1.e().j(new com.tencent.mm.plugin.webview.ui.tools.f0(this, str, str2));
    }

    public final java.lang.String Y6() {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("OpenFileChooserUI");
        if (!h07.m()) {
            h07.J();
        }
        java.lang.String o17 = h07.o();
        return !o17.endsWith("/") ? o17.concat("/") : o17;
    }

    public final com.tencent.mm.plugin.mmsight.SightParams Z6(int i17) {
        java.lang.String str = "microMsg_" + java.lang.System.currentTimeMillis();
        this.f183631n = Y6() + str + ".mp4";
        this.f183632o = Y6() + str + ".jpeg";
        int intExtra = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(3, 1);
        sightParams.f148818e = this.f183628h != 16 ? 2 : 1;
        sightParams.f148817d = i17;
        if (sightParams.f148819f == null) {
            sightParams.f148819f = new com.tencent.mm.modelcontrol.VideoTransPara();
        }
        sightParams.f148819f.f71195h = intExtra;
        sightParams.a(str, this.f183631n, this.f183632o, Y6() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
        return sightParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.a7():void");
    }

    public final boolean b7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "avaiableMem = %d", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.w(this)));
        return com.tencent.mm.sdk.platformtools.t8.w(this) > 200;
    }

    public final boolean c7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video thumb file path is null");
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "thumbFilePath:%s", str);
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "video thumb file is exist");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.vfs.r6 r6Var;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_pick_local_media_show_memory_warning", this.f183636s);
            setResult(i18, intent2);
            finish();
            return;
        }
        switch (i17) {
            case 1:
            case 3:
                dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.o0(this, intent, i18));
                return;
            case 2:
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context applicationContext = getContext().getApplicationContext();
                java.lang.String Y6 = Y6();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, Y6);
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OpenFileChooserUI", "take photo, but result is null");
                    setResult(-2, intent);
                    finish();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "take photo, result[%s]", b17);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("key_send_raw_image", this.f183627g);
                intent3.putExtra("max_select_count", this.f183624d);
                intent3.putExtra("query_source_type", this.f183625e);
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
                arrayList.add(b17);
                intent3.putStringArrayListExtra("preview_image_list", arrayList);
                intent3.putExtra("preview_image", true);
                intent3.addFlags(67108864);
                j45.l.n(this, "gallery", ".ui.GalleryEntryUI", intent3, 3);
                return;
            case 4:
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "choose video failed, path is null");
                    setResult(1);
                    finish();
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_GALLERY_VIDEO");
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", stringArrayListExtra.get(0));
                    if (this.f183630m == 1 && !c7(this.f183632o)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
                    }
                    W6(stringArrayListExtra.get(0));
                    return;
                }
            case 5:
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f183631n);
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                    W6(this.f183631n);
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_VIDEO, file not exist : %s", this.f183631n);
                setResult(1);
                finish();
                return;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_SIGHT_VIDEO");
                if (intent != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "data is valid!");
                    com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
                    if (sightCaptureResult == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
                        setResult(1);
                        finish();
                        return;
                    }
                    java.lang.String str2 = sightCaptureResult.f148809g;
                    this.f183631n = str2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str2);
                    if (!c7(this.f183632o)) {
                        java.lang.String str3 = sightCaptureResult.f148810h;
                        if (c7(str3)) {
                            this.f183632o = str3;
                        }
                    }
                    r6Var = android.text.TextUtils.isEmpty(this.f183631n) ? null : new com.tencent.mm.vfs.r6(this.f183631n);
                    if (r6Var != null && r6Var.m()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f183631n);
                        W6(this.f183631n);
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f183631n);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "data is null!");
                setResult(1);
                finish();
                return;
            case 7:
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
                if (intent != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "data is valid!");
                    com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult2 = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
                    if (sightCaptureResult2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
                        setResult(1);
                        finish();
                        return;
                    }
                    if (sightCaptureResult2.f148807e) {
                        java.lang.String str4 = sightCaptureResult2.f148815p;
                        android.content.Intent intent4 = new android.content.Intent();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str4);
                            intent4.putExtra("key_pick_local_pic_fail_reason", "can't get the image's filePath!");
                            setResult(1, intent4);
                            finish();
                            return;
                        }
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str4);
                        java.lang.String str5 = a18.f213279f;
                        if (str5 != null) {
                            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
                            if (!str5.equals(l18)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                        if (m18.a() ? m18.f213266a.F(m18.f213267b) : false) {
                            dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.v(this, str4, intent4, i18));
                            return;
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str4);
                        intent4.putExtra("key_pick_local_pic_fail_reason", "can't have access to the image!");
                        setResult(1, intent4);
                        finish();
                        return;
                    }
                    java.lang.String str6 = sightCaptureResult2.f148809g;
                    this.f183631n = str6;
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str6);
                    if (!c7(this.f183632o)) {
                        java.lang.String str7 = sightCaptureResult2.f148810h;
                        if (c7(str7)) {
                            this.f183632o = str7;
                        }
                    }
                    r6Var = android.text.TextUtils.isEmpty(this.f183631n) ? null : new com.tencent.mm.vfs.r6(this.f183631n);
                    if (r6Var != null && r6Var.m()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f183631n);
                        W6(this.f183631n);
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f183631n);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "data is null!");
                setResult(1);
                finish();
                return;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra2 != null && stringArrayListExtra2.size() > 0) {
                    W6(stringArrayListExtra2.get(0));
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", true);
                java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
                if (stringArrayListExtra3 != null || parcelableArrayListExtra != null) {
                    dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.w(this, parcelableArrayListExtra, booleanExtra, stringArrayListExtra3, i18));
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "chosen is null");
                setResult(1);
                finish();
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "onBusinessPermissionDenied");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_fail_reason", "onBusinessPermissionDenied");
        setResult(1, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionGranted(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "onBusinessPermissionGranted!");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
        a7();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.ProgressDialog progressDialog = this.f183635r;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f183635r.dismiss();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.webview.ui.tools.n0(this), null);
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String Y6 = Y6();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.l(context, Y6, str, 2);
    }
}
