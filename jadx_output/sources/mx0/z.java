package mx0;

/* loaded from: classes5.dex */
public interface z {
    static /* synthetic */ void h(mx0.z zVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).W0(str);
    }

    static /* synthetic */ void i(mx0.z zVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: muteMic");
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).G0(z17, z18);
    }

    boolean getCurrentCameraIsFront();

    boolean getCurrentMicIsMute();

    com.tencent.maas.camstudio.MJCamTemplateInfo getCurrentTemplateInfo();

    com.tencent.maas.model.time.MJTime getNormalMaxRecordingDuration();

    java.lang.String getSelfFinderUsername();

    void setCameraUsage(bs0.j jVar);

    void setShouldDisableBeautyAndMakeup(boolean z17);
}
