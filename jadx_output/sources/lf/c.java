package lf;

/* loaded from: classes13.dex */
public class c implements com.tencent.map.geolocation.sapp.TencentLocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf.e f318176a;

    public c(lf.e eVar) {
        this.f318176a = eVar;
    }

    @Override // com.tencent.map.geolocation.sapp.TencentLocationListener
    public void onLocationChanged(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            ((ku5.t0) ku5.t0.f312615d).h(new lf.b(this, this, tencentLocation, i17, str), "MicroMsg.DefaultTencentLocationManager");
            return;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s", java.lang.Integer.valueOf(i17), str);
        }
        java.util.List list = this.f318176a.f318186o;
        if (list != null && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            lf.e eVar = this.f318176a;
            lf.e.a(eVar, eVar.f318186o, i17, str, eVar.d(tencentLocation, false));
            ((java.util.concurrent.CopyOnWriteArrayList) this.f318176a.f318186o).clear();
        }
        java.util.List list2 = this.f318176a.f318185n;
        if (list2 != null && ((java.util.concurrent.CopyOnWriteArrayList) list2).size() > 0) {
            lf.e eVar2 = this.f318176a;
            lf.e.a(eVar2, eVar2.f318185n, i17, str, eVar2.d(tencentLocation, true));
            ((java.util.concurrent.CopyOnWriteArrayList) this.f318176a.f318185n).clear();
        }
        java.util.List list3 = this.f318176a.f318188q;
        if (list3 != null && ((java.util.concurrent.CopyOnWriteArrayList) list3).size() > 0) {
            lf.e eVar3 = this.f318176a;
            lf.e.a(eVar3, eVar3.f318188q, i17, str, eVar3.d(tencentLocation, false));
        }
        java.util.List list4 = this.f318176a.f318187p;
        if (list4 != null && ((java.util.concurrent.CopyOnWriteArrayList) list4).size() > 0) {
            lf.e eVar4 = this.f318176a;
            lf.e.a(eVar4, eVar4.f318187p, i17, str, eVar4.d(tencentLocation, true));
        }
        lf.e eVar5 = this.f318176a;
        eVar5.f318179e = tencentLocation;
        eVar5.f318180f = java.lang.System.currentTimeMillis();
        if (tencentLocation != null && tencentLocation.getExtra() != null && tencentLocation.getExtra().getBoolean("KEY_IS_HIGH_ACCURACY")) {
            lf.e eVar6 = this.f318176a;
            eVar6.f318181g = tencentLocation;
            eVar6.f318182h = java.lang.System.currentTimeMillis();
        }
        lf.e eVar7 = this.f318176a;
        eVar7.f318183i = i17;
        eVar7.f318184m = str;
        eVar7.e();
    }

    @Override // com.tencent.map.geolocation.sapp.TencentLocationListener
    public void onStatusUpdate(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]name:%s, status:%d, desc:%s", str, java.lang.Integer.valueOf(i17), str2);
    }
}
