package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class f90 extends l75.n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f126756h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f126757i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f126758d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f126759e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.k0 f126760f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f126761g;

    static {
        l75.e0 e0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem.Companion.getClass();
        e0Var = com.tencent.mm.plugin.finder.storage.FinderItem.info;
        f126756h = new java.lang.String[]{l75.n0.getCreateSQLs(e0Var, dm.i4.TABLE_NAME)};
        f126757i = new java.lang.Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f90(l75.k0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "_db"
            kotlin.jvm.internal.o.g(r9, r0)
            com.tencent.mm.plugin.finder.storage.h90 r0 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            r0.getClass()
            l75.e0 r0 = com.tencent.mm.plugin.finder.storage.FinderItem.access$getInfo$cp()
            java.lang.String[] r1 = dm.i4.INDEX_CREATE
            java.lang.String r2 = "FinderFeedItem"
            r8.<init>(r9, r0, r2, r1)
            r8.f126758d = r2
            r8.f126760f = r9
            com.tencent.mm.plugin.finder.storage.kj0 r9 = com.tencent.mm.plugin.finder.storage.lj0.f127143a
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1[r2] = r3
            java.util.List r1 = kz5.c0.i(r1)
            java.util.ArrayList r1 = r9.b(r1)
            r8.f126761g = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            r5 = r5 & r2
            if (r5 == 0) goto L3f
            int r5 = r4.intValue()
            r5 = r5 & r0
            if (r5 != 0) goto L3f
            r3.add(r4)
            goto L3f
        L5d:
            java.lang.String r1 = "localFlag"
            java.lang.String r4 = r9.a(r3, r1)
            r8.f126759e = r4
            java.lang.String r5 = "CONDITION_POST "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = "Finder.FinderFeedStorage"
            com.tencent.mars.xlog.Log.i(r5, r4)
            r3.clear()
            java.util.ArrayList r4 = r8.f126761g
            java.util.Iterator r4 = r4.iterator()
        L79:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            r7 = r7 & r2
            if (r7 != 0) goto L93
            int r7 = r6.intValue()
            r7 = r7 & r0
            if (r7 == 0) goto L79
        L93:
            r3.add(r6)
            goto L79
        L97:
            java.lang.String r9 = r9.a(r3, r1)
            java.lang.String r0 = "FAIL_OR_WAITING "
            java.lang.String r9 = r0.concat(r9)
            com.tencent.mars.xlog.Log.i(r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.f90.<init>(l75.k0):void");
    }

    public final java.util.List D0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f126760f.f("SELECT * FROM FinderFeedItem  WHERE localFlag IN (1, 2);", null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
            finderItem.convertFrom(f17);
            arrayList.add(finderItem);
        }
        f17.close();
        return arrayList;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem J0(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        android.database.Cursor f17 = this.f126760f.f("SELECT * FROM FinderFeedItem  WHERE localFlag IN (64);", null, 2);
        while (true) {
            if (!f17.moveToNext()) {
                break;
            }
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = new com.tencent.mm.plugin.finder.storage.FinderItem();
            finderItem2.convertFrom(f17);
            if (kotlin.jvm.internal.o.b(finderItem2.getClientId(), str)) {
                finderItem = finderItem2;
                break;
            }
        }
        f17.close();
        return finderItem;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem L0() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
        android.database.Cursor f17 = this.f126760f.f("SELECT * FROM FinderFeedItem  WHERE " + this.f126759e + " ORDER BY " + this.f126758d + ".localId ASC LIMIT 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        finderItem.convertFrom(f17);
        f17.close();
        return finderItem;
    }

    public final long P0(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        long cj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).cj();
        finderObj.setLocalId(cj6);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedStorage", "new feed rowId " + this.f126760f.l(dm.i4.TABLE_NAME, dm.i4.COL_LOCALID, finderObj.convertTo()) + ' ' + pm0.b0.g(finderObj.getFeedObject()) + " localID: " + cj6);
        return cj6;
    }

    public final boolean y0(long j17, boolean z17) {
        r45.y31 y31Var;
        java.util.LinkedList list;
        if (z17) {
            bu2.d0 d0Var = bu2.e0.f24498a;
            for (java.lang.Integer num : bu2.e0.f24500c) {
                int intValue = num.intValue();
                bu2.d0 d0Var2 = bu2.e0.f24498a;
                d0Var2.l(intValue);
                java.util.LinkedList list2 = bu2.e0.f24502e.a(intValue).f24493c.getList(0);
                if (list2 != null && (y31Var = (r45.y31) kz5.n0.a0(list2, 0)) != null && (list = y31Var.getList(0)) != null) {
                    kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                    pm0.v.d0(list, new bu2.w(j17, c0Var));
                    if (c0Var.f310112d) {
                        d0Var2.b(bu2.e0.f24502e.a(intValue));
                    }
                }
            }
        }
        int delete = this.f126760f.delete(dm.i4.TABLE_NAME, "localId=?", new java.lang.String[]{"" + j17});
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedStorage", "[deleteByLocalId] ret:" + delete);
        return delete > 0;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem z0(long j17) {
        android.database.Cursor f17 = this.f126760f.f("SELECT * FROM FinderFeedItem  WHERE FinderFeedItem.localId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
        finderItem.convertFrom(f17);
        f17.close();
        return finderItem;
    }
}
