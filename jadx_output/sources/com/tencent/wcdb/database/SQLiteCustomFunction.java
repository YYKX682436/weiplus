package com.tencent.wcdb.database;

/* loaded from: classes12.dex */
public final class SQLiteCustomFunction {
    public final com.tencent.wcdb.database.SQLiteDatabase.CustomFunction callback;
    public final java.lang.String name;
    public final int numArgs;

    public SQLiteCustomFunction(java.lang.String str, int i17, com.tencent.wcdb.database.SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("name must not be null.");
        }
        this.name = str;
        this.numArgs = i17;
        this.callback = customFunction;
    }

    private void dispatchCallback(java.lang.String[] strArr) {
        this.callback.callback(strArr);
    }
}
