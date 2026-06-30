package fu5;

/* loaded from: classes15.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f266910a = new java.util.HashMap();

    public static boolean a(java.lang.Class cls, zt5.k kVar) {
        if (kVar.a()) {
            return false;
        }
        java.util.HashMap hashMap = f266910a;
        fu5.b bVar = (fu5.b) hashMap.get(cls);
        if (bVar == null) {
            bVar = new fu5.b(null);
            bVar.f266908b = kVar.f475605a;
            bVar.f266909c = kVar.f475606b;
            bVar.f266907a = 1;
            hashMap.put(cls, bVar);
        } else if (kVar.f475605a == bVar.f266908b && kVar.f475606b.equals(bVar.f266909c)) {
            int i17 = bVar.f266907a + 1;
            bVar.f266907a = i17;
            if (i17 >= 2) {
                return true;
            }
        } else {
            bVar.f266908b = kVar.f475605a;
            bVar.f266909c = kVar.f475606b;
            bVar.f266907a = 1;
        }
        zt5.h.a("Soter.RemoveASKStrategy", "error counter: %s", java.lang.Integer.valueOf(bVar.f266907a));
        return false;
    }
}
