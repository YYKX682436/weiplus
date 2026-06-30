package to1;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final to1.i f420915a = new to1.i();

    /* renamed from: b, reason: collision with root package name */
    public static final android.content.ContentResolver f420916b = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();

    public static long a(to1.i iVar, java.io.InputStream input, java.io.OutputStream out, ro1.d dVar, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            dVar = null;
        }
        if ((i18 & 8) != 0) {
            i17 = 8192;
        }
        iVar.getClass();
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(out, "out");
        return ro1.a.f397974a.a(input, out, dVar, i17);
    }

    public final to1.r b(android.net.Uri treeUri, java.lang.String str, boolean z17) {
        java.lang.String path = str;
        kotlin.jvm.internal.o.g(treeUri, "treeUri");
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String treeDocumentId = android.provider.DocumentsContract.getTreeDocumentId(treeUri);
        kotlin.jvm.internal.o.d(treeDocumentId);
        java.lang.String str2 = (java.lang.String) kz5.n0.i0(r26.n0.e0(treeDocumentId, new char[]{':'}, false, 0, 6, null));
        if (r26.i0.y(path, str2, false)) {
            path = path.substring(str2.length());
            kotlin.jvm.internal.o.f(path, "substring(...)");
        } else if (r26.i0.y(path, "/".concat(str2), false)) {
            path = path.substring(str2.length() + 1);
            kotlin.jvm.internal.o.f(path, "substring(...)");
        }
        java.lang.String str3 = path;
        to1.n nVar = to1.r.f420934d;
        android.net.Uri buildDocumentUriUsingTree = android.provider.DocumentsContract.buildDocumentUriUsingTree(treeUri, android.provider.DocumentsContract.getTreeDocumentId(treeUri));
        kotlin.jvm.internal.o.d(buildDocumentUriUsingTree);
        to1.r b17 = nVar.b(buildDocumentUriUsingTree);
        if ((str3.length() == 0) || kotlin.jvm.internal.o.b(str3, "/")) {
            return b17;
        }
        if (!z17) {
            if (b17 != null) {
                return b17.c(str3);
            }
            return null;
        }
        java.util.List e07 = r26.n0.e0(str3, new char[]{'/'}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : e07) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b17 = b17 != null ? b17.h((java.lang.String) it.next()) : null;
        }
        return b17;
    }

    public final java.io.InputStream c(android.net.Uri uri) {
        int i17 = 0;
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        while (true) {
            int i18 = i17 + 1;
            if (i17 >= 3 || (assetFileDescriptor = f420916b.openAssetFileDescriptor(uri, "rw", null)) != null) {
                break;
            }
            com.tencent.mars.xlog.Log.w("SAFUtils", "Fail to get file descriptor, tryCount=" + i18 + ", uri=" + uri);
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(200L);
            i17 = i18;
        }
        if (assetFileDescriptor == null) {
            return null;
        }
        try {
            return assetFileDescriptor.createInputStream();
        } catch (java.io.IOException unused) {
            throw new java.io.FileNotFoundException("Unable to create stream");
        }
    }

    public final java.io.OutputStream d(android.net.Uri uri) {
        int i17 = 0;
        while (true) {
            int i18 = i17 + 1;
            if (i17 >= 3) {
                com.tencent.mars.xlog.Log.e("SAFUtils", "All attempts are failed. uri=" + uri);
                return null;
            }
            java.io.OutputStream openOutputStream = f420916b.openOutputStream(uri, "wt");
            if (openOutputStream != null) {
                return openOutputStream;
            }
            com.tencent.mars.xlog.Log.w("SAFUtils", "Fail to open output stream, tryCount=" + i18 + ", uri=" + uri);
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(200L);
            i17 = i18;
        }
    }
}
