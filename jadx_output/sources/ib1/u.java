package ib1;

/* loaded from: classes7.dex */
public class u implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290088a;

    public u(ib1.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f290088a = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d
    public void onBluetoothStateChange(boolean z17) {
        ib1.b0.u(this.f290088a, z17, false);
    }
}
