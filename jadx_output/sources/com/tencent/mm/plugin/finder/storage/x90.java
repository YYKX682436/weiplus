package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class x90 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f128295e = {l75.n0.getCreateSQLs(so2.i3.L1, "FinderMediaCacheInfoV4")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f128296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(l75.k0 db6) {
        super(db6, so2.i3.L1, "FinderMediaCacheInfoV4", dm.w4.L);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = so2.i3.L1;
        this.f128296d = db6;
    }

    public final java.util.LinkedList D0(java.lang.String originMediaId) {
        kotlin.jvm.internal.o.g(originMediaId, "originMediaId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f128296d.B("select *, rowid from FinderMediaCacheInfoV4  where originMediaId = '" + originMediaId + "' ", null);
        if (B != null) {
            try {
                B.moveToFirst();
                while (!B.isAfterLast()) {
                    so2.i3 i3Var = new so2.i3();
                    i3Var.convertFrom(B);
                    linkedList.add(i3Var);
                    B.moveToNext();
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return linkedList;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean insert(so2.i3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        return super.insert(item);
    }

    public final boolean L0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        android.database.Cursor B = this.f128296d.B("select *, rowid from FinderMediaCacheInfoV4  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                r0 = B.getCount() > 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        return r0;
    }

    public final boolean P0(so2.i3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.content.ContentValues convertTo = item.convertTo();
        convertTo.remove("rowid");
        java.lang.String tableName = getTableName();
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String asString = convertTo.getAsString("mediaId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (asString == null) {
            asString = "";
        }
        strArr[0] = asString;
        boolean z18 = this.f128296d.p(tableName, convertTo, "mediaId = ?", strArr) > 0;
        if (z18) {
            doNotify();
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderMediaCacheStorage", "[update] failure. " + item.field_mediaId);
        }
        return z18;
    }

    public final java.util.LinkedList y0(long j17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f128296d.B("select *, rowid from FinderMediaCacheInfoV4  where feedId = '" + j17 + "' ", null);
        if (B != null) {
            try {
                B.moveToFirst();
                while (!B.isAfterLast()) {
                    so2.i3 i3Var = new so2.i3();
                    i3Var.convertFrom(B);
                    linkedList.add(i3Var);
                    B.moveToNext();
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return linkedList;
    }

    public final so2.i3 z0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        so2.i3 i3Var = new so2.i3();
        i3Var.field_mediaId = mediaId;
        jz5.f0 f0Var = null;
        android.database.Cursor B = this.f128296d.B("select *, rowid from FinderMediaCacheInfoV4  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    i3Var.convertFrom(B);
                }
                vz5.b.a(B, null);
                f0Var = jz5.f0.f302826a;
            } finally {
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderMediaCacheStorage", "getByMediaId mediaId:" + mediaId + ", cursor is null.");
        }
        return i3Var;
    }
}
