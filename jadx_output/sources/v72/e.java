package v72;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public long f433653a;

    /* renamed from: b, reason: collision with root package name */
    public int f433654b;

    /* renamed from: c, reason: collision with root package name */
    public long f433655c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433656d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bq0 f433657e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rq0 f433658f;

    public e(v72.i iVar, v72.b bVar) {
    }

    public void a(android.database.Cursor cursor) {
        this.f433653a = cursor.getLong(0);
        this.f433654b = cursor.getInt(1);
        this.f433655c = cursor.getLong(2);
        this.f433656d = cursor.getString(3);
        byte[] blob = cursor.getBlob(4);
        if (blob == null || blob.length == 0) {
            this.f433657e = new r45.bq0();
        } else {
            this.f433657e = (r45.bq0) new r45.bq0().parseFrom(blob);
        }
        byte[] blob2 = cursor.getBlob(5);
        if (blob2 == null || blob2.length == 0) {
            this.f433658f = null;
        } else {
            this.f433658f = (r45.rq0) new r45.rq0().parseFrom(blob2);
        }
    }
}
