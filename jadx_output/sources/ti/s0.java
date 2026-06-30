package ti;

/* loaded from: classes16.dex */
public class s0 implements ti.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f419506a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f419507b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f419508c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f419509d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public ti.t0 f419510e;

    public ti.s0 a() {
        this.f419510e.f419512b = true;
        return this;
    }

    public ti.s0 b(java.lang.String str) {
        vi.b.a(str, "mClassName");
        ti.t0 t0Var = new ti.t0("any subclass of ".concat(str));
        this.f419510e = t0Var;
        this.f419509d.put(str, t0Var);
        return this;
    }

    public ti.s0 c(java.lang.String str, java.lang.String str2) {
        vi.b.a(str, "mClassName");
        vi.b.a(str2, "fieldName");
        java.util.Map map = this.f419506a;
        java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(str);
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            map.put(str, map2);
        }
        ti.t0 t0Var = new ti.t0("field " + str + "#" + str2);
        this.f419510e = t0Var;
        map2.put(str2, t0Var);
        return this;
    }

    public ti.s0 d(java.lang.String str, java.lang.String str2) {
        vi.b.a(str, "mClassName");
        vi.b.a(str2, "fieldName");
        java.util.Map map = this.f419507b;
        java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(str);
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            map.put(str, map2);
        }
        ti.t0 t0Var = new ti.t0("static field " + str + "#" + str2);
        this.f419510e = t0Var;
        map2.put(str2, t0Var);
        return this;
    }
}
