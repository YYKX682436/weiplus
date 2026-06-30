package org.chromium.base;

/* loaded from: classes12.dex */
public abstract class ContentUriUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "ContentUriUtils";
    private static org.chromium.base.ContentUriUtils.FileProviderUtil sFileProviderUtil;
    private static final java.lang.Object sLock = new java.lang.Object();

    /* loaded from: classes12.dex */
    public interface FileProviderUtil {
        android.net.Uri getContentUriFromFile(java.io.File file);
    }

    private ContentUriUtils() {
    }

    public static boolean contentUriExists(java.lang.String str) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(str);
        boolean z17 = assetFileDescriptor != null;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
        return z17;
    }

    public static boolean delete(java.lang.String str) {
        return org.chromium.base.ContextUtils.getApplicationContext().getContentResolver().delete(android.net.Uri.parse(str), null, null) > 0;
    }

    private static android.content.res.AssetFileDescriptor getAssetFileDescriptor(java.lang.String str) {
        android.content.ContentResolver contentResolver = org.chromium.base.ContextUtils.getApplicationContext().getContentResolver();
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            if (isVirtualDocument(parse)) {
                java.lang.String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (java.io.IOException unused) {
                    }
                    throw new java.lang.SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new android.content.res.AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (java.lang.Exception e17) {
            org.chromium.base.Log.w(TAG, "Cannot open content uri: %s", str, e17);
        }
        return null;
    }

    public static android.net.Uri getContentUriFromFile(java.io.File file) {
        synchronized (sLock) {
            org.chromium.base.ContentUriUtils.FileProviderUtil fileProviderUtil = sFileProviderUtil;
            if (fileProviderUtil == null) {
                return null;
            }
            return fileProviderUtil.getContentUriFromFile(file);
        }
    }

    public static java.lang.String getContentUriFromFilePath(java.lang.String str) {
        try {
            android.net.Uri contentUriFromFile = getContentUriFromFile(new java.io.File(str));
            if (contentUriFromFile != null) {
                return contentUriFromFile.toString();
            }
            return null;
        } catch (java.lang.IllegalArgumentException e17) {
            org.chromium.base.Log.e(TAG, "Cannot retrieve content uri from file: %s", str, e17);
            return null;
        }
    }

    public static java.lang.String getDisplayName(android.net.Uri uri, android.content.Context context, java.lang.String str) {
        java.lang.String[] streamTypes;
        java.lang.String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.database.Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex(str);
                        if (columnIndex == -1) {
                            query.close();
                            return "";
                        }
                        java.lang.String string = query.getString(columnIndex);
                        if (hasVirtualFlag(query) && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                            string = string + "." + extensionFromMimeType;
                        }
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return "";
    }

    public static java.lang.String getMimeType(java.lang.String str) {
        android.content.ContentResolver contentResolver = org.chromium.base.ContextUtils.getApplicationContext().getContentResolver();
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!isVirtualDocument(parse)) {
            return contentResolver.getType(parse);
        }
        java.lang.String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    private static boolean hasVirtualFlag(android.database.Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("flags");
        return columnIndex > -1 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    public static boolean isContentUri(java.lang.String str) {
        android.net.Uri parse;
        return (str == null || (parse = android.net.Uri.parse(str)) == null || !"content".equals(parse.getScheme())) ? false : true;
    }

    private static boolean isVirtualDocument(android.net.Uri uri) {
        if (uri == null || !android.provider.DocumentsContract.isDocumentUri(org.chromium.base.ContextUtils.getApplicationContext(), uri)) {
            return false;
        }
        try {
            android.database.Cursor query = org.chromium.base.ContextUtils.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        boolean hasVirtualFlag = hasVirtualFlag(query);
                        query.close();
                        return hasVirtualFlag;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return false;
    }

    public static java.lang.String maybeGetDisplayName(java.lang.String str) {
        try {
            java.lang.String displayName = getDisplayName(android.net.Uri.parse(str), org.chromium.base.ContextUtils.getApplicationContext(), "_display_name");
            if (android.text.TextUtils.isEmpty(displayName)) {
                return null;
            }
            return displayName;
        } catch (java.lang.Exception e17) {
            org.chromium.base.Log.w(TAG, "Cannot open content uri: %s", str, e17);
            return null;
        }
    }

    public static int openContentUriForRead(java.lang.String str) {
        android.content.res.AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(str);
        if (assetFileDescriptor != null) {
            return assetFileDescriptor.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static void setFileProviderUtil(org.chromium.base.ContentUriUtils.FileProviderUtil fileProviderUtil) {
        synchronized (sLock) {
            sFileProviderUtil = fileProviderUtil;
        }
    }
}
