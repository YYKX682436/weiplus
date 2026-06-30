package mn0;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(mn0.y yVar) {
        super(0);
        this.f329803d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mn0.y yVar = this.f329803d;
        com.tencent.rtmp.TXLivePlayer e17 = yVar.e(yVar.f329805d);
        e17.enableHardwareDecode(true);
        hn0.w.f282443a.a("BaseLiveTXPlayer");
        ko0.t tVar = ko0.t.f309903a;
        jz5.g gVar = ko0.t.f309904b;
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioCodecType);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", 1);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            e17.callExperimentalAPI(jSONObject3);
        }
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "create txLivePlayer enableAudioCodec:" + ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        return e17;
    }
}
