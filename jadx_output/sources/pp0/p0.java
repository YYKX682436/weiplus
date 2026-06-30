package pp0;

/* loaded from: classes5.dex */
public interface p0 {
    static /* synthetic */ java.lang.Object i0(pp0.p0 p0Var, com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj == null) {
            return p0Var.Y(videoFrame, str, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? com.tencent.maas.camstudio.z.PNG : zVar, (i17 & 16) != 0 ? false : z18, (i17 & 32) != 0 ? false : z19, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exportPhoto");
    }

    static /* synthetic */ java.lang.Object w(pp0.p0 p0Var, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pausePreview");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return p0Var.E(z17, continuation);
    }

    void A0(com.tencent.maas.camstudio.d0 d0Var);

    java.lang.Object B(boolean z17, kotlin.coroutines.Continuation continuation);

    void B0(com.tencent.maas.camerafun.MJAudioFrame mJAudioFrame);

    java.lang.Object C(java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, kotlin.coroutines.Continuation continuation);

    void C0();

    java.lang.Object D(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation);

    java.lang.Object E(boolean z17, kotlin.coroutines.Continuation continuation);

    java.lang.Object E0(kotlin.coroutines.Continuation continuation);

    java.lang.Object F(kotlin.coroutines.Continuation continuation);

    java.lang.Object G(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, kotlin.coroutines.Continuation continuation);

    java.lang.Object G0(com.tencent.maas.moviecomposing.segments.GeographicInfo geographicInfo, kotlin.coroutines.Continuation continuation);

    java.lang.Object H(kotlin.coroutines.Continuation continuation);

    void H0(java.lang.String str);

    java.lang.Object I(kotlin.coroutines.Continuation continuation);

    int I0(java.lang.String str, long j17, java.lang.String str2, com.tencent.maas.camstudio.u uVar, com.tencent.maas.camstudio.r rVar);

    void J(com.tencent.maas.camstudio.MJAIGCCancelReason mJAIGCCancelReason);

    android.opengl.EGLContext J0();

    java.lang.Object K(com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, kotlin.coroutines.Continuation continuation);

    void K0(android.view.SurfaceView surfaceView);

    void L(com.tencent.maas.camstudio.f0 f0Var);

    void L0(com.tencent.maas.camstudio.a0 a0Var);

    java.lang.Object M(kotlin.coroutines.Continuation continuation);

    java.lang.Object M0(java.util.List list, kotlin.coroutines.Continuation continuation);

    com.tencent.maas.camstudio.MJBeautyAdjustmentDesc N(java.lang.String str);

    java.lang.Object N0(jg.d dVar, kotlin.coroutines.Continuation continuation);

    java.lang.Object O(kotlin.coroutines.Continuation continuation);

    java.lang.String P(java.lang.String str);

    void Q(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService);

    java.lang.Object R(com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, kotlin.coroutines.Continuation continuation);

    java.lang.Object S(kotlin.coroutines.Continuation continuation);

    void T(com.tencent.maas.camstudio.c0 c0Var);

    java.lang.Object U(kotlin.coroutines.Continuation continuation);

    boolean V(com.tencent.maas.material.g gVar);

    java.lang.Object W(com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, kotlin.coroutines.Continuation continuation);

    void X(com.tencent.maas.camstudio.d0 d0Var);

    java.lang.Object Y(com.tencent.maas.camstudio.frame.VideoFrame videoFrame, java.lang.String str, boolean z17, com.tencent.maas.camstudio.z zVar, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation);

    void Z(yz5.l lVar);

    java.lang.Object b0(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation);

    void c0(com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams, com.tencent.maas.camstudio.d0 d0Var);

    void d0(com.tencent.maas.camstudio.frame.VideoFrame videoFrame);

    java.lang.Object e0(com.tencent.maas.camstudio.MJCamFilterDesc mJCamFilterDesc, kotlin.coroutines.Continuation continuation);

    void g0(java.lang.String str, com.tencent.maas.camstudio.i0 i0Var);

    void h0(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var);

    void i(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService);

    java.lang.Object j(com.tencent.maas.camstudio.MJCamPreviewSettings mJCamPreviewSettings, yz5.l lVar, kotlin.coroutines.Continuation continuation);

    java.lang.Object j0(kotlin.coroutines.Continuation continuation);

    com.tencent.maas.camstudio.MJCamMusicDesc k();

    boolean k0();

    com.tencent.maas.camstudio.MJCamTemplateInfo l(java.lang.String str, long j17);

    java.lang.Object m(java.lang.String str, com.tencent.maas.camstudio.u uVar, kotlin.coroutines.Continuation continuation);

    java.lang.Object m0(kotlin.coroutines.Continuation continuation);

    java.lang.Object n(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation);

    boolean n0(java.lang.String str, long j17);

    java.lang.Object o(kotlin.coroutines.Continuation continuation);

    void o0(com.tencent.maas.camstudio.h0 h0Var);

    int p(java.lang.String str, com.tencent.maas.camstudio.q qVar, com.tencent.maas.camstudio.u uVar, yz5.l lVar);

    java.lang.Object p0(java.lang.String str, com.tencent.maas.camstudio.MJCamTemplateOverridingParams mJCamTemplateOverridingParams, kotlin.coroutines.Continuation continuation);

    void q();

    java.lang.Object q0(java.lang.String str, kotlin.coroutines.Continuation continuation);

    java.lang.Object r(com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc, kotlin.coroutines.Continuation continuation);

    void r0(com.tencent.maas.camstudio.MJExposureCheckParams mJExposureCheckParams, com.tencent.maas.camstudio.g0 g0Var);

    kotlinx.coroutines.r2 release();

    void s(boolean z17);

    void s0(int i17);

    java.lang.Object t(com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc, kotlin.coroutines.Continuation continuation);

    java.lang.Object t0(boolean z17, kotlin.coroutines.Continuation continuation);

    void u(float f17);

    java.lang.Object u0(kotlin.coroutines.Continuation continuation);

    void v0(com.tencent.maas.camstudio.d0 d0Var);

    void w0(com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str);

    java.lang.Object x(com.tencent.maas.material.g gVar, kotlin.coroutines.Continuation continuation);

    java.lang.Object x0(kotlin.coroutines.Continuation continuation);

    void y0(boolean z17, com.tencent.maas.camstudio.j0 j0Var);

    void z(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo, java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, com.tencent.maas.camstudio.d0 d0Var);

    com.tencent.maas.camstudio.MJCamMusicVolumeDesc z0();
}
