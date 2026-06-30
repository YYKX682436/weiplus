package kh2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f307990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f307991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ om2.u f307992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame f307993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307994i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, boolean z17, boolean z18, om2.u uVar, com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        super(0);
        this.f307989d = i17;
        this.f307990e = z17;
        this.f307991f = z18;
        this.f307992g = uVar;
        this.f307993h = tRTCAudioFrame;
        this.f307994i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATH, this.f307989d);
        jSONObject.put("noteEmpty", this.f307990e);
        jSONObject.put("lyricEmpty", this.f307991f);
        jSONObject.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.UID, this.f307992g.f346383a);
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = this.f307993h;
        jSONObject.put("sampleRate", tRTCAudioFrame != null ? tRTCAudioFrame.sampleRate : 0);
        jSONObject.put("channel", tRTCAudioFrame != null ? tRTCAudioFrame.channel : 0);
        jSONObject.put(ya.b.SOURCE, this.f307994i);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
