package z85;

/* loaded from: classes4.dex */
public class w extends dm.x5 {

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f470826p = dm.x5.initAutoDBInfo(z85.w.class);

    public w(java.lang.String str, byte[] bArr) {
        this.field_reqType = str;
        this.field_cache = bArr;
    }

    @Override // dm.x5, l75.f0
    public l75.e0 getDBInfo() {
        return f470826p;
    }

    public w(android.database.Cursor cursor) {
        if (cursor == null) {
            return;
        }
        convertFrom(cursor);
    }
}
