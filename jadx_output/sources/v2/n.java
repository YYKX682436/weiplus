package v2;

/* loaded from: classes15.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f432716a = new boolean[3];

    public static boolean a(v2.i iVar, int i17) {
        v2.h[] hVarArr = iVar.C;
        if (hVarArr[i17] != v2.h.MATCH_CONSTRAINT) {
            return false;
        }
        if (iVar.G != 0.0f) {
            v2.h hVar = hVarArr[i17 != 0 ? (char) 0 : (char) 1];
            return false;
        }
        if (i17 == 0) {
            if (iVar.f432657e != 0 || iVar.f432663h != 0 || iVar.f432665i != 0) {
                return false;
            }
        } else if (iVar.f432659f != 0 || iVar.f432667k != 0 || iVar.f432668l != 0) {
            return false;
        }
        return true;
    }

    public static void b(v2.i iVar, int i17, int i18) {
        int i19 = i17 * 2;
        int i27 = i19 + 1;
        v2.g[] gVarArr = iVar.A;
        v2.o oVar = gVarArr[i19].f432634a;
        oVar.f432720f = iVar.D.f432675s.f432634a;
        oVar.f432721g = i18;
        oVar.f432729b = 1;
        v2.o oVar2 = gVarArr[i27].f432634a;
        oVar2.f432720f = oVar;
        oVar2.f432721g = iVar.i(i17);
        iVar.A[i27].f432634a.f432729b = 1;
    }
}
