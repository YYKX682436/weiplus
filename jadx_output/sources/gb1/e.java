package gb1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f269985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f269986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f269987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f269988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gb1.f f269989h;

    public e(gb1.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f269989h = fVar;
        this.f269985d = lVar;
        this.f269986e = c0Var;
        this.f269987f = jSONObject;
        this.f269988g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f269989h.I(this.f269985d, this.f269986e, this.f269987f, this.f269988g);
    }
}
