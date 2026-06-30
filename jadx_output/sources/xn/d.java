package xn;

/* loaded from: classes4.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f455404d;

    /* renamed from: e, reason: collision with root package name */
    public final xn.b f455405e;

    public d(int i17, java.lang.Object obj, xn.b config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f455404d = obj;
        this.f455405e = config;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        xn.d other = (xn.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        ((a45.e) ((jz5.n) ((a45.g) this.f455405e).f1350d).getValue()).getClass();
        u15.a thiz = (u15.a) this.f455404d;
        u15.a other2 = (u15.a) other.f455404d;
        kotlin.jvm.internal.o.g(thiz, "thiz");
        kotlin.jvm.internal.o.g(other2, "other");
        return false;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xn.d other = (xn.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        ((a45.e) ((jz5.n) ((a45.g) this.f455405e).f1350d).getValue()).getClass();
        u15.a thiz = (u15.a) this.f455404d;
        u15.a other2 = (u15.a) other.f455404d;
        kotlin.jvm.internal.o.g(thiz, "thiz");
        kotlin.jvm.internal.o.g(other2, "other");
        oi3.e k17 = thiz.k();
        if (k17 == null) {
            return 0;
        }
        long j17 = k17.getLong(k17.f345617d + 2);
        oi3.e k18 = other2.k();
        return kotlin.jvm.internal.o.j(j17, k18 != null ? k18.getLong(k18.f345617d + 2) : 0L);
    }

    @Override // xm3.a, in5.c
    public int h() {
        int integer;
        yz5.l lVar;
        xn.b bVar = this.f455405e;
        bVar.getClass();
        java.lang.Object obj = this.f455404d;
        u15.a data = (u15.a) obj;
        kotlin.jvm.internal.o.g(data, "data");
        if (data.n()) {
            integer = 1000000;
        } else {
            oi3.e k17 = data.k();
            integer = k17 != null ? k17.getInteger(k17.f345617d + 4) : 0;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) bVar.f455403b;
        int intValue = (!linkedHashMap.keySet().contains(java.lang.Integer.valueOf(integer)) || (lVar = (yz5.l) linkedHashMap.get(java.lang.Integer.valueOf(integer))) == null) ? 0 : ((java.lang.Number) lVar.invoke(obj)).intValue();
        xn.a aVar = xn.b.f455401c;
        kotlin.jvm.internal.o.g(data, "data");
        int a17 = aVar.a("", integer, intValue);
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) bVar.f455402a;
        if (linkedHashMap2.keySet().contains(java.lang.Integer.valueOf(a17))) {
            return a17;
        }
        kotlin.jvm.internal.o.g(data, "data");
        int a18 = aVar.a("", integer, 0);
        if (linkedHashMap2.keySet().contains(java.lang.Integer.valueOf(a18))) {
            return a18;
        }
        return 1;
    }

    @Override // xm3.d
    public java.lang.String v() {
        ((a45.e) ((jz5.n) ((a45.g) this.f455405e).f1350d).getValue()).getClass();
        u15.a data = (u15.a) this.f455404d;
        kotlin.jvm.internal.o.g(data, "data");
        oi3.e k17 = data.k();
        return (k17 != null ? java.lang.Long.valueOf(k17.getLong(k17.f345617d + 2)) : java.lang.Integer.valueOf(data.hashCode())).toString();
    }
}
