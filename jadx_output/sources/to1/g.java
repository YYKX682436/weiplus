package to1;

/* loaded from: classes5.dex */
public final class g implements ro1.j {

    /* renamed from: a, reason: collision with root package name */
    public static final to1.g f420911a = new to1.g();

    @Override // ro1.j
    public boolean a(android.content.Context context, po1.d deviceInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        if (deviceInfo.f357296b != po1.g.f357310h) {
            return true;
        }
        oo1.j jVar = oo1.j.f347145a;
        if (deviceInfo.f357300f.length() == 0) {
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(deviceInfo.f357301g);
        java.util.List<android.content.UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        kotlin.jvm.internal.o.f(persistedUriPermissions, "getPersistedUriPermissions(...)");
        for (android.content.UriPermission uriPermission : persistedUriPermissions) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", "checkPermission, it.uri=" + uriPermission.getUri() + ", treeUri=" + parse + ", canRead=" + uriPermission.isReadPermission() + ", canWrite=" + uriPermission.isWritePermission());
            if (uriPermission.getUri().equals(parse) && uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                return true;
            }
        }
        return false;
    }

    @Override // ro1.j
    public ro1.g b() {
        return new to1.c();
    }

    public final boolean c(android.net.Uri uri) {
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
        java.util.List<android.content.UriPermission> persistedUriPermissions = contentResolver.getPersistedUriPermissions();
        kotlin.jvm.internal.o.f(persistedUriPermissions, "getPersistedUriPermissions(...)");
        for (android.content.UriPermission uriPermission : persistedUriPermissions) {
            if (uriPermission.getUri().equals(uri) && uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                return true;
            }
        }
        contentResolver.takePersistableUriPermission(uri, 3);
        java.util.List<android.content.UriPermission> persistedUriPermissions2 = contentResolver.getPersistedUriPermissions();
        kotlin.jvm.internal.o.f(persistedUriPermissions2, "getPersistedUriPermissions(...)");
        if (!persistedUriPermissions2.isEmpty()) {
            for (android.content.UriPermission uriPermission2 : persistedUriPermissions2) {
                if (uriPermission2.getUri().equals(uri) && uriPermission2.isReadPermission() && uriPermission2.isWritePermission()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final android.content.Intent d(po1.d device) {
        kotlin.jvm.internal.o.g(device, "device");
        if (device.f357296b != po1.g.f357310h) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            if (z65.c.a()) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "UUID=" + device.f357300f + " Description=" + device.b(), 1).show();
            }
            android.net.Uri buildDocumentUri = android.provider.DocumentsContract.buildDocumentUri("com.android.externalstorage.documents", device.f357300f + ':' + device.f357299e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIntentForSaf, initialUri = ");
            sb6.append(buildDocumentUri);
            com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", sb6.toString());
            intent.putExtra("android.provider.extra.INITIAL_URI", buildDocumentUri);
        }
        return intent;
    }

    public final jz5.l e(android.net.Uri uri) {
        kotlin.jvm.internal.o.g(uri, "uri");
        if (!kotlin.jvm.internal.o.b("com.android.externalstorage.documents", uri.getHost())) {
            return null;
        }
        java.lang.String treeDocumentId = android.provider.DocumentsContract.getTreeDocumentId(uri);
        kotlin.jvm.internal.o.d(treeDocumentId);
        int O = r26.n0.O(treeDocumentId, ':', 0, false, 6, null);
        if (O < 0) {
            return null;
        }
        java.lang.String substring = treeDocumentId.substring(0, O);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = treeDocumentId.substring(substring.length() + 1);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        return r26.n0.i0(substring2, '/', false, 2, null) ? new jz5.l(substring, substring2) : new jz5.l(substring, "/".concat(substring2));
    }

    public final boolean f(android.net.Uri uri, po1.d device) {
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(device, "device");
        com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskDevice", "Try save new device. device=" + device + ", uri=" + uri);
        if (!c(uri)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SAFUDiskDevice", "Check permission not pass for uri(%s)", uri.toString());
            return false;
        }
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.o.f(uri2, "toString(...)");
        device.f357301g = uri2;
        return ro1.v.f398014a.h(device, new to1.d(uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fo1.n g(android.net.Uri r11, po1.d r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: to1.g.g(android.net.Uri, po1.d, java.lang.String):fo1.n");
    }
}
