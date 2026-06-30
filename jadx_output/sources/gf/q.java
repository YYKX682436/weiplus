package gf;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f271164e;

    public q(com.tencent.luggage.sdk.jsapi.component.service.y yVar, int i17) {
        this.f271163d = yVar;
        this.f271164e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_ID, this.f271164e);
        this.f271163d.e("onSkylineWindowReady", jSONObject.toString(), 0);
    }
}
