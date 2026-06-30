package q56;

/* loaded from: classes16.dex */
public abstract class m extends java.lang.RuntimeException {
    public static java.lang.Throwable a(java.lang.Throwable th6, java.lang.Object obj) {
        if (th6 == null) {
            th6 = new java.lang.NullPointerException();
        }
        int i17 = 0;
        java.lang.Throwable th7 = th6;
        int i18 = 0;
        while (true) {
            if (th7.getCause() == null) {
                break;
            }
            int i19 = i18 + 1;
            if (i18 >= 25) {
                th7 = new java.lang.RuntimeException("Stack too deep to get final cause");
                break;
            }
            th7 = th7.getCause();
            i18 = i19;
        }
        if ((th7 instanceof q56.l) && ((q56.l) th7).f360213d == obj) {
            return th6;
        }
        q56.l lVar = new q56.l(obj);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Throwable th8 = th6;
        while (true) {
            if (th8.getCause() != null) {
                int i27 = i17 + 1;
                if (i17 >= 25) {
                    break;
                }
                th8 = th8.getCause();
                if (!hashSet.contains(th8.getCause())) {
                    hashSet.add(th8.getCause());
                    i17 = i27;
                }
            }
            try {
                th8.initCause(lVar);
                break;
            } catch (java.lang.Throwable unused) {
            }
        }
        return th6;
    }
}
