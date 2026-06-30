package q10;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f359524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d5 f359525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359526f;

    public n(java.util.Map map, bw5.d5 d5Var, int i17) {
        this.f359524d = map;
        this.f359525e = d5Var;
        this.f359526f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.util.Map map = this.f359524d;
        if (map != null) {
            java.lang.String jSONObject = new org.json.JSONObject(map).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            str = r26.i0.t(jSONObject, ";", ",", false);
        } else {
            str = "";
        }
        y02.v0 a17 = y02.x0.f458634d.a();
        if (a17 != null) {
            a17.p1(this.f359525e, this.f359526f, str);
        }
    }
}
