package kt5;

/* loaded from: classes13.dex */
public abstract class f {
    public static java.lang.Class a(android.content.Context context, java.lang.String str, java.lang.Object obj) {
        java.lang.Class<?> cls;
        try {
            try {
                cls = context != null ? context.getClassLoader().loadClass(str) : java.lang.Class.forName(str);
            } catch (java.lang.Throwable th6) {
                ot5.g.e(th6);
                cls = null;
            }
            if (cls == null && obj != null) {
                cls = obj.getClass().getClassLoader().loadClass(str);
            }
            if (cls == null) {
                return null;
            }
            return cls;
        } catch (java.lang.Throwable th7) {
            ot5.g.e(th7);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:20:0x0012, B:14:0x0005, B:17:0x000c), top: B:13:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(java.lang.Class r1, java.lang.String r2, java.lang.Object r3) {
        /*
            r0 = 0
            if (r1 != 0) goto L5
        L3:
            r1 = r0
            goto L16
        L5:
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lc
            goto L3
        Lc:
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r1 = move-exception
            ot5.g.e(r1)     // Catch: java.lang.Throwable -> L1e
            goto L3
        L16:
            if (r1 != 0) goto L19
            return r0
        L19:
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            ot5.g.e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kt5.f.b(java.lang.Class, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
