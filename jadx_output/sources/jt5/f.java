package jt5;

/* loaded from: classes13.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.File r3) {
        /*
            r0 = 0
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L30
            boolean r1 = kt5.c.f312051c     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto Lb
        L9:
            r3 = r0
            goto L2a
        Lb:
            java.lang.Object r1 = kt5.c.f312049a     // Catch: java.lang.Exception -> L30
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Method r2 = kt5.c.f312050b     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L30
            if (r3 != 0) goto L1a
            goto L9
        L1a:
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "st_mode"
            java.lang.Object r3 = kt5.f.b(r1, r2, r3)     // Catch: java.lang.Exception -> L30
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L30
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L30
        L2a:
            r3 = r3 & 2048(0x800, float:2.87E-42)
            if (r3 <= 0) goto L2f
            r0 = 1
        L2f:
            return r0
        L30:
            r3 = move-exception
            ot5.g.e(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jt5.f.a(java.io.File):boolean");
    }

    public static boolean b() {
        java.lang.String str = new java.lang.String(kt5.a.b("/proc/mounts"));
        ot5.g.c("RiskScanner", "SetuidBitChecker mounts : ".concat(str));
        java.lang.String[] split = str.split("\n");
        int length = split.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            java.lang.String str2 = split[i17];
            if (!str2.contains(" /system ")) {
                i17++;
            } else if (str2.contains(",nosuid")) {
                ot5.g.b("SetuidBitChecker : nosuid found");
                return true;
            }
        }
        return false;
    }
}
