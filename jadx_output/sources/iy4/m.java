package iy4;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.p f295975d;

    public m(iy4.p pVar) {
        this.f295975d = pVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 101) {
            return;
        }
        iy4.k kVar = iy4.k.f295972d;
        iy4.p pVar = this.f295975d;
        if (intent != null) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (i18 == -1 && bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("go_next", "");
                if (kotlin.jvm.internal.o.b(string, "continue_login")) {
                    pVar.f295984g = false;
                    com.tencent.pigeon.ext_device.ExtDeviceLoginFlutterAPI extDeviceLoginFlutterAPI = pVar.f295981d;
                    if (extDeviceLoginFlutterAPI != null) {
                        extDeviceLoginFlutterAPI.confirmLogin(iy4.l.f295974d);
                    }
                } else if (kotlin.jvm.internal.o.b(string, "cancel_login")) {
                    pVar.f295984g = false;
                    com.tencent.pigeon.ext_device.ExtDeviceLoginFlutterAPI extDeviceLoginFlutterAPI2 = pVar.f295981d;
                    if (extDeviceLoginFlutterAPI2 != null) {
                        extDeviceLoginFlutterAPI2.cancelLogin(kVar);
                    }
                }
            }
        }
        if (pVar.f295984g) {
            pVar.f295984g = false;
            com.tencent.pigeon.ext_device.ExtDeviceLoginFlutterAPI extDeviceLoginFlutterAPI3 = pVar.f295981d;
            if (extDeviceLoginFlutterAPI3 != null) {
                extDeviceLoginFlutterAPI3.cancelLogin(kVar);
            }
        }
    }
}
