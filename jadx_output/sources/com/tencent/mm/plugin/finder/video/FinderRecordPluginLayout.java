package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderRecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lr90/j;", "", "getMaxMegaVideoDuration", "Landroid/view/View;", "x", "Ljz5/g;", "getHeaderParentView", "()Landroid/view/View;", "headerParentView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderRecordPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0, r90.j {
    public static final /* synthetic */ int K = 0;
    public it3.y A;
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider B;
    public di3.d C;
    public final hw2.e0 D;
    public long E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f130624J;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView f130625h;

    /* renamed from: i, reason: collision with root package name */
    public final yt3.r3 f130626i;

    /* renamed from: m, reason: collision with root package name */
    public final hw2.w f130627m;

    /* renamed from: n, reason: collision with root package name */
    public final yt3.y3 f130628n;

    /* renamed from: o, reason: collision with root package name */
    public final yt3.w3 f130629o;

    /* renamed from: p, reason: collision with root package name */
    public final hw2.t f130630p;

    /* renamed from: q, reason: collision with root package name */
    public final iw2.b f130631q;

    /* renamed from: r, reason: collision with root package name */
    public final hw2.c0 f130632r;

    /* renamed from: s, reason: collision with root package name */
    public final hw2.b0 f130633s;

    /* renamed from: t, reason: collision with root package name */
    public final hw2.e f130634t;

    /* renamed from: u, reason: collision with root package name */
    public final hw2.g0 f130635u;

    /* renamed from: v, reason: collision with root package name */
    public final cw2.ab f130636v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f130637w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final jz5.g headerParentView;

    /* renamed from: y, reason: collision with root package name */
    public cw2.h0 f130639y;

    /* renamed from: z, reason: collision with root package name */
    public at0.n f130640z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRecordPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.headerParentView = jz5.h.b(new cw2.y4(this));
        this.C = new di3.d(context, 2);
        hw2.e0 e0Var = new hw2.e0(this);
        this.D = e0Var;
        this.G = true;
        this.f130624J = "";
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489081b80, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ntp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        yt3.y3 y3Var = new yt3.y3((android.widget.ImageView) findViewById, this);
        this.f130628n = y3Var;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bzo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        hw2.w wVar = new hw2.w((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2, this, findViewById(com.tencent.mm.R.id.f483759bz3));
        this.f130627m = wVar;
        yt3.w3 w3Var = new yt3.w3(this, this);
        this.f130629o = w3Var;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.lpn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        yt3.r3 r3Var = new yt3.r3((android.widget.RelativeLayout) findViewById3, this);
        this.f130626i = r3Var;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fwr);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f130625h = (com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.lpw);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        iw2.b bVar = new iw2.b((com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView) findViewById5, this);
        this.f130631q = bVar;
        hw2.g0 g0Var = new hw2.g0(this, this);
        this.f130635u = g0Var;
        hw2.e eVar = new hw2.e(this, this);
        this.f130634t = eVar;
        ((java.util.ArrayList) eVar.f285523r).add(g0Var);
        this.f130636v = new cw2.ab(this, this);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.ctg);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f130633s = new hw2.b0(findViewById6, this);
        r3Var.f465641v = new cw2.x4(this);
        r3Var.f465644y = false;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.g17);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f130637w = findViewById7;
        com.tencent.mm.plugin.finder.video.plugin.view.SubRecordFinishView subRecordFinishView = new com.tencent.mm.plugin.finder.video.plugin.view.SubRecordFinishView(context, null);
        subRecordFinishView.setVisibility(4);
        ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m3x)).addView(subRecordFinishView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f130632r = new hw2.c0(subRecordFinishView, this);
        com.tencent.mm.plugin.finder.video.plugin.view.SubRecordBeautyView subRecordBeautyView = new com.tencent.mm.plugin.finder.video.plugin.view.SubRecordBeautyView(context, null);
        ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m3x)).addView(subRecordBeautyView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        hw2.t tVar = new hw2.t(this, subRecordBeautyView, this);
        this.f130630p = tVar;
        android.content.Intent intent = ((android.app.Activity) context).getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        op4.l lVar = new op4.l(this, intent);
        lVar.z(new kw2.z(this));
        getPluginList().add(lVar);
        getPluginList().add(r3Var);
        getPluginList().add(wVar);
        getPluginList().add(y3Var);
        getPluginList().add(w3Var);
        getPluginList().add(bVar);
        getPluginList().add(e0Var);
        getPluginList().add(eVar);
        getPluginList().add(g0Var);
        getPluginList().add(tVar);
        di3.d dVar = this.C;
        if (dVar != null) {
            dVar.f232689g = this;
        }
        if (dVar != null) {
            dVar.enable();
        }
    }

    private final android.view.View getHeaderParentView() {
        java.lang.Object value = ((jz5.n) this.headerParentView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final long getMaxMegaVideoDuration() {
        return (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).wi() == 1 ? ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj() : ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).mj()) * 1000;
    }

    public final void A() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.B;
        if (recordConfigProvider == null || (videoTransPara = recordConfigProvider.f155676n) == null) {
            return;
        }
        videoTransPara.f71192e = (videoTransPara.f71191d * 16) / 9;
        com.tencent.mars.xlog.Log.i("Finder.FinderRecordPluginLayout", "onResume init SightRecordConfig,fix record size:" + videoTransPara.f71191d + 'x' + videoTransPara.f71192e);
        st3.t.f412597a.c(videoTransPara, 0, false);
    }

    public final void B(boolean z17) {
        java.lang.String str;
        android.os.Bundle bundle;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.B;
        if (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null || (str = bundle.getString("post_id")) == null) {
            str = "";
        }
        multiMediaEditInfoStruct.f59300d = multiMediaEditInfoStruct.b("PostId", str, true);
        multiMediaEditInfoStruct.f59301e = multiMediaEditInfoStruct.b("EditId", this.f130624J, true);
        multiMediaEditInfoStruct.f59316t = z17 ? 2L : 1L;
        multiMediaEditInfoStruct.D = 99L;
        multiMediaEditInfoStruct.C = multiMediaEditInfoStruct.b("BeautyInfo", this.f130630p.f285570r.I, true);
        multiMediaEditInfoStruct.k();
    }

    public final void C(boolean z17) {
        p05.l4 l4Var;
        p05.p4 p4Var;
        ms0.a aVar;
        int i17;
        cl0.g gVar;
        com.tencent.mm.autogen.mmdata.rpt.FinderRecordProfileReportStruct finderRecordProfileReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderRecordProfileReportStruct();
        finderRecordProfileReportStruct.f57689n = z17 ? 2 : 1;
        at0.n nVar = this.f130640z;
        if (nVar != null && (gVar = nVar.f13612t) != null) {
            finderRecordProfileReportStruct.f57679d = gVar.optLong("CameraOpenCost");
            finderRecordProfileReportStruct.f57682g = gVar.optLong("REPORT_CREATE_RECORDER");
            finderRecordProfileReportStruct.f57680e = gVar.optLong("CameraFirstFrameCost");
            finderRecordProfileReportStruct.f57681f = gVar.optBoolean("isUseCamera2") ? 2 : 1;
            finderRecordProfileReportStruct.f57683h = gVar.optLong("HighRecordStopWaitTime");
        }
        cw2.h0 h0Var = this.f130639y;
        ms0.c previewRenderer = h0Var != null ? h0Var.getPreviewRenderer() : null;
        mu3.b bVar = previewRenderer instanceof mu3.b ? (mu3.b) previewRenderer : null;
        if (bVar != null && (aVar = bVar.f330960p) != null) {
            long j17 = aVar.f330942d;
            int i18 = 0;
            if (j17 > 0 && (i17 = aVar.f330940b) != 0) {
                long j18 = aVar.f330943e - j17;
                if (j18 > 0) {
                    i18 = a06.d.b((i17 * 1000.0f) / ((float) j18));
                }
            }
            finderRecordProfileReportStruct.f57684i = i18;
            int i19 = aVar.f330940b;
            finderRecordProfileReportStruct.f57685j = i19 == 0 ? 0L : aVar.f330939a / i19;
        }
        if (bVar != null && (l4Var = bVar.f331398v) != null && (p4Var = l4Var.G) != null) {
            finderRecordProfileReportStruct.f57686k = p4Var.f350645a;
            int i27 = p4Var.f350647c;
            finderRecordProfileReportStruct.f57687l = i27 == 0 ? 0L : p4Var.f350646b / i27;
            int i28 = p4Var.f350649e;
            finderRecordProfileReportStruct.f57685j = i28 != 0 ? p4Var.f350648d / i28 : 0L;
            finderRecordProfileReportStruct.f57688m = p4Var.f350650f;
        }
        finderRecordProfileReportStruct.k();
    }

    public final void D(boolean z17) {
        cw2.h0 h0Var = this.f130639y;
        if (h0Var != null) {
            h0Var.f412530i = !z17;
        }
        at0.n nVar = this.f130640z;
        if (nVar != null) {
            nVar.e();
        }
        yt3.r3 r3Var = this.f130626i;
        if (z17) {
            r3Var.a();
        } else {
            r3Var.j(new cw2.k5(this));
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.B = configProvider;
        this.f130639y = new cw2.h0(configProvider, this.f130625h);
        A();
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.a9z);
        android.widget.ImageView imageView = this.f130628n.f465727d;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_camera_switch, d17));
        this.A = navigator;
        this.B = configProvider;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a((android.app.Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "checkAudioPermission " + a17 + " !");
        cw2.h0 h0Var = this.f130639y;
        if (h0Var != null) {
            h0Var.f412530i = !a17;
        }
        kotlin.jvm.internal.o.d(h0Var);
        at0.n nVar = new at0.n(h0Var);
        this.f130640z = nVar;
        if (configProvider.F == 11) {
            long j17 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi().f71196i * 1000;
            if (j17 >= 1000) {
                at0.n nVar2 = this.f130640z;
                if (nVar2 != null) {
                    nVar2.f(j17);
                }
            } else {
                at0.n nVar3 = this.f130640z;
                if (nVar3 != null) {
                    nVar3.f(1000L);
                }
            }
        } else {
            nVar.f(1000L);
        }
        this.f130626i.b(configProvider);
        android.os.Bundle bundle = configProvider.M;
        java.lang.String string = bundle != null ? bundle.getString("KEY_ORIGIN_MUSIC_PATH") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            this.f130634t.d(configProvider, false, false);
            this.f130635u.b(true);
            this.f130635u.setVisibility(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_record_enable_add_audio, 0) == 1 ? 0 : 8);
        } else {
            android.os.Bundle bundle2 = configProvider.M;
            if (bundle2 == null || (str = bundle2.getString("KEY_ORIGIN_MUSIC_NAME")) == null) {
                str = "";
            }
            qc0.d1 a18 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.a(string != null ? string : "");
            if (a18 == null || a18.f361366d == 0) {
                com.tencent.mars.xlog.Log.e("Finder.FinderRecordPluginLayout", "follow music error, path:" + string + ", length:" + com.tencent.mm.vfs.w6.k(string));
                onBackPress();
                return;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo.f155711e = (int) java.lang.System.currentTimeMillis();
            android.os.Bundle bundle3 = configProvider.M;
            audioCacheInfo.f155719p = bundle3 != null ? bundle3.getBoolean("KEY_BGM_IF_ORIGIN") : false ? 1 : 2;
            audioCacheInfo.f155716m = true;
            audioCacheInfo.f155722s = true;
            audioCacheInfo.f155715i = string;
            audioCacheInfo.f155723t = str;
            audioCacheInfo.f155720q = (int) a18.f361366d;
            hw2.e eVar = this.f130634t;
            java.util.List c17 = kz5.b0.c(audioCacheInfo);
            eVar.getClass();
            eVar.f285516h = c17;
            this.G = false;
            this.f130626i.x(com.tencent.mm.R.string.ht_);
            ((ku5.t0) ku5.t0.f312615d).B(new cw2.z4(this));
            this.f130634t.d(configProvider, false, false);
            this.f130634t.a();
            this.f130635u.b(true);
            this.f130635u.setVisibility(0);
        }
        this.f130634t.f285520o = false;
        yt3.w3 w3Var = this.f130629o;
        w3Var.getClass();
        w3Var.f465709e.setFocusColor(configProvider.f155677o.f64787s);
        hw2.w wVar = this.f130627m;
        wVar.getClass();
        wVar.f465669f = configProvider.F;
        hw2.t tVar = this.f130630p;
        tVar.getClass();
        boolean z17 = configProvider.Q.f188597e;
        tVar.f285562g = z17;
        if (z17) {
            android.view.View view = tVar.f285560e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.h(tVar.f285563h ? tVar.f285564i : tVar.f285565m);
        } else {
            android.view.View view2 = tVar.f285560e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.D.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderRecordPluginLayout", "configProvider:" + configProvider + ", config:" + st3.t.f412597a.d());
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 304 && i18 == 0) {
            r(null);
        } else if (i17 == 304 && i18 == -1) {
            onBackPress();
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (super.onBackPress()) {
            return true;
        }
        ju3.d0.k(this, ju3.c0.S2, null, 2, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        super.onDetach();
        com.tencent.mars.xlog.Log.i("Finder.FinderRecordPluginLayout", "onDetach");
        at0.n nVar = this.f130640z;
        if (nVar != null) {
            nVar.k();
        }
    }

    @Override // r90.j
    public void onOrientationChange(int i17) {
        if (i17 < 0) {
            return;
        }
        this.f130628n.b((i17 == 90 || i17 == 270) ? i17 == 270 ? 90.0f : -90.0f : i17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("Finder.FinderRecordPluginLayout", "onPause");
        at0.n nVar = this.f130640z;
        if (nVar != null) {
            nVar.k();
        }
        di3.d dVar = this.C;
        if (dVar != null) {
            dVar.disable();
        }
        nu3.i.f340218a.d(15);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "onRequestPermissionsResult requestCode:" + i17 + " permissions:" + permissions + " grantResults:" + grantResults);
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == 80) {
            if (grantResults[0] == 0) {
                D(true);
            } else {
                db5.e1.C(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.hss), i65.a.r(getContext(), com.tencent.mm.R.string.hsu), i65.a.r(getContext(), com.tencent.mm.R.string.hst), i65.a.r(getContext(), com.tencent.mm.R.string.hsr), false, new cw2.a5(this), new cw2.b5(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        super.onResume();
        if (this.H) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((sb0.f) jVar).getClass();
            D(j35.u.h((android.app.Activity) context, "android.permission.RECORD_AUDIO"));
        }
        A();
        di3.d dVar = this.C;
        if (dVar != null) {
            dVar.enable();
        }
        at0.n nVar = this.f130640z;
        if (nVar != null) {
            boolean z17 = nVar.f13598f;
            hw2.t tVar = this.f130630p;
            tVar.f285563h = z17;
            if (tVar.f285562g) {
                tVar.h(z17 ? tVar.f285564i : tVar.f285565m);
            }
            nVar.h(this.G, java.lang.Float.valueOf(1.7777778f), cw2.c5.f223616d);
        }
        yt3.r3 r3Var = this.f130626i;
        r3Var.f465628f.setVisibility(0);
        if (r3Var.f465644y) {
            r3Var.f465626d.bringToFront();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect;
        super.onSizeChanged(i17, i18, i19, i27);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.g17);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lpw);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f484954g16);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fwr);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.lpn);
        int c17 = com.tencent.mm.ui.bl.c(getContext());
        if (getContext() instanceof android.app.Activity) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            rect = com.tencent.mm.ui.bk.m((android.app.Activity) context);
        } else {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect2 = rect;
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        android.view.ViewGroup.LayoutParams layoutParams5 = findViewById2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        findViewById4.getViewTreeObserver().addOnGlobalLayoutListener(new sw2.a(findViewById4, i18, this, c17, layoutParams2, (android.widget.RelativeLayout.LayoutParams) layoutParams5, layoutParams4, findViewById3, rect2, findViewById2, findViewById, findViewById5));
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        super.r(bVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f130624J = sb6.toString();
        op4.l lVar = (op4.l) j(op4.l.class);
        if (lVar != null) {
            op4.h hVar = (op4.h) lVar.A("21875");
            if (hVar != null) {
                java.lang.String b17 = np4.b.b(this.B);
                com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) hVar.f347291d;
                if (finderShowInWXProfileStruct != null) {
                    finderShowInWXProfileStruct.f57827e = finderShowInWXProfileStruct.b("findercontextid", b17, true);
                }
            }
            op4.h hVar2 = (op4.h) lVar.A("21875");
            if (hVar2 != null) {
                java.lang.String c17 = np4.b.c(this.B);
                com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) hVar2.f347291d;
                if (finderShowInWXProfileStruct2 != null) {
                    finderShowInWXProfileStruct2.s(c17);
                }
            }
        }
        setBackgroundColor(android.graphics.Color.parseColor("#000000"));
        iw2.b bVar2 = this.f130631q;
        bVar2.setVisibility(4);
        if (bVar2.f295231f) {
            this.f130633s.setVisibility(0);
            this.f130632r.setVisibility(0);
        } else {
            bVar2.setVisibility(0);
            this.f130630p.setVisibility(0);
            this.D.a();
        }
        this.I = java.lang.System.currentTimeMillis();
        xo4.b.a(xo4.b.f455768a, 99, 0, 0L, 0, null, null, null, 124, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        com.tencent.mars.xlog.Log.i("Finder.FinderRecordPluginLayout", "release");
        at0.n nVar = this.f130640z;
        if (nVar != null) {
            nVar.d();
        }
        di3.d dVar = this.C;
        if (dVar != null) {
            dVar.disable();
        }
        di3.d dVar2 = this.C;
        if (dVar2 != null) {
            dVar2.f232689g = null;
        }
        this.C = null;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.B;
        boolean z17 = false;
        if (recordConfigProvider != null && !recordConfigProvider.f155687y) {
            z17 = true;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).a(new cw2.d5(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x040b  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // ju3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(ju3.c0 r32, android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 2614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout.w(ju3.c0, android.os.Bundle):void");
    }

    public final android.os.Bundle y(java.util.ArrayList arrayList) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelableArrayList("media_list", arrayList);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.B;
        bundle2.putString("post_id", (recordConfigProvider == null || (bundle = recordConfigProvider.M) == null) ? null : bundle.getString("post_id"));
        bundle2.putLong("video_max_duration", getMaxMegaVideoDuration());
        bundle2.putLong("video_track_max_duration", getMaxMegaVideoDuration());
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        bundle2.putInt("image_max_height", t70Var.l2());
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        bundle2.putInt("image_max_width", t70Var.k2());
        bundle2.putInt("image_compress_quality", ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).cj());
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        bundle2.putString("output_dir", com.tencent.mm.plugin.finder.assist.e9.f102146o);
        cw2.h0 h0Var = this.f130639y;
        bundle2.putBoolean("KEY_MEDIA_MUTE", h0Var != null ? h0Var.f412530i : false);
        bundle2.putBoolean("KEY_FULLSCREEN", true);
        bundle2.putInt("KEY_MEDIA_SOURCE_FROM", 2);
        bundle2.putString("FINDER_CONTEXT_ID", np4.b.b(this.B));
        bundle2.putString("FINDER_SESSION_ID", np4.b.c(this.B));
        bundle2.putString("key_click_tab_context_id", np4.b.a(this.B));
        bundle2.putParcelable("key_beauty_config", this.f130630p.f285570r);
        return bundle2;
    }

    public final android.os.Bundle z() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        android.os.Bundle bundle4;
        android.os.Bundle bundle5;
        android.os.Bundle bundle6 = new android.os.Bundle();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f130634t.f285519n;
        if (audioCacheInfo != null) {
            java.lang.String str = null;
            if (audioCacheInfo.f155722s) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.B;
                bundle6.putString("KEY_ORIGIN_MUSIC_ID", (recordConfigProvider == null || (bundle5 = recordConfigProvider.M) == null) ? null : bundle5.getString("KEY_ORIGIN_MUSIC_ID"));
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.B;
                bundle6.putString("KEY_ORIGIN_MUSIC_NAME", (recordConfigProvider2 == null || (bundle4 = recordConfigProvider2.M) == null) ? null : bundle4.getString("KEY_ORIGIN_MUSIC_NAME"));
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.B;
                bundle6.putString("KEY_ORIGIN_MUSIC_PATH", (recordConfigProvider3 == null || (bundle3 = recordConfigProvider3.M) == null) ? null : bundle3.getString("KEY_ORIGIN_MUSIC_PATH"));
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.B;
                bundle6.putByteArray("KEY_ORIGIN_MUSIC_INFO", (recordConfigProvider4 == null || (bundle2 = recordConfigProvider4.M) == null) ? null : bundle2.getByteArray("KEY_ORIGIN_MUSIC_INFO"));
            }
            bundle6.putParcelable("KEY_SELECT_AUDIO_INFO", audioCacheInfo);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = this.B;
            if (recordConfigProvider5 != null && (bundle = recordConfigProvider5.M) != null) {
                str = bundle.getString("KEY_ORIGIN_BGM_URL");
            }
            bundle6.putString("KEY_ORIGIN_BGM_URL", str);
            bundle6.putBoolean("KEY_MEDIA_MUTE", true);
            bundle6.putBoolean("SELECT_MUTE_ORIGIN_KEY", true);
        }
        return bundle6;
    }
}
