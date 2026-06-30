package k16;

/* loaded from: classes15.dex */
public final class h implements k16.g {

    /* renamed from: a, reason: collision with root package name */
    public final i16.e1 f303459a;

    /* renamed from: b, reason: collision with root package name */
    public final i16.b1 f303460b;

    public h(i16.e1 strings, i16.b1 qualifiedNames) {
        kotlin.jvm.internal.o.g(strings, "strings");
        kotlin.jvm.internal.o.g(qualifiedNames, "qualifiedNames");
        this.f303459a = strings;
        this.f303460b = qualifiedNames;
    }

    @Override // k16.g
    public java.lang.String a(int i17) {
        jz5.o c17 = c(i17);
        java.util.List list = (java.util.List) c17.f302841d;
        java.lang.String g07 = kz5.n0.g0((java.util.List) c17.f302842e, ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return g07;
        }
        return kz5.n0.g0(list, "/", null, null, 0, null, null, 62, null) + '/' + g07;
    }

    @Override // k16.g
    public boolean b(int i17) {
        return ((java.lang.Boolean) c(i17).f302843f).booleanValue();
    }

    public final jz5.o c(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        boolean z17 = false;
        while (i17 != -1) {
            i16.a1 a1Var = (i16.a1) this.f303460b.f287366e.get(i17);
            java.lang.String str = (java.lang.String) this.f303459a.f287414e.get(a1Var.f287350g);
            i16.z0 z0Var = a1Var.f287351h;
            kotlin.jvm.internal.o.d(z0Var);
            int ordinal = z0Var.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z17 = true;
            }
            i17 = a1Var.f287349f;
        }
        return new jz5.o(linkedList, linkedList2, java.lang.Boolean.valueOf(z17));
    }

    @Override // k16.g
    public java.lang.String getString(int i17) {
        java.lang.String str = (java.lang.String) this.f303459a.f287414e.get(i17);
        kotlin.jvm.internal.o.f(str, "getString(...)");
        return str;
    }
}
