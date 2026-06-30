package jb1;

/* loaded from: classes7.dex */
public final class p extends jb1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb1.q f298739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f298740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298741c;

    public p(jb1.q qVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f298739a = qVar;
        this.f298740b = i17;
        this.f298741c = lVar;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public void onStartFailure(int i17) {
        java.lang.String str;
        super.onStartFailure(i17);
        com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "Not broadcasting: " + i17);
        if (i17 == 1) {
            str = "fail:data too large";
        } else if (i17 == 2) {
            str = "fail:too many advertisers";
        } else if (i17 == 3) {
            str = "fail:already started";
        } else if (i17 == 4) {
            str = "fail:internal error";
        } else if (i17 != 5) {
            str = "fail:Unhandled " + i17 + " error";
        } else {
            str = "fail:feature unsupported";
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.e("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "onStartFailure: error msg = " + str2);
        qb1.a.a(this.f298739a, this.f298740b, this.f298741c, 10008, str2, null, 16, null);
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public void onStartSuccess(android.bluetooth.le.AdvertiseSettings advertiseSettings) {
        super.onStartSuccess(advertiseSettings);
        qb1.a.b(this.f298739a, this.f298740b, this.f298741c, null);
    }
}
