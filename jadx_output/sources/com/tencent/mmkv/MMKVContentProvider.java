package com.tencent.mmkv;

/* loaded from: classes12.dex */
public class MMKVContentProvider extends android.content.ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static android.net.Uri f215171d;

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str.equals("mmkvFromAshmemID") && bundle != null) {
            try {
                com.tencent.mmkv.MMKV mmkvWithAshmemID = com.tencent.mmkv.MMKV.mmkvWithAshmemID(getContext(), str2, bundle.getInt("KEY_SIZE"), bundle.getInt("KEY_MODE"), bundle.getString("KEY_CRYPT"));
                com.tencent.mmkv.ParcelableMMKV parcelableMMKV = new com.tencent.mmkv.ParcelableMMKV(mmkvWithAshmemID);
                mmkvWithAshmemID.ashmemFD();
                mmkvWithAshmemID.ashmemMetaFD();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelable("KEY", parcelableMMKV);
                return bundle2;
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return getContext() != null;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Not implement in MMKV");
    }
}
