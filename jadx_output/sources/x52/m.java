package x52;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final x52.l f452120a = new x52.l(null);

    public static final void a(java.lang.String str) {
        x52.l lVar = f452120a;
        if (str == null) {
            return;
        }
        r45.k16 a17 = lVar.a();
        if (a17 == null) {
            a17 = new r45.k16();
        }
        int size = a17.f378314d.size();
        java.util.LinkedList linkedList = a17.f378314d;
        if (size > 100) {
            linkedList.removeFirst();
            linkedList.addLast(str);
        } else {
            linkedList.addLast(str);
        }
        if (linkedList.isEmpty()) {
            return;
        }
        try {
            byte[] byteArray = a17.toByteArray();
            if (byteArray == null) {
                return;
            }
            c52.c.d("mmkv_sionId_table_hell", byteArray);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e17, "SessionTable, _write: %s", e17.getMessage());
        }
    }

    public static final java.lang.String b() {
        r45.k16 a17 = f452120a.a();
        if (a17 == null) {
            return null;
        }
        java.util.LinkedList linkedList = a17.f378314d;
        if (linkedList.isEmpty()) {
            return null;
        }
        return (java.lang.String) linkedList.getLast();
    }
}
