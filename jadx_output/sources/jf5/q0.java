package jf5;

/* loaded from: classes11.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public jf5.n0 f299498a;

    /* renamed from: b, reason: collision with root package name */
    public jf5.n0 f299499b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f299500c = kz5.p0.f313996d;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299501d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f299502e;

    public static java.lang.String b(jf5.q0 q0Var, yz5.l lVar, int i17, java.lang.Object obj) {
        java.lang.String str;
        if ((i17 & 1) != 0) {
            lVar = null;
        }
        jf5.t0 e17 = q0Var.e();
        if (e17 == null) {
            return "";
        }
        java.lang.String str2 = q0Var.f299501d;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectionManager", "getSelectedText failed: rawMarkdown is null");
            return "";
        }
        int b17 = jf5.k0.b(str2, e17.f299510a);
        int b18 = jf5.k0.b(str2, e17.f299511b);
        if (b17 >= 0 && b17 <= str2.length() && b18 <= str2.length() && b18 >= b17) {
            java.lang.String substring = str2.substring(b17, b18);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            return (lVar == null || (str = (java.lang.String) lVar.invoke(substring)) == null) ? substring : str;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SelectionManager", "getSelectedText failed: invalid char range charStart=" + b17 + ", charEnd=" + b18 + ", markdownLen=" + str2.length());
        return "";
    }

    public final void a() {
        jf5.n0 n0Var;
        jf5.n0 n0Var2 = this.f299498a;
        if (n0Var2 == null || (n0Var = this.f299499b) == null) {
            return;
        }
        int indexOf = this.f299500c.indexOf(n0Var2.f299484a);
        int indexOf2 = this.f299500c.indexOf(n0Var.f299484a);
        if (indexOf < 0 || indexOf2 < 0) {
            return;
        }
        if (indexOf > indexOf2 || (indexOf == indexOf2 && n0Var2.f299485b > n0Var.f299485b)) {
            this.f299498a = n0Var;
            this.f299499b = n0Var2;
        }
    }

    public final e06.k c(jf5.f0 content) {
        jf5.n0 n0Var;
        kotlin.jvm.internal.o.g(content, "content");
        jf5.n0 n0Var2 = this.f299498a;
        if (n0Var2 == null || (n0Var = this.f299499b) == null) {
            return null;
        }
        int indexOf = this.f299500c.indexOf(n0Var2.f299484a);
        int indexOf2 = this.f299500c.indexOf(n0Var.f299484a);
        int indexOf3 = this.f299500c.indexOf(content);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (!(indexOf <= indexOf3 && indexOf3 <= indexOf2)) {
            return null;
        }
        int i17 = indexOf3 == indexOf ? n0Var2.f299485b : 0;
        int length = indexOf3 == indexOf2 ? n0Var.f299485b : ((jf5.j0) content).c().length();
        if (length > i17) {
            return e06.p.m(i17, length);
        }
        return null;
    }

    public final boolean d() {
        jf5.n0 n0Var;
        jf5.n0 n0Var2 = this.f299498a;
        return n0Var2 != null && (n0Var = this.f299499b) != null && this.f299500c.contains(n0Var2.f299484a) && this.f299500c.contains(n0Var.f299484a);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jf5.t0 e() {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf5.q0.e():jf5.t0");
    }

    public final void f(jf5.f0 content, int i17, int i18) {
        kotlin.jvm.internal.o.g(content, "content");
        jf5.j0 j0Var = (jf5.j0) content;
        this.f299498a = new jf5.n0(content, e06.p.f(i17, 0, j0Var.c().length()));
        this.f299499b = new jf5.n0(content, e06.p.f(i18, 0, j0Var.c().length()));
        a();
        yz5.a aVar = this.f299502e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void g(jf5.f0 content, int i17) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f299499b = new jf5.n0(content, e06.p.f(i17, 0, ((jf5.j0) content).c().length()));
        a();
        yz5.a aVar = this.f299502e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void h(jf5.f0 content, int i17) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f299498a = new jf5.n0(content, e06.p.f(i17, 0, ((jf5.j0) content).c().length()));
        a();
        yz5.a aVar = this.f299502e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
