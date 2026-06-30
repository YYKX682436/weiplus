package lo0;

/* loaded from: classes14.dex */
public final class p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final lo0.p0 f320057e = new lo0.p0();

    /* renamed from: f, reason: collision with root package name */
    public static final int f320058f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f320059g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f320060a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f320061b;

    /* renamed from: c, reason: collision with root package name */
    public final lo0.f f320062c;

    /* renamed from: d, reason: collision with root package name */
    public lo0.k0 f320063d;

    public p0(java.lang.String packageDirectory) {
        java.lang.String concat;
        java.lang.Object obj;
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
                if (!(optString == null || optString.length() == 0) && !r26.i0.p(optString, "makeup", false)) {
                    throw new lo0.u("Makeup package item type mismatch. " + optString);
                }
                java.lang.String optString2 = jSONObject.optString("functionalVersion");
                lo0.q0 q0Var = lo0.r0.f320070c;
                kotlin.jvm.internal.o.d(optString2);
                lo0.r0 a17 = q0Var.a(optString2);
                if (!(a17 == null) && (a17.f320072a != f320058f || java.lang.Integer.compare(a17.f320073b ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ f320059g) < 0)) {
                    throw new lo0.u("Incompatible makeup package functional version. ".concat(optString2));
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("badges");
                if (optJSONArray != null) {
                    c75.c.d(optJSONArray, new lo0.l0(linkedHashMap));
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("items");
                if (!(optJSONArray2 == null) && optJSONArray2.length() != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    c75.c.d(optJSONArray2, new lo0.m0(packageDirectory, linkedHashMap, a17, arrayList2, arrayList));
                    if (!arrayList2.isEmpty()) {
                        if (arrayList2.size() > 1) {
                            kz5.g0.t(arrayList2, new lo0.o0());
                        }
                        this.f320060a = true;
                        this.f320061b = arrayList2;
                        this.f320062c = new lo0.f("makeup", arrayList);
                        java.util.Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (!((lo0.k0) obj).f320036b) {
                                    break;
                                }
                            }
                        }
                        lo0.k0 k0Var = (lo0.k0) obj;
                        this.f320063d = k0Var == null ? (lo0.k0) kz5.n0.X(arrayList2) : k0Var;
                        return;
                    }
                    throw new lo0.u("Resource package contains no valid makeup suites.");
                }
                throw new lo0.u("Resource package contains no makeup items.");
            } catch (java.lang.Exception unused) {
                throw new lo0.u("Failed to parse configuration file for makeup package.");
            }
        }
        throw new lo0.u("Failed to read configuration file for makeup package.");
    }

    public p0() {
        lo0.k0 k0Var = new lo0.k0();
        this.f320060a = false;
        this.f320061b = kz5.b0.c(k0Var);
        this.f320062c = new lo0.f("makeup", kz5.p0.f313996d);
        this.f320063d = k0Var;
    }

    public p0(lo0.p0 p0Var) {
        java.lang.Object obj;
        java.util.Collection<lo0.b> values = ((java.util.LinkedHashMap) p0Var.f320062c.f319986b).values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        for (lo0.b bVar : values) {
            bVar.getClass();
            arrayList.add(new lo0.b(bVar));
        }
        java.util.Map d17 = d75.b.d(arrayList, lo0.n0.f320054d);
        this.f320060a = p0Var.f320060a;
        java.util.List<lo0.k0> list = p0Var.f320061b;
        java.util.ArrayList<lo0.k0> arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.k0 k0Var : list) {
            k0Var.getClass();
            arrayList2.add(new lo0.k0(k0Var, d17));
        }
        this.f320061b = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (lo0.k0 k0Var2 : arrayList2) {
            kz5.h0.u(arrayList3, kz5.n0.u0(((java.util.LinkedHashMap) k0Var2.f320042h.f319986b).values(), k0Var2.f320041g));
        }
        this.f320062c = new lo0.f(p0Var.f320062c.f319985a, kz5.n0.V(arrayList3));
        java.util.Iterator it = this.f320061b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((lo0.k0) obj).f320036b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        lo0.k0 k0Var3 = (lo0.k0) obj;
        this.f320063d = k0Var3 == null ? (lo0.k0) kz5.n0.X(this.f320061b) : k0Var3;
    }
}
