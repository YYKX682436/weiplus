package com.tencent.wcdb.database;

/* loaded from: classes2.dex */
public class DatabaseObjectNotClosedException extends java.lang.RuntimeException {

    /* renamed from: s, reason: collision with root package name */
    private static final java.lang.String f215721s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(f215721s);
    }
}
