package wo3;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.tenpay.model.o {
    public c(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, "");
        hashMap.put("ack_key", m17 != null ? (java.lang.String) m17 : null);
        java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_REQ_KEY_STRING, "");
        hashMap.put("req_key", m18 != null ? (java.lang.String) m18 : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.Object m19 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_PAYMSG_TYPE_INT, null);
        int i17 = 0;
        int intValue = m19 != null ? ((java.lang.Integer) m19).intValue() : 0;
        sb6.append(intValue < 0 ? 0 : intValue);
        hashMap.put("paymsg_type", sb6.toString());
        java.lang.Object m27 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, "");
        hashMap.put("transactionid", m27 != null ? (java.lang.String) m27 : null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            i17 = -1;
        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            i17 = 1;
        } else if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            i17 = 2;
        } else if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            i17 = 3;
        } else if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            i17 = 4;
        }
        sb7.append(i17);
        hashMap.put("network", sb7.toString());
        hashMap.put("processed", to3.c0.f420951i ? "1" : "0");
        hashMap.put("is_pos_enabled", "1");
        hashMap.put("channel", z17 ? "pull" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH);
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "" + (java.lang.System.currentTimeMillis() / 1000));
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1230;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineackmsg";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 69L, 1L, true);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 68L, 1L, true);
        int optInt = jSONObject.optInt("poll_time") * 1000;
        if (optInt > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, java.lang.Integer.valueOf(optInt));
        }
    }
}
