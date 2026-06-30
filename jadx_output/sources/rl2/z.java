package rl2;

/* loaded from: classes4.dex */
public abstract class z extends be2.k {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f397222d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f397223e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f397224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l75.k0 db6, java.lang.String table) {
        super(db6, ce2.o.f40787r, table, dm.l7.f238283h);
        kotlin.jvm.internal.o.g(db6, "db");
        kotlin.jvm.internal.o.g(table, "table");
        l75.e0 e0Var = ce2.o.f40787r;
        this.f397222d = db6;
        this.f397223e = table;
        this.f397224f = new com.tencent.mm.sdk.platformtools.r2(100);
    }

    public java.util.List D0() {
        java.util.Collection values = this.f397224f.values();
        kotlin.jvm.internal.o.f(values, "values(...)");
        java.util.Collection collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((ce2.o) it.next());
        }
        return arrayList;
    }

    public void J0() {
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397224f;
        boolean isEmpty = r2Var.p().isEmpty();
        java.lang.String str = this.f397223e;
        if (isEmpty) {
            android.database.Cursor f17 = this.f397222d.f("SELECT * FROM " + str, null, 2);
            while (f17.moveToNext()) {
                ce2.o oVar = new ce2.o();
                oVar.convertFrom(f17);
                r2Var.put(oVar.field_id, oVar);
            }
            f17.close();
        }
        com.tencent.mars.xlog.Log.i(str, "initResource: " + c01.z1.r() + ", isEmpty:" + isEmpty + ", cache size:" + r2Var.size());
    }

    public void L0() {
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397224f;
        java.util.Set p17 = r2Var.p();
        kotlin.jvm.internal.o.f(p17, "entrySet(...)");
        java.util.Iterator it = p17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str = this.f397223e;
            if (!hasNext) {
                com.tencent.mars.xlog.Log.i(str, "saveResource finish size:" + r2Var.size() + '!');
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            ce2.o oVar = (ce2.o) value;
            l75.k0 k0Var = this.f397222d;
            android.database.Cursor f17 = k0Var.f("SELECT * FROM " + str + " where " + str + ".id=" + ((java.lang.String) key), null, 2);
            boolean moveToNext = f17.moveToNext();
            boolean z17 = !moveToNext;
            f17.close();
            com.tencent.mars.xlog.Log.i(str, "saveCache " + oVar.field_id + ',' + oVar.field_md5 + ",needReplace:" + moveToNext + ", needInsert:" + z17 + ", result:" + (moveToNext ? replace(oVar) : z17 && k0Var.l(str, dm.i4.COL_ID, oVar.convertTo()) > 0));
        }
    }

    @Override // be2.k
    public void y0(java.lang.String id6, java.lang.String path, java.lang.String md52) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397224f;
        ce2.o oVar = new ce2.o();
        oVar.field_id = id6;
        oVar.field_path = path;
        oVar.field_md5 = md52;
        r2Var.put(id6, oVar);
        com.tencent.mars.xlog.Log.i(this.f397223e, "insertResource id:" + id6 + ",path:" + path + ",md5:" + md52 + ",cache size:" + r2Var.size());
    }

    @Override // be2.k
    public ce2.o z0(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f397224f;
        ce2.o oVar = (ce2.o) r2Var.get(id6);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectResource id:");
        sb6.append(id6);
        sb6.append(",resource:");
        sb6.append(oVar != null ? oVar.field_md5 : null);
        sb6.append(",cache size:");
        sb6.append(r2Var.size());
        com.tencent.mars.xlog.Log.i(this.f397223e, sb6.toString());
        return oVar;
    }
}
