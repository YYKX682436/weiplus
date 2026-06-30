package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SettingSnsBackgroundUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f166622h = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f166623d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f166624e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.SharedPreferences f166625f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f166626g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_bg_artist_preference_open, true);

    public final void V6(java.lang.String str) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        w94.a aVar = w94.a.f444075a;
        int i17 = 1;
        if (aVar.b()) {
            java.lang.String c18 = q75.g.c(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", "mediaEdit mimeType:%s", c18);
            if (android.text.TextUtils.isEmpty(c18)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                return;
            }
            if (c18.contains("image")) {
                c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, dw3.h.f244211a.c("sns_cover", null));
                c17.a(1, com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout.class.getName());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
                if (snsCoverReportStruct != null) {
                    snsCoverReportStruct.f60521h = 1;
                }
                if (snsCoverReportStruct != null) {
                    snsCoverReportStruct.f60517d = 4;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            } else {
                java.lang.String[] e17 = dw3.h.f244211a.e("sns_cover", "video", "thumb");
                c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(str, e17[0], e17[1]);
                i17 = 2;
                c17.a(2, com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout.class.getName());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = ba4.b.f18698a;
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.f60521h = 2;
                }
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.f60517d = 4;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = c17;
            com.tencent.mm.modelcontrol.VideoTransPara a17 = aVar.a();
            recordConfigProvider.f155676n = a17;
            recordConfigProvider.f155685w = a17.f71195h * 1000;
            recordConfigProvider.f155688z = false;
            ut3.m.f431182a.f(getContext(), 8, com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd, recordConfigProvider, i17, 0);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct3 = ba4.b.f18698a;
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f60521h = 1;
            }
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f60517d = 4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImageMode", 1);
            intent.putExtra("CropImage_ImgPath", str);
            intent.putExtra("CropImage_OutputPath", com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes()));
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.p(this, intent, 6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mediaEdit", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    public final void W6(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        if (i17 == 2) {
            str = "onActivityResultImp";
            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(getApplicationContext(), intent, com.tencent.mm.plugin.sns.model.l4.Ni());
            this.f166623d = b17;
            if (b17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return;
            }
            V6(b17);
        } else if (i17 != 5) {
            float f17 = 0.0f;
            if (i17 != 6) {
                switch (i17) {
                    case 8:
                        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ri();
                        com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo = (com.tencent.mm.plugin.mediabasic.data.MediaResultInfo) intent.getParcelableExtra("media_basic_out_model");
                        if (mediaResultInfo != null && mediaResultInfo.f148606d) {
                            if (mediaResultInfo.f148608f != null && pc4.d.f353410a.y()) {
                                f17 = mediaResultInfo.f148608f.getFloat("snsCoverOffsetKey", 0.0f);
                            }
                            java.util.Iterator it = mediaResultInfo.f148607e.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) obj).f148609d == og3.a.f345155d) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                com.tencent.mm.plugin.sns.model.o7 Nj = com.tencent.mm.plugin.sns.model.l4.Nj();
                                java.util.ArrayList arrayList = mediaResultInfo.f148607e;
                                Nj.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverByVideo", "com.tencent.mm.plugin.sns.model.UploadManager");
                                java.util.Iterator it6 = arrayList.iterator();
                                java.lang.String str7 = "";
                                java.lang.String str8 = str7;
                                java.lang.String str9 = str8;
                                while (it6.hasNext()) {
                                    com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) it6.next();
                                    if (mediaSingleInfo.f148609d == og3.a.f345155d) {
                                        str8 = mediaSingleInfo.f148610e;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "videoPath:%s", str8);
                                    }
                                    if (mediaSingleInfo.f148609d == og3.a.f345157f) {
                                        str9 = mediaSingleInfo.f148610e;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "thumbPath:%s", str9);
                                    }
                                    if (mediaSingleInfo.f148609d == og3.a.f345156e) {
                                        str7 = mediaSingleInfo.f148610e;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "coverPath:%s", str7);
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "videoPath:%s thumbPath:%s", str8, str9);
                                if (Nj.i() == null || Nj.i().equals("")) {
                                    str5 = "setSnsCoverByVideo";
                                    str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                    str3 = "onActivityResultImp";
                                    str4 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                } else {
                                    java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), Nj.i());
                                    com.tencent.mm.vfs.w6.u(d17);
                                    java.lang.String thumbPath = d17 + Nj.i() + "thumb_bg_";
                                    java.lang.String videoPath = d17 + Nj.i() + "vdieo_bg_";
                                    java.lang.String imagePath = d17 + Nj.i() + "image_bg_";
                                    com.tencent.mm.vfs.w6.h(d17 + Nj.i() + "bg_");
                                    Nj.o(str8, videoPath);
                                    Nj.o(str9, thumbPath);
                                    Nj.o(str7, imagePath);
                                    com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
                                    java.lang.String userName = Nj.i();
                                    Bj.getClass();
                                    str3 = "onActivityResultImp";
                                    str4 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCoverVideoInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                                    kotlin.jvm.internal.o.g(userName, "userName");
                                    kotlin.jvm.internal.o.g(videoPath, "videoPath");
                                    kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
                                    kotlin.jvm.internal.o.g(imagePath, "imagePath");
                                    str5 = "setSnsCoverByVideo";
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "updateCoverVideoInfoLocal :".concat(userName));
                                    com.tencent.mm.plugin.sns.storage.x1 L0 = Bj.L0(userName);
                                    L0.field_userName = userName;
                                    Bj.z0(L0);
                                    L0.field_type = 2;
                                    if (kotlin.jvm.internal.o.b(videoPath, L0.field_localVideo)) {
                                        str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                    } else {
                                        str6 = "com.tencent.mm.plugin.sns.model.UploadManager";
                                        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(L0.field_localVideo));
                                        L0.field_localVideo = videoPath;
                                    }
                                    if (!kotlin.jvm.internal.o.b(thumbPath, L0.field_localThumb)) {
                                        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(L0.field_localThumb));
                                        L0.field_localThumb = thumbPath;
                                    }
                                    if (!kotlin.jvm.internal.o.b(imagePath, L0.field_localImage)) {
                                        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(L0.field_localImage));
                                        L0.field_localImage = imagePath;
                                    }
                                    Bj.W0(L0, false);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverVideoInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                                    oi0.e.f345591d.b(thumbPath, videoPath);
                                }
                                Nj.j();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadSnsVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
                                com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(7, null);
                                if (com.tencent.mm.vfs.w6.j(str7)) {
                                    y7Var.a(str7, "");
                                }
                                if (com.tencent.mm.vfs.w6.j(str8)) {
                                    y7Var.f(str8, str9, "", com.tencent.mm.vfs.w6.p(str8));
                                }
                                y7Var.F(1);
                                int i19 = y7Var.i();
                                if (str8 != null) {
                                    ta4.b1.f416725a.b(i19, kz5.b0.c(str8));
                                }
                                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.W = i19;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                ba4.b.f18700c = i19;
                                ba4.b.f18699b = java.lang.System.currentTimeMillis();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadSnsVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
                            } else {
                                str3 = "onActivityResultImp";
                                str4 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                                com.tencent.mm.plugin.sns.model.l4.Nj().r(mediaResultInfo.f148607e, f17);
                            }
                            setResult(-1);
                            finish();
                            str = str3;
                            str2 = str4;
                            break;
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SettingSnsBackgroundUI", "CaptureVideoNormalModel is null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                            return;
                        }
                        break;
                    case 9:
                        if (intent != null) {
                            je4.a.f299315a.a(this, 10, intent.getByteArrayExtra("SELECT_OBJECT"), intent.getIntExtra("SELECT_TAB_TYPE", 0), 0);
                            str = "onActivityResultImp";
                            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                            break;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                            return;
                        }
                    case 10:
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                        try {
                            finderObject.parseFrom(intent.getByteArrayExtra("SELECT_OBJECT"));
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingSnsBackgroundUI", e17, "FinderObject error", new java.lang.Object[0]);
                        }
                        if (finderObject.getObjectDesc() != null) {
                            if (finderObject.getObjectDesc().getMediaType() == 2) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
                                if (snsCoverReportStruct != null) {
                                    snsCoverReportStruct.f60521h = 4;
                                }
                                if (snsCoverReportStruct != null) {
                                    snsCoverReportStruct.f60517d = 4;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                            } else if (finderObject.getObjectDesc().getMediaType() == 4) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                                com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = ba4.b.f18698a;
                                if (snsCoverReportStruct2 != null) {
                                    snsCoverReportStruct2.f60521h = 3;
                                }
                                if (snsCoverReportStruct2 != null) {
                                    snsCoverReportStruct2.f60517d = 4;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                            }
                        }
                        com.tencent.mm.plugin.sns.model.l4.Nj().q(finderObject);
                        setResult(-1);
                        finish();
                        str = "onActivityResultImp";
                        str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                        break;
                    default:
                        com.tencent.mars.xlog.Log.e("MicroMsg.SettingSnsBackgroundUI", "onActivityResult: not found this requestCode");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResultImp", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                        return;
                }
            } else {
                str = "onActivityResultImp";
                str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.h8(this));
                if (intent == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                this.f166623d = stringExtra;
                if (stringExtra == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM   " + this.f166623d);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.String path = this.f166623d;
                kotlin.jvm.internal.o.g(path, "path");
                arrayList2.add(new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(og3.a.f345156e, path, null, 4, null));
                com.tencent.mm.plugin.sns.model.l4.Nj().r(arrayList2, 0.0f);
                setResult(-1);
                finish();
            }
        } else {
            str = "onActivityResultImp";
            str2 = "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI";
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return;
            }
            java.lang.String b18 = com.tencent.mm.ui.tools.i1.b(getApplicationContext(), intent, com.tencent.mm.plugin.sns.model.l4.Ni());
            this.f166623d = b18;
            if (b18 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return;
            }
            V6(b18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public final void X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("takePhotoAfterPermissionGranted", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        w94.a aVar = w94.a.f444075a;
        if (aVar.b()) {
            java.lang.String[] e17 = dw3.h.f244211a.e("sns_cover", "video", "thumb");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider d17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.d(e17[0], e17[1]);
            com.tencent.mm.plugin.sns.statistics.a aVar2 = com.tencent.mm.plugin.sns.statistics.a.f164826a;
            aVar2.a(d17, aVar2.i());
            d17.a(1, com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout.class.getName());
            d17.a(2, com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout.class.getName());
            com.tencent.mm.modelcontrol.VideoTransPara a17 = aVar.a();
            d17.f155676n = a17;
            d17.f155685w = a17.f71195h * 1000;
            d17.f155688z = true;
            d17.f155684v = java.lang.Boolean.FALSE;
            ut3.m.f431182a.d(getContext(), 8, com.tencent.mm.R.anim.f477876e0, -1, d17, 0);
        } else {
            if (!com.tencent.mm.pluginsdk.ui.tools.l7.l(this, lp0.b.m(), "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, 2)) {
                dp.a.makeText(this, getString(com.tencent.mm.R.string.igw), 1).show();
            }
        }
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.A().f60513d = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("takePhotoAfterPermissionGranted", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResourceId", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        return com.tencent.mm.R.xml.f494951cj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        setMMTitle(com.tencent.mm.R.string.iyk);
        com.tencent.mm.plugin.sns.ui.SnsArtistPreference snsArtistPreference = (com.tencent.mm.plugin.sns.ui.SnsArtistPreference) ((com.tencent.mm.ui.base.preference.h0) this.f166624e).h("settings_sns_bg_select_bg");
        if (snsArtistPreference != null) {
            if (this.f166626g) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
                snsArtistPreference.R = "Kravanja";
                snsArtistPreference.M();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
                ((com.tencent.mm.ui.base.preference.h0) this.f166624e).notifyDataSetChanged();
            } else {
                ((com.tencent.mm.ui.base.preference.h0) this.f166624e).v(snsArtistPreference);
            }
        }
        setBackBtn(new com.tencent.mm.plugin.sns.ui.k8(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", "onAcvityResult requestCode:" + i17 + " " + i18);
        if (i18 != -1) {
            if (i17 == 2 || i17 == 5 || i17 == 6) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.i8(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        gm0.j1.i();
        gm0.j1.b().m();
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper()).postDelayed(new com.tencent.mm.plugin.sns.ui.j8(this, i17, i18, intent), 2000L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        } else {
            W6(i17, i18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f60517d = 3;
        }
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.k();
        }
        ba4.b.f18698a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onCreate(bundle);
        this.f166624e = getPreferenceScreen();
        this.f166625f = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        if (!w94.a.f444075a.b()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f166624e).w("settings_sns_bg_select_from_finder");
        }
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        ba4.b.f18698a = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onNewIntent(intent);
        setIntent(intent);
        setResult(-1);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", str + " item has been clicked!");
        boolean z17 = false;
        if (str.equals("settings_sns_bg_select_from_album")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60521h = 10;
            }
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60517d = 4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            gm0.j1.i();
            if (gm0.j1.u().l()) {
                if (w94.a.f444075a.b()) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("is_hide_album_footer", true);
                    intent.putExtra("is_hide_album_preview_footer", true);
                    com.tencent.mm.pluginsdk.ui.tools.l7.c(this, 5, 1, 31, 3, false, intent);
                } else {
                    com.tencent.mm.pluginsdk.ui.tools.l7.h(this, 5, null);
                }
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.A().f60513d = 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z17 = true;
            } else {
                db5.t7.k(this, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectFromAlbum", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z17;
        }
        if (str.equals("settings_sns_bg_select_from_finder")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = ba4.b.f18698a;
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.f60521h = 11;
            }
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.f60517d = 4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            gm0.j1.i();
            if (gm0.j1.u().l()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("BIZ_SCENE", 3);
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                arrayList.add(2);
                arrayList.add(4);
                arrayList.add(5);
                arrayList.add(3);
                arrayList.add(1);
                intent2.putIntegerArrayListExtra("TAB_LIST", arrayList);
                overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).yj(this, intent2, 9);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z17 = true;
            } else {
                db5.t7.k(this, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectFromFinder", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return z17;
        }
        if (!str.equals("settings_sns_bg_take_photo")) {
            if (!str.equals("settings_sns_bg_select_bg")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                return false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct3 = ba4.b.f18698a;
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f60521h = 13;
            }
            if (snsCoverReportStruct3 != null) {
                snsCoverReportStruct3.f60517d = 4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSelectBg", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.ArtistUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI", "setSelectBg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/sns/ui/SettingSnsBackgroundUI", "setSelectBg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.A().f60513d = 8;
            s0Var.A().f60514e = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSelectBg", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct4 = ba4.b.f18698a;
        if (snsCoverReportStruct4 != null) {
            snsCoverReportStruct4.f60521h = 12;
        }
        if (snsCoverReportStruct4 != null) {
            snsCoverReportStruct4.f60517d = 4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markType", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), getContext());
            if (a17) {
                X6();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
                z17 = true;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            }
        } else {
            db5.t7.k(this, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTakePhoto", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreferenceTreeClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        return z17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingSnsBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if (iArr[0] == 0) {
                X6();
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.sns.ui.l8(this), null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        super.onResume();
        com.tencent.mm.ui.base.preference.r rVar = this.f166624e;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
    }
}
