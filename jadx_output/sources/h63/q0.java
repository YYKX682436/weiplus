package h63;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f279270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f279272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f279274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h63.k1 f279275i;

    public q0(h63.v0 v0Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, int i17, h63.k1 k1Var) {
        this.f279270d = v0Var;
        this.f279271e = context;
        this.f279272f = jSONObject;
        this.f279273g = str;
        this.f279274h = i17;
        this.f279275i = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h63.v0 v0Var = this.f279270d;
        com.tencent.mm.plugin.gamelive.playgame.a aVar = v0Var.f279290i;
        if (aVar == null) {
            v0Var.f279290i = new com.tencent.mm.plugin.gamelive.playgame.a(this.f279271e, this.f279272f, this.f279273g, this.f279274h, this.f279275i);
        } else if (aVar != null) {
            aVar.f142074c = this.f279272f;
            aVar.f142086o = this.f279275i;
            aVar.a(this.f279273g, this.f279274h);
            aVar.b();
        }
    }
}
