package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes14.dex */
public class e implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI f175324d;

    public e(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI) {
        this.f175324d = networkDiagnoseAllInOneUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get location, isOK:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = this.f175324d;
        i11.e eVar = networkDiagnoseAllInOneUI.f175299u;
        if (eVar != null) {
            ((i11.h) eVar).m(networkDiagnoseAllInOneUI.f175300v);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.traceroute.ui.c(this));
        java.lang.String str2 = networkDiagnoseAllInOneUI.f175294p;
        if (z17) {
            str = (java.lang.String.valueOf(f18) + "-" + java.lang.String.valueOf(f17)) + "," + networkDiagnoseAllInOneUI.f175294p;
        } else {
            if (!networkDiagnoseAllInOneUI.f175302x && !com.tencent.mm.sdk.platformtools.n2.a()) {
                com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI2 = this.f175324d;
                networkDiagnoseAllInOneUI2.f175302x = true;
                db5.e1.C(networkDiagnoseAllInOneUI2, networkDiagnoseAllInOneUI2.getString(com.tencent.mm.R.string.fs_), networkDiagnoseAllInOneUI.getString(com.tencent.mm.R.string.f490573yv), networkDiagnoseAllInOneUI.getString(com.tencent.mm.R.string.g6z), networkDiagnoseAllInOneUI.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.traceroute.ui.d(this), null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.NetworkDiagnoseAllInOneUI", "get geolocation fail");
            str = "," + networkDiagnoseAllInOneUI.f175294p;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(14533, str);
        return false;
    }
}
