package v8;

/* loaded from: classes15.dex */
public abstract class u {
    public static boolean a(int i17, t9.p pVar, boolean z17) {
        if (pVar.f416542c - pVar.f416541b < 7) {
            if (z17) {
                return false;
            }
            throw new m8.x("too short header: " + (pVar.f416542c - pVar.f416541b));
        }
        if (pVar.m() != i17) {
            if (z17) {
                return false;
            }
            throw new m8.x("expected header type " + java.lang.Integer.toHexString(i17));
        }
        if (pVar.m() == 118 && pVar.m() == 111 && pVar.m() == 114 && pVar.m() == 98 && pVar.m() == 105 && pVar.m() == 115) {
            return true;
        }
        if (z17) {
            return false;
        }
        throw new m8.x("expected characters 'vorbis'");
    }
}
