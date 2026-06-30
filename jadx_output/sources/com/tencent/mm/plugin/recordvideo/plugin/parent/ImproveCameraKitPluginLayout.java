package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001b\u0010#\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001b\u0010&\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001a\u0010,\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "Lbs0/e;", "", "visible", "Ljz5/f0;", "setPluginVisibility", "getLayoutId", "setPluginViewVisible", "Lzt3/a;", "C", "Lzt3/a;", "getKitContext", "()Lzt3/a;", "kitContext", "Lyt3/a4;", "D", "Lyt3/a4;", "getSwitchFlashPlugin", "()Lyt3/a4;", "switchFlashPlugin", "Landroid/view/View;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljz5/g;", "getCaptureLayout", "()Landroid/view/View;", "captureLayout", "F", "getCameraView", "cameraView", "G", "getCloseView", "closeView", "H", "getCaptureHintView", "captureHintView", "I", "getCapturePermissionJumperView", "capturePermissionJumperView", "Lku3/n2;", "J", "Lku3/n2;", "getHintPlugin", "()Lku3/n2;", "hintPlugin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class ImproveCameraKitPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout implements bs0.e {
    public static final /* synthetic */ int Q = 0;

    /* renamed from: C, reason: from kotlin metadata */
    public final zt3.a kitContext;

    /* renamed from: D, reason: from kotlin metadata */
    public final yt3.a4 switchFlashPlugin;

    /* renamed from: E, reason: from kotlin metadata */
    public final jz5.g captureLayout;

    /* renamed from: F, reason: from kotlin metadata */
    public final jz5.g cameraView;

    /* renamed from: G, reason: from kotlin metadata */
    public final jz5.g closeView;

    /* renamed from: H, reason: from kotlin metadata */
    public final jz5.g captureHintView;

    /* renamed from: I, reason: from kotlin metadata */
    public final jz5.g capturePermissionJumperView;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final ku3.n2 hintPlugin;
    public int K;
    public int L;
    public int M;
    public int N;
    public kotlinx.coroutines.r2 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveCameraKitPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        zt3.a aVar = new zt3.a(this, getCameraUsage());
        this.kitContext = aVar;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.g7z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.switchFlashPlugin = new yt3.a4((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById, this);
        this.captureLayout = jz5.h.b(new ju3.h0(this));
        this.cameraView = jz5.h.b(new ju3.f0(this));
        this.closeView = jz5.h.b(new ju3.j0(this));
        this.captureHintView = jz5.h.b(new ju3.g0(this));
        this.capturePermissionJumperView = jz5.h.b(new ju3.i0(this));
        this.hintPlugin = new ku3.n2(this, this, aVar);
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
    }

    public static final void G(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        boolean a17 = improveCameraKitPluginLayout.getOrientationPlugin().a();
        if (!improveCameraKitPluginLayout.getEnableLandscape() && a17) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = improveCameraKitPluginLayout.getConfigProvider();
            if (configProvider == null || (bundle2 = configProvider.M) == null) {
                return;
            }
            bundle2.putInt("key_preview_location_type", 2);
            bundle2.putInt("key_preview_margin_top", 0);
            return;
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider2 = improveCameraKitPluginLayout.getConfigProvider();
        if (configProvider2 == null || (bundle = configProvider2.M) == null) {
            return;
        }
        bundle.putInt("key_preview_location_type", improveCameraKitPluginLayout.K);
        bundle.putInt("key_preview_margin_top", improveCameraKitPluginLayout.L);
        bundle.putInt("key_back_margin_top", improveCameraKitPluginLayout.M);
        bundle.putInt("key_edit_control_margin_bottom", improveCameraKitPluginLayout.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.H(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout
    public void A(boolean z17) {
        getRecorder().h(!z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", "updateRecordTipByAudioPermission to hide");
            this.kitContext.X6(new ku3.n0(2, 1, null, 4, null));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", "updateRecordTipByAudioPermission to show");
            this.hintPlugin.d(new ju3.y0(this));
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public java.lang.Object C(jz5.l lVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object C;
        int i17 = ju3.e0.f301934a[((bs0.g) lVar.f302833d).ordinal()];
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 1) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            C = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new ju3.k0(lVar, this, null), continuation);
            if (C != pz5.a.f359186d) {
                return f0Var;
            }
        } else {
            C = super.C(lVar, continuation);
            if (C != pz5.a.f359186d) {
                return f0Var;
            }
        }
        return C;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public boolean D() {
        return false;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public yt3.b E() {
        return new yt3.z2(this, this, this.kitContext);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public void F() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        int i17 = -1;
        int i18 = configProvider != null ? configProvider.F : -1;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider2 = getConfigProvider();
        int i19 = (configProvider2 == null || (bundle3 = configProvider2.M) == null) ? -1 : bundle3.getInt("key_sub_scene", -1);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider3 = getConfigProvider();
        boolean z17 = ((configProvider3 == null || (bundle2 = configProvider3.M) == null) ? 2 : bundle2.getInt("key_camera_select", 2)) == 2;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider4 = getConfigProvider();
        if (configProvider4 != null && (bundle = configProvider4.M) != null) {
            i17 = bundle.getInt("key_camera_instance", -1);
        }
        int i27 = i17;
        bs0.j cameraUsage = getCameraUsage();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        cameraUsage.f0(context, new xr0.h(null, new xr0.c(i27, 0, 0, null, null, z17, 30, null), new xr0.g(i18, i19), new xr0.b(true, true, true, false, false, 24, null), 1, null));
    }

    public int I() {
        return 0;
    }

    public void J() {
        getPluginList().add(this.switchFlashPlugin);
        getPluginList().add(this.hintPlugin);
    }

    public final void K(int i17, int i18) {
        nu3.f fVar = nu3.f.f340210a;
        fVar.a(i17);
        android.view.View cameraView = getCameraView();
        kotlin.jvm.internal.o.e(cameraView, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.CameraKitView");
        fVar.b(((com.tencent.mm.media.camera.view.CameraKitView) cameraView).getCurrentExpo());
        fVar.g(this.switchFlashPlugin.f465347f == yt3.c.f465373d ? 1 : 2);
        fVar.f(getCameraSwitchPlugin().f465731h ? 1 : 2);
        fVar.e(i18);
    }

    @Override // bs0.e
    public void e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSwitchCameraByDoubleClickCount >> ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = nu3.f.f340211b;
        sb6.append(cameraActionsLogStruct != null ? java.lang.Long.valueOf(cameraActionsLogStruct.f55516l) : null);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = nu3.f.f340211b;
        sb6.append(cameraActionsLogStruct2 != null ? cameraActionsLogStruct2.f55519o : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct3 = nu3.f.f340211b;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.f55516l++;
        }
    }

    public final android.view.View getCameraView() {
        java.lang.Object value = ((jz5.n) this.cameraView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View getCaptureHintView() {
        java.lang.Object value = ((jz5.n) this.captureHintView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View getCaptureLayout() {
        java.lang.Object value = ((jz5.n) this.captureLayout).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View getCapturePermissionJumperView() {
        java.lang.Object value = ((jz5.n) this.capturePermissionJumperView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View getCloseView() {
        java.lang.Object value = ((jz5.n) this.closeView).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final ku3.n2 getHintPlugin() {
        return this.hintPlugin;
    }

    public final zt3.a getKitContext() {
        return this.kitContext;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bkn;
    }

    public final yt3.a4 getSwitchFlashPlugin() {
        return this.switchFlashPlugin;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0360  */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(it3.y r18, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r19) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.m(it3.y, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onAttach() {
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", "onAttach: ");
        yt3.b recordPlugin = getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.f(true);
        }
        super.onAttach();
        nu3.f fVar = nu3.f.f340210a;
        fVar.d();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        fVar.c((configProvider == null || (videoCaptureReportInfo = configProvider.I) == null) ? 0 : videoCaptureReportInfo.f155690d);
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = nu3.f.f340211b;
        if (cameraActionsLogStruct != null) {
            cameraActionsLogStruct.f55525u = 1;
        }
        setPluginVisibility(0);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        K(0, 1);
        return super.onBackPress();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged >> ");
        sb6.append(configuration != null ? java.lang.Integer.valueOf(configuration.orientation) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", sb6.toString());
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", "onDetach: ");
        super.onDetach();
        setPluginVisibility(4);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, r90.j
    public void onOrientationChange(int i17) {
        pm0.v.X(new ju3.l0(this, i17));
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void reset() {
        super.reset();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        if (configProvider != null ? kotlin.jvm.internal.o.b(configProvider.f155682t, java.lang.Boolean.TRUE) : false) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (j35.u.h(getContext(), "android.permission.RECORD_AUDIO")) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", "reset to show");
            this.hintPlugin.d(new ju3.m0(this));
        }
    }

    public void setPluginViewVisible(int i17) {
        getClosePlugin().setVisibility(i17);
        getCameraSwitchPlugin().setVisibility(i17);
        yt3.b recordPlugin = getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.setVisibility(i17);
        }
        if (getCameraSwitchPlugin().f465731h) {
            return;
        }
        this.switchFlashPlugin.f465345d.setVisibility(i17);
    }

    public void setPluginVisibility(int i17) {
        if (!getCameraSwitchPlugin().f465731h) {
            this.switchFlashPlugin.f465345d.setVisibility(i17);
        }
        if (i17 == 0) {
            android.view.View cameraView = getCameraView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(cameraView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cameraView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(cameraView, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 5) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Y6(false);
            this.P = kotlinx.coroutines.l.d(getScope(), null, null, new ju3.o0(this, null), 3, null);
            return;
        }
        if (ordinal == 6) {
            kotlinx.coroutines.l.d(getScope(), null, null, new ju3.s0(this, null), 3, null);
            return;
        }
        if (ordinal == 8) {
            kotlinx.coroutines.l.d(getScope(), null, null, new ju3.v0(this, null), 3, null);
            return;
        }
        if (ordinal == 15) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context2).Y6(false);
            kotlinx.coroutines.l.d(getScope(), null, null, new ju3.u0(this, null), 3, null);
            return;
        }
        if (ordinal != 30) {
            super.w(status, bundle);
            return;
        }
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context3).Y6(false);
    }
}
