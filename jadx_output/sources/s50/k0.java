package s50;

@j95.b
/* loaded from: classes5.dex */
public final class k0 extends jm0.o implements u50.w {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f403070m;

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(v13.e.class);
    }

    public boolean Zi() {
        boolean l17 = j62.e.g().l("clicfg_android_use_search_global_sug_stick_bottom", false, true, true);
        if (f403070m != l17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSSearchFeatureService", "enableSearchGlobalSugStickBottom: " + f403070m + " -> " + l17);
            f403070m = l17;
        }
        return f403070m;
    }

    public void aj(java.lang.String query, long j17) {
        kotlin.jvm.internal.o.g(query, "query");
        if (!jm0.g.class.isAssignableFrom(v13.e.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(v13.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        v13.e eVar = (v13.e) ((jm0.g) a17);
        com.tencent.mm.plugin.fts.t tVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137379d;
        if (tVar != null) {
            tVar.b(65536, new v13.c(query, j17, eVar));
        }
    }
}
