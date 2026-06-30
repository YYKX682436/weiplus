package f4;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f259408a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f259409b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f259410c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f259411d = new java.util.ArrayList();

    public u(kotlin.jvm.internal.i iVar) {
    }

    public final void a(long j17, long j18, java.util.List list, java.util.List list2) {
        java.util.List list3;
        int size = list2.size() - 1;
        java.util.List list4 = this.f259410c;
        if (size >= 0) {
            while (true) {
                int i17 = size - 1;
                f4.t tVar = (f4.t) list2.get(size);
                long j19 = tVar.f259406b;
                if (j19 > 0 && j19 < j17) {
                    list2.remove(size);
                } else if (tVar.f259405a < j18) {
                    ((java.util.ArrayList) list4).add(tVar);
                    if (kotlin.jvm.internal.o.b(list2, this.f259409b) && tVar.f259406b == -1) {
                        tVar.f259406b = java.lang.System.nanoTime();
                    }
                }
                if (i17 < 0) {
                    break;
                } else {
                    size = i17;
                }
            }
        }
        if (((java.util.ArrayList) list4).size() > 0) {
            int size2 = ((java.util.ArrayList) list4).size();
            int i18 = 0;
            while (true) {
                list3 = this.f259411d;
                if (i18 >= size2) {
                    break;
                }
                if (!((java.util.ArrayList) list3).contains(java.lang.Integer.valueOf(i18))) {
                    f4.t tVar2 = (f4.t) ((java.util.ArrayList) list4).get(i18);
                    int size3 = ((java.util.ArrayList) list4).size();
                    for (int i19 = i18 + 1; i19 < size3; i19++) {
                        f4.t tVar3 = (f4.t) ((java.util.ArrayList) list4).get(i19);
                        if (kotlin.jvm.internal.o.b(tVar2.f259407c.f259412a, tVar3.f259407c.f259412a)) {
                            if (tVar2.f259405a < tVar3.f259405a) {
                                ((java.util.ArrayList) list3).add(java.lang.Integer.valueOf(i18));
                            } else {
                                ((java.util.ArrayList) list3).add(java.lang.Integer.valueOf(i19));
                            }
                        }
                    }
                }
                i18++;
            }
            kz5.g0.s(list3);
            for (int size4 = ((java.util.ArrayList) list3).size() - 1; -1 < size4; size4--) {
                ((java.util.ArrayList) list4).remove(((java.lang.Number) ((java.util.ArrayList) list3).get(size4)).intValue());
            }
            int size5 = ((java.util.ArrayList) list4).size();
            for (int i27 = 0; i27 < size5; i27++) {
                list.add(((f4.t) ((java.util.ArrayList) list4).get(i27)).f259407c);
            }
            ((java.util.ArrayList) list4).clear();
            ((java.util.ArrayList) list3).clear();
        }
    }

    public final void b() {
        synchronized (this.f259409b) {
            int size = ((java.util.ArrayList) this.f259409b).size();
            while (true) {
                size--;
                if (-1 < size) {
                    if (((f4.t) ((java.util.ArrayList) this.f259409b).get(size)).f259406b != -1) {
                        ((java.util.ArrayList) this.f259409b).remove(size);
                    }
                }
            }
        }
    }

    public final java.util.List c(long j17, long j18) {
        java.util.ArrayList arrayList;
        synchronized (this.f259409b) {
            arrayList = new java.util.ArrayList(((java.util.ArrayList) this.f259408a).size() + ((java.util.ArrayList) this.f259409b).size());
            a(j17, j18, arrayList, this.f259408a);
            a(j17, j18, arrayList, this.f259409b);
        }
        return arrayList;
    }

    public final void d(java.lang.String str, java.util.List list, long j17) {
        synchronized (this.f259409b) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                f4.t tVar = (f4.t) it.next();
                if (kotlin.jvm.internal.o.b(tVar.f259407c.f259412a, str) && tVar.f259406b < 0) {
                    tVar.f259406b = j17;
                }
            }
        }
    }
}
