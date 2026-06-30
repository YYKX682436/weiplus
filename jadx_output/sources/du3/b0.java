package du3;

/* loaded from: classes10.dex */
public final class b0 extends yt3.a {
    public static final du3.r F = new du3.r(null);
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public boolean D;
    public java.lang.String E;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243524f;

    /* renamed from: g, reason: collision with root package name */
    public final int f243525g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f243526h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f243527i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f243528m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f243529n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f243530o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f243531p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f243532q;

    /* renamed from: r, reason: collision with root package name */
    public du3.b f243533r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f243534s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f243535t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f243536u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f243537v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f243538w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f243539x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f243540y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f243541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243524f = parent;
        this.f243525g = hashCode();
        this.f243526h = "yb_task_id";
        this.f243527i = "yb_template_id";
        this.f243528m = "yb_image_local_id";
        this.f243529n = "yb_video_local_id";
        this.f243530o = "yb_media_type";
        this.f243531p = "yb_save_origin_image";
        this.f243532q = "%s?yb_task_id=%s&yb_template_id=%s&yb_image_local_id=%s&yb_support_live_photo=%s";
        this.f243534s = "0";
        this.f243536u = jz5.h.b(new du3.w(this));
        this.f243537v = jz5.h.b(new du3.v(this));
        this.f243538w = jz5.h.b(new du3.a0(this));
        this.f243539x = jz5.h.b(new du3.u(this, status));
        this.f243540y = new java.util.ArrayList();
        this.A = "";
        this.C = "";
    }

    public final void A(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "replaceImage localid:" + str + " path:" + d17);
        if (com.tencent.mm.vfs.w6.j(d17)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_1_STRING", d17);
            this.f465332d.w(ju3.c0.Y1, bundle);
        }
    }

    public final void B(java.lang.String str) {
        if (this.D) {
            try {
                java.lang.String str2 = this.B;
                if (android.text.TextUtils.isEmpty(str2)) {
                    java.lang.String i17 = com.tencent.mm.vfs.w6.i(this.E, false);
                    if (com.tencent.mm.vfs.w6.j(i17)) {
                        kotlin.jvm.internal.o.d(i17);
                        android.media.ExifInterface exifInterface = new android.media.ExifInterface(i17);
                        java.lang.String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE);
                        java.lang.String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL);
                        if (kotlin.jvm.internal.o.b("yuanbao.tencent.com", attribute) && !android.text.TextUtils.isEmpty(attribute2)) {
                            str2 = attribute2;
                        }
                    }
                }
                if (!android.text.TextUtils.isEmpty(str2) && str2 != null) {
                    java.lang.String i18 = com.tencent.mm.vfs.w6.i(str, true);
                    if (com.tencent.mm.vfs.w6.j(i18)) {
                        kotlin.jvm.internal.o.d(i18);
                        android.media.ExifInterface exifInterface2 = new android.media.ExifInterface(i18);
                        exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE, "yuanbao.tencent.com");
                        exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL, str2);
                        exifInterface2.saveAttributes();
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("yb_template_id", str2);
                        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
                        kotlin.jvm.internal.o.f(wi6, "checkSnsPostSessionId(...)");
                        hashMap.put("sns_publish_sessionid", wi6);
                        hashMap.put("yb_return_type", this.f243534s);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_yb_retouch_complete", hashMap, 36244);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImproveEditPhotoAiPlugin", e17, "saveYuanBaoTemplateInfo error", new java.lang.Object[0]);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == this.f243525g && i18 == -1) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "get null data");
                return;
            }
            java.lang.String string = bundleExtra.getString(this.f243526h);
            if (string == null) {
                string = "";
            }
            java.lang.String decode = java.net.URLDecoder.decode(string, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String string2 = bundleExtra.getString(this.f243527i);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String decode2 = java.net.URLDecoder.decode(string2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String string3 = bundleExtra.getString(this.f243528m);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String decode3 = java.net.URLDecoder.decode(string3, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String string4 = bundleExtra.getString(this.f243529n);
            if (string4 == null) {
                string4 = "";
            }
            java.lang.String decode4 = java.net.URLDecoder.decode(string4, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            java.lang.String string5 = bundleExtra.getString(this.f243530o);
            if (string5 == null) {
                string5 = "";
            }
            java.lang.String decode5 = java.net.URLDecoder.decode(string5, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            kotlin.jvm.internal.o.f(decode5, "decode(...)");
            this.f243534s = decode5;
            java.lang.String string6 = bundleExtra.getString(this.f243531p);
            if (string6 == null) {
                string6 = "";
            }
            java.lang.String decode6 = java.net.URLDecoder.decode(string6, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "taskId:" + decode + " templateId:" + decode2 + " mediaType:" + this.f243534s + " imageLocalId:" + decode3 + " videoLocalId:" + decode4);
            this.B = decode2;
            java.lang.String str = this.f243534s;
            int hashCode = str.hashCode();
            android.view.ViewGroup viewGroup = this.f243524f;
            switch (hashCode) {
                case 48:
                    if (str.equals("0")) {
                        A(decode3);
                        break;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f243534s);
                    break;
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    if (str.equals("1")) {
                        ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                        boolean a17 = pc4.e.f353426a.a();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                        boolean z17 = true;
                        if (!a17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "device not support livephoto");
                            if (decode3 != null && decode3.length() != 0) {
                                z17 = false;
                            }
                            if (!z17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "roll back to image");
                                A(decode3);
                                break;
                            }
                        } else {
                            if (!(decode3 == null || decode3.length() == 0)) {
                                if (decode4 != null && decode4.length() != 0) {
                                    z17 = false;
                                }
                                if (!z17) {
                                    ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
                                    java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(decode3);
                                    ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
                                    java.lang.String d18 = com.tencent.mm.plugin.webview.model.o5.d(decode4);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "handleLivePhoto thumb:" + d17 + " video:" + d18);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "export thumb:" + com.tencent.mm.vfs.w6.i(d17, false) + " video:" + com.tencent.mm.vfs.w6.i(d18, false));
                                    B(d17);
                                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                    com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, d18, d17, -1L, bool, nu3.i.f340218a.l());
                                    captureDataManager$CaptureVideoNormalModel.f155667n = bool;
                                    ut3.f.f431176c.a(viewGroup.getContext(), captureDataManager$CaptureVideoNormalModel);
                                    break;
                                }
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f243534s);
                    break;
                case 50:
                    if (str.equals("2")) {
                        db5.e1.y(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.pdv), "", i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.f490454vi), null);
                        break;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f243534s);
                    break;
                default:
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "unsupported type:" + this.f243534s);
                    break;
            }
            if (decode.equals(this.A) && decode6.equals("1")) {
                java.lang.String str2 = this.C;
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    java.lang.String a18 = q75.c.a("jpg");
                    zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    ((yb0.g) b0Var).getClass();
                    com.tencent.mm.platformtools.ExportFileUtil.b(context, str2, a18);
                    q75.c.f(a18, com.tencent.mm.sdk.platformtools.x2.f193071a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "export " + str2 + " to:" + a18);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.d(decode2);
            hashMap.put("yb_template_id", decode2);
            java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
            kotlin.jvm.internal.o.f(wi6, "checkSnsPostSessionId(...)");
            hashMap.put("sns_publish_sessionid", wi6);
            hashMap.put("yb_return_type", this.f243534s);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_yb_replace_asset", hashMap, 36244);
        }
    }

    @Override // yt3.r2
    public void onAttach() {
        ((hk0.u0) ((jz5.n) this.f243538w).getValue()).Z6(6, new du3.z(this));
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        boolean a17 = F.a(configProvider);
        this.D = a17;
        if (a17) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f243524f.getContext());
            linearLayoutManager.Q(0);
            z().setLayoutManager(linearLayoutManager);
            z().N(new eu3.d(10));
            z().setAdapter((du3.q) ((jz5.n) this.f243539x).getValue());
            java.lang.String inputPhotoPath = configProvider.D;
            kotlin.jvm.internal.o.f(inputPhotoPath, "inputPhotoPath");
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new du3.y(this, inputPhotoPath, null), 2, null);
            this.E = configProvider.D;
        }
    }

    public final androidx.recyclerview.widget.RecyclerView z() {
        java.lang.Object value = ((jz5.n) this.f243536u).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }
}
