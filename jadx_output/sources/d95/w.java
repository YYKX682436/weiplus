package d95;

/* loaded from: classes12.dex */
public class w implements com.tencent.wcdb.core.Database.CorruptionNotification {
    public w(java.util.List list) {
    }

    @Override // com.tencent.wcdb.core.Database.CorruptionNotification
    public void onCorrupted(com.tencent.wcdb.core.Database database) {
        final java.lang.String path = database.getPath();
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(path);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NewDB", "RepairCorruptionHandler: DB corrupted, path: ".concat(path));
        jx3.f.INSTANCE.d(22323, str2, 0, "wcdb2Repair", 0, 0, android.os.Build.FINGERPRINT);
        database.blockade();
        database.close(new com.tencent.wcdb.core.Database.CloseCallBack() { // from class: d95.w$$a
            @Override // com.tencent.wcdb.core.Database.CloseCallBack
            public final void onClose() {
                java.lang.String str3 = path;
                d95.f.r(str3);
                if (str3.contains("EnMicroMsg.db")) {
                    d95.f.a();
                }
            }
        });
    }
}
