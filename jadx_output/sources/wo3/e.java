package wo3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448148d;

    /* renamed from: e, reason: collision with root package name */
    public int f448149e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448150f;

    public e() {
        java.util.HashMap hashMap = new java.util.HashMap();
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, null);
        if (m17 != null) {
            hashMap.put("ack_key", (java.lang.String) m17);
        }
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis() + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.modelbase.m1
    public long getReturnTimeout() {
        return to3.q.f420974d;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1981;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinegetmsg";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 57L, 1L, true);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 56L, 1L, true);
        this.f448148d = jSONObject.optString("appmsg");
        this.f448149e = jSONObject.optInt("poll_time") * 1000;
        this.f448150f = jSONObject.optString("ack_key");
        if (this.f448149e > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, java.lang.Integer.valueOf(this.f448149e));
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, this.f448150f);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean resend() {
        return false;
    }
}
