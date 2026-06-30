package ma1;

/* loaded from: classes7.dex */
public class e implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ma1.c f325156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f325158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f325159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ma1.f f325160g;

    public e(ma1.f fVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, ma1.c cVar, java.lang.String str, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject) {
        this.f325160g = fVar;
        this.f325154a = c0Var;
        this.f325155b = i17;
        this.f325156c = cVar;
        this.f325157d = str;
        this.f325158e = jSONArray;
        this.f325159f = jSONObject;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            if (i18 != 0 || jSONObject == null) {
                this.f325160g.F(this.f325154a, this.f325155b, i17, i18, str);
                return;
            }
            ma1.f fVar = this.f325160g;
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325154a;
            fVar.getClass();
            ta1.q0 b17 = ta1.q0.b(c0Var.getAppId(), c0Var);
            java.util.Objects.requireNonNull(b17);
            ta1.n0 n0Var = new ta1.n0(b17);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("audio");
            if (optJSONObject != null) {
                n0Var.f416648a = optJSONObject.optInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 0);
                n0Var.f416649b = optJSONObject.optInt("samplerate", 0);
                n0Var.f416650c = optJSONObject.optInt("channel", 0);
            }
            this.f325160g.G(this.f325154a, this.f325155b, this.f325156c, this.f325157d, this.f325158e, n0Var, this.f325159f);
        } catch (java.lang.Exception e17) {
            this.f325160g.F(this.f325154a, this.f325155b, 1, -1, e17.getMessage());
        }
    }
}
