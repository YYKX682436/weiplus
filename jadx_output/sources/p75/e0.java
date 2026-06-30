package p75;

/* loaded from: classes12.dex */
public final class e0 implements p75.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteStatement f352634d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.wcdb.compat.SQLiteStatement f352635e;

    public e0(com.tencent.wcdb.database.SQLiteStatement sQLiteStatement, com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2) {
        this.f352634d = sQLiteStatement;
        this.f352635e = sQLiteStatement2;
    }

    public void a(java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.o.g(bindArgs, "bindArgs");
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f352634d;
        if (sQLiteStatement != null) {
            sQLiteStatement.bindAllArgs(bindArgs);
            return;
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = this.f352635e;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.bindAllArgs(bindArgs);
        }
    }

    public int b(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f352634d;
        if (sQLiteStatement != null) {
            return sQLiteStatement.executeUpdateDelete(cancellationSignal);
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = this.f352635e;
        if (sQLiteStatement2 != null) {
            return sQLiteStatement2.executeUpdateDelete();
        }
        return 0;
    }

    public void bindLong(int i17, long j17) {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f352634d;
        if (sQLiteStatement != null) {
            sQLiteStatement.bindLong(i17, j17);
            return;
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = this.f352635e;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.bindLong(i17, j17);
        }
    }

    public void bindString(int i17, java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f352634d;
        if (sQLiteStatement != null) {
            sQLiteStatement.bindString(i17, value);
            return;
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = this.f352635e;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.bindString(i17, value);
        }
    }

    public long c() {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f352634d;
        if (sQLiteStatement != null) {
            return sQLiteStatement.simpleQueryForLong();
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = this.f352635e;
        if (sQLiteStatement2 != null) {
            return sQLiteStatement2.simpleQueryForLong();
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = this.f352634d;
        if (sQLiteStatement != null) {
            sQLiteStatement.releaseReference();
            return;
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = this.f352635e;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.releaseReference();
        }
    }
}
