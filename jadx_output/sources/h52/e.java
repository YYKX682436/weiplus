package h52;

/* loaded from: classes15.dex */
public abstract class e {
    public static r45.x35 a() {
        byte[] a17 = c52.c.a("mmkv_key_page_se_dao");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x35 x35Var = new r45.x35();
        try {
            x35Var.parseFrom(a17);
            return x35Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.PageStateDao", e17, "PageStateDao _doRead parse", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String b(int i17) {
        java.lang.String str;
        r45.x35 a17 = a();
        if (a17 == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.util.Iterator it = a17.f389754d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            r45.p44 p44Var = (r45.p44) it.next();
            if (p44Var != null && valueOf.equals(p44Var.f382747d)) {
                str = p44Var.f382748e;
                break;
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String[] split = str.split("\\|");
        if (split.length != 3) {
            return null;
        }
        return split[0];
    }

    public static nm5.c c(int i17) {
        java.lang.String str;
        r45.x35 a17 = a();
        if (a17 == null) {
            return null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.util.Iterator it = a17.f389754d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            r45.p44 p44Var = (r45.p44) it.next();
            if (p44Var != null && valueOf.equals(p44Var.f382747d)) {
                str = p44Var.f382748e;
                break;
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String[] split = str.split("\\|");
        if (split.length != 3) {
            return null;
        }
        return nm5.j.d(split[0], java.lang.Boolean.valueOf(split[1]), split[2]);
    }

    public static void d(java.lang.String str, java.lang.String str2, int i17) {
        java.util.LinkedList linkedList;
        androidx.fragment.app.Fragment e17;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.lang.String canonicalName = (android.text.TextUtils.isEmpty(str2) && b52.b.k(str) && (e17 = i52.l.e(str)) != null) ? e17.getClass().getCanonicalName() : null;
        if (canonicalName == null) {
            canonicalName = "NULL";
        }
        java.lang.String str3 = str + "|" + (!canonicalName.equals("NULL")) + "|" + canonicalName;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
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
            if (p44Var != null && valueOf.equals(p44Var.f382747d)) {
                linkedList.remove(p44Var);
                break;
            }
        }
        r45.p44 p44Var2 = new r45.p44();
        p44Var2.f382747d = valueOf;
        p44Var2.f382748e = str3;
        linkedList.add(p44Var2);
        try {
            c52.c.d("mmkv_key_page_se_dao", a17.toByteArray());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.PageStateDao", e18, "PageStateDao writeBack", new java.lang.Object[0]);
        }
    }
}
