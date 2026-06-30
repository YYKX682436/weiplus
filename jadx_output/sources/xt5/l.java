package xt5;

/* loaded from: classes15.dex */
public abstract class l {
    public static int a(android.content.Context context, java.lang.String str) {
        if (context == null) {
            zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: check self permission: context is null", new java.lang.Object[0]);
            return -1;
        }
        if (!zt5.l.b(str)) {
            return context.checkSelfPermission(str);
        }
        zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: requested permission is null or nil", new java.lang.Object[0]);
        return -1;
    }
}
