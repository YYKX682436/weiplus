package x52;

/* loaded from: classes15.dex */
public abstract class i {
    public static r45.f16 a(java.lang.String str) {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return null;
        }
        byte[] a17 = c52.c.a(str + h17);
        if (a17 != null && a17.length > 0) {
            r45.f16 f16Var = new r45.f16();
            try {
                f16Var.parseFrom(a17);
                return f16Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SessionPageMatchingCache", e17, "SessionPageMatchingCache.read: %s", e17.getMessage());
            }
        }
        return null;
    }

    public static void b(r45.f16 f16Var, java.lang.String str) {
        int h17;
        if (f16Var == null || (h17 = b52.b.h()) == 0) {
            return;
        }
        try {
            c52.c.d(str + h17, f16Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SessionPageMatchingCache", e17, "SessionPageMatchingCache.write: %s", e17.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0.equals(((r45.e16) r4.get(0)).f372911f) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(r45.jw3 r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x52.i.c(r45.jw3):void");
    }

    public static void d(r45.a07 a07Var, java.lang.String str, r45.f16 f16Var, boolean z17) {
        r45.jw3 jw3Var;
        java.lang.String g17;
        if (f16Var != null) {
            java.util.LinkedList linkedList = f16Var.f373930d;
            if (linkedList.isEmpty()) {
                return;
            }
            java.lang.String g18 = b52.b.g(str);
            java.util.Iterator it = linkedList.iterator();
            boolean z18 = false;
            while (it.hasNext()) {
                r45.e16 e16Var = (r45.e16) it.next();
                if (e16Var != null) {
                    java.util.LinkedList linkedList2 = e16Var.f372914i;
                    if (!linkedList2.isEmpty() && (jw3Var = (r45.jw3) linkedList2.getLast()) != null && (g17 = b52.b.g(jw3Var.f378159d)) != null && g17.equals(g18)) {
                        jw3Var.f378166n.add(a07Var);
                        z18 = true;
                    }
                }
            }
            if (z18) {
                if (z17) {
                    b(f16Var, "mmkv_key_hellSPMatchinghe_");
                } else {
                    b(f16Var, "mmkv_key_hellSPMatchSuche_");
                }
            }
        }
    }

    public static void e() {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return;
        }
        try {
            c52.c.d("mmkv_key_hellSPMatchinghe_" + h17, new byte[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SessionPageMatchingCache", e17, "SessionPageMatchingCache.reset: %s", e17.getMessage());
        }
    }
}
