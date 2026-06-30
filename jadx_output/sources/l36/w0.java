package l36;

/* loaded from: classes16.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.k0 f315681a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315682b;

    /* renamed from: c, reason: collision with root package name */
    public final l36.i0 f315683c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f315684d;

    /* renamed from: e, reason: collision with root package name */
    public volatile l36.l f315685e;

    public w0(l36.v0 v0Var) {
        this.f315681a = v0Var.f315664a;
        this.f315682b = v0Var.f315665b;
        l36.h0 h0Var = v0Var.f315666c;
        h0Var.getClass();
        this.f315683c = new l36.i0(h0Var);
        v0Var.getClass();
        byte[] bArr = m36.e.f323386a;
        java.util.Map map = v0Var.f315667d;
        this.f315684d = map.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
    }

    public java.lang.String a(java.lang.String str) {
        return this.f315683c.c(str);
    }

    public java.lang.String toString() {
        return "Request{method=" + this.f315682b + ", url=" + this.f315681a + ", tags=" + this.f315684d + '}';
    }
}
