package sv4;

/* loaded from: classes12.dex */
public final class e implements su4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sv4.h f413395a;

    public e(sv4.h hVar) {
        this.f413395a = hVar;
    }

    @Override // su4.p0
    public void a() {
    }

    @Override // su4.p0
    public su4.e2 b() {
        return new su4.e2(false, "");
    }

    @Override // su4.p0
    public su4.e2 c() {
        return new su4.e2(false, "");
    }

    @Override // su4.p0
    public org.json.JSONObject d() {
        return new org.json.JSONObject();
    }

    @Override // su4.p0
    public void e(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // su4.p0
    public int f() {
        return 0;
    }

    @Override // su4.p0
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this.f413395a.getActivity();
    }

    @Override // su4.p0
    public org.json.JSONArray h() {
        return new org.json.JSONArray();
    }

    @Override // su4.p0
    public void i(android.content.Context context, java.lang.String query, int i17, java.lang.String parentSearchId, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(parentSearchId, "parentSearchId");
    }

    @Override // su4.p0
    public void j() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FTSGlobalTeachSettingUIC", "refreshVoiceV3Btn called in standalone SettingUIC; no-op (legacy path)");
    }

    @Override // su4.p0
    public void k() {
    }

    @Override // su4.p0
    public int n() {
        return com.tencent.mm.R.id.v3o;
    }

    @Override // su4.p0
    public boolean o() {
        return false;
    }

    @Override // su4.p0
    public org.json.JSONObject p() {
        return new org.json.JSONObject();
    }
}
