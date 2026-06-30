package j62;

/* loaded from: classes9.dex */
public class a implements j62.f {

    /* renamed from: d, reason: collision with root package name */
    public int f297879d;

    /* renamed from: e, reason: collision with root package name */
    public int f297880e;

    /* renamed from: f, reason: collision with root package name */
    public int f297881f;

    /* renamed from: g, reason: collision with root package name */
    public int f297882g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297883h;

    /* renamed from: i, reason: collision with root package name */
    public long f297884i;

    /* renamed from: m, reason: collision with root package name */
    public long f297885m;

    /* renamed from: n, reason: collision with root package name */
    public int f297886n;

    /* renamed from: o, reason: collision with root package name */
    public int f297887o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f297888p;

    /* renamed from: q, reason: collision with root package name */
    public int f297889q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashMap f297890r = null;

    @Override // j62.f
    public java.util.HashMap E() {
        java.util.HashMap hashMap = this.f297890r;
        if (hashMap != null) {
            return hashMap;
        }
        java.util.HashMap hashMap2 = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f297883h)) {
            try {
                java.lang.Object obj = new org.json.JSONObject(this.f297883h).get("Args");
                if (obj == null) {
                    return null;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                try {
                    if (obj instanceof org.json.JSONArray) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                            b(hashMap3, jSONArray.getJSONObject(i17), true);
                        }
                    } else if (obj instanceof org.json.JSONObject) {
                        b(hashMap3, (org.json.JSONObject) obj, true);
                    }
                    hashMap2 = hashMap3;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    hashMap2 = hashMap3;
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExptAppItem", "get expt item error [%s] exptId[%d]", e.toString(), java.lang.Integer.valueOf(this.f297879d));
                    this.f297890r = hashMap2;
                    return hashMap2;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }
        this.f297890r = hashMap2;
        return hashMap2;
    }

    @Override // j62.f
    public java.lang.String O(java.lang.String str, java.lang.String str2) {
        return "";
    }

    public boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f297879d = jSONObject.optInt("ExptId");
            this.f297880e = jSONObject.optInt("GroupId");
            this.f297881f = jSONObject.optInt("ExptSequence");
            this.f297882g = jSONObject.optInt("UseFlag");
            this.f297883h = str;
            this.f297884i = jSONObject.optLong("StartTime");
            this.f297885m = jSONObject.optLong("EndTime");
            this.f297886n = jSONObject.optInt("ExptType");
            this.f297887o = jSONObject.optInt("SvrType");
            this.f297888p = jSONObject.optString("ExptCheckSum");
            E();
            toString();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExptAppItem", "%d convertFrom [%s] error [%s]", java.lang.Integer.valueOf(hashCode()), str, e17.toString());
            return false;
        }
    }

    public final void b(java.util.HashMap hashMap, org.json.JSONObject jSONObject, boolean z17) {
        byte[] decode;
        if (jSONObject == null || hashMap == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("Key");
        java.lang.String optString2 = jSONObject.optString("Val");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            return;
        }
        if (z17 && (decode = android.util.Base64.decode(optString2, 0)) != null && decode.length > 0) {
            if (decode.length <= 1048576) {
                try {
                    optString2 = new java.lang.String(decode, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.lang.Error | java.lang.Exception unused) {
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExptAppItem", "data length more 1M don't parse, reset value. key[%s]", optString);
                optString2 = "";
            }
        }
        hashMap.put(optString, optString2);
        if (optString != null) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(optString, "ECSubType_" + this.f297879d)) {
                this.f297889q = java.lang.Integer.parseInt(optString2);
            }
        }
    }

    public boolean c() {
        if (this.f297881f < 0) {
            return false;
        }
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        if (i17 < this.f297884i) {
            return false;
        }
        long j17 = this.f297885m;
        return j17 <= 0 || i17 <= j17;
    }

    @Override // j62.f
    public int e0() {
        return this.f297879d;
    }

    @Override // j62.f
    public boolean g0() {
        return false;
    }

    @Override // j62.f
    public int getGroupId() {
        return this.f297880e;
    }

    public java.lang.String toString() {
        return "ExptAppItem{exptId=" + this.f297879d + ", groupId=" + this.f297880e + ", exptSeq=" + this.f297881f + ", useFlag=" + this.f297882g + ", exptContent='" + this.f297883h + "', startTime=" + this.f297884i + ", endTime=" + this.f297885m + ", exptType=" + this.f297886n + ", svrType=" + this.f297887o + ", exptCheckSum='" + this.f297888p + "'}";
    }
}
