package ko0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.c f309821a = new ko0.c();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.LinkedList f309822b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f309823c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f309824d;

    static {
        ki.i.f308101c.c(new ko0.a());
    }

    public static final java.lang.String c(java.lang.String str, java.lang.String str2, boolean z17) {
        int L = r26.n0.L(str, str2, 0, false, 6, null);
        if (L == -1) {
            return str;
        }
        if (z17) {
            java.lang.String substring = str.substring(0, L);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            return substring;
        }
        int length = L + str2.length();
        if (length >= str.length()) {
            return str;
        }
        java.lang.String substring2 = str.substring(length, str.length());
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        return substring2;
    }

    public static final java.lang.String d(java.util.List list, java.lang.String str) {
        if (str.length() == 0) {
            java.lang.String str2 = (java.lang.String) kz5.n0.Z(list);
            return str2 == null ? "" : str2;
        }
        int indexOf = list.indexOf(str);
        return (indexOf <= -1 || indexOf >= list.size() - 1) ? "" : (java.lang.String) list.get(indexOf + 1);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("LiveBackUpUtil", "fetchCdnIp serviceReject:" + f309824d);
        if (f309824d) {
            return;
        }
        f309823c = true;
        r45.wr1 wr1Var = new r45.wr1();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8260;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetcdnip";
        lVar.f70664a = wr1Var;
        lVar.f70665b = new r45.xr1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        wi6.l().K(ko0.b.f309819a);
    }

    public final java.util.List b(java.lang.String str) {
        java.lang.String c17 = c(str, "?", true);
        if (!(c17.length() > 0)) {
            c17 = null;
        }
        if (c17 == null) {
            return null;
        }
        java.lang.String c18 = c(c17, "://", false);
        java.lang.String str2 = c18.length() > 0 ? c18 : null;
        if (str2 == null) {
            return null;
        }
        return r26.n0.f0(str2, new java.lang.String[]{"/"}, false, 0, 6, null);
    }

    public final void e(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("LiveBackUpUtil", "resetCdnIp ".concat(source));
        f309824d = false;
        java.util.LinkedList linkedList = f309822b;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    public final void f() {
        if (f309823c) {
            return;
        }
        java.util.LinkedList linkedList = f309822b;
        if (linkedList == null || linkedList.isEmpty()) {
            a();
        }
    }
}
