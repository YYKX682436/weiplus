package q6;

/* loaded from: classes16.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public long f360214a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONArray f360215b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f360216c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f360217d;

    /* renamed from: e, reason: collision with root package name */
    public final p6.a f360218e;

    /* renamed from: f, reason: collision with root package name */
    public final o6.a f360219f;

    public b(java.lang.String str, p6.a aVar) {
        this.f360215b = null;
        this.f360216c = null;
        try {
            this.f360217d = str;
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            try {
                this.f360216c = jSONObject.getJSONObject("Pattern");
            } catch (org.json.JSONException unused) {
                this.f360215b = jSONObject.getJSONArray("PatternList");
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        this.f360218e = aVar;
        int i17 = aVar.f352114h;
        if (i17 <= 0 || aVar.f352113g == null) {
            return;
        }
        java.lang.String c17 = l6.m.c(aVar.f352107a, i17);
        if (c17 != null && c17.length() > 0) {
            this.f360219f = l6.m.f(l6.m.c(aVar.f352107a, aVar.f352114h));
        }
        if (p6.a.a(this.f360219f)) {
            ((o6.c) this.f360219f.f343174b.get(0)).f343175a = aVar.f352114h;
        }
    }

    public com.appaac.haptic.sync.VibrationPattern a(long j17) {
        long j18;
        if (j17 < 0) {
            return null;
        }
        this.f360214a = j17;
        org.json.JSONObject jSONObject = this.f360216c;
        org.json.JSONArray jSONArray = this.f360215b;
        if (jSONObject != null && jSONArray == null) {
            return new com.appaac.haptic.sync.VibrationPattern("\"Pattern\":" + jSONObject.toString(), 1, 0);
        }
        if (jSONArray != null) {
            p6.a aVar = this.f360218e;
            if (aVar != null && aVar.f352114h > 0) {
                o6.a aVar2 = this.f360219f;
                if (p6.a.a(aVar2) && ((o6.c) aVar2.f343174b.get(0)).f343175a >= j17) {
                    if (!p6.a.a(aVar2)) {
                        return null;
                    }
                    o6.a aVar3 = new o6.a();
                    aVar3.f343173a = new o6.b();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    aVar3.f343174b = arrayList;
                    arrayList.add(aVar2.f343174b.get(0));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(l6.m.b(aVar3));
                    return new com.appaac.haptic.sync.VibrationPattern(sb6.substring(sb6.indexOf("\"Pattern\""), sb6.lastIndexOf("}", sb6.lastIndexOf("}"))), 1, 0);
                }
            }
            int length = jSONArray.length();
            int i17 = 0;
            while (i17 < length) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                try {
                    j18 = jSONObject2.getLong("AbsoluteTime");
                } catch (org.json.JSONException unused) {
                    j18 = jSONObject2.getJSONObject("PatternDesc").getLong("AbsoluteTime");
                }
                if (j17 < j18) {
                    break;
                }
                i17++;
            }
            if (i17 >= 1) {
                return new com.appaac.haptic.sync.VibrationPattern("\"Pattern\":" + jSONArray.getJSONObject(i17 - 1).getJSONArray("Pattern").toString(), 1, 0);
            }
        }
        return null;
    }

    public long b() {
        org.json.JSONArray jSONArray;
        long j17;
        if (this.f360216c == null && (jSONArray = this.f360215b) != null) {
            try {
                try {
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                        try {
                            j17 = jSONObject.getLong("AbsoluteTime");
                        } catch (org.json.JSONException unused) {
                            j17 = jSONObject.getJSONObject("PatternDesc").getLong("AbsoluteTime");
                        }
                        if (this.f360214a < j17) {
                            return j17;
                        }
                    }
                } catch (org.json.JSONException e17) {
                    e17.getMessage();
                }
            } catch (java.lang.Exception e18) {
                e18.getMessage();
            }
        }
        return -1L;
    }
}
