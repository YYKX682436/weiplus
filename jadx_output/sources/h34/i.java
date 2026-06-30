package h34;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278538d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f278539e;

    /* renamed from: f, reason: collision with root package name */
    public final int f278540f;

    /* renamed from: g, reason: collision with root package name */
    public long f278541g = 0;

    public i(java.lang.String str, java.util.Collection collection, int i17, float f17, float f18, int i18) {
        this.f278540f = 1;
        this.f278540f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tx3();
        lVar.f70665b = new r45.ux3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/ibeaconboardcast";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.appdownload.q0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278539e = a17;
        c01.fb a18 = c01.fb.a();
        java.lang.String str2 = a18.f37195i;
        str2 = str2 == null ? "" : str2;
        java.lang.String str3 = a18.f37194h;
        str3 = str3 == null ? "" : str3;
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        r45.tx3 tx3Var = (r45.tx3) a17.f70710a.f70684a;
        tx3Var.f386854d = str == null ? "" : str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"Beacons\":[");
        if (collection != null) {
            collection.size();
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
        }
        sb6.append("],\"Action\":" + i17 + ",\"LBS\":{\"Latitude\":" + f17 + ",\"Longitude\":" + f18 + ",\"Province\":\"" + str2 + "\",\"City\":\"" + str3 + "\"},\"MachineID\":\"" + wo.w0.k() + "\",\"ZBBeaconState\":\"" + ((defaultAdapter != null && defaultAdapter.getState() == 12 && com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) ? 0 : 1) + "\"}");
        tx3Var.f386855e = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(collection != null ? collection.size() : 0);
        objArr[1] = tx3Var.f386855e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang]beaconCollection.size:%d,json:%s", objArr);
        if (i17 == 1) {
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2008, f18, f17, i18);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f278541g = java.lang.System.currentTimeMillis();
        this.f278538d = u0Var;
        return dispatch(sVar, this.f278539e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.q0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShakeIbeacon", "[oneliang][NetSceneShakeIbeacon]:netId:%s,errType:%s,errCode:%s,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f278538d.onSceneEnd(i18, i19, str, this);
        this.f278541g = java.lang.System.currentTimeMillis() - this.f278541g;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11497, java.lang.String.valueOf((int) ((r3 / 1000) + 0.5d)), 1, java.lang.Integer.valueOf((int) this.f278541g));
        com.tencent.mm.modelbase.o oVar = this.f278539e;
        if (i18 != 0 || i19 != 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((r45.tx3) oVar.f70710a.f70684a).f386855e);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("Beacons");
                int length = jSONArray.length();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("LBS");
                java.lang.String string = jSONObject2.getString("Latitude");
                java.lang.String string2 = jSONObject2.getString("Longitude");
                if (length > 0) {
                    org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(0);
                    java.lang.String string3 = jSONObject3.getString("UUID");
                    org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("Location");
                    g0Var.d(12659, 1, java.lang.Integer.valueOf(length), string3, java.lang.Integer.valueOf(jSONObject4.getInt("Major")), java.lang.Integer.valueOf(jSONObject4.getInt("Minor")), string, string2, 1, java.lang.Integer.valueOf(i19));
                } else {
                    g0Var.d(12659, 1, java.lang.Integer.valueOf(length), "", 0, 0, string, string2, 1, java.lang.Integer.valueOf(i19));
                }
                return;
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
                return;
            }
        }
        r45.ux3 ux3Var = (r45.ux3) oVar.f70711b.f70700a;
        try {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject(((r45.tx3) oVar.f70710a.f70684a).f386855e);
            org.json.JSONArray jSONArray2 = jSONObject5.getJSONArray("Beacons");
            int length2 = jSONArray2.length();
            org.json.JSONObject jSONObject6 = jSONObject5.getJSONObject("LBS");
            int i27 = jSONObject5.getInt("Action");
            java.lang.String string4 = jSONObject6.getString("Latitude");
            java.lang.String string5 = jSONObject6.getString("Longitude");
            if (length2 > 0) {
                org.json.JSONObject jSONObject7 = jSONArray2.getJSONObject(0);
                java.lang.String string6 = jSONObject7.getString("UUID");
                org.json.JSONObject jSONObject8 = jSONObject7.getJSONObject("Location");
                int i28 = jSONObject8.getInt("Major");
                int i29 = jSONObject8.getInt("Minor");
                r45.xx3 xx3Var = ux3Var.f387717d;
                if (xx3Var == null || xx3Var.f390577d != 0) {
                    g0Var.d(12659, 1, java.lang.Integer.valueOf(length2), string6, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), string4, string5, 2, java.lang.Integer.valueOf(ux3Var.f387717d.f390577d));
                } else {
                    java.lang.String str2 = xx3Var.f390579f;
                    if (i27 == 1 && str2 != null && !str2.equals("") && new org.json.JSONObject(str2).getJSONArray("msgs").length() == 0) {
                        g0Var.d(12659, 1, java.lang.Integer.valueOf(length2), string6, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), string4, string5, 2, java.lang.Integer.valueOf(ux3Var.f387717d.f390577d));
                    }
                }
            } else {
                g0Var.d(12659, 1, java.lang.Integer.valueOf(length2), "", 0, 0, string4, string5, 2, java.lang.Integer.valueOf(ux3Var.f387717d.f390577d));
            }
        } catch (org.json.JSONException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneShakeIbeacon", "parse IBeaconBoardcastRequest json error!");
        }
    }
}
