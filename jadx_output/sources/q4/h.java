package q4;

/* loaded from: classes13.dex */
public class h implements p4.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.sqlite.SQLiteProgram f360020d;

    public h(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        this.f360020d = sQLiteProgram;
    }

    @Override // p4.g
    public void bindBlob(int i17, byte[] bArr) {
        this.f360020d.bindBlob(i17, bArr);
    }

    @Override // p4.g
    public void bindDouble(int i17, double d17) {
        this.f360020d.bindDouble(i17, d17);
    }

    @Override // p4.g
    public void bindLong(int i17, long j17) {
        this.f360020d.bindLong(i17, j17);
    }

    @Override // p4.g
    public void bindNull(int i17) {
        this.f360020d.bindNull(i17);
    }

    @Override // p4.g
    public void bindString(int i17, java.lang.String str) {
        this.f360020d.bindString(i17, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f360020d.close();
    }
}
