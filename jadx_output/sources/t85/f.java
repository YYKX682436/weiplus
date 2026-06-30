package t85;

/* loaded from: classes10.dex */
public class f extends t85.a {

    /* renamed from: b, reason: collision with root package name */
    public double f416466b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f416465a = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f416467c = "Sticker2D";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416468d = "";

    /* renamed from: e, reason: collision with root package name */
    public t85.k f416469e = new t85.k();

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f416470f = new java.util.HashMap();

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        java.lang.String optString = jsonObj.optString(dm.i4.COL_ID, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f416465a = optString;
        this.f416466b = jsonObj.optDouble("version", this.f416466b);
        java.lang.String optString2 = jsonObj.optString("type", this.f416467c);
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f416467c = optString2;
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("elements") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = optJSONArray.getString(i17);
                org.json.JSONObject jSONObject = optJSONObject.getJSONObject(string);
                t85.e eVar = new t85.e();
                kotlin.jvm.internal.o.d(string);
                kotlin.jvm.internal.o.d(jSONObject);
                eVar.a(jSONObject);
                this.f416470f.put(string, eVar);
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if ((r2.f416488d.length == 0) != false) goto L28;
     */
    @Override // t85.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject b() {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r6.f416465a
            r0.put(r1, r2)
            java.lang.String r1 = "version"
            double r2 = r6.f416466b
            r0.put(r1, r2)
            java.lang.String r1 = "type"
            java.lang.String r2 = r6.f416467c
            r0.put(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.HashMap r3 = r6.f416470f
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            r2.put(r5)
            java.lang.Object r5 = r4.getValue()
            t85.e r5 = (t85.e) r5
            org.json.JSONObject r5 = r5.b()
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r1.put(r4, r5)
            goto L30
        L57:
            java.lang.String r3 = "elements"
            r1.put(r3, r2)
            t85.k r2 = r6.f416469e
            double[] r3 = r2.f416485a
            int r3 = r3.length
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L67
            r3 = r4
            goto L68
        L67:
            r3 = r5
        L68:
            if (r3 == 0) goto L89
            double[] r3 = r2.f416486b
            int r3 = r3.length
            if (r3 != 0) goto L71
            r3 = r4
            goto L72
        L71:
            r3 = r5
        L72:
            if (r3 == 0) goto L89
            double[] r3 = r2.f416487c
            int r3 = r3.length
            if (r3 != 0) goto L7b
            r3 = r4
            goto L7c
        L7b:
            r3 = r5
        L7c:
            if (r3 == 0) goto L89
            double[] r3 = r2.f416488d
            int r3 = r3.length
            if (r3 != 0) goto L85
            r3 = r4
            goto L86
        L85:
            r3 = r5
        L86:
            if (r3 == 0) goto L89
            goto L8a
        L89:
            r4 = r5
        L8a:
            if (r4 != 0) goto L96
            org.json.JSONObject r2 = r2.b()
            java.lang.String r3 = "template_trans_set"
            r1.put(r3, r2)
        L96:
            java.lang.String r2 = "params"
            r0.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t85.f.b():org.json.JSONObject");
    }
}
