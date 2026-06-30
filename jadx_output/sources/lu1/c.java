package lu1;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f321321a = new java.util.ArrayList();

    public static void a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String str3;
        lu1.b bVar;
        lu1.b bVar2;
        if (str == null || str2 == null || i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadHelpper", "the params is wrongful");
            return;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(xt1.q.f456550c);
        if (!r6Var.J()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "mkdirs failed.File is exist = " + r6Var.m());
        }
        java.lang.String str4 = i18 == 2 ? ".jpeg" : ".mp4";
        if (r6Var.o().endsWith("/")) {
            str3 = r6Var.o() + b17 + str4;
        } else {
            str3 = r6Var.o() + "/" + b17 + str4;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "get file path from capture file name : %s == %s", b17, str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "before downloadVideoFromCDN fieldId:%s, aseKey:%s, dataLength:%d, type:%d, filePath:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "read file length = " + com.tencent.mm.vfs.w6.k(str3));
        int i19 = 0;
        if (com.tencent.mm.vfs.w6.j(str3) && com.tencent.mm.vfs.w6.k(str3) == i17) {
            while (i19 < ((java.util.ArrayList) f321321a).size()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) f321321a).get(i19);
                if (weakReference != null && (bVar2 = (lu1.b) weakReference.get()) != null) {
                    bVar2.I1(str, str3);
                }
                i19++;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "filePath:%s is't exist, so download from CDN", str3);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_CDNDownloadHelpper";
        mVar.f241787f = new lu1.a(str, str3);
        mVar.f241786e = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        mVar.field_mediaId = com.tencent.mm.modelcdntran.i2.b("cardgiftfile", java.lang.System.currentTimeMillis(), str, str);
        mVar.field_fullpath = str3;
        mVar.field_totalLen = i17;
        mVar.field_fileType = 10011;
        mVar.field_fileId = str;
        mVar.field_aesKey = str2;
        mVar.field_priority = 2;
        mVar.field_needStorage = true;
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "add download cdn task : %b, fileId : %s", java.lang.Boolean.valueOf(wi6), mVar.field_fileId);
        if (wi6) {
            return;
        }
        while (i19 < ((java.util.ArrayList) f321321a).size()) {
            java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) f321321a).get(i19);
            if (weakReference2 != null && (bVar = (lu1.b) weakReference2.get()) != null) {
                bVar.J(str);
            }
            i19++;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadHelpper", "can't download from cdn!!!");
    }

    public static void b(lu1.b bVar) {
        if (f321321a == null) {
            f321321a = new java.util.ArrayList();
        }
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadHelpper", "ICDNDownloadCallback is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "register:%d", java.lang.Integer.valueOf(bVar.hashCode()));
            f321321a.add(new java.lang.ref.WeakReference(bVar));
        }
    }

    public static void c(lu1.b bVar) {
        lu1.b bVar2;
        if (f321321a == null || bVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadHelpper", "unregister:%d", java.lang.Integer.valueOf(bVar.hashCode()));
        for (int i17 = 0; i17 < f321321a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f321321a.get(i17);
            if (weakReference != null && (bVar2 = (lu1.b) weakReference.get()) != null && bVar2.equals(bVar)) {
                f321321a.remove(weakReference);
                return;
            }
        }
    }
}
