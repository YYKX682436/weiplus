package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class x9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f210908d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.z9 f210909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210910f;

    public x9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI, android.net.Uri uri, com.tencent.mm.ui.tools.z9 z9Var) {
        this.f210910f = shareImgUI;
        this.f210908d = uri;
        this.f210909e = z9Var;
    }

    public final boolean a(android.net.Uri uri) {
        if (uri == null || !mm.k.f328520y1.h() || android.os.Build.VERSION.SDK_INT < 30 || com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion < 30) {
            return false;
        }
        if (uri.toString().startsWith(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI.toString())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "uri is Downloads file, should copy it for FLAG_GRANT_READ_URI_PERMISSION issue: " + uri);
            return true;
        }
        if (!uri.toString().startsWith(android.provider.MediaStore.Files.getContentUri("external").toString())) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "uri is Files file, should copy it for FLAG_GRANT_READ_URI_PERMISSION issue: " + uri);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
    
        if (r12 == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.x9.run():void");
    }
}
