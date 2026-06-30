package h52;

/* loaded from: classes11.dex */
public abstract class b {
    public static r45.x35 a() {
        byte[] a17 = c52.c.a("hell_ac_ble_mmkv_key");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x35 x35Var = new r45.x35();
        try {
            x35Var.parseFrom(a17);
            return x35Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.ActivityBundleDao", e17, "ActivityBundleDao _doRead parse", new java.lang.Object[0]);
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
            c52.c.d("hell_ac_ble_mmkv_key", a17.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.ActivityBundleDao", e17, "ActivityBundleDao writeBack", new java.lang.Object[0]);
        }
    }

    public static java.lang.String c(java.lang.String str) {
        r45.x35 a17 = a();
        if (a17 == null) {
            return null;
        }
        java.util.LinkedList linkedList = a17.f389754d;
        if (linkedList.isEmpty()) {
            return null;
        }
        java.util.Iterator it = linkedList.iterator();
        r45.p44 p44Var = null;
        while (it.hasNext()) {
            r45.p44 p44Var2 = (r45.p44) it.next();
            if (p44Var2 != null && str.equals(p44Var2.f382747d)) {
                p44Var = p44Var2;
            }
        }
        if (p44Var == null) {
            return null;
        }
        return p44Var.f382748e;
    }
}
