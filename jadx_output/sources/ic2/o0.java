package ic2;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f290355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic2.p0 f290356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.hx0 hx0Var, ic2.p0 p0Var) {
        super(0);
        this.f290355d = hx0Var;
        this.f290356e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.y31 y31Var;
        java.util.LinkedList list;
        r45.qw2 qw2Var = new r45.qw2();
        com.tencent.mm.protobuf.g byteString = this.f290355d.getByteString(1);
        if (byteString != null) {
            qw2Var.parseFrom(byteString.g());
            java.util.LinkedList list2 = qw2Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getObject(...)");
            if (true ^ list2.isEmpty()) {
                this.f290356e.getClass();
                com.tencent.mars.xlog.Log.i("Finder.SyncHandler", "sync spam obj %s", java.lang.Integer.valueOf(qw2Var.getList(0).size()));
                cu2.t tVar = cu2.u.f222441a;
                java.util.LinkedList list3 = qw2Var.getList(0);
                kotlin.jvm.internal.o.f(list3, "getObject(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
                java.util.Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((r45.pc6) it.next()).getLong(0)));
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.finder.storage.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
                Pj.getClass();
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                bu2.d0 d0Var = bu2.e0.f24498a;
                kz5.n0.Q0(arrayList);
                for (java.lang.Integer num : bu2.e0.f24500c) {
                    int intValue = num.intValue();
                    bu2.d0 d0Var2 = bu2.e0.f24498a;
                    d0Var2.l(intValue);
                    java.util.LinkedList list4 = bu2.e0.f24502e.a(intValue).f24493c.getList(0);
                    if (list4 != null && (y31Var = (r45.y31) kz5.n0.a0(list4, 0)) != null && (list = y31Var.getList(0)) != null) {
                        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                        pm0.v.d0(list, new bu2.u(arrayList, c0Var));
                        if (c0Var.f310112d) {
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                            d0Var2.b(bu2.e0.f24502e.a(intValue));
                        }
                    }
                }
                android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray();
                l75.k0 k0Var = Pj.f126760f;
                android.database.Cursor f17 = k0Var.f("SELECT id, createTime from FinderFeedItem ORDER BY createTime DESC LIMIT 100", null, 2);
                try {
                    if (f17.moveToFirst()) {
                        while (!f17.isAfterLast()) {
                            long j17 = f17.getLong(0);
                            if (j17 != 0) {
                                longSparseArray.put(j17, java.lang.Long.valueOf(j17));
                            }
                            f17.moveToNext();
                        }
                    }
                    vz5.b.a(f17, null);
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        long longValue = ((java.lang.Number) it6.next()).longValue();
                        bu2.j.f24534a.l(longValue);
                        if (longSparseArray.indexOfKey(longValue) >= 0) {
                            k0Var.delete(dm.i4.TABLE_NAME, "id=?", new java.lang.String[]{"" + longValue});
                        }
                    }
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedStorage", "[deleteByGroupId] size=" + arrayList.size() + " COST=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                    cu2.t tVar2 = cu2.u.f222441a;
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedLogic", "delete feed size=$" + arrayList.size() + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                } finally {
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
