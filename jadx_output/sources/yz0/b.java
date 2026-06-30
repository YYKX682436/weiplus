package yz0;

/* loaded from: classes15.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f468488e = {l75.n0.getCreateSQLs(yz0.a.Y, "MMPlayerMediaInfoDbCache")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f468489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, yz0.a.Y, "MMPlayerMediaInfoDbCache", dm.x7.A);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = yz0.a.Y;
        this.f468489d = db6;
    }

    public final boolean D0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        android.database.Cursor B = this.f468489d.B("select *, rowid from MMPlayerMediaInfoDbCache  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                r0 = B.getCount() > 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        return r0;
    }

    public final boolean J0(yz0.a item) {
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
        boolean z18 = this.f468489d.p(tableName, convertTo, "mediaId = ?", strArr) > 0;
        if (z18) {
            doNotify();
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderMediaCacheStorage", "[update] failure. " + item.field_mediaId);
        }
        return z18;
    }

    public final yz0.a y0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        yz0.a aVar = new yz0.a();
        aVar.field_mediaId = mediaId;
        jz5.f0 f0Var = null;
        android.database.Cursor B = this.f468489d.B("select *, rowid from MMPlayerMediaInfoDbCache  where mediaId = '" + mediaId + "' ", null);
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    aVar.convertFrom(B);
                }
                vz5.b.a(B, null);
                f0Var = jz5.f0.f302826a;
            } finally {
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.FinderMediaCacheStorage", "getByMediaId mediaId:" + mediaId + ", cursor is null.");
        }
        return aVar;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(yz0.a item) {
        kotlin.jvm.internal.o.g(item, "item");
        return super.insert(item);
    }
}
