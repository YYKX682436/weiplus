package eg1;

/* loaded from: classes13.dex */
public class i implements vc1.s2 {

    /* renamed from: b, reason: collision with root package name */
    public float f252518b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f252521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252522f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f252523g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f252517a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f252519c = new org.json.JSONObject();

    /* renamed from: d, reason: collision with root package name */
    public final uc1.h1 f252520d = new uc1.h1();

    public i(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar, vc1.a3 a3Var) {
        this.f252521e = i17;
        this.f252522f = lVar;
        this.f252523g = a3Var;
    }

    @Override // vc1.s2
    public void a(vc1.q1 q1Var, boolean z17) {
        vc1.a3 a3Var = this.f252523g;
        org.json.JSONObject jSONObject = this.f252519c;
        if (this.f252517a.compareAndSet(true, false)) {
            try {
                jSONObject.remove("mapId");
                jSONObject.put("mapId", this.f252521e);
                jSONObject.remove("type");
                jSONObject.put("type", "end");
                jSONObject.remove("causedBy");
                boolean z18 = q1Var.f435127a != this.f252518b;
                if (!z17) {
                    jSONObject.put("causedBy", "update");
                } else if (z18) {
                    jSONObject.put("causedBy", "scale");
                } else {
                    jSONObject.put("causedBy", "drag");
                }
                jSONObject.remove(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, q1Var.f435128b);
                jSONObject.remove("skew");
                jSONObject.put("skew", q1Var.f435129c);
                jSONObject.remove("scale");
                jSONObject.put("scale", ((vc1.p1) a3Var).f435068e.getMap().getCameraPosition().getZoom());
                uc1.a.b(a3Var, jSONObject);
                uc1.a.a(a3Var, jSONObject);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            uc1.h1 h1Var = this.f252520d;
            h1Var.f82374f = jSONObject2;
            this.f252522f.i(h1Var, null);
            jSONObject.toString();
        }
    }

    @Override // vc1.s2
    public void b(vc1.q1 q1Var, boolean z17) {
        org.json.JSONObject jSONObject = this.f252519c;
        if (this.f252517a.compareAndSet(false, true)) {
            try {
                jSONObject.remove("mapId");
                jSONObject.put("mapId", this.f252521e);
                jSONObject.remove("type");
                jSONObject.put("type", "begin");
                if (z17) {
                    jSONObject.put("causedBy", "gesture");
                } else {
                    jSONObject.put("causedBy", "update");
                }
                jSONObject.remove(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
                jSONObject.remove("skew");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            uc1.h1 h1Var = this.f252520d;
            h1Var.f82374f = jSONObject2;
            this.f252522f.i(h1Var, null);
            this.f252518b = q1Var.f435127a;
        }
    }
}
