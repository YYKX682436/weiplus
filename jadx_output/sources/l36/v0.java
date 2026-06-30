package l36;

/* loaded from: classes16.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public l36.k0 f315664a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f315665b;

    /* renamed from: c, reason: collision with root package name */
    public l36.h0 f315666c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f315667d;

    public v0() {
        this.f315667d = java.util.Collections.emptyMap();
        this.f315665b = "GET";
        this.f315666c = new l36.h0();
    }

    public l36.w0 a() {
        if (this.f315664a != null) {
            return new l36.w0(this);
        }
        throw new java.lang.IllegalStateException("url == null");
    }

    public l36.v0 b(l36.l lVar) {
        java.lang.String lVar2 = lVar.toString();
        if (lVar2.isEmpty()) {
            this.f315666c.d("Cache-Control");
            return this;
        }
        this.f315666c.e("Cache-Control", lVar2);
        return this;
    }

    public l36.v0 c(java.lang.String str, l36.y0 y0Var) {
        if (str == null) {
            throw new java.lang.NullPointerException("method == null");
        }
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("method.length() == 0");
        }
        if (y0Var != null && !p36.h.b(str)) {
            throw new java.lang.IllegalArgumentException("method " + str + " must not have a request body.");
        }
        if (y0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new java.lang.IllegalArgumentException("method " + str + " must have a request body.");
            }
        }
        this.f315665b = str;
        return this;
    }

    public l36.v0 d(java.lang.String str) {
        this.f315666c.d(str);
        return this;
    }

    public l36.v0 e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        l36.j0 j0Var = new l36.j0();
        j0Var.b(null, str);
        f(j0Var.a());
        return this;
    }

    public l36.v0 f(l36.k0 k0Var) {
        if (k0Var == null) {
            throw new java.lang.NullPointerException("url == null");
        }
        this.f315664a = k0Var;
        return this;
    }

    public v0(l36.w0 w0Var) {
        java.util.Map linkedHashMap;
        this.f315667d = java.util.Collections.emptyMap();
        this.f315664a = w0Var.f315681a;
        this.f315665b = w0Var.f315682b;
        w0Var.getClass();
        java.util.Map map = w0Var.f315684d;
        if (map.isEmpty()) {
            linkedHashMap = java.util.Collections.emptyMap();
        } else {
            linkedHashMap = new java.util.LinkedHashMap(map);
        }
        this.f315667d = linkedHashMap;
        this.f315666c = w0Var.f315683c.e();
    }
}
