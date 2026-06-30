package sx4;

/* loaded from: classes8.dex */
public class c0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("type");
        java.lang.String string = bundle.getString("url");
        long j17 = bundle.getLong("time", java.lang.System.currentTimeMillis());
        switch (i17) {
            case 1:
                sx4.d0.i(string, j17);
                return;
            case 2:
                java.util.HashMap hashMap = sx4.d0.f413581t;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    return;
                }
                if (!sx4.d0.d()) {
                    sx4.d0.k(2, string, j17);
                    return;
                } else {
                    if (sx4.d0.c(string) != null) {
                        sx4.d0.c(string).f413584c = j17;
                        return;
                    }
                    return;
                }
            case 3:
                java.util.HashMap hashMap2 = sx4.d0.f413581t;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    return;
                }
                if (!sx4.d0.d()) {
                    sx4.d0.k(3, string, j17);
                    return;
                } else {
                    if (sx4.d0.c(string) != null) {
                        sx4.d0.c(string).f413585d = j17;
                        return;
                    }
                    return;
                }
            case 4:
                java.util.HashMap hashMap3 = sx4.d0.f413581t;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    return;
                }
                if (!sx4.d0.d()) {
                    sx4.d0.k(4, string, j17);
                    return;
                } else {
                    if (sx4.d0.c(string) != null) {
                        sx4.d0.c(string).f413586e = j17;
                        return;
                    }
                    return;
                }
            case 5:
                sx4.d0.h(string, j17);
                return;
            case 6:
                sx4.d0.g(string, j17);
                return;
            case 7:
                sx4.d0.m(string, j17);
                return;
            case 8:
                sx4.d0.l(string, j17);
                return;
            case 9:
                sx4.d0.j(string, j17);
                return;
            case 10:
                sx4.d0.e(string, j17);
                return;
            case 11:
                sx4.d0.f(string, j17);
                return;
            default:
                return;
        }
    }
}
