package qj1;

/* loaded from: classes4.dex */
public final class a extends l75.f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l75.e0 f363865d = l75.f0.initAutoDBInfo(qj1.a.class);

    @l75.m0(defValue = "$$invalid", primaryKey = 1)
    public java.lang.String field_key;
    public byte[] field_value;

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        this.field_key = cursor.getString(0);
        this.field_value = cursor.getBlob(1);
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues(2);
        contentValues.put("key", this.field_key);
        contentValues.put("value", this.field_value);
        return contentValues;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f363865d;
    }
}
