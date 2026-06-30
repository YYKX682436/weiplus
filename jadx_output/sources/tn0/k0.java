package tn0;

/* loaded from: classes10.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(tn0.w0 w0Var) {
        super(4);
        this.f420715d = w0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        byte[] audioBuffer = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        long longValue = ((java.lang.Number) obj4).longValue();
        kotlin.jvm.internal.o.g(audioBuffer, "audioBuffer");
        tn0.w0 w0Var = this.f420715d;
        w0Var.getClass();
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = audioBuffer;
        tRTCAudioFrame.sampleRate = intValue;
        tRTCAudioFrame.channel = intValue2;
        tRTCAudioFrame.timestamp = longValue;
        w0Var.T().mixExternalAudioFrame(tRTCAudioFrame);
        return jz5.f0.f302826a;
    }
}
