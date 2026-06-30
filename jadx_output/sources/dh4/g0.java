package dh4;

/* loaded from: classes5.dex */
public abstract class g0 {
    static {
        int i17 = dh4.a.f232502a;
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        com.tencent.mm.storage.z3 n17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true)) == null) {
            return null;
        }
        if (com.tencent.mm.storage.z3.R4(str)) {
            return com.tencent.mm.sdk.platformtools.t8.K0(n17.P0()) ? context.getString(com.tencent.mm.R.string.jot) : n17.f2();
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }
}
