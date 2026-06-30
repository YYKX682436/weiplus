package qi3;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final qi3.m f363747a = new qi3.m();

    public static final boolean b(int i17) {
        return (i17 == 2 || i17 == 4 || i17 == 6 || i17 == 19 || i17 == 3 || i17 == 43 || i17 == 1090519089) ? false : true;
    }

    public static final boolean c(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        if (!f9Var.k2()) {
            return b(f9Var.getType());
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        java.lang.Integer valueOf = k17 != null ? java.lang.Integer.valueOf(k17.getInteger(k17.f368365d + 6)) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            return false;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            return false;
        }
        if (valueOf != null && valueOf.intValue() == 6) {
            return false;
        }
        return valueOf == null || valueOf.intValue() != 19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r7 = (et1.a) r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.qr a(qi3.n r10, int r11, yz5.l r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi3.m.a(qi3.n, int, yz5.l):r45.qr");
    }
}
