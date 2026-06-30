package lo0;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: i, reason: collision with root package name */
    public static final lo0.t f320074i = new lo0.t();

    /* renamed from: j, reason: collision with root package name */
    public static final int f320075j = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f320076a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f320077b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f320078c;

    /* renamed from: d, reason: collision with root package name */
    public final lo0.f f320079d;

    /* renamed from: e, reason: collision with root package name */
    public lo0.a0 f320080e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f320081f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f320082g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f320083h;

    public t(java.lang.String packageDirectory) {
        java.lang.String concat;
        kotlin.jvm.internal.o.g(packageDirectory, "packageDirectory");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.nio.file.Path path = java.nio.file.Paths.get(packageDirectory, new java.lang.String[0]);
            kotlin.jvm.internal.o.f(path, "get(...)");
            java.nio.file.Path resolve = path.resolve("contents.json");
            kotlin.jvm.internal.o.f(resolve, "resolve(...)");
            concat = resolve.toAbsolutePath().toString();
        } else {
            concat = packageDirectory.concat("/contents.json");
        }
        java.lang.String M = com.tencent.mm.vfs.w6.M(concat);
        if (!(M == null || M.length() == 0)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(M);
                java.lang.String optString = jSONObject.optString("itemsType");
                if (!(optString == null || optString.length() == 0) && !r26.i0.p(optString, "beautify", false)) {
                    throw new lo0.u("Beauty package item type mismatch. " + optString);
                }
                java.lang.String optString2 = jSONObject.optString("functionalVersion");
                lo0.q0 q0Var = lo0.r0.f320070c;
                kotlin.jvm.internal.o.d(optString2);
                lo0.r0 a17 = q0Var.a(optString2);
                if (!(a17 == null) && (a17.f320072a != f320075j || java.lang.Integer.compare(a17.f320073b ^ Integer.MIN_VALUE, Integer.MIN_VALUE) < 0)) {
                    throw new lo0.u("Incompatible beauty package functional version. ".concat(optString2));
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("badges");
                if (optJSONArray != null) {
                    c75.c.d(optJSONArray, new lo0.p(linkedHashMap));
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
                java.lang.String str = null;
                java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString("opaqueResourcesPath") : null;
                optString3 = optString3 == null ? "" : optString3;
                if (optString3.length() > 0) {
                    if (!(optString3.length() == 0)) {
                        if (!(packageDirectory.length() == 0)) {
                            java.lang.String b17 = lo0.n.b(packageDirectory);
                            java.lang.String o17 = new com.tencent.mm.vfs.r6(packageDirectory, optString3).o();
                            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                            java.lang.String b18 = lo0.n.b(o17);
                            if (r26.i0.y(b18, b17, false)) {
                                str = b18;
                            }
                        }
                    }
                    if (!(str == null || str.length() == 0)) {
                        this.f320077b = str;
                    } else {
                        throw new lo0.u("Failed normalizing suite resource path. " + packageDirectory + ", " + optString3);
                    }
                } else {
                    this.f320077b = null;
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("items");
                if (!(optJSONArray2 == null) && optJSONArray2.length() != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    c75.c.d(optJSONArray2, new lo0.q(packageDirectory, linkedHashMap, this, arrayList2, arrayList));
                    if (!arrayList2.isEmpty()) {
                        if (arrayList2.size() > 1) {
                            kz5.g0.t(arrayList2, new lo0.s());
                        }
                        this.f320076a = arrayList2;
                        java.lang.String optString4 = jSONObject.optString("femaleDefaultItem");
                        kotlin.jvm.internal.o.f(optString4, "optString(...)");
                        this.f320081f = optString4;
                        java.lang.String optString5 = jSONObject.optString("maleDefaultItem");
                        kotlin.jvm.internal.o.f(optString5, "optString(...)");
                        this.f320082g = optString5;
                        java.lang.String optString6 = jSONObject.optString("defaultItem");
                        kotlin.jvm.internal.o.f(optString6, "optString(...)");
                        this.f320083h = optString6;
                        this.f320080e = a();
                        this.f320078c = true;
                        this.f320079d = new lo0.f(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY, arrayList);
                        return;
                    }
                    throw new lo0.u("Resource package contains no valid beauty suites.");
                }
                throw new lo0.u("Resource package contains no beauty suites.");
            } catch (java.lang.Exception unused) {
                throw new lo0.u("Failed to parse configuration file for beauty package.");
            }
        }
        throw new lo0.u("Failed to read configuration file for beauty package.");
    }

    public final lo0.a0 a() {
        com.tencent.mm.storage.z3 g17 = c01.z1.g();
        java.lang.Object obj = null;
        java.lang.Integer valueOf = g17 != null ? java.lang.Integer.valueOf(g17.I) : null;
        java.lang.String str = this.f320083h;
        java.lang.String str2 = (valueOf != null && valueOf.intValue() == 2) ? this.f320081f : (valueOf != null && valueOf.intValue() == 1) ? this.f320082g : str;
        if (!(str2.length() == 0)) {
            str = str2;
        }
        boolean z17 = str.length() == 0;
        java.util.List list = this.f320076a;
        if (z17) {
            return (lo0.a0) kz5.n0.X(list);
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (r26.i0.p(((lo0.a0) next).f319950a, str, false)) {
                obj = next;
                break;
            }
        }
        lo0.a0 a0Var = (lo0.a0) obj;
        return a0Var == null ? (lo0.a0) kz5.n0.X(list) : a0Var;
    }

    public t() {
        this.f320076a = kz5.b0.c(new lo0.a0());
        this.f320081f = "off";
        this.f320082g = "off";
        this.f320083h = "off";
        this.f320080e = a();
        this.f320077b = "";
        this.f320078c = false;
        this.f320079d = new lo0.f(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY, kz5.p0.f313996d);
    }

    public t(lo0.t tVar) {
        java.util.Collection<lo0.b> values = ((java.util.LinkedHashMap) tVar.f320079d.f319986b).values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        for (lo0.b bVar : values) {
            bVar.getClass();
            arrayList.add(new lo0.b(bVar));
        }
        java.util.Map d17 = d75.b.d(arrayList, lo0.r.f320069d);
        java.util.List<lo0.a0> list = tVar.f320076a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.a0 a0Var : list) {
            a0Var.getClass();
            arrayList2.add(new lo0.a0(a0Var, d17));
        }
        this.f320076a = arrayList2;
        this.f320081f = tVar.f320081f;
        this.f320082g = tVar.f320082g;
        this.f320083h = tVar.f320083h;
        this.f320080e = a();
        this.f320077b = tVar.f320077b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            lo0.a0 a0Var2 = (lo0.a0) it.next();
            kz5.h0.u(arrayList3, kz5.n0.u0(((java.util.LinkedHashMap) a0Var2.f319958i.f319986b).values(), a0Var2.f319957h));
        }
        this.f320079d = new lo0.f(tVar.f320079d.f319985a, kz5.n0.V(arrayList3));
        this.f320078c = tVar.f320078c;
    }
}
