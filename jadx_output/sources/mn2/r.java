package mn2;

/* loaded from: classes11.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String[] strArr = mn2.s.f330107f;
        for (int i17 = 0; i17 < 4; i17++) {
            if (r26.i0.n(str, strArr[i17], false)) {
                return true;
            }
        }
        return false;
    }
}
