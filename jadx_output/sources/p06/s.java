package p06;

/* loaded from: classes16.dex */
public final class s implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final p06.k f350775d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f350776e;

    public s(p06.k delegate, yz5.l fqNameFilter) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(fqNameFilter, "fqNameFilter");
        this.f350775d = delegate;
        this.f350776e = fqNameFilter;
    }

    @Override // p06.k
    public boolean I(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        if (((java.lang.Boolean) this.f350776e.invoke(fqName)).booleanValue()) {
            return this.f350775d.I(fqName);
        }
        return false;
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        if (((java.lang.Boolean) this.f350776e.invoke(fqName)).booleanValue()) {
            return this.f350775d.a(fqName);
        }
        return null;
    }

    @Override // p06.k
    public boolean isEmpty() {
        p06.k kVar = this.f350775d;
        if ((kVar instanceof java.util.Collection) && ((java.util.Collection) kVar).isEmpty()) {
            return false;
        }
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            n16.c a17 = ((p06.c) it.next()).a();
            if (a17 != null && ((java.lang.Boolean) this.f350776e.invoke(a17)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f350775d) {
            n16.c a17 = ((p06.c) obj).a();
            if (a17 != null && ((java.lang.Boolean) this.f350776e.invoke(a17)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
