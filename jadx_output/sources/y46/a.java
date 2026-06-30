package y46;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f459395a;

    /* renamed from: b, reason: collision with root package name */
    public int f459396b = 1;

    public a(java.lang.Object obj) {
        this.f459395a = obj;
    }

    public static boolean a(y46.a[] aVarArr, java.lang.Object obj) {
        for (y46.a aVar : aVarArr) {
            if (aVar.f459395a == obj) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof y46.a)) {
            return false;
        }
        y46.a aVar = (y46.a) obj;
        java.lang.Object obj2 = this.f459395a;
        if (obj2.getClass() != aVar.f459395a.getClass() || this.f459396b != aVar.f459396b) {
            return false;
        }
        boolean z17 = obj2 instanceof java.lang.StringBuffer;
        java.lang.Object obj3 = aVar.f459395a;
        return z17 ? obj2.toString().equals(obj3.toString()) : obj2 instanceof java.lang.Number ? obj2.equals(obj3) : obj2 == obj3;
    }

    public int hashCode() {
        return this.f459395a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String obj = this.f459395a.toString();
        int i17 = this.f459396b;
        if (obj == null) {
            return null;
        }
        if (i17 <= 0) {
            return "";
        }
        int length = obj.length();
        if (i17 == 1 || length == 0) {
            return obj;
        }
        if (length == 1 && i17 <= 8192) {
            return u46.l.m(i17, obj.charAt(0));
        }
        int i18 = length * i17;
        if (length == 1) {
            char charAt = obj.charAt(0);
            char[] cArr = new char[i18];
            for (int i19 = i17 - 1; i19 >= 0; i19--) {
                cArr[i19] = charAt;
            }
            return new java.lang.String(cArr);
        }
        if (length != 2) {
            x46.a aVar = new x46.a(i18);
            for (int i27 = 0; i27 < i17; i27++) {
                aVar.c(obj);
            }
            return aVar.toString();
        }
        char charAt2 = obj.charAt(0);
        char charAt3 = obj.charAt(1);
        char[] cArr2 = new char[i18];
        for (int i28 = (i17 * 2) - 2; i28 >= 0; i28 = (i28 - 1) - 1) {
            cArr2[i28] = charAt2;
            cArr2[i28 + 1] = charAt3;
        }
        return new java.lang.String(cArr2);
    }
}
