package com.tencent.mm.plugin.sns.ui.record;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "", "getLayoutId", "Landroid/view/View;", "C", "Ljz5/g;", "getOpBtnArea", "()Landroid/view/View;", "opBtnArea", "Lcom/tencent/mm/media/camera/view/CameraKitView;", "D", "getCameraView", "()Lcom/tencent/mm/media/camera/view/CameraKitView;", "cameraView", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "getRecordButton", "recordButton", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SnsFixedResolutionCameraKitPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout {

    /* renamed from: C, reason: from kotlin metadata */
    public final jz5.g opBtnArea;

    /* renamed from: D, reason: from kotlin metadata */
    public final jz5.g cameraView;

    /* renamed from: E, reason: from kotlin metadata */
    public final jz5.g recordButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsFixedResolutionCameraKitPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.opBtnArea = jz5.h.b(new vd4.b(this));
        this.cameraView = jz5.h.b(new vd4.a(this));
        this.recordButton = jz5.h.b(new vd4.c(this));
        G();
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableRecordVideoFullScreen", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableRecordVideoFullScreen", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return false;
    }

    public final void G() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        na4.a aVar = na4.g.f335990b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "initViewWithResolutionRadioConfig: radioConfig=" + aVar);
            int h17 = com.tencent.mm.ui.bl.h(getContext()) + i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWillShowBehindStatusBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWillShowBehindStatusBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            if (aVar.f335988b) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOpButtonShowInsideCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                com.tencent.mm.media.camera.view.CameraKitView cameraView = getCameraView();
                android.view.ViewGroup.LayoutParams layoutParams2 = cameraView != null ? cameraView.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 != null) {
                    layoutParams3.removeRule(3);
                    layoutParams3.addRule(10);
                    com.tencent.mm.media.camera.view.CameraKitView cameraView2 = getCameraView();
                    if (cameraView2 != null) {
                        cameraView2.setLayoutParams(layoutParams3);
                    }
                }
                android.view.View opBtnArea = getOpBtnArea();
                android.view.ViewGroup.LayoutParams layoutParams4 = opBtnArea != null ? opBtnArea.getLayoutParams() : null;
                layoutParams = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams != null) {
                    com.tencent.mm.media.camera.view.CameraKitView cameraView3 = getCameraView();
                    layoutParams.addRule(6, cameraView3 != null ? cameraView3.getId() : 0);
                    android.view.View opBtnArea2 = getOpBtnArea();
                    if (opBtnArea2 != null) {
                        opBtnArea2.setLayoutParams(layoutParams);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOpButtonShowInsideCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                J(h17);
                H(true);
            } else {
                J(h17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOpButtonShowAboveCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                android.view.View opBtnArea3 = getOpBtnArea();
                android.view.ViewGroup.LayoutParams layoutParams5 = opBtnArea3 != null ? opBtnArea3.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.removeRule(6);
                    android.view.View opBtnArea4 = getOpBtnArea();
                    if (opBtnArea4 != null) {
                        opBtnArea4.setLayoutParams(layoutParams6);
                    }
                }
                com.tencent.mm.media.camera.view.CameraKitView cameraView4 = getCameraView();
                android.view.ViewGroup.LayoutParams layoutParams7 = cameraView4 != null ? cameraView4.getLayoutParams() : null;
                layoutParams = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
                if (layoutParams != null) {
                    layoutParams.removeRule(10);
                    android.view.View opBtnArea5 = getOpBtnArea();
                    layoutParams.addRule(3, opBtnArea5 != null ? opBtnArea5.getId() : 0);
                    com.tencent.mm.media.camera.view.CameraKitView cameraView5 = getCameraView();
                    if (cameraView5 != null) {
                        cameraView5.setLayoutParams(layoutParams);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOpButtonShowAboveCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                H(false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWillShowBehindNavigationBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWillShowBehindNavigationBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            if (aVar.f335987a) {
                I(true);
            } else {
                I(false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final void H(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCameraMaskView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483539b55);
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCameraMaskView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final void I(boolean z17) {
        int h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCaptureLayout", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View recordButton = getRecordButton();
        android.view.ViewGroup.LayoutParams layoutParams = recordButton != null ? recordButton.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            int i17 = na4.g.f335991c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479720dd) + i17;
        } else {
            h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479720dd);
        }
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = h17;
        }
        android.view.View recordButton2 = getRecordButton();
        if (recordButton2 != null) {
            recordButton2.setLayoutParams(layoutParams2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "updateCaptureLayout: willShowBehindNavigationBar:" + z17 + ", bottomMargin:" + h17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCaptureLayout", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final void J(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOpButtonLayoutParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View opBtnArea = getOpBtnArea();
        android.view.ViewGroup.LayoutParams layoutParams = opBtnArea != null ? opBtnArea.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i17;
            android.view.View opBtnArea2 = getOpBtnArea();
            if (opBtnArea2 != null) {
                opBtnArea2.setLayoutParams(layoutParams2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOpButtonLayoutParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final com.tencent.mm.media.camera.view.CameraKitView getCameraView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCameraView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mm.media.camera.view.CameraKitView cameraKitView = (com.tencent.mm.media.camera.view.CameraKitView) ((jz5.n) this.cameraView).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCameraView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return cameraKitView;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return com.tencent.mm.R.layout.crs;
    }

    public final android.view.View getOpBtnArea() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpBtnArea", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View view = (android.view.View) ((jz5.n) this.opBtnArea).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpBtnArea", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return view;
    }

    public final android.view.View getRecordButton() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecordButton", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View view = (android.view.View) ((jz5.n) this.recordButton).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecordButton", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return view;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "initLogic: ");
        super.m(navigator, configProvider);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateRecordVideoParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = configProvider.f155676n;
        videoTransPara.f71192e = (videoTransPara.f71191d * 16) / 9;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "updateRecordVideoParams width:" + videoTransPara.f71191d + " height:" + videoTransPara.f71192e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateRecordVideoParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        super.onConfigurationChanged(configuration);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged: orientation=");
        sb6.append(configuration != null ? java.lang.Integer.valueOf(configuration.orientation) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", sb6.toString());
        android.view.View recordButton = getRecordButton();
        if (recordButton != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.g3 a17 = n3.b1.a(recordButton);
            e3.d a18 = a17 != null ? a17.a(2) : null;
            if (a18 != null) {
                i17 = a18.f247047d;
                na4.g gVar = na4.g.f335989a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.a a19 = gVar.a(i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.g.f335990b = a19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                G();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
            }
        }
        i17 = -1;
        na4.g gVar2 = na4.g.f335989a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        na4.a a192 = gVar2.a(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        na4.g.f335990b = a192;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "onResume: ");
        super.onResume();
        reset();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }
}
