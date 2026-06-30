package i52;

/* loaded from: classes11.dex */
public abstract class e {
    public static r45.x35 a() {
        byte[] a17 = c52.c.a("hell_fgm_bun_mmkv_key");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x35 x35Var = new r45.x35();
        try {
            x35Var.parseFrom(a17);
            return x35Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FragmentBundleDao", e17, "FragmentBundleDao _doRead parse", new java.lang.Object[0]);
            return null;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList;
        r45.x35 a17 = a();
        if (a17 == null) {
            a17 = new r45.x35();
        }
        java.util.Iterator it = a17.f389754d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = a17.f389754d;
            if (!hasNext) {
                break;
            }
            r45.p44 p44Var = (r45.p44) it.next();
            if (p44Var != null && str.equals(p44Var.f382747d)) {
                linkedList.remove(p44Var);
                break;
            }
        }
        r45.p44 p44Var2 = new r45.p44();
        p44Var2.f382747d = str;
        p44Var2.f382748e = str2;
        linkedList.add(p44Var2);
        try {
            c52.c.d("hell_fgm_bun_mmkv_key", a17.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FragmentBundleDao", e17, "FragmentBundleDao writeBack", new java.lang.Object[0]);
        }
    }
}
