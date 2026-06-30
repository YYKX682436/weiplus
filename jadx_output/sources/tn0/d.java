package tn0;

/* loaded from: classes10.dex */
public final class d implements com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420659a;

    public d(tn0.w0 w0Var) {
        this.f420659a = w0Var;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onCapturedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f420659a.f420779x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).onCapturedAudioFrame(tRTCAudioFrame);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onLocalProcessedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f420659a.f420779x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).onLocalProcessedAudioFrame(tRTCAudioFrame);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onMixedAllAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f420659a.f420779x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).getClass();
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onMixedPlayAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f420659a.f420779x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).getClass();
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onRemoteUserAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        java.util.Iterator it = this.f420659a.f420779x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).onRemoteUserAudioFrame(tRTCAudioFrame, str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onVoiceEarMonitorAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        java.util.Iterator it = this.f420659a.f420779x1.iterator();
        while (it.hasNext()) {
            ((tn0.m1) it.next()).onVoiceEarMonitorAudioFrame(tRTCAudioFrame);
        }
    }
}
