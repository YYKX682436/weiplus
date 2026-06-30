package vq4;

/* loaded from: classes12.dex */
public final class n implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f439363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f439364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439365c;

    public n(int i17, org.json.JSONObject jSONObject, rh.c1 c1Var) {
        this.f439363a = i17;
        this.f439364b = jSONObject;
        this.f439365c = c1Var;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "dump all tasks:");
        int i17 = 0;
        for (java.lang.Object obj2 : ((java.util.Map) obj).entrySet()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
            if (i17 < this.f439363a) {
                vq4.x.a(this.f439364b, java.lang.String.valueOf(i17), new vq4.m(entry, this.f439365c, i17));
            }
            i17 = i18;
        }
    }
}
