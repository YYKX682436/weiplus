package cx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f224500a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f224501b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f224502c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.EnumSet f224503d;

    /* renamed from: e, reason: collision with root package name */
    public final cx0.e f224504e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f224505f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f224506g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f224507h;

    public c(java.util.List inserts, java.util.List deletes, java.util.List updates, java.util.EnumSet options, cx0.e eVar) {
        kotlin.jvm.internal.o.g(inserts, "inserts");
        kotlin.jvm.internal.o.g(deletes, "deletes");
        kotlin.jvm.internal.o.g(updates, "updates");
        kotlin.jvm.internal.o.g(options, "options");
        this.f224500a = inserts;
        this.f224501b = deletes;
        this.f224502c = updates;
        this.f224503d = options;
        this.f224504e = eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(inserts, 10));
        java.util.Iterator it = inserts.iterator();
        while (it.hasNext()) {
            arrayList.add(((cx0.b) it.next()).f224496a);
        }
        this.f224505f = kz5.n0.X0(arrayList);
        java.util.List list = this.f224501b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((cx0.b) it6.next()).f224496a);
        }
        this.f224506g = kz5.n0.X0(arrayList2);
        java.util.List list2 = this.f224502c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((cx0.b) it7.next()).f224496a);
        }
        this.f224507h = kz5.n0.X0(arrayList3);
    }

    public final boolean a() {
        return (this.f224500a.size() + this.f224501b.size()) + this.f224502c.size() > 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6;
        java.lang.StringBuilder sb7;
        java.lang.StringBuilder sb8;
        java.util.List list = this.f224500a;
        if (list.isEmpty()) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(list.size());
            sb6.append(" inserts");
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(list.size());
            sb6.append(" inserts\n");
            sb6.append(list);
        }
        java.lang.String sb9 = sb6.toString();
        java.util.List list2 = this.f224501b;
        if (list2.isEmpty()) {
            sb7 = new java.lang.StringBuilder();
            sb7.append(list2.size());
            sb7.append(" deletes");
        } else {
            sb7 = new java.lang.StringBuilder();
            sb7.append(list2.size());
            sb7.append(" deletes\n");
            sb7.append(list2);
        }
        java.lang.String sb10 = sb7.toString();
        java.util.List list3 = this.f224502c;
        if (list3.isEmpty()) {
            sb8 = new java.lang.StringBuilder();
            sb8.append(list3.size());
            sb8.append(" updates");
        } else {
            sb8 = new java.lang.StringBuilder();
            sb8.append(list3.size());
            sb8.append(" updates\n");
            sb8.append(list3);
        }
        return "TimelineMutationInfo " + super.toString() + "; \n" + sb9 + " \n" + sb10 + " \n" + sb8.toString() + '>';
    }
}
