package yt5;

/* loaded from: classes15.dex */
public abstract class c {
    public c(java.lang.String str, int i17) {
    }

    public static yt5.c b(java.lang.String str, int i17) {
        if (wt5.a.l()) {
            return new yt5.b(str, i17);
        }
        zt5.h.b("Soter.KeyGenParameterSpecCompatBuilder", "soter: not support soter. return dummy", new java.lang.Object[0]);
        return new yt5.a(str, i17);
    }

    public abstract java.security.spec.AlgorithmParameterSpec a();

    public abstract yt5.c c(java.lang.String... strArr);

    public abstract yt5.c d(java.lang.String... strArr);

    public abstract yt5.c e(boolean z17);
}
