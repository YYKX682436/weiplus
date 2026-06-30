package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/MediaTabCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MediaTabCameraKitPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout {
    public boolean R;
    public boolean S;
    public final androidx.lifecycle.b0 T;
    public com.tencent.mm.ui.widget.dialog.j0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaTabCameraKitPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(this, true);
        this.T = b0Var;
        setIgnoreLifeCycle(true);
        getCameraUsage().l0(new ju3.b1(this));
        b0Var.i(androidx.lifecycle.n.INITIALIZED);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout
    public int I() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        return i65.a.h(getContext(), com.tencent.mm.R.dimen.f479727dj) + ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).getIntent().getIntExtra("intent_bottom_navigationbar_height", 0);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.T.f(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onPause");
        this.T.f(androidx.lifecycle.m.ON_STOP);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 != 18) {
            super.onRequestPermissionsResult(i17, permissions, grantResults);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onRequestPermissionsResult requestCode:" + i17 + " permissions:" + permissions + " grantResults:" + grantResults);
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            s();
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.U;
        if (j0Var != null && j0Var.isShowing()) {
            return;
        }
        this.U = db5.e1.C(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.hh8), i65.a.r(getContext(), com.tencent.mm.R.string.hht), i65.a.r(getContext(), com.tencent.mm.R.string.g6z), i65.a.r(getContext(), com.tencent.mm.R.string.hhl), false, new ju3.d1(this), new ju3.e1(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        super.onResume();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        if ((j35.u.h((android.app.Activity) context, "android.permission.CAMERA") && this.R) || this.S) {
            s();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onResume isPageSelected:" + this.R);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        try {
            this.T.f(androidx.lifecycle.m.ON_DESTROY);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaTabCameraKitPluginLayout", e17, "handleLifecycleEvent error", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void reset() {
        super.reset();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Y6(true);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onPageSelected: ");
        this.R = true;
        this.S = false;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        if (j35.u.a((android.app.Activity) context, "android.permission.CAMERA", 18, "", "")) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
            if (configProvider != null ? kotlin.jvm.internal.o.b(configProvider.f155682t, java.lang.Boolean.TRUE) : false) {
                z();
            }
            androidx.lifecycle.b0 b0Var = this.T;
            if (b0Var.f11605c == androidx.lifecycle.n.RESUMED) {
                return;
            }
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            d85.g0 g0Var = d85.g0.CAMERA;
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(g0Var, new ju3.c1(((d85.d1) m0Var).hj(g0Var), this))) {
                return;
            }
            b0Var.f(androidx.lifecycle.m.ON_RESUME);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void u() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onPageUnselected: ");
        this.R = false;
    }
}
