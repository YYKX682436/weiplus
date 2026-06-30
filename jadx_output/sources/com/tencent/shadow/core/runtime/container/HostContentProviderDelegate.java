package com.tencent.shadow.core.runtime.container;

/* loaded from: classes16.dex */
public interface HostContentProviderDelegate {
    int bulkInsert(android.net.Uri uri, android.content.ContentValues[] contentValuesArr);

    android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr);

    java.lang.String getType(android.net.Uri uri);

    android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues);

    void onConfigurationChanged(android.content.res.Configuration configuration);

    boolean onCreate();

    void onLowMemory();

    void onTrimMemory(int i17);

    android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str);

    android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal);

    android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2);

    int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr);
}
