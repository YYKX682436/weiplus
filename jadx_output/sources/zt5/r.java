package zt5;

/* loaded from: classes14.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public long f475613a;

    /* renamed from: b, reason: collision with root package name */
    public int f475614b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f475615c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f475616d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475617e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f475618f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f475619g;

    public r(java.lang.String str, java.lang.String str2) {
        this.f475613a = -1L;
        this.f475614b = -1;
        this.f475615c = "";
        this.f475616d = "";
        this.f475618f = null;
        this.f475619g = "";
        this.f475617e = str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("certs")) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("certs");
                if (optJSONArray.length() < 2) {
                    zt5.h.b("Soter.SoterPubKeyModel", "certificates train not enough", new java.lang.Object[0]);
                }
                zt5.h.c("Soter.SoterPubKeyModel", "certs size: [%d]", java.lang.Integer.valueOf(optJSONArray.length()));
                this.f475618f = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    this.f475618f.add(optJSONArray.getString(i17));
                }
                try {
                    zt5.a.a((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(((java.lang.String) this.f475618f.get(0)).getBytes())), this);
                } catch (java.lang.Exception e17) {
                    zt5.h.d("Soter.SoterPubKeyModel", e17, "soter: loadDeviceInfo from attestationCert failed");
                }
                jSONObject.put("cpu_id", this.f475615c);
                jSONObject.put("uid", this.f475614b);
                jSONObject.put("counter", this.f475613a);
                this.f475617e = jSONObject.toString();
            } else {
                this.f475613a = jSONObject.optLong("counter");
                this.f475614b = jSONObject.optInt("uid");
                this.f475615c = jSONObject.optString("cpu_id");
                this.f475616d = jSONObject.optString("pub_key");
            }
        } catch (java.lang.Exception unused) {
            zt5.h.b("Soter.SoterPubKeyModel", "soter: pub key model failed", new java.lang.Object[0]);
        }
        this.f475619g = str2;
    }

    public java.lang.String toString() {
        return "SoterPubKeyModel{counter=" + this.f475613a + ", uid=" + this.f475614b + ", cpu_id='" + this.f475615c + "', pub_key_in_x509='" + this.f475616d + "', rawJson='" + this.f475617e + "', signature='" + this.f475619g + "'}";
    }

    public r(java.security.cert.Certificate[] certificateArr) {
        this.f475613a = -1L;
        this.f475614b = -1;
        this.f475615c = "";
        this.f475616d = "";
        this.f475617e = "";
        this.f475618f = null;
        this.f475619g = "";
        if (certificateArr != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i17 = 0; i17 < certificateArr.length; i17++) {
                    java.security.cert.Certificate certificate = certificateArr[i17];
                    android.util.Base64.encodeToString(certificate.getEncoded(), 2);
                    java.lang.String b17 = zt5.a.b(certificate);
                    if (i17 == 0) {
                        try {
                            zt5.a.a((java.security.cert.X509Certificate) certificate, this);
                        } catch (java.lang.Exception e17) {
                            zt5.h.d("Soter.SoterPubKeyModel", e17, "soter: loadDeviceInfo from attestationCert failed");
                        }
                    }
                    jSONArray.put(b17);
                    arrayList.add(b17);
                }
                this.f475618f = arrayList;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("certs", jSONArray);
                jSONObject.put("cpu_id", this.f475615c);
                jSONObject.put("uid", this.f475614b);
                jSONObject.put("counter", this.f475613a);
                this.f475617e = jSONObject.toString();
            } catch (java.lang.Exception unused) {
                zt5.h.b("Soter.SoterPubKeyModel", "soter: pub key model failed", new java.lang.Object[0]);
            }
        }
    }
}
