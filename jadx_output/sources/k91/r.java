package k91;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.plugin.appbrand.jsapi.g0 {
    public k91.m A;
    public java.util.Set B;
    public org.json.JSONObject D;
    public org.json.JSONObject E;
    public org.json.JSONObject F;
    public org.json.JSONObject G;
    public org.json.JSONObject H;
    public org.json.JSONObject I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f305736J;
    public java.lang.String L;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f305737d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f305738e;

    /* renamed from: f, reason: collision with root package name */
    public k91.d f305739f;

    /* renamed from: g, reason: collision with root package name */
    public k91.d f305740g;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f305742i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Map f305743m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f305744n;

    /* renamed from: o, reason: collision with root package name */
    public k91.n f305745o;

    /* renamed from: p, reason: collision with root package name */
    public k91.n f305746p;

    /* renamed from: q, reason: collision with root package name */
    public k91.e f305747q;

    /* renamed from: r, reason: collision with root package name */
    public k91.c f305748r;

    /* renamed from: t, reason: collision with root package name */
    public java.util.Set f305750t;

    /* renamed from: u, reason: collision with root package name */
    public org.json.JSONArray f305751u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f305752v;

    /* renamed from: y, reason: collision with root package name */
    public k91.h f305755y;

    /* renamed from: z, reason: collision with root package name */
    public k91.j f305756z;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f305741h = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Boolean f305749s = java.lang.Boolean.FALSE;

    /* renamed from: w, reason: collision with root package name */
    public boolean f305753w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f305754x = false;
    public boolean C = false;
    public boolean K = false;

    public r(boolean z17) {
        this.f305737d = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k91.r h(java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.r.h(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):k91.r");
    }

    public static java.util.Map i(org.json.JSONObject jSONObject, k91.d dVar, k91.j jVar) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, new k91.f(jSONObject.optJSONObject(next), dVar, jVar));
        }
        return hashMap;
    }

    public k91.d a() {
        k91.d dVar;
        return (!this.f305737d || (dVar = this.f305740g) == null) ? this.f305739f : dVar;
    }

    public java.lang.String b() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f305736J) ? this.f305736J : "index.html";
    }

    public k91.f c(java.lang.String str) {
        java.util.Map map;
        if (!android.text.TextUtils.isEmpty(str)) {
            synchronized (this.f305741h) {
                if (!((java.util.HashMap) this.f305742i).containsKey(str)) {
                    str = com.tencent.mm.plugin.appbrand.appstorage.l1.i(str);
                }
                if (((java.util.HashMap) this.f305742i).containsKey(str)) {
                    return (this.f305737d && (map = this.f305743m) != null && map.containsKey(str)) ? (k91.f) this.f305743m.get(str) : (k91.f) ((java.util.HashMap) this.f305742i).get(str);
                }
            }
        }
        return new k91.f(null, this.f305739f, this.f305756z);
    }

    public k91.l d(java.lang.String str) {
        k91.m mVar = this.A;
        if (mVar == null || mVar.f305671a == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        if (str.endsWith(".html")) {
            str = str.substring(0, str.indexOf(".html"));
        }
        return (k91.l) this.A.f305671a.get(str);
    }

    public k91.n e() {
        k91.n nVar;
        return (!this.f305737d || (nVar = this.f305746p) == null) ? this.f305745o : nVar;
    }

    public final boolean f() {
        org.json.JSONObject jSONObject = this.E;
        return jSONObject != null && jSONObject.length() > 0;
    }

    public final boolean g() {
        return f() && this.f305737d;
    }
}
