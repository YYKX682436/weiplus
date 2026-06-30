package z40;

/* loaded from: classes8.dex */
public interface e extends i95.m {
    static z40.e get() {
        return (z40.e) i95.n0.c(z40.e.class);
    }

    static boolean l4() {
        try {
            l85.g0 g0Var = (l85.g0) i95.n0.c(l85.g0.class);
            z40.e eVar = (z40.e) i95.n0.c(z40.e.class);
            if (g0Var != null && eVar != null) {
                return ((l85.d0) ((l85.g0) i95.n0.c(l85.g0.class))).wi();
            }
            com.tencent.mars.xlog.Log.e("Finder.BoxIFinderFlutterBizFeatureService", "enableFinder() config or featureService is null");
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.BoxIFinderFlutterBizFeatureService", "enableFinder() throw" + th6.toString());
            return false;
        }
    }
}
