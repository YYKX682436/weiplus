package x51;

/* loaded from: classes12.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f452029a = new java.util.concurrent.ConcurrentHashMap();

    public static final x51.k0 a(int i17, java.lang.String str, java.util.HashMap hashMap, boolean z17, boolean z18) {
        iz5.a.g(null, (com.tencent.mm.sdk.platformtools.t8.K0(str) || hashMap == null) ? false : true);
        int hashCode = str.hashCode();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f452029a;
        x51.k0 k0Var = (x51.k0) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        if (k0Var == null) {
            x51.k0 k0Var2 = new x51.k0(str, z17);
            if (z17) {
                if (!k0Var2.R("", str, "", gm0.j1.b().h(), wo.w0.g(true), hashMap, z18)) {
                    throw new c01.c(1);
                }
            } else if (!k0Var2.S(str, hashMap, true, false)) {
                throw new c01.c(1);
            }
            concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), k0Var2);
            k0Var = k0Var2;
        } else {
            iz5.a.g(null, z17 == k0Var.f452022i);
            long b17 = k0Var.b();
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                for (java.lang.String str2 : ((d95.c0) it.next()).a()) {
                    try {
                        k0Var.A(null, str2);
                    } catch (java.lang.Exception e17) {
                        iz5.a.g("CreateTable failed:[" + str2 + "][" + e17.getMessage() + "]", false);
                    }
                }
            }
            k0Var.w(java.lang.Long.valueOf(b17));
        }
        k0Var.f452024k.put(i17, true);
        return k0Var;
    }
}
