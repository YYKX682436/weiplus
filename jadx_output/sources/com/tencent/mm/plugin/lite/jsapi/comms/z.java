package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class z implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.a0 f143839a;

    public z(com.tencent.mm.plugin.lite.jsapi.comms.a0 a0Var) {
        this.f143839a = a0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.lite.jsapi.comms.a0 a0Var = this.f143839a;
        if (i17 != a0Var.f143496g) {
            return false;
        }
        if (i18 == -1) {
            if (intent == null) {
                a0Var.f143443f.a("invalid location result");
                return true;
            }
            com.tencent.mm.modelgeo.Addr addr = (com.tencent.mm.modelgeo.Addr) intent.getParcelableExtra("key_pick_addr");
            java.util.HashMap hashMap = new java.util.HashMap();
            if (addr != null) {
                hashMap.put("address", addr.a());
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, addr.c());
                hashMap.put("latitude", java.lang.Float.valueOf(addr.f71224t));
                hashMap.put("longitude", java.lang.Float.valueOf(addr.f71225u));
                com.tencent.mars.xlog.Log.i("LiteAppJsApiChooseLocation", "cbResult: %s", hashMap);
                a0Var.f143443f.c(new org.json.JSONObject(hashMap), false);
            } else {
                a0Var.f143443f.a("empty location result");
            }
        } else if (i18 == 0) {
            a0Var.f143443f.a("user cancel");
        } else {
            a0Var.f143443f.a("location choose fail");
        }
        return true;
    }
}
