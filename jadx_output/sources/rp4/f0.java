package rp4;

/* loaded from: classes10.dex */
public final class f0 implements yt3.r2 {
    public yz5.p A;
    public boolean B;
    public final java.util.ArrayList C;
    public java.lang.String D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f398629d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f398630e;

    /* renamed from: f, reason: collision with root package name */
    public ct0.b f398631f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f398632g;

    /* renamed from: h, reason: collision with root package name */
    public ru3.f f398633h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f398634i;

    /* renamed from: m, reason: collision with root package name */
    public st3.s f398635m;

    /* renamed from: n, reason: collision with root package name */
    public st3.r f398636n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f398637o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f398638p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f398639q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f398640r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f398641s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f398642t;

    /* renamed from: u, reason: collision with root package name */
    public m55.c f398643u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f398644v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f398645w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.loading.MMProgressLoading f398646x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f398647y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f398648z;

    public f0(android.content.Context context, ju3.d0 d0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f398629d = context;
        this.f398630e = d0Var;
        this.f398634i = true;
        this.f398636n = new st3.r(0, 0, 0, 0, 0, 0, 0, 0, false, false, 0, 0, 0, 0, 16383, null);
        this.f398637o = "";
        this.f398641s = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));
        this.f398644v = "";
        this.C = new java.util.ArrayList();
        this.D = "";
        this.E = "";
    }

    public final void a(boolean z17) {
        if (z17) {
            java.util.ArrayList arrayList = this.C;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            arrayList.add(recordConfigProvider.B);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            arrayList.add(recordConfigProvider2.C);
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider3);
        recordConfigProvider3.B = "";
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider4);
        recordConfigProvider4.C = "";
        dw3.c0 c0Var = dw3.c0.f244182a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider5);
        c0Var.c(recordConfigProvider5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeOutputPath >> ");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider6 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider6);
        sb6.append(recordConfigProvider6.C);
        sb6.append(' ');
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider7 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider7);
        sb6.append(recordConfigProvider7.B);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
    }

    public final void b(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        if (this.f398648z) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copyMuxResultPath >> configThumbPath: ");
            sb6.append(this.D);
            sb6.append(" configVideoPath: ");
            sb6.append(this.E);
            sb6.append(", currentProviderThumbPath: ");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            sb6.append(recordConfigProvider.C);
            sb6.append(" currentProviderVideoPath: ");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            sb6.append(recordConfigProvider2.B);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
            boolean z17 = this.D.length() > 0;
            java.util.ArrayList arrayList = this.C;
            if (z17) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f398632g;
                kotlin.jvm.internal.o.d(recordConfigProvider3);
                com.tencent.mm.vfs.w6.c(recordConfigProvider3.C, this.D);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.f398632g;
                kotlin.jvm.internal.o.d(recordConfigProvider4);
                arrayList.add(recordConfigProvider4.C);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.f398632g;
                kotlin.jvm.internal.o.d(recordConfigProvider5);
                java.lang.String str = this.D;
                recordConfigProvider5.C = str;
                captureDataManager$CaptureVideoNormalModel.f155662f = str;
            }
            if (this.E.length() > 0) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider6 = this.f398632g;
                kotlin.jvm.internal.o.d(recordConfigProvider6);
                com.tencent.mm.vfs.w6.c(recordConfigProvider6.B, this.E);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider7 = this.f398632g;
                kotlin.jvm.internal.o.d(recordConfigProvider7);
                arrayList.add(recordConfigProvider7.B);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider8 = this.f398632g;
                kotlin.jvm.internal.o.d(recordConfigProvider8);
                java.lang.String str2 = this.E;
                recordConfigProvider8.B = str2;
                captureDataManager$CaptureVideoNormalModel.f155661e = str2;
            }
        }
        nu3.e eVar = nu3.e.f340198a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider9 = this.f398632g;
        java.lang.String str3 = recordConfigProvider9 != null ? recordConfigProvider9.B : null;
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[parseVideoEditedMediaInfo]");
        nu3.b c17 = eVar.c(str3);
        nu3.e.f340203f = c17;
        if (c17.d() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVideo.CameraEditorReporter", "wait for background remux, filepath:".concat(str3));
        }
        ((java.util.ArrayList) nu3.e.f340206i).add(str3);
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("mediacodec_create_error", false);
        ut3.f.f431176c.a(this.f398629d, captureDataManager$CaptureVideoNormalModel);
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel c() {
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f398632g;
        if (recordConfigProvider == null) {
            return null;
        }
        ct0.b bVar = this.f398631f;
        boolean z17 = bVar != null && bVar.f222206c;
        rp4.y yVar = rp4.y.f398709a;
        if (z17) {
            int i17 = recordConfigProvider.F;
            if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 135L, 1L, false);
            } else if (i17 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 136L, 1L, false);
            }
            dw3.c0.f244182a.t(this.f398632g, true);
            java.lang.String outputVideoPath = recordConfigProvider.B;
            kotlin.jvm.internal.o.f(outputVideoPath, "outputVideoPath");
            java.lang.String thumbPath = recordConfigProvider.C;
            kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
            yVar.a(outputVideoPath, thumbPath, recordConfigProvider.f155676n.f71204t);
            java.lang.String outputVideoPath2 = recordConfigProvider.B;
            kotlin.jvm.internal.o.f(outputVideoPath2, "outputVideoPath");
            yVar.b(outputVideoPath2);
            ct0.b bVar2 = this.f398631f;
            if (bVar2 != null) {
                ut3.f fVar = ut3.f.f431176c;
                fVar.f431178b.putBoolean("key_is_capture_video", bVar2.f222206c);
                android.os.Bundle bundle = fVar.f431178b;
                java.util.ArrayList arrayList = bVar2.f222214k;
                bundle.putBoolean("key_is_photo_video", !(arrayList == null || arrayList.isEmpty()));
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String str2 = recordConfigProvider.B;
            java.lang.String str3 = recordConfigProvider.C;
            kotlin.jvm.internal.o.d(this.f398635m);
            kotlin.jvm.internal.o.d(this.f398635m);
            return new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, str2, str3, java.lang.Long.valueOf(r1.f412593g - r3.f412592f), java.lang.Boolean.FALSE, nu3.i.f340218a.l());
        }
        if (recordConfigProvider != null && (str = recordConfigProvider.B) != null && !com.tencent.mm.vfs.w6.j(com.tencent.mm.vfs.w6.r(str))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoCompositionRemuxPlugin", "output parent dir is no exist >> make result " + com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str)));
        }
        ct0.b bVar3 = this.f398631f;
        kotlin.jvm.internal.o.d(bVar3);
        java.lang.String str4 = bVar3.f222204a;
        java.lang.String thumbPath2 = recordConfigProvider.C;
        kotlin.jvm.internal.o.f(thumbPath2, "thumbPath");
        yVar.a(str4, thumbPath2, recordConfigProvider.f155676n.f71204t);
        ct0.b bVar4 = this.f398631f;
        kotlin.jvm.internal.o.d(bVar4);
        java.lang.String str5 = bVar4.f222204a;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider2);
        long d17 = com.tencent.mm.vfs.w6.d(str5, recordConfigProvider2.B, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", "handleNoNeedRemuxVideoFile >> copy result " + d17);
        if (d17 >= 0) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider3);
            java.lang.String outputVideoPath3 = recordConfigProvider3.B;
            kotlin.jvm.internal.o.f(outputVideoPath3, "outputVideoPath");
            yVar.b(outputVideoPath3);
        }
        ct0.b bVar5 = this.f398631f;
        if (bVar5 != null) {
            ut3.f fVar2 = ut3.f.f431176c;
            fVar2.f431178b.putBoolean("key_is_capture_video", bVar5.f222206c);
            android.os.Bundle bundle2 = fVar2.f431178b;
            java.util.ArrayList arrayList2 = bVar5.f222214k;
            bundle2.putBoolean("key_is_photo_video", !(arrayList2 == null || arrayList2.isEmpty()));
        }
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.f398632g;
        kotlin.jvm.internal.o.d(recordConfigProvider4);
        java.lang.String str6 = recordConfigProvider4.B;
        java.lang.String str7 = recordConfigProvider.C;
        kotlin.jvm.internal.o.d(this.f398635m);
        kotlin.jvm.internal.o.d(this.f398635m);
        return new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool2, str6, str7, java.lang.Long.valueOf(r1.f412593g - r3.f412592f), java.lang.Boolean.FALSE, nu3.i.f340218a.l());
    }

    public final void d(ct0.b info, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f398631f = info;
        this.f398632g = configProvider;
        this.f398638p = configProvider.f155676n;
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_IS_CAPUTRE_BOOLEAN", java.lang.Boolean.valueOf(info.f222206c));
        if (info.f222206c) {
            iVar.n("KEY_CAPUTRE_VIDEO_PATH_STRING", info.d());
            iVar.n("KEY_CAPUTRE_THUMB_PATH_STRING", info.a() ? info.f222205b : info.f222210g);
        }
        boolean z17 = configProvider.M.getBoolean("key_edit_video_remux_show_progress", false);
        this.f398648z = z17;
        if (z17) {
            android.content.Context context = this.f398629d;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            this.f398645w = activity.findViewById(com.tencent.mm.R.id.f484164r60);
            this.f398646x = (com.tencent.mm.ui.widget.loading.MMProgressLoading) activity.findViewById(com.tencent.mm.R.id.r79);
            this.f398647y = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.r8g);
            android.view.View view = this.f398645w;
            if (view != null) {
                view.setOnClickListener(rp4.z.f398710d);
            }
            android.widget.TextView textView = this.f398647y;
            if (textView != null) {
                textView.setOnClickListener(new rp4.a0(this));
            }
            this.A = new rp4.c0(this);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealFilePath videoPath: ");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            sb6.append(recordConfigProvider.B);
            sb6.append(" thumbPath: ");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            sb6.append(recordConfigProvider2.C);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider3);
            java.lang.String thumbPath = recordConfigProvider3.C;
            kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
            this.D = thumbPath;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.f398632g;
            kotlin.jvm.internal.o.d(recordConfigProvider4);
            java.lang.String outputVideoPath = recordConfigProvider4.B;
            kotlin.jvm.internal.o.f(outputVideoPath, "outputVideoPath");
            this.E = outputVideoPath;
            a(false);
        }
    }

    public final void e(int i17) {
        android.content.Context context = this.f398629d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).setResult(i17);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
    }

    public final void f(st3.s editConfig, rp4.x mediaModel) {
        boolean z17;
        kotlin.jvm.internal.o.g(editConfig, "editConfig");
        kotlin.jvm.internal.o.g(mediaModel, "mediaModel");
        if (this.f398634i) {
            this.f398634i = false;
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", "isRepeat to return");
            return;
        }
        this.B = false;
        kotlinx.coroutines.r2 r2Var = this.f398642t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f398642t = kotlinx.coroutines.l.d(this.f398641s, null, null, new rp4.e0(this, editConfig, mediaModel, null), 3, null);
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.r2 r2Var = this.f398642t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (this.f398648z) {
            for (java.lang.String str : this.C) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxPlugin", "delete dirty file " + str);
                if (r26.n0.D(str, "edit", false, 2, null) && r26.n0.D(str, "vsg_", false, 2, null)) {
                    dw3.c0.f244182a.j(str);
                }
            }
        }
    }
}
