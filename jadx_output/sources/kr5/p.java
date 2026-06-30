package kr5;

/* loaded from: classes13.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f311570a;

    /* renamed from: b, reason: collision with root package name */
    public static kr5.g f311571b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f311572c;

    public static void a(java.util.List list) {
        or5.b.d("DnsService.addLogNodes(%s) called", sr5.a.e(list));
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            or5.c cVar = (or5.c) it.next();
            java.util.List list2 = or5.d.f347704a;
            synchronized (or5.d.class) {
                if (cVar != null) {
                    ((java.util.ArrayList) or5.d.f347704a).add(cVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tr5.z b(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr5.p.b(java.lang.String, java.lang.String, boolean, boolean):tr5.z");
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String b17 = kr5.c.c().b();
        tr5.e0 e0Var = new tr5.e0();
        e0Var.c(f311570a);
        e0Var.e(str);
        e0Var.g(f311571b.f311549d);
        e0Var.d(b17);
        e0Var.f(f311571b.f311548c);
        e0Var.b(f311571b.f311554i);
        e0Var.f421465g = true;
        kr5.g gVar = f311571b;
        e0Var.f421466h = gVar.f311556k;
        e0Var.f421470l = false;
        int i17 = gVar.f311557l;
        if (sr5.f.a(i17)) {
            throw new java.lang.IllegalArgumentException("customNetStack".concat(" is invalid"));
        }
        e0Var.f421469k = i17;
        tr5.g0 d17 = tr5.l.d(e0Var.a());
        ((lr5.d) lr5.e.f320770c).execute(new kr5.k(d17));
        return ((fs5.c) d17.f421493e).e();
    }

    public static void d() {
        java.util.Set set = f311571b.f311551f;
        if (set == null || set.isEmpty()) {
            return;
        }
        ((lr5.d) lr5.e.f320770c).execute(new kr5.o(sr5.a.f((java.lang.String[]) f311571b.f311551f.toArray(new java.lang.String[f311571b.f311551f.size()]), ",")));
    }
}
