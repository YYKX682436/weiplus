package pc1;

/* loaded from: classes7.dex */
public class b implements android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc1.d f353339d;

    public b(pc1.d dVar) {
        this.f353339d = dVar;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        java.util.Iterator it;
        boolean z17;
        double pow;
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "valueByte is null or nil");
            return;
        }
        java.util.Map map = pc1.e.f353348a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "handleScanDataV2, device: " + bluetoothDevice);
        pb1.z a17 = pb1.z.a(bArr);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BeaconManager", "handleScanDataV2, scanRecordCompat is null");
        } else {
            java.util.LinkedHashMap linkedHashMap = a17.f353166c;
            if (linkedHashMap == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BeaconManager", "handleScanDataV2, id2ManufacturerData is null");
            } else {
                java.util.Iterator it6 = linkedHashMap.values().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    byte[] bArr2 = (byte[]) it6.next();
                    if (bArr2 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.BeaconManager", "handleScanDataV2, manufacturerData is null");
                        break;
                    }
                    if (22 >= bArr2.length) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "handleManufacturerData, manufacturerData is too short");
                    } else if ((bArr2[0] & 255) == 2 && (bArr2[1] & 255) == 21) {
                        byte[] bArr3 = new byte[16];
                        java.lang.System.arraycopy(bArr2, 2, bArr3, 0, 16);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        for (int i18 = 0; i18 < 16; i18++) {
                            int i19 = bArr3[i18] & 255;
                            if (i19 < 16) {
                                sb6.append("0");
                            }
                            sb6.append(java.lang.Integer.toHexString(i19));
                        }
                        java.lang.String upperCase = sb6.toString().toUpperCase(java.util.Locale.US);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(upperCase)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "handleManufacturerData, hexString is null, err");
                        } else {
                            java.lang.String str = upperCase.substring(0, 8) + "-" + upperCase.substring(8, 12) + "-" + upperCase.substring(12, 16) + "-" + upperCase.substring(16, 20) + "-" + upperCase.substring(20, 32);
                            com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "handleManufacturerData, strUuid %s", str);
                            java.util.UUID fromString = java.util.UUID.fromString(str);
                            pc1.d dVar = this.f353339d;
                            java.util.UUID[] uuidArr = dVar.f353342c;
                            java.util.Map map2 = dVar.f353346g;
                            int length = uuidArr.length;
                            int i27 = 0;
                            while (true) {
                                if (i27 >= length) {
                                    z17 = false;
                                    break;
                                } else {
                                    if (uuidArr[i27].equals(fromString)) {
                                        z17 = true;
                                        break;
                                    }
                                    i27++;
                                }
                            }
                            if (z17) {
                                int i28 = ((bArr2[18] & 255) * 256) + (bArr2[19] & 255);
                                int i29 = ((bArr2[20] & 255) * 256) + (bArr2[21] & 255);
                                byte b17 = bArr2[22];
                                double d17 = i17;
                                if (d17 == 0.0d) {
                                    pow = -1.0d;
                                    it = it6;
                                } else {
                                    it = it6;
                                    double d18 = (d17 * 1.0d) / b17;
                                    pow = d18 < 1.0d ? java.lang.Math.pow(d18, 10.0d) : 0.54992d + (java.lang.Math.pow(d18, 9.9476d) * 0.92093d);
                                }
                                java.lang.String address = bluetoothDevice.getAddress();
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put("uuid", fromString);
                                    jSONObject.put("major", i28);
                                    jSONObject.put("minor", i29);
                                    jSONObject.put("proximity", 0);
                                    jSONObject.put("accuracy", pow);
                                    jSONObject.put("rssi", i17);
                                    ((java.util.concurrent.ConcurrentHashMap) dVar.f353341b).put(address, jSONObject);
                                    ((java.util.concurrent.ConcurrentHashMap) map2).put(address, jSONObject);
                                } catch (org.json.JSONException e17) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.BeaconManager", "handleManufacturerData, put JSON data error : %s", e17);
                                }
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                if (currentTimeMillis - dVar.f353345f > 500) {
                                    pc1.c cVar = dVar.f353343d;
                                    if (cVar != null) {
                                        pc1.h hVar = (pc1.h) cVar;
                                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                                        for (org.json.JSONObject jSONObject2 : ((java.util.concurrent.ConcurrentHashMap) map2).values()) {
                                            if (jSONObject2 != null) {
                                                jSONArray.put(jSONObject2);
                                            }
                                        }
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        try {
                                            jSONObject3.put("beacons", jSONArray);
                                        } catch (org.json.JSONException e18) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartBeaconDiscovery", "put res JSON data error : %s", e18);
                                        }
                                        com.tencent.mm.plugin.appbrand.jsapi.l lVar = hVar.f353359c;
                                        int componentId = lVar.getComponentId();
                                        pc1.k kVar = hVar.f353357a;
                                        kVar.p(lVar);
                                        kVar.f82376h = componentId;
                                        kVar.f82374f = jSONObject3.toString();
                                        kVar.m();
                                    }
                                    dVar.f353345f = currentTimeMillis;
                                    ((java.util.concurrent.ConcurrentHashMap) map2).clear();
                                }
                                it6 = it;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BeaconManager", "handleManufacturerData, not found beacon!");
                            }
                        }
                    }
                    it = it6;
                    it6 = it;
                }
            }
        }
    }
}
