package sr5;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            or5.b.a("Close %s", closeable);
            try {
                closeable.close();
            } catch (java.io.IOException e17) {
                or5.b.b("exception: %s", e17);
            }
        }
    }

    public static boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean c(java.lang.Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static java.lang.String[] d(java.lang.String[] strArr, tr5.f0 f0Var) {
        java.lang.String str = f0Var.f421489o;
        if (strArr.length <= 0 || str.equals(f0Var.f421476b) || str.split(",").length != 1) {
            return strArr;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArr) {
            arrayList.add(str + ":" + str2);
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static java.lang.String e(java.util.Collection collection) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        if (!(collection == null || collection.isEmpty())) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                sb6.append(next == null ? "null" : next.toString());
                sb6.append(", ");
            }
            sb6.setLength(sb6.length() - 2);
        }
        sb6.append(']');
        return sb6.toString();
    }

    public static java.lang.String f(java.lang.String[] strArr, java.lang.String str) {
        if (c(strArr) || android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArr) {
            sb6.append(str2);
            sb6.append(str);
        }
        if (sb6.length() > 0) {
            sb6.setLength(sb6.length() - 1);
        }
        return sb6.toString();
    }
}
