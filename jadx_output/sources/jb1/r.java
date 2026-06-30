package jb1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f298743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb1.s f298744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f298745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298746g;

    public r(org.json.JSONObject jSONObject, jb1.s sVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f298743d = jSONObject;
        this.f298744e = sVar;
        this.f298745f = i17;
        this.f298746g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb1.a0 b17 = jb1.d0.f298705a.b(this.f298743d.optInt("serverId"));
        if (b17 == null) {
            qb1.a.a(this.f298744e, this.f298745f, this.f298746g, 10020, "fail: no server", null, 16, null);
            return;
        }
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "invoke: adapter is null");
            qb1.a.a(this.f298744e, this.f298745f, this.f298746g, 10001, "fail:not available", null, 16, null);
        } else {
            b17.d(d17);
            qb1.a.b(this.f298744e, this.f298745f, this.f298746g, null);
        }
    }
}
