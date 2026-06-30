package pr2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final pr2.a f357949a = new pr2.a();

    public final boolean a() {
        if (!gm0.j1.a()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("account not Ready!");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.w("Finder.EntrancePermission", sb6.toString());
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P0).getValue()).r()).intValue();
        if (intValue != 0) {
            com.tencent.mars.xlog.Log.i("Finder.EntrancePermission", "[hasFinderEntrancePermission] debugConfig=" + intValue);
            return intValue == 1;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderTimelineEntry", 100);
        boolean z18 = b17 != 0;
        com.tencent.mars.xlog.Log.i("Finder.EntrancePermission", "[hasFinderEntrancePermission] hasPermission=" + z18 + " serverConfig=" + b17 + " isSpam=" + (hz2.d.f286313a.b("entrance") == 2));
        return z18;
    }

    public final void b(long j17, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        long j18 = j17 & (-34359738369L);
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
        com.tencent.mars.xlog.Log.i(tag, "openFinderEntrance extstatus:" + j18);
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 57;
        p53Var.f382762e = 1;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }
}
