package mn0;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f329795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f329797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f329798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, mn0.y yVar, boolean z18, boolean z19) {
        super(0);
        this.f329795d = z17;
        this.f329796e = yVar;
        this.f329797f = z18;
        this.f329798g = z19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        nn0.o oVar;
        boolean z17 = this.f329795d;
        mn0.y yVar = this.f329796e;
        if (z17) {
            com.tencent.rtmp.TXLivePlayer p17 = yVar.p();
            nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
            if (iVar != null && (oVar = iVar.f338584b) != null) {
                oVar.B(true);
            }
        }
        if (yVar.f329824z % 10 == 1) {
            if (yVar.k() > 0) {
                yVar.D = (((android.media.AudioManager) ((jz5.n) yVar.A).getValue()).getStreamVolume(3) * 100) / yVar.k();
            }
            java.lang.StringBuilder sb6 = yVar.E;
            try {
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                if (!r26.n0.B(sb7, "waveAdaptiveVEqConfig", false)) {
                    sb6.append("waveAdaptiveVEqConfig=" + yVar.f329824z + ';');
                    sb6.append("startPlayVolume=" + yVar.C + ';');
                    sb6.append("stopPlayVolume=" + yVar.D + ';');
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("AudioVolumeEqualizer, session_id:");
                    r45.p72 p72Var = yVar.P;
                    if (p72Var == null || (str = p72Var.getString(1)) == null) {
                        str = "";
                    }
                    sb8.append(str);
                    sb8.append(", reportEndStr:");
                    sb8.append((java.lang.Object) sb6);
                    com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", sb8.toString());
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("api", "reportExternalBusinessData");
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("endReportData", sb6.toString());
                    jSONObject.put("params", jSONObject2);
                    java.lang.String jSONObject3 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                    yVar.callExperimentalAPI(jSONObject3);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("txLivePlayer stopPlay isNeedClearLastImg=");
        boolean z18 = this.f329797f;
        sb9.append(z18);
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", sb9.toString());
        if (yVar.p() instanceof nn0.i) {
            com.tencent.rtmp.TXLivePlayer p18 = yVar.p();
            kotlin.jvm.internal.o.e(p18, "null cannot be cast to non-null type com.tencent.mm.live.core.core.postprocessor.customrender.CustomTXLivePlayer<*>");
            ((nn0.i) p18).e(z18, this.f329798g);
        } else {
            yVar.p().stopPlay(z18);
        }
        yVar.f329811m = false;
        yVar.R = c01.id.c();
        return jz5.f0.f302826a;
    }
}
