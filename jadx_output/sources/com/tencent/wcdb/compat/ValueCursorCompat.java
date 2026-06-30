package com.tencent.wcdb.compat;

/* loaded from: classes12.dex */
public final class ValueCursorCompat {
    public static boolean isValueCursor(android.database.Cursor cursor) {
        return cursor instanceof com.tencent.wcdb.compat.ValueCursor;
    }
}
