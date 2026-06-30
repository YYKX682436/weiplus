package v13;

/* loaded from: classes12.dex */
public final class c extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f432518n = "";

    /* renamed from: o, reason: collision with root package name */
    public long f432519o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432520p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f432521q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v13.e f432522r;

    public c(java.lang.String str, long j17, v13.e eVar) {
        this.f432520p = str;
        this.f432521q = j17;
        this.f432522r = eVar;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
        dm.i3 i3Var = new dm.i3();
        java.lang.String input = this.f432520p;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[,|，']");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        this.f432518n = replaceAll;
        i3Var.y0(replaceAll);
        i3Var.w0(this.f432521q);
        i3Var.z0(c01.id.c());
        this.f432519o = i3Var.replaceToDB(oVar.l(), false);
        final r45.cw5 cw5Var = new r45.cw5();
        cw5Var.f371870d = this.f432518n;
        cw5Var.f371871e = c01.id.c();
        cw5Var.f371873g = this.f432521q == 0;
        java.util.List list = com.tencent.mm.plugin.fts.ui.y2.f138380a;
        if (list != null) {
            try {
                list.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.plugin.fts.ui.y2$$a
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return ((r45.cw5) obj).f371870d.equals(r45.cw5.this.f371870d);
                    }
                });
                list.add(cw5Var);
                while (list.size() > 30) {
                    list.remove(0);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSSearchPrefixUserInfo", e17, "[fts] updateLatestSearchClickHistory failed.", new java.lang.Object[0]);
            }
        }
        oVar.d();
        this.f432522r.f432531f = dm.i3.f237554g.h(dm.i3.f237555h.h()).a().n(oVar.l());
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "processQuery:" + this.f432518n + " result:" + this.f432519o;
    }
}
