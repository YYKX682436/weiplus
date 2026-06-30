package ob1;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344007a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f344008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344009c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f344010d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f344011e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f344012f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f344013g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f344014h;

    public f(java.lang.String str, java.lang.String str2) {
        this.f344007a = str;
        this.f344008b = str2;
        this.f344014h = null;
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("deviceId", this.f344008b);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f344007a);
        jSONObject.put("RSSI", this.f344009c);
        java.lang.Boolean bool = this.f344014h;
        if (bool != null) {
            jSONObject.put("connectable", bool);
        }
        byte[] bArr = new byte[0];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedHashMap linkedHashMap = this.f344010d;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((java.lang.Integer) entry.getKey()).intValue();
                byte[] bArr2 = {(byte) (intValue & 255), (byte) ((intValue >> 8) & 255)};
                byte[] bArr3 = (byte[]) entry.getValue();
                byte[] bArr4 = new byte[bArr.length + 2 + bArr3.length];
                java.lang.System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
                java.lang.System.arraycopy(bArr2, 0, bArr4, bArr.length, 2);
                java.lang.System.arraycopy(bArr3, 0, bArr4, bArr.length + 2, bArr3.length);
                bArr = bArr4;
            }
        }
        sb6.append(new java.lang.String(android.util.Base64.encode(bArr, 2)));
        jSONObject.put("advertisData", sb6);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List list = this.f344011e;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((android.os.ParcelUuid) it.next()).getUuid().toString().toUpperCase());
            }
        }
        jSONObject.put("advertisServiceUUIDs", jSONArray);
        jSONObject.put("localName", this.f344012f);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Map map = this.f344013g;
        if (map != null && map.size() > 0) {
            for (android.os.ParcelUuid parcelUuid : map.keySet()) {
                jSONObject2.put(parcelUuid.getUuid().toString().toUpperCase(), new java.lang.String(android.util.Base64.encode((byte[]) map.get(parcelUuid), 2)));
            }
        }
        jSONObject.put("serviceData", jSONObject2);
        return jSONObject;
    }

    public f(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat scanResultCompat) {
        java.lang.String name = scanResultCompat.a().getName();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f344007a = name == null ? "" : name;
        java.lang.String address = scanResultCompat.a().getAddress();
        this.f344008b = address == null ? "" : address;
        this.f344009c = scanResultCompat.f80108f;
        this.f344014h = scanResultCompat.f80110h;
        pb1.z zVar = scanResultCompat.f80107e;
        if (zVar != null) {
            this.f344010d = zVar.f353171h;
            this.f344011e = zVar.f353165b;
            java.lang.String str = zVar.f353169f;
            this.f344012f = str != null ? str : "";
            this.f344013g = zVar.f353167d;
            return;
        }
        this.f344012f = "";
    }
}
