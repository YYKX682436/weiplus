package lf0;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf0.d0 f318240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f318242f;

    public y(lf0.d0 d0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f318240d = d0Var;
        this.f318241e = str;
        this.f318242f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf0.d0.wi(this.f318240d, this.f318241e, this.f318242f);
    }
}
