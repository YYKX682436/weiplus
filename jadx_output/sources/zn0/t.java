package zn0;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget f474398a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam f474399b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig f474400c;

    public t(com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget publishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        kotlin.jvm.internal.o.g(publishTarget, "publishTarget");
        this.f474398a = publishTarget;
        this.f474399b = tRTCStreamEncoderParam;
        this.f474400c = tRTCStreamMixingConfig;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0.t)) {
            return false;
        }
        zn0.t tVar = (zn0.t) obj;
        return kotlin.jvm.internal.o.b(this.f474398a, tVar.f474398a) && kotlin.jvm.internal.o.b(this.f474399b, tVar.f474399b) && kotlin.jvm.internal.o.b(this.f474400c, tVar.f474400c);
    }

    public int hashCode() {
        int hashCode = this.f474398a.hashCode() * 31;
        com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam = this.f474399b;
        int hashCode2 = (hashCode + (tRTCStreamEncoderParam == null ? 0 : tRTCStreamEncoderParam.hashCode())) * 31;
        com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig = this.f474400c;
        return hashCode2 + (tRTCStreamMixingConfig != null ? tRTCStreamMixingConfig.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLivePublishMediaStreamDataWrap(publishTarget=" + this.f474398a + ", streamEncoderParam=" + this.f474399b + ", streamMixingConfig=" + this.f474400c + ')';
    }
}
