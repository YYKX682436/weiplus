package z73;

/* loaded from: classes11.dex */
public abstract class h {
    public static void a(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mm.app.l0.b();
        if (arrayList.size() >= 1) {
            list.add(b("crash-patch-id-1", (java.lang.String) arrayList.get(0)));
        }
        if (arrayList.size() >= 2) {
            list.add(b("crash-patch-id-2", (java.lang.String) arrayList.get(1)));
        }
        if (arrayList.size() >= 3) {
            list.add(b("crash-patch-id-3", (java.lang.String) arrayList.get(2)));
        }
    }

    public static r45.e35 b(java.lang.String str, java.lang.String str2) {
        r45.e35 e35Var = new r45.e35();
        e35Var.f372968d = str;
        e35Var.f372969e = str2;
        return e35Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|4|(2:5|6)|7|8|9|(1:11)(1:32)|12|(1:14)(1:31)|15|(1:17)(1:30)|18|(3:22|(2:25|23)|26)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Tinker.NetSceneUtil", r3, "kernel not startup", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e A[Catch: all -> 0x0128, LOOP:0: B:23:0x0108->B:25:0x010e, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0128, blocks: (B:8:0x0034, B:12:0x0089, B:15:0x009a, B:18:0x00d9, B:20:0x00fc, B:22:0x0104, B:23:0x0108, B:25:0x010e), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedList c() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.h.c():java.util.LinkedList");
    }
}
