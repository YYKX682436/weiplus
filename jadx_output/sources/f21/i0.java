package f21;

/* loaded from: classes8.dex */
public class i0 {

    /* renamed from: l, reason: collision with root package name */
    public int f258924l = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f258913a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f258914b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f258915c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f258916d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f258917e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f258918f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f258919g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f258920h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f258921i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f258922j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f258923k = 0;

    public void a(android.database.Cursor cursor) {
        this.f258914b = cursor.getInt(2);
        this.f258915c = cursor.getString(3);
        this.f258916d = cursor.getInt(4);
        this.f258917e = cursor.getString(5);
        this.f258918f = cursor.getInt(6);
        this.f258920h = cursor.getString(8);
        this.f258921i = cursor.getString(9);
        this.f258919g = cursor.getInt(7);
        this.f258923k = cursor.getInt(11);
        this.f258913a = cursor.getInt(1);
        this.f258922j = cursor.getInt(10);
        cursor.getString(0);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f258924l & 2) != 0) {
            contentValues.put(dm.i4.COL_ID, java.lang.Integer.valueOf(this.f258913a));
        }
        if ((this.f258924l & 4) != 0) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f258914b));
        }
        if ((this.f258924l & 8) != 0) {
            java.lang.String str = this.f258915c;
            if (str == null) {
                str = "";
            }
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        }
        if ((this.f258924l & 16) != 0) {
            contentValues.put("size", java.lang.Integer.valueOf(this.f258916d));
        }
        if ((this.f258924l & 32) != 0) {
            java.lang.String str2 = this.f258917e;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("packname", str2);
        }
        if ((this.f258924l & 64) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f258918f));
        }
        if ((this.f258924l & 128) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f258919g));
        }
        if ((this.f258924l & 256) != 0) {
            java.lang.String str3 = this.f258920h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f258924l & 512) != 0) {
            java.lang.String str4 = this.f258921i;
            contentValues.put("reserved2", str4 != null ? str4 : "");
        }
        if ((this.f258924l & 1024) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f258922j));
        }
        if ((this.f258924l & 2048) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f258923k));
        }
        if ((this.f258924l & 1) != 0) {
            contentValues.put(dm.i4.COL_LOCALID, this.f258913a + "_" + this.f258919g);
        }
        return contentValues;
    }
}
