package lx;

/* loaded from: classes7.dex */
public final class i2 implements com.tencent.pigeon.biz.BizMediaApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321799d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f321800e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f321801f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f321802g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f321803h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f321804i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    public static final /* synthetic */ java.lang.String a(lx.i2 i2Var) {
        i2Var.getClass();
        return "MicroMsg.FlutterBizMediaPlugin";
    }

    @Override // com.tencent.pigeon.biz.BizMediaApi
    public void chooseMediaFromCamera(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera");
        android.content.Context context = this.f321799d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (context instanceof androidx.activity.ComponentActivity) {
            kotlinx.coroutines.y0 y0Var = this.f321804i;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new lx.d2(context, this, callback, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera: context is not ComponentActivity");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Context is not ComponentActivity")))));
        }
    }

    @Override // com.tencent.pigeon.biz.BizMediaApi
    public void editPhoto(java.lang.String photoId, java.lang.String path, yz5.l callback) {
        kotlin.jvm.internal.o.g(photoId, "photoId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto: photoId=" + photoId + ", path=" + path);
        android.content.Context context = this.f321799d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        if (!(context2 instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto: context is not Activity");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Context is not Activity")))));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(path) || !com.tencent.mm.vfs.w6.j(path)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto: file not exist, path=".concat(path));
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("File not exist")))));
            return;
        }
        this.f321800e = callback;
        this.f321801f = photoId;
        this.f321802g = path;
        try {
            zw.a aVar = zw.a.f476485a;
            java.lang.String str = zw.a.f476486b;
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.u(str);
            }
            java.lang.String str2 = str + "edit_" + photoId + '_' + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            this.f321803h = str2;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(path, str2);
            b17.F = 0;
            ut3.m.f431182a.f(context2, 1001, -1, -1, b17, 1, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto: exception", e17);
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
            this.f321800e = null;
            this.f321801f = null;
            this.f321802g = null;
            this.f321803h = null;
        }
    }

    @Override // com.tencent.pigeon.biz.BizMediaApi
    public void editTextCover(java.lang.String prompt, java.lang.String aiPicId, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(prompt, "prompt");
        kotlin.jvm.internal.o.g(aiPicId, "aiPicId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editTextCover: prompt=" + prompt + ", aiPicId=" + aiPicId + ", editScene=" + j17);
        if (aiPicId.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "editTextCover: aiPicId is empty");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("aiPicId is empty")))));
        } else {
            android.content.Context context = this.f321799d;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Bi(context, 0, 0, prompt, aiPicId, (int) j17, true, new lx.e2(this, callback), new lx.f2(context, this, callback));
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1001) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "handleEditPhotoResult: resultCode=" + i18);
        yz5.l lVar = this.f321800e;
        java.lang.String str = this.f321801f;
        java.lang.String str2 = this.f321802g;
        this.f321800e = null;
        this.f321801f = null;
        this.f321802g = null;
        if (lVar == null || str == null || str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "handleEditPhotoResult: callback or original data is null");
        } else if (i18 == -1) {
            try {
                java.lang.String str3 = this.f321803h;
                if ((str3 == null || !com.tencent.mm.vfs.w6.j(str3)) && intent != null) {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                    if (stringArrayListExtra != null && (stringArrayListExtra.isEmpty() ^ true)) {
                        str3 = stringArrayListExtra.get(0);
                    }
                    if (str3 == null) {
                        str3 = intent.getStringExtra("outputPhotoPath");
                    }
                    if (str3 == null) {
                        str3 = intent.getStringExtra("result_path");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto result: editedPath=" + str3 + ", outputPath=" + this.f321803h);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || !com.tencent.mm.vfs.w6.j(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto failed: edited file not exist, path=" + str3);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Edited file not exist")))));
                } else if (str3 != null) {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.tencent.mm.graphics.e.d(str3, options);
                    android.graphics.Point point = new android.graphics.Point(options.outWidth, options.outHeight);
                    com.tencent.mm.compatible.util.Exif fromFile = com.tencent.mm.compatible.util.Exif.fromFile(str2);
                    com.tencent.pigeon.biz.BizSelectPhotoInfo bizSelectPhotoInfo = new com.tencent.pigeon.biz.BizSelectPhotoInfo(str.concat("_edited"), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)).o(), null, java.lang.Long.valueOf(point.x), java.lang.Long.valueOf(point.y), fromFile != null ? new com.tencent.pigeon.biz.BizPhotoExtInfo(java.lang.Double.valueOf(fromFile.latitude), java.lang.Double.valueOf(fromFile.longitude), null, null, null, null, null, null, null, null, null, 2044, null) : null, q75.g.b(s46.c.c(r26.n0.u0(str3).toString())), 4, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto success: path=" + bizSelectPhotoInfo.getPath() + ", width=" + bizSelectPhotoInfo.getWidth() + ", height=" + bizSelectPhotoInfo.getHeight());
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(bizSelectPhotoInfo)));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMediaPlugin", "handleEditPhotoResult: exception", e17);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto cancelled by user");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321799d = binding.getActivity();
        binding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizMediaApi.Companion companion = com.tencent.pigeon.biz.BizMediaApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizMediaApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321799d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321799d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizMediaApi.Companion companion = com.tencent.pigeon.biz.BizMediaApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizMediaApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        kotlinx.coroutines.z0.e(this.f321804i, null, 1, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321799d = binding.getActivity();
        binding.addActivityResultListener(this);
    }

    @Override // com.tencent.pigeon.biz.BizMediaApi
    public void selectPhoto(long j17, boolean z17, boolean z18, boolean z19, long j18, long j19, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        zw.o oVar = zw.o.f476536a;
        android.content.Context context = this.f321799d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        oVar.a(context, (int) j18, (int) j17, z18, z19, (int) j19, new lx.g2(this, callback), false);
    }

    @Override // com.tencent.pigeon.biz.BizMediaApi
    public void uploadCommentPic(com.tencent.pigeon.biz.BizStartCdnUploadReq req, yz5.l callback) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope2;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(callback, "callback");
        lx.h2 h2Var = new lx.h2(callback);
        java.lang.Long cancel = req.getCancel();
        if (cancel != null && ((int) cancel.longValue()) == 1) {
            gm0.b bVar = gm0.j1.b().f273245h;
            if (bVar == null || (lifecycleScope2 = bVar.f273145e) == null) {
                return;
            }
            v65.i.b(lifecycleScope2, null, new tr1.a(req, null), 1, null);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.field_mediaId = req.getMediaId();
        java.lang.Long appType = req.getAppType();
        mVar.field_appType = appType != null ? (int) appType.longValue() : 0;
        mVar.f241789h = 3;
        java.lang.Long fileType = req.getFileType();
        mVar.field_fileType = fileType != null ? (int) fileType.longValue() : 0;
        mVar.field_fullpath = req.getFullPath();
        mVar.field_thumbpath = req.getThumbPath();
        mVar.N = req.getCustom_header();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInteractionCommentImgUploader", "uploadCommentCDNImpl taskInfo field_mediaId:" + mVar.field_mediaId);
        gm0.b bVar2 = gm0.j1.b().f273245h;
        if (bVar2 == null || (lifecycleScope = bVar2.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new tr1.b(mVar, h2Var, req, null), 1, null);
    }
}
