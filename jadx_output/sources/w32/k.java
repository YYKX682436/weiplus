package w32;

/* loaded from: classes13.dex */
public class k extends com.tencent.mm.plugin.exdevice.model.o3 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f442682d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442683e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442684f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442685g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f442682d = null;
        this.f442683e = null;
        this.f442684f = null;
        this.f442685g = -1;
        this.f442682d = str;
        this.f442683e = str2;
        this.f442684f = str3;
        this.f442685g = i17;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("execute MMWifiStatusSubscribeTaskExcuter. brandName=");
        java.lang.String str = this.f442682d;
        sb6.append(str);
        sb6.append(",deviceType=");
        java.lang.String str2 = this.f442683e;
        sb6.append(str2);
        sb6.append(",deviceId=");
        java.lang.String str3 = this.f442684f;
        sb6.append(str3);
        sb6.append(",reqType=");
        int i17 = this.f442685g;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", sb6.toString());
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.l2(str, str2, str3, i17));
        return false;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "onSceneEnd. errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0.CTRL_INDEX, this);
    }
}
