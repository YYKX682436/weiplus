package qm0;

/* loaded from: classes3.dex */
public final class a extends qm0.b {
    public a(java.util.List list, kotlin.jvm.internal.i iVar) {
        super(list);
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList;
        java.util.List list = this.f364680a;
        kotlin.jvm.internal.o.f(list, "list");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(this.f364680a);
        }
        return arrayList;
    }

    public final java.util.List b(yz5.l predicate) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.util.List list = this.f364680a;
        kotlin.jvm.internal.o.f(list, "list");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((java.lang.Boolean) predicate.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final java.lang.Object c(yz5.l predicate) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.util.List list = this.f364680a;
        kotlin.jvm.internal.o.f(list, "list");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((java.lang.Boolean) predicate.invoke(obj)).booleanValue()) {
                    break;
                }
            }
        }
        return obj;
    }

    public final java.lang.Object d(yz5.l predicate) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.util.List list = this.f364680a;
        kotlin.jvm.internal.o.f(list, "list");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((java.lang.Boolean) predicate.invoke(obj)).booleanValue()) {
                    break;
                }
            }
        }
        return obj;
    }
}
