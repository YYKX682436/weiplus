package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lr90/j;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "h", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "getPreviewPlugin", "()Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "previewPlugin", "Lyt3/r3;", "i", "Lyt3/r3;", "getRecordPlugin", "()Lyt3/r3;", "recordPlugin", "Lat0/n;", "s", "Lat0/n;", "getRecordController", "()Lat0/n;", "setRecordController", "(Lat0/n;)V", "recordController", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "u", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Ldi3/d;", org.chromium.base.BaseSwitches.V, "Ldi3/d;", "getOrientationEventListener", "()Ldi3/d;", "setOrientationEventListener", "(Ldi3/d;)V", "orientationEventListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class RecordPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0, r90.j {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f155834x = 0;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView previewPlugin;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final yt3.r3 recordPlugin;

    /* renamed from: m, reason: collision with root package name */
    public final yt3.s3 f155837m;

    /* renamed from: n, reason: collision with root package name */
    public final yt3.a3 f155838n;

    /* renamed from: o, reason: collision with root package name */
    public final yt3.y3 f155839o;

    /* renamed from: p, reason: collision with root package name */
    public final yt3.d3 f155840p;

    /* renamed from: q, reason: collision with root package name */
    public final yt3.u3 f155841q;

    /* renamed from: r, reason: collision with root package name */
    public st3.e f155842r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public at0.n recordController;

    /* renamed from: t, reason: collision with root package name */
    public it3.y f155844t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public di3.d orientationEventListener;

    /* renamed from: w, reason: collision with root package name */
    public boolean f155847w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ed, code lost:
    
        if (((r12 == null || (r12 = r12.f447710x) == -1 || r12 != 1) ? false : true) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecordPluginLayout(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    public final di3.d getOrientationEventListener() {
        return this.orientationEventListener;
    }

    public final com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView getPreviewPlugin() {
        return this.previewPlugin;
    }

    public final at0.n getRecordController() {
        return this.recordController;
    }

    public final yt3.r3 getRecordPlugin() {
        return this.recordPlugin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        at0.n nVar;
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        boolean contains = kz5.c0.i(1, 2, 4).contains(java.lang.Integer.valueOf(configProvider.F));
        st3.t tVar = st3.t.f412597a;
        if (contains) {
            if (configProvider.f155676n == null) {
                configProvider.f155676n = new com.tencent.mm.plugin.mmsight.SightParams(configProvider.F, 0).f148819f;
            }
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = configProvider.f155676n;
            if (videoTransPara != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "initLogic init SightRecordConfig ");
                tVar.c(videoTransPara, configProvider.F, true);
                if (videoTransPara.K == 1) {
                    nu3.m.f340229a.e(1);
                } else if (videoTransPara.f71190J == 1) {
                    nu3.m.f340229a.e(2);
                }
            }
        }
        this.f155844t = navigator;
        this.configProvider = configProvider;
        this.f155842r = new st3.e(configProvider, this.previewPlugin);
        if (configProvider.f155682t.booleanValue()) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a((android.app.Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "checkAudioPermission " + a17 + " !");
            st3.e eVar = this.f155842r;
            if (eVar != null) {
                eVar.f412530i = !a17;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "jump check audio permission");
        }
        st3.e eVar2 = this.f155842r;
        kotlin.jvm.internal.o.d(eVar2);
        at0.n nVar2 = new at0.n(eVar2);
        this.recordController = nVar2;
        if (configProvider.F == 11) {
            long j17 = d11.s.fj().ij().f71196i * 1000;
            if (j17 >= 1000) {
                at0.n nVar3 = this.recordController;
                if (nVar3 != null) {
                    nVar3.f(j17);
                }
            } else {
                at0.n nVar4 = this.recordController;
                if (nVar4 != null) {
                    nVar4.f(1000L);
                }
            }
        } else {
            int i17 = configProvider.f155686x;
            if (i17 > 0) {
                nVar2.f(i17);
            } else {
                nVar2.f(1000L);
            }
        }
        if (x51.o1.O && (nVar = this.recordController) != null) {
            nVar.f13594b.j(new ju3.x1(this));
        }
        yt3.r3 r3Var = this.recordPlugin;
        r3Var.b(configProvider);
        yt3.a3 a3Var = this.f155838n;
        a3Var.getClass();
        java.lang.Boolean enableAlbum = configProvider.f155684v;
        kotlin.jvm.internal.o.f(enableAlbum, "enableAlbum");
        a3Var.f465343f = enableAlbum.booleanValue();
        a3Var.f465344g = configProvider.F;
        yt3.s3 s3Var = this.f155837m;
        s3Var.getClass();
        s3Var.f465669f = configProvider.F;
        yt3.d3 d3Var = this.f155840p;
        d3Var.getClass();
        com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig = configProvider.Q;
        boolean z17 = xEffectConfig.f188597e;
        d3Var.f465408g = z17;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = d3Var.f465405d;
        if (z17) {
            weImageView.setVisibility(0);
            d3Var.a(d3Var.f465409h ? d3Var.f465410i : d3Var.f465411m);
        } else {
            weImageView.setVisibility(8);
        }
        yt3.u3 u3Var = this.f155841q;
        u3Var.getClass();
        boolean z18 = xEffectConfig.f188598f;
        u3Var.f465692f = z18;
        android.widget.ImageView imageView = u3Var.f465690d;
        if (z18) {
            imageView.setVisibility(0);
            u3Var.f465693g = true;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", true);
            u3Var.f465691e.w(ju3.c0.f301905u, bundle);
        } else {
            imageView.setVisibility(8);
        }
        java.lang.Boolean enableAlbum2 = configProvider.f155684v;
        kotlin.jvm.internal.o.f(enableAlbum2, "enableAlbum");
        int i18 = enableAlbum2.booleanValue() ? 0 : 8;
        if (a3Var.f465343f) {
            a3Var.f465341d.setVisibility(i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "configProvider:" + configProvider + ", config:" + tVar.d());
        java.lang.String captureHint = configProvider.R;
        kotlin.jvm.internal.o.f(captureHint, "captureHint");
        if (captureHint.length() > 0) {
            java.lang.String captureHint2 = configProvider.R;
            kotlin.jvm.internal.o.f(captureHint2, "captureHint");
            r3Var.f465629g.setText(captureHint2);
        }
        nu3.m mVar = nu3.m.f340229a;
        st3.e eVar3 = this.f155842r;
        boolean j18 = eVar3 != null ? eVar3.j() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRecordDaemon >> type: " + j18);
        nu3.m.f340230b.f60391h = j18 ^ 1;
        st3.e eVar4 = this.f155842r;
        boolean g17 = eVar4 != null ? eVar4.g() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setRecordCpuCrop >> type: " + g17);
        nu3.m.f340230b.f60390g = g17 ^ 1;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged:");
        sb6.append(configuration);
        sb6.append(" layout:");
        sb6.append(configuration != null ? java.lang.Integer.valueOf(configuration.screenLayout) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", sb6.toString());
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        if (recordConfigProvider != null) {
            st3.t tVar = st3.t.f412597a;
            com.tencent.mm.modelcontrol.VideoTransPara videoParam = recordConfigProvider.f155676n;
            kotlin.jvm.internal.o.f(videoParam, "videoParam");
            tVar.c(videoParam, recordConfigProvider.F, true);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        super.onDetach();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "onDetach");
        at0.n nVar = this.recordController;
        if (nVar != null) {
            nVar.k();
        }
        dx1.g.f244489a.j("SnsPublishProcess", "cameraPageStaytime_", java.lang.Long.valueOf(getBrowserTimeMs()), bx1.u.f36310e);
    }

    @Override // r90.j
    public void onOrientationChange(int i17) {
        if (i17 < 0) {
            return;
        }
        this.f155839o.b((i17 == 90 || i17 == 270) ? i17 == 270 ? 90.0f : -90.0f : i17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "onPause");
        at0.n nVar = this.recordController;
        if (nVar != null) {
            nVar.k();
        }
        di3.d dVar = this.orientationEventListener;
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
                y(true);
            } else {
                db5.e1.C(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.hss), i65.a.r(getContext(), com.tencent.mm.R.string.hsu), i65.a.r(getContext(), com.tencent.mm.R.string.hst), i65.a.r(getContext(), com.tencent.mm.R.string.hsr), false, new ju3.y1(this), new ju3.z1(this));
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        super.onResume();
        if (this.f155847w) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((sb0.f) jVar).getClass();
            y(j35.u.h((android.app.Activity) context, "android.permission.RECORD_AUDIO"));
        }
        di3.d dVar = this.orientationEventListener;
        if (dVar != null) {
            dVar.enable();
        }
        at0.n nVar = this.recordController;
        if (nVar != null) {
            java.util.List i17 = kz5.c0.i(1, 2);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.configProvider;
            if (kz5.n0.O(i17, recordConfigProvider2 != null ? java.lang.Integer.valueOf(recordConfigProvider2.F) : null) && (recordConfigProvider = this.configProvider) != null && (videoTransPara = recordConfigProvider.f155676n) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "onResume init SightRecordConfig");
                st3.t tVar = st3.t.f412597a;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.configProvider;
                tVar.c(videoTransPara, recordConfigProvider3 != null ? recordConfigProvider3.F : 0, true);
            }
            boolean z17 = nVar.f13598f;
            yt3.d3 d3Var = this.f155840p;
            d3Var.f465409h = z17;
            if (d3Var.f465408g) {
                d3Var.a(z17 ? d3Var.f465410i : d3Var.f465411m);
            }
            at0.n.i(nVar, false, null, new ju3.w1(nVar), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordPluginLayout", "release");
        at0.n nVar = this.recordController;
        if (nVar != null) {
            nVar.d();
        }
        di3.d dVar = this.orientationEventListener;
        if (dVar != null) {
            dVar.disable();
        }
        di3.d dVar2 = this.orientationEventListener;
        if (dVar2 != null) {
            dVar2.f232689g = null;
        }
        this.orientationEventListener = null;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.configProvider;
        boolean z17 = false;
        if (recordConfigProvider != null && !recordConfigProvider.f155687y) {
            z17 = true;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).g(new ju3.a2(this));
        }
    }

    public final void setConfigProvider(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        this.configProvider = recordConfigProvider;
    }

    public final void setOrientationEventListener(di3.d dVar) {
        this.orientationEventListener = dVar;
    }

    public final void setRecordController(at0.n nVar) {
        this.recordController = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022f  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // ju3.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(ju3.c0 r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.w(ju3.c0, android.os.Bundle):void");
    }

    public final void y(boolean z17) {
        st3.e eVar = this.f155842r;
        if (eVar != null) {
            eVar.f412530i = !z17;
        }
        at0.n nVar = this.recordController;
        if (nVar != null) {
            nVar.e();
        }
        yt3.r3 r3Var = this.recordPlugin;
        if (z17) {
            r3Var.a();
        } else {
            r3Var.j(new ju3.f2(this));
        }
    }
}
