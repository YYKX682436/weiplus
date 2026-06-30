package ih2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f291555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame f291556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        super(0);
        this.f291555d = i17;
        this.f291556e = tRTCAudioFrame;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATH, this.f291555d);
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = this.f291556e;
        jSONObject.put("sampleRate", tRTCAudioFrame != null ? tRTCAudioFrame.sampleRate : 0);
        jSONObject.put("channel", tRTCAudioFrame != null ? tRTCAudioFrame.channel : 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
