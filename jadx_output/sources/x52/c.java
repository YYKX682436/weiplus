package x52;

/* loaded from: classes15.dex */
public abstract class c {
    public static void a(r45.c45 c45Var) {
        r45.c45 c45Var2;
        r45.lw3 h17 = h();
        if (h17 == null) {
            h17 = new r45.lw3();
        }
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.a(c45Var);
        boolean isEmpty = h17.f379878f.isEmpty();
        java.util.LinkedList linkedList = h17.f379878f;
        if (!isEmpty && (c45Var2 = (r45.c45) linkedList.getLast()) != null && c45Var2.f371282s != 1) {
            java.lang.String b17 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(c45Var2.f371270d);
            java.lang.String b18 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.b(c45Var.f371270d);
            if (b17 != null && b17.equals(b18)) {
                c45Var2.f371282s = 1;
                c45Var2.f371276m = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "onSessionClose-addSession: %s", c45Var2.f371270d);
            }
        }
        linkedList.addLast(c45Var);
        h17.f379879g = linkedList.size() - 1;
        if (!com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.l(c45Var.f371270d)) {
            h17.f379884o = true;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "addSession: %s, %b", c45Var.f371270d, java.lang.Boolean.valueOf(h17.f379884o));
        k(h17);
    }

    public static void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "HellSessionDao, clearCurSession: %s", str);
        r45.lw3 h17 = h();
        if (h17 != null) {
            java.util.LinkedList linkedList = h17.f379878f;
            if (linkedList.isEmpty()) {
                return;
            }
            int size = linkedList.size();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "clearCurSession, length: %s, %d", str, java.lang.Integer.valueOf(size));
            for (int i17 = size - 1; i17 >= 0; i17--) {
                r45.c45 c45Var = (r45.c45) linkedList.get(i17);
                if (c45Var != null) {
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "clearCurSession, length: %s", c45Var.f371270d);
                    if (str.equals(c45Var.f371270d)) {
                        linkedList.remove(i17);
                        h17.f379879g = linkedList.size() - 1;
                        k(h17);
                        return;
                    }
                }
            }
        }
    }

    public static r45.c45 c(r45.c45 c45Var, java.lang.String str, long j17) {
        r45.c45 c45Var2 = new r45.c45();
        c45Var2.f371270d = str;
        c45Var2.f371273g = c45Var.f371273g;
        c45Var2.f371278o = c45Var.f371278o;
        c45Var2.f371279p = false;
        c45Var2.f371282s = 0;
        c45Var2.f371274h = c45Var.f371274h;
        c45Var2.f371280q = c45Var.f371280q;
        c45Var2.f371277n = c45Var.f371277n;
        c45Var2.f371278o = c45Var.f371278o;
        c45Var2.f371271e = d();
        c45Var2.f371275i = j17;
        c45Var2.f371281r = c45Var.f371281r;
        return c45Var2;
    }

    public static long d() {
        r45.lw3 h17 = h();
        if (h17 == null) {
            h17 = new r45.lw3();
        }
        long j17 = h17.f379883n;
        h17.f379883n = 1 + j17;
        k(h17);
        return j17;
    }

    public static r45.c45 e() {
        r45.lw3 h17 = h();
        if (h17 != null && g(h17)) {
            return (r45.c45) h17.f379878f.get(h17.f379879g);
        }
        return null;
    }

    public static r45.c45 f(java.lang.String str) {
        r45.lw3 h17;
        int i17;
        if (str != null && (h17 = h()) != null) {
            java.util.LinkedList linkedList = h17.f379878f;
            if (!linkedList.isEmpty()) {
                for (int size = linkedList.size() - 1; size >= 0; size--) {
                    r45.c45 c45Var = (r45.c45) linkedList.get(size);
                    if (c45Var != null && str.equals(c45Var.f371270d) && size - 1 >= 0) {
                        return (r45.c45) linkedList.get(i17);
                    }
                }
            }
        }
        return null;
    }

    public static boolean g(r45.lw3 lw3Var) {
        int i17;
        return lw3Var != null && (i17 = lw3Var.f379879g) >= 0 && i17 < lw3Var.f379878f.size();
    }

    public static r45.lw3 h() {
        byte[] a17 = c52.c.a("mmkv_key_hell_sessions");
        if (a17 != null && a17.length > 0) {
            r45.lw3 lw3Var = new r45.lw3();
            try {
                lw3Var.parseFrom(a17);
                return lw3Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionDao", e17, "HellSessionDao._read", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static void i(r45.lw3 lw3Var) {
        if (lw3Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "HellSessionDao, setHellSession");
        k(lw3Var);
    }

    public static void j(r45.c45 c45Var) {
        r45.lw3 h17 = h();
        if (h17 != null && g(h17)) {
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.a(c45Var);
            h17.f379878f.set(h17.f379879g, c45Var);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionDao", "updateCurSession, newSession: %s, %s, %d", c45Var.f371270d, c45Var.f371273g, java.lang.Integer.valueOf(c45Var.f371274h));
            if (!com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.l(c45Var.f371270d)) {
                h17.f379884o = true;
            }
            k(h17);
        }
    }

    public static void k(r45.lw3 lw3Var) {
        if (lw3Var == null) {
            return;
        }
        try {
            c52.c.d("mmkv_key_hell_sessions", lw3Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionDao", e17, "HellSessionDao._writeBack: %s", e17.getMessage());
        }
    }
}
