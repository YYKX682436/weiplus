package com.tencent.wcdb.compat;

/* loaded from: classes12.dex */
public final class DatabaseUtils {
    private DatabaseUtils() {
    }

    public static void bindCancellationSignal(com.tencent.wcdb.core.Handle handle, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            return;
        }
        final com.tencent.wcdb.core.Handle.CancellationSignal cancellationSignal2 = new com.tencent.wcdb.core.Handle.CancellationSignal();
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.wcdb.compat.DatabaseUtils.1
            @Override // android.os.CancellationSignal.OnCancelListener
            public void onCancel() {
                com.tencent.wcdb.core.Handle.CancellationSignal.this.cancel();
            }
        });
        if (cancellationSignal.isCanceled()) {
            cancellationSignal2.cancel();
        }
        handle.attachCancellationSignal(cancellationSignal2);
    }

    public static long longForQuery(com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr) {
        com.tencent.wcdb.compat.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            compileStatement.bindAllArgs(objArr);
            long simpleQueryForLong = compileStatement.simpleQueryForLong();
            compileStatement.close();
            return simpleQueryForLong;
        } catch (java.lang.Throwable th6) {
            if (compileStatement != null) {
                try {
                    compileStatement.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static java.lang.String stringForQuery(com.tencent.wcdb.compat.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr) {
        com.tencent.wcdb.compat.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            compileStatement.bindAllArgs(objArr);
            java.lang.String simpleQueryForString = compileStatement.simpleQueryForString();
            compileStatement.close();
            return simpleQueryForString;
        } catch (java.lang.Throwable th6) {
            if (compileStatement != null) {
                try {
                    compileStatement.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
