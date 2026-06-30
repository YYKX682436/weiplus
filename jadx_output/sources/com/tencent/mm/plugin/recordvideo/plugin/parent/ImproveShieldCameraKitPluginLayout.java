package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "", "visible", "Ljz5/f0;", "setPluginViewVisible", "setPluginVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ImproveShieldCameraKitPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveShieldCameraKitPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
    public java.lang.Object C(jz5.l lVar, kotlin.coroutines.Continuation continuation) {
        int i17 = ju3.z0.f302043a[((bs0.g) lVar.f302833d).ordinal()];
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 != 1) {
            java.lang.Object C = super.C(lVar, continuation);
            return C == pz5.a.f359186d ? C : f0Var;
        }
        android.os.Bundle bundle = (android.os.Bundle) lVar.f302834e;
        boolean z17 = bundle != null ? bundle.getBoolean("camera_boolean") : false;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new ju3.a1(this, z17, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : f0Var;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout
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
        cameraUsage.f0(context, new xr0.h(new xr0.i(i65.a.d(getContext(), com.tencent.mm.R.color.f478553an)), new xr0.c(i27, 0, 0, null, null, z17, 30, null), new xr0.g(i18, i19), new xr0.b(false, false, false, false, false, 24, null)));
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout
    public void J() {
        getPluginList().add(getHintPlugin());
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void m(it3.y navigator, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(navigator, "navigator");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.g7z)).setVisibility(4);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onAttach() {
        super.onAttach();
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = nu3.f.f340211b;
        if (cameraActionsLogStruct == null) {
            return;
        }
        cameraActionsLogStruct.f55525u = 2;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout
    public void setPluginViewVisible(int i17) {
        getClosePlugin().setVisibility(i17);
        getCameraSwitchPlugin().setVisibility(i17);
        yt3.b recordPlugin = getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.setVisibility(i17);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout
    public void setPluginVisibility(int i17) {
        if (i17 == 0) {
            android.view.View cameraView = getCameraView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(cameraView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cameraView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(cameraView, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
