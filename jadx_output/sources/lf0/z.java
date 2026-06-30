package lf0;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf0.d0 f318243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f318245f;

    public z(lf0.d0 d0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f318243d = d0Var;
        this.f318244e = str;
        this.f318245f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf0.d0.wi(this.f318243d, this.f318244e, this.f318245f);
    }
}
