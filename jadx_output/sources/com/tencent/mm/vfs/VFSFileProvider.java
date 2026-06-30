package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class VFSFileProvider extends android.content.ContentProvider {
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private java.lang.String mAuthority;
    private static final java.lang.String[] COLUMNS = {"_display_name", "_size"};
    private static final java.util.regex.Pattern PATH_SEPARATE = java.util.regex.Pattern.compile("/");

    public static com.tencent.mm.vfs.z7 a(android.net.Uri uri) {
        java.lang.String str;
        java.lang.String substring;
        java.lang.String str2;
        java.lang.String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return null;
        }
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        java.lang.String[] split = PATH_SEPARATE.split(path, 3);
        if (split.length < 2) {
            return null;
        }
        java.lang.String str3 = split[0];
        if (!str3.startsWith("@")) {
            str = "wcf";
            substring = path.substring(str3.length() + 1);
            str2 = str3;
        } else {
            if (split.length < 3) {
                return null;
            }
            str = str3.substring(1);
            str2 = split[1].equals("@") ? null : split[1];
            substring = split[2];
        }
        return new com.tencent.mm.vfs.z7(str, str2, substring, null, null);
    }

    public static android.net.Uri getUriForFile(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, java.lang.String str2) {
        return getUriForFile(str, r6Var).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }

    public static android.net.Uri vfsUriToContentUri(com.tencent.mm.vfs.z7 z7Var, java.lang.String str) {
        java.lang.String sb6;
        java.lang.String str2 = z7Var.f213277d;
        if (str2 == null || str2.isEmpty() || str2.equals("file")) {
            return null;
        }
        boolean equals = str2.equals("wcf");
        java.lang.String str3 = z7Var.f213279f;
        java.lang.String str4 = z7Var.f213278e;
        if (equals) {
            sb6 = str4 + str3;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("@");
            sb7.append(str2);
            sb7.append('/');
            if (str4 == null || str4.isEmpty()) {
                str4 = "@";
            }
            sb7.append(str4);
            sb7.append(str3);
            sb6 = sb7.toString();
        }
        return new android.net.Uri.Builder().scheme("content").authority(str).path(sb6).build();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new java.lang.SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new java.lang.SecurityException("Provider must grant uri permissions");
        }
        this.mAuthority = providerInfo.authority;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("No mapping found for " + uri);
        }
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return (m17.a() && m17.f213266a.d(m17.f213267b)) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        android.content.Context context;
        com.tencent.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("No mapping found for " + uri);
        }
        java.lang.String str = a17.f213277d;
        if (str != null && str.equals("content") && (context = getContext()) != null) {
            return context.getContentResolver().getType(a17.h());
        }
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        int lastIndexOf2 = (lastIndexOf < 0 ? str3 : str3.substring(lastIndexOf + 1)).lastIndexOf(46);
        if (lastIndexOf2 < 0) {
            return "application/octet-stream";
        }
        int lastIndexOf3 = str3.lastIndexOf("/");
        if (lastIndexOf3 >= 0) {
            str3 = str3.substring(lastIndexOf3 + 1);
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str3.substring(lastIndexOf2 + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.io.FileNotFoundException("File not found: " + uri);
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.x(m17.f213267b, str);
        }
        throw new java.io.FileNotFoundException("File not found: " + uri);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17;
        com.tencent.mm.vfs.x1 m17;
        java.lang.String str3;
        com.tencent.mm.vfs.z7 a17 = a(uri);
        if (a17 == null) {
            throw new java.lang.IllegalArgumentException("No mapping found for " + uri);
        }
        java.lang.String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        if (strArr == null) {
            strArr = COLUMNS;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        java.lang.Object[] objArr = new java.lang.Object[strArr.length];
        com.tencent.mm.vfs.z2 z2Var = null;
        int i18 = 0;
        for (java.lang.String str5 : strArr) {
            if ("_display_name".equals(str5)) {
                strArr3[i18] = "_display_name";
                i17 = i18 + 1;
                if (queryParameter == null) {
                    str3 = a17.f213279f;
                    int lastIndexOf = str3.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str3 = str3.substring(lastIndexOf + 1);
                    }
                } else {
                    str3 = queryParameter;
                }
                objArr[i18] = str3;
            } else if ("_size".equals(str5)) {
                strArr3[i18] = "_size";
                i17 = i18 + 1;
                z2Var = com.tencent.mm.vfs.a3.f212781a.m(a17, z2Var);
                long j17 = 0;
                if (z2Var.a() && (m17 = z2Var.f213266a.m(z2Var.f213267b)) != null) {
                    j17 = m17.f213233c;
                }
                objArr[i18] = java.lang.Long.valueOf(j17);
            }
            i18 = i17;
        }
        java.lang.String[] strArr4 = (java.lang.String[]) java.util.Arrays.copyOf(strArr3, i18);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i18);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr4, 1);
        matrixCursor.addRow(copyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    public static android.net.Uri getUriForFile(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.z7 z7Var = r6Var.f213166d;
        com.tencent.mm.vfs.z7 d17 = com.tencent.mm.vfs.a3.f212781a.d(z7Var);
        if (d17 != null) {
            android.net.Uri vfsUriToContentUri = vfsUriToContentUri(d17, str);
            if (vfsUriToContentUri != null) {
                return vfsUriToContentUri;
            }
            throw new java.lang.IllegalArgumentException("Cannot convert export URI to content URI: " + d17);
        }
        throw new java.lang.IllegalArgumentException("Cannot get URI for export: " + z7Var);
    }
}
