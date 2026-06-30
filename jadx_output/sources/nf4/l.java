package nf4;

/* loaded from: classes4.dex */
public final class l extends l75.n0 {

    /* renamed from: m, reason: collision with root package name */
    public static final nf4.k f336858m = new nf4.k(null);

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f336859n = " order by MMStoryInfo.createTime desc";

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f336860o = " (storyID != 0  ) ";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f336861p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f336862q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f336863r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f336864s;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f336865t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f336866u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f336867v;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f336868d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f336869e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f336870f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f336871g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.k0 f336872h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f336873i;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE INDEX IF NOT EXISTS ");
        l75.e0 e0Var = nf4.j.M;
        sb6.append(nf4.j.P);
        sb6.append(" ON ");
        sb6.append("MMStoryInfo");
        sb6.append(" ( storyID )");
        f336866u = new java.lang.String[]{sb6.toString(), "CREATE INDEX IF NOT EXISTS " + nf4.j.Q + " ON MMStoryInfo (userName,storyID, createTime)", "CREATE INDEX IF NOT EXISTS " + nf4.j.R + " ON MMStoryInfo (userName, createTime)"};
        f336867v = new java.lang.String[]{l75.n0.getCreateSQLs(nf4.j.M, "MMStoryInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l75.k0 vdb) {
        super(vdb, nf4.j.M, "MMStoryInfo", f336866u);
        kotlin.jvm.internal.o.g(vdb, "vdb");
        this.f336868d = vdb;
        nf4.k kVar = f336858m;
        java.util.List asList = java.util.Arrays.asList(2, 4, 8);
        kotlin.jvm.internal.o.f(asList, "asList(...)");
        java.util.ArrayList c17 = kVar.c(asList);
        this.f336869e = c17;
        java.util.List asList2 = java.util.Arrays.asList(4, 8, 16);
        kotlin.jvm.internal.o.f(asList2, "asList(...)");
        this.f336870f = kVar.c(asList2);
        java.util.List asList3 = java.util.Arrays.asList(4, 8);
        kotlin.jvm.internal.o.f(asList3, "asList(...)");
        this.f336871g = kVar.c(asList3);
        this.f336872h = vdb;
        this.f336873i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if ((num.intValue() & 2) != 0 && (num.intValue() & 4) == 0) {
                arrayList.add(num);
            }
        }
        kVar.a(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it6 = this.f336870f.iterator();
        while (it6.hasNext()) {
            java.lang.Integer num2 = (java.lang.Integer) it6.next();
            if ((num2.intValue() & 4) != 0) {
                arrayList.add(num2);
            }
        }
        f336862q = kVar.a(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it7 = this.f336870f.iterator();
        while (it7.hasNext()) {
            java.lang.Integer num3 = (java.lang.Integer) it7.next();
            if ((num3.intValue() & 8) != 0) {
                arrayList.add(num3);
            }
        }
        f336863r = kVar.a(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it8 = this.f336869e.iterator();
        while (it8.hasNext()) {
            java.lang.Integer num4 = (java.lang.Integer) it8.next();
            if ((num4.intValue() & 4) != 0) {
                arrayList.add(num4);
            }
        }
        kVar.a(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it9 = this.f336870f.iterator();
        while (it9.hasNext()) {
            java.lang.Integer num5 = (java.lang.Integer) it9.next();
            if ((num5.intValue() & 16) != 0) {
                arrayList.add(num5);
            }
        }
        f336864s = kVar.a(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it10 = this.f336871g.iterator();
        while (it10.hasNext()) {
            java.lang.Integer num6 = (java.lang.Integer) it10.next();
            if ((num6.intValue() & 4) != 0) {
                arrayList.add(num6);
            }
        }
        f336861p = kVar.b(arrayList, "itemStoryFlag", true);
        arrayList.clear();
        java.util.Iterator it11 = this.f336871g.iterator();
        while (it11.hasNext()) {
            java.lang.Integer num7 = (java.lang.Integer) it11.next();
            if ((num7.intValue() & 8) != 0) {
                arrayList.add(num7);
            }
        }
        f336865t = kVar.a(arrayList, "itemStoryFlag");
    }

    public final nf4.j D0(long j17) {
        nf4.j jVar = new nf4.j();
        android.database.Cursor f17 = this.f336872h.f("select *,rowid from MMStoryInfo  where MMStoryInfo.storyID=" + j17 + " limit 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        jVar.convertFrom(f17);
        f17.close();
        return jVar;
    }

    public final nf4.j J0(int i17) {
        nf4.j jVar = new nf4.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *,rowid from MMStoryInfo  where MMStoryInfo.");
        l75.e0 e0Var = nf4.j.M;
        sb6.append(nf4.j.N);
        sb6.append('=');
        sb6.append(i17);
        android.database.Cursor f17 = this.f336872h.f(sb6.toString(), null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        jVar.convertFrom(f17);
        f17.close();
        return jVar;
    }

    public final nf4.j L0(long j17) {
        nf4.j jVar = new nf4.j();
        android.database.Cursor f17 = this.f336872h.f("select *,rowid from MMStoryInfo  WHERE MMStoryInfo.storyID=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        jVar.convertFrom(f17);
        f17.close();
        return jVar;
    }

    public final java.util.List P0(java.lang.String userName, boolean z17, int i17, boolean z18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = "select *,rowid from MMStoryInfo " + y0(userName, z17) + ' ';
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" AND ");
        sb6.append("MMStoryInfo.createTime>" + i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        java.lang.String str2 = f336859n;
        if (!z17) {
            str2 = " AND " + f336860o + " AND " + f336861p + ' ' + str2;
        }
        sb8.append(str2);
        android.database.Cursor f17 = this.f336872h.f(sb8.toString(), null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                nf4.j jVar = new nf4.j();
                jVar.convertFrom(f17);
                arrayList.add(jVar);
            }
            f17.close();
        }
        if (z17) {
            int i18 = ef4.k.f252458a;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC, java.lang.Integer.valueOf(java.lang.Math.min(arrayList.size(), ((java.lang.Number) bf4.g.f19716b.a()).intValue())));
        }
        if (!z18) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!pm0.v.z(((nf4.j) next).field_itemStoryFlag, 4)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final java.util.List W0(java.lang.String userName, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.List P0 = P0(userName, z17, i17, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : P0) {
            if (((nf4.j) obj).y0().f379435n == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final long b1(long j17, int i17) {
        java.lang.String baseSql = "select *,rowid from MMStoryInfo  WHERE " + f336864s;
        kotlin.jvm.internal.o.g(baseSql, "baseSql");
        if (j17 != 0) {
            baseSql = baseSql + " AND MMStoryInfo.storyID < '" + j17 + '\'';
        }
        android.database.Cursor B = this.f336872h.B(baseSql + f336859n + " limit " + i17, null);
        if (!B.moveToLast()) {
            B.close();
            return 0L;
        }
        nf4.j jVar = new nf4.j();
        jVar.convertFrom(B);
        B.close();
        return jVar.field_storyID;
    }

    public final java.util.List d1(java.lang.String userName, int i17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f336872h.f((("select *,rowid from MMStoryInfo " + y0(userName, true)) + " AND createTime BETWEEN " + i17 + " AND " + ((i17 + 86400) - 1)) + f336859n, null, 2);
        while (f17.moveToNext()) {
            nf4.j jVar = new nf4.j();
            jVar.convertFrom(f17);
            arrayList.add(jVar);
        }
        f17.close();
        return arrayList;
    }

    @Override // l75.n0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public boolean update(long j17, nf4.j storyInfo) {
        kotlin.jvm.internal.o.g(storyInfo, "storyInfo");
        return replace(storyInfo);
    }

    public final int i1(int i17, nf4.j storyinfo) {
        boolean z17;
        kotlin.jvm.internal.o.g(storyinfo, "storyinfo");
        nf4.l i18 = ef4.w.f252468t.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(storyinfo.field_createTime);
        java.lang.String localId = sb6.toString();
        kotlin.jvm.internal.o.g(localId, "localId");
        java.util.List delList = i18.f336873i;
        kotlin.jvm.internal.o.f(delList, "delList");
        synchronized (delList) {
            java.util.Iterator it = delList.iterator();
            z17 = false;
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b((java.lang.String) it.next(), localId)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryInfoStorage", "wo wo wo " + localId);
                    z17 = true;
                }
            }
        }
        if (z17) {
            return -1;
        }
        android.content.ContentValues convertTo = storyinfo.convertTo();
        convertTo.remove("rowid");
        l75.k0 k0Var = this.f336872h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        l75.e0 e0Var = nf4.j.M;
        sb7.append(nf4.j.N);
        sb7.append("=?");
        return k0Var.p("MMStoryInfo", convertTo, sb7.toString(), new java.lang.String[]{"" + i17});
    }

    public final java.lang.String y0(java.lang.String str, boolean z17) {
        if (z17) {
            return " WHERE " + f336862q;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" WHERE MMStoryInfo.userName='");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("' AND ");
        sb6.append(f336863r);
        return sb6.toString();
    }

    public void z0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryInfoStorage", "dropTable " + this.f336872h.delete("MMStoryInfo", null, null));
    }
}
