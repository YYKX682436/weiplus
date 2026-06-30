package ye3;

/* loaded from: classes15.dex */
public final class o extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f461230e = {l75.n0.getCreateSQLs(ye3.n.Q, "MBThumbPlayerMediaInfoDbCache")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f461231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.k0 db6) {
        super(db6, ye3.n.Q, "MBThumbPlayerMediaInfoDbCache", dm.w7.f240828w);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = ye3.n.Q;
        this.f461231d = db6;
    }

    public final boolean D0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (r26.n0.N(mediaId)) {
            return false;
        }
        try {
            android.database.Cursor B = this.f461231d.B("SELECT 1 FROM MBThumbPlayerMediaInfoDbCache WHERE mediaId = ? LIMIT 1", new java.lang.String[]{mediaId});
            if (B == null) {
                return false;
            }
            try {
                boolean z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                return z17;
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[isExist] query failed. mediaId=".concat(mediaId), e17);
            return false;
        }
    }

    public final boolean J0(ye3.n item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.field_mediaId;
        kotlin.jvm.internal.o.d(str);
        if (r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[update] mediaId is blank, skip");
            return false;
        }
        android.content.ContentValues convertTo = item.convertTo();
        convertTo.remove("rowid");
        boolean z17 = this.f461231d.p("MBThumbPlayerMediaInfoDbCache", convertTo, "mediaId = ?", new java.lang.String[]{str}) > 0;
        if (z17) {
            doNotify();
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[update] success. mediaId=" + str + " state=" + item.field_state);
        } else {
            com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[update] failed. mediaId=" + str + " item=" + item);
        }
        return z17;
    }

    public final ye3.n y0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (r26.n0.N(mediaId)) {
            com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[getByMediaId] mediaId is blank, return empty entity");
            return new ye3.n();
        }
        ye3.n nVar = new ye3.n();
        try {
            android.database.Cursor B = this.f461231d.B("SELECT *, rowid FROM MBThumbPlayerMediaInfoDbCache WHERE mediaId = ?", new java.lang.String[]{mediaId});
            jz5.f0 f0Var = null;
            if (B != null) {
                try {
                    if (B.moveToFirst()) {
                        nVar.convertFrom(B);
                        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[getByMediaId] found. mediaId=".concat(mediaId));
                    } else {
                        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[getByMediaId] not found. mediaId=".concat(mediaId));
                    }
                    vz5.b.a(B, null);
                    f0Var = jz5.f0.f302826a;
                } finally {
                }
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[getByMediaId] cursor is null. mediaId=".concat(mediaId));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[getByMediaId] query failed. mediaId=".concat(mediaId), e17);
        }
        return nVar;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean insert(ye3.n item) {
        kotlin.jvm.internal.o.g(item, "item");
        boolean insert = super.insert(item);
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[insert] mediaId=" + item.field_mediaId + " ret=" + insert);
        return insert;
    }
}
