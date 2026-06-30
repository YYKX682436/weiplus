package d95;

/* loaded from: classes12.dex */
public class u implements com.tencent.wcdb.core.Database.CorruptionNotification {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f227706a;

    public u(java.util.List list) {
        this.f227706a = list == null ? java.util.Collections.emptyList() : new java.util.ArrayList(list);
    }

    @Override // com.tencent.wcdb.core.Database.CorruptionNotification
    public void onCorrupted(com.tencent.wcdb.core.Database database) {
        jx3.f fVar = jx3.f.INSTANCE;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(database.getPath());
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
        fVar.d(22323, str2, 0, "wcdb2", 0, 0, android.os.Build.FINGERPRINT);
        database.removeFiles();
        for (android.util.Pair pair : this.f227706a) {
            database.createTable((java.lang.String) pair.first, (com.tencent.wcdb.orm.TableBinding) pair.second);
        }
    }
}
