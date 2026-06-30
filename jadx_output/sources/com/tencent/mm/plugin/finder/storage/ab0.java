package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes4.dex */
public final class ab0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f126396e = {l75.n0.getCreateSQLs(so2.i4.f410422p, "FinderOrAliasDeletingInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f126397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(l75.k0 db6) {
        super(db6, so2.i4.f410422p, "FinderOrAliasDeletingInfo", dm.y4.f241194g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = so2.i4.f410422p;
        this.f126397d = db6;
    }

    public final java.util.LinkedList y0() {
        com.tencent.mars.xlog.Log.i("Finder.FinderOrAliasDeletingInfoStorage", "getAllDeletingInfo");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f126397d.B("select * , rowid from FinderOrAliasDeletingInfo", null);
        while (B.moveToNext()) {
            try {
                so2.i4 i4Var = new so2.i4();
                i4Var.convertFrom(B);
                linkedList.add(i4Var);
            } finally {
            }
        }
        vz5.b.a(B, null);
        return linkedList;
    }
}
