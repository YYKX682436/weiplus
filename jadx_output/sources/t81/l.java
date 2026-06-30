package t81;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final t81.l f416365a = new t81.l();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f416366b = jz5.h.b(t81.k.f416364d);

    public long a(java.lang.String str) {
        android.database.Cursor query;
        if (str == null || str.length() == 0) {
            return -1L;
        }
        try {
            android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
            if (contentResolver != null && (query = contentResolver.query((android.net.Uri) ((jz5.n) f416366b).getValue(), null, "username=?", new java.lang.String[]{str}, null)) != null) {
                try {
                    if (!query.isClosed() && query.moveToFirst()) {
                        t81.h hVar = new t81.h();
                        hVar.convertFrom(query);
                        long j17 = hVar.field_timestamp;
                        vz5.b.a(query, null);
                        return j17;
                    }
                    vz5.b.a(query, null);
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaSyncCmdPersistentContentResolver", "getInvalidContactTimestampForUsername(" + str + ") get exception:" + e17);
        }
        return -1L;
    }
}
