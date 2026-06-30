package cu2;

/* loaded from: classes2.dex */
public final class n extends l75.n0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f222421n = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.storage.x80.P, "FinderDraftItem")};

    /* renamed from: o, reason: collision with root package name */
    public static final int f222422o = 1;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f222423d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f222424e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f222425f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f222426g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f222427h;

    /* renamed from: i, reason: collision with root package name */
    public final l75.k0 f222428i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f222429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 _db) {
        super(_db, com.tencent.mm.plugin.finder.storage.x80.P, "FinderDraftItem", dm.d4.f236340u);
        kotlin.jvm.internal.o.g(_db, "_db");
        com.tencent.mm.plugin.finder.storage.w80 w80Var = com.tencent.mm.plugin.finder.storage.x80.N;
        this.f222423d = "FinderDraftItem";
        this.f222428i = _db;
        com.tencent.mm.plugin.finder.storage.kj0 kj0Var = com.tencent.mm.plugin.finder.storage.lj0.f127143a;
        java.util.ArrayList b17 = kj0Var.b(kz5.c0.i(1, 2, 4));
        this.f222429m = b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.clear();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if ((num.intValue() & 1) != 0 && (num.intValue() & 2) == 0 && (num.intValue() & 4) == 0) {
                arrayList.add(num);
            }
        }
        this.f222425f = kj0Var.a(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it6 = this.f222429m.iterator();
        while (it6.hasNext()) {
            java.lang.Integer num2 = (java.lang.Integer) it6.next();
            if ((num2.intValue() & 1) != 0 || (num2.intValue() & 2) != 0) {
                arrayList.add(num2);
            }
        }
        this.f222426g = kj0Var.a(arrayList, "localFlag");
        this.f222424e = "(markDeleted=0)";
        this.f222427h = "dbversion=" + f222422o;
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorage", "CONDITION_POST " + this.f222425f + "； NOT_DELETED (markDeleted=0)");
    }

    public static boolean y0(cu2.n nVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorage", "deleteByLocalId " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        return nVar.f222428i.delete("FinderDraftItem", "localId=?", new java.lang.String[]{sb6.toString()}) > 0;
    }

    public final com.tencent.mm.plugin.finder.storage.x80 D0(long j17) {
        android.database.Cursor f17 = this.f222428i.f("SELECT * FROM FinderDraftItem  WHERE " + this.f222424e + " AND " + this.f222423d + ".localId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
        x80Var.convertFrom(f17);
        f17.close();
        return x80Var;
    }

    public final com.tencent.mm.plugin.finder.storage.x80 J0(long j17) {
        if (j17 == 0) {
            return null;
        }
        android.database.Cursor f17 = this.f222428i.f("SELECT * FROM FinderDraftItem  WHERE " + this.f222423d + ".objectId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
        x80Var.convertFrom(f17);
        f17.close();
        return x80Var;
    }

    public final long L0(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        draftItem.w0();
        if (draftItem.field_finderItem == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderDraftStorage", "insertNewDraft but field_finderItem is null");
            return -1L;
        }
        long cj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).cj();
        draftItem.field_localId = cj6;
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorage", "new draft rowId " + this.f222428i.l(this.f222423d, dm.i4.COL_LOCALID, draftItem.convertTo()) + ' ' + pm0.b0.g(draftItem) + " localID: " + cj6);
        return cj6;
    }

    public final void P0(long j17) {
        com.tencent.mm.plugin.finder.storage.x80 D0 = D0(j17);
        if (D0 != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderDraftStorage", "markDeleted, " + D0.v0());
            D0.field_markDeleted = 1;
            W0(j17, D0);
        }
    }

    public final boolean W0(long j17, com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        draftItem.w0();
        android.content.ContentValues convertTo = draftItem.convertTo();
        convertTo.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        return this.f222428i.p("FinderDraftItem", convertTo, "localId=?", new java.lang.String[]{sb6.toString()}) > 0;
    }

    public final boolean z0(long j17) {
        if (j17 == 0) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        return this.f222428i.delete("FinderDraftItem", "objectId=?", new java.lang.String[]{sb6.toString()}) > 0;
    }
}
