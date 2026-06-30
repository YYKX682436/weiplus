package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes8.dex */
public final class u90 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f128124e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.storage.t90.f128071x, "FinderLocalOperation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f128125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.storage.t90.f128071x, "FinderLocalOperation", dm.u4.f240285n);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.t90.f128071x;
        this.f128125d = db6;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        com.tencent.mm.plugin.finder.storage.t90 item = (com.tencent.mm.plugin.finder.storage.t90) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean insert = super.insert(item);
        com.tencent.mars.xlog.Log.i("Finder.FinderLocalOperationStorage", "insert " + item.field_localId + ", ret:" + insert);
        return insert;
    }

    public final java.util.List y0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = this.f128125d.B("select * from FinderLocalOperation", null);
        if (B != null) {
            while (B.moveToNext()) {
                com.tencent.mm.plugin.finder.storage.t90 t90Var = new com.tencent.mm.plugin.finder.storage.t90();
                t90Var.convertFrom(B);
                arrayList.add(t90Var);
            }
            B.close();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLocalOperationStorage", "getAllData size:" + arrayList.size());
        return arrayList;
    }
}
