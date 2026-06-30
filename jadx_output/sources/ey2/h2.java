package ey2;

/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f257388a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.LongSparseArray f257389b = new android.util.LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final android.util.LongSparseArray f257390c = new android.util.LongSparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f257391d = new java.lang.Object();

    public h2(int i17) {
        this.f257388a = i17;
    }

    public final void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(this.f257388a)));
        synchronized (this.f257391d) {
            android.util.LongSparseArray p17 = pm0.v.p(this.f257390c, new ey2.g2(this));
            int size = p17.size();
            for (int i17 = 0; i17 < size; i17++) {
                long keyAt = p17.keyAt(i17);
                java.lang.String str = (java.lang.String) p17.valueAt(i17);
                r45.e13 e13Var = new r45.e13();
                e13Var.set(0, java.lang.Long.valueOf(keyAt));
                e13Var.set(1, str);
                e13Var.set(2, java.lang.Integer.valueOf(this.f257388a));
                e13Var.set(3, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(e13Var.getLong(0), e13Var.getString(4), qt2Var.getInteger(5)));
                linkedList.add(e13Var);
            }
            if (this.f257390c.size() > 0) {
                this.f257390c.clear();
            }
        }
        if (!linkedList.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkReport] tabType=");
            sb6.append(this.f257388a);
            sb6.append(", begin to report unread... ");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((r45.e13) it.next()).getLong(0)));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.TabStreamUnreadVM", sb6.toString());
            new db2.f(linkedList, qt2Var).l();
        }
    }

    public final ey2.h2 b(java.util.List readList) {
        kotlin.jvm.internal.o.g(readList, "readList");
        synchronized (this.f257391d) {
            java.util.Iterator it = readList.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (this.f257389b.indexOfKey(j5Var.getItemId()) < 0) {
                    this.f257389b.append(j5Var.getItemId(), j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getObjectNonceId() : "");
                }
            }
        }
        return this;
    }

    public final boolean c(long j17) {
        return this.f257389b.indexOfKey(j17) >= 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.h2) && this.f257388a == ((ey2.h2) obj).f257388a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f257388a);
    }

    public java.lang.String toString() {
        return "TabStreamCollector(tabType=" + this.f257388a + ')';
    }
}
