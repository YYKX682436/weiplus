package d95;

/* loaded from: classes12.dex */
public class p extends com.tencent.wcdb.CursorWrapper {

    /* renamed from: d, reason: collision with root package name */
    public final int f227699d;

    /* renamed from: e, reason: collision with root package name */
    public final long f227700e;

    public p(com.tencent.wcdb.Cursor cursor, java.lang.String str) {
        super(cursor);
        if (cursor instanceof com.tencent.wcdb.database.SQLiteDirectCursor) {
            this.f227699d = 2;
        } else if (cursor instanceof com.tencent.wcdb.database.SQLiteCursor) {
            this.f227699d = 1;
        } else {
            this.f227699d = -1;
        }
        this.f227700e = java.lang.System.nanoTime();
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mCursor.close();
        long nanoTime = (java.lang.System.nanoTime() - this.f227700e) / 1000;
        int i17 = this.f227699d;
        int i18 = i17 == 1 ? 0 : i17 == 2 ? 3 : -1;
        if (i18 >= 0) {
            d95.f.f227673s.b(i18 + 1, i18 + 2, nanoTime);
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        try {
            return super.getBlob(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getCount() {
        if (this.f227699d == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Slow operation: ");
            java.lang.Throwable th6 = new java.lang.Throwable();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.c(th6));
            com.tencent.mars.xlog.Log.w("MicroMsg.MMDataBase", sb6.toString());
        }
        try {
            return this.mCursor.getCount();
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public double getDouble(int i17) {
        try {
            return super.getDouble(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public float getFloat(int i17) {
        try {
            return super.getFloat(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public int getInt(int i17) {
        try {
            return super.getInt(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public long getLong(int i17) {
        try {
            return super.getLong(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public short getShort(int i17) {
        try {
            return super.getShort(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return (short) 0;
        }
    }

    @Override // com.tencent.wcdb.CursorWrapper, com.tencent.wcdb.Cursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        try {
            return super.getString(i17);
        } catch (com.tencent.wcdb.CursorIndexOutOfBoundsException | java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
