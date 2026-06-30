package j23;

/* loaded from: classes12.dex */
public final class b extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public long f297269p;

    @Override // t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        if (gVar == null || !gVar.f423772o) {
            return false;
        }
        java.lang.String str = this.f138007i;
        kotlin.jvm.internal.o.f(str, "getQuery(...)");
        long j17 = this.f297269p;
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 6L;
        kFContactSessionSearchLogStruct.f58544e = 1L;
        kFContactSessionSearchLogStruct.p(str);
        kFContactSessionSearchLogStruct.f58546g = j17;
        kFContactSessionSearchLogStruct.f58547h = 1L;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
        return true;
    }

    @Override // t13.k
    public int getType() {
        return 12289;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        u13.g gVar;
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        int i18 = (i17 - nativeItem.f414565a) - 1;
        if (i18 >= nativeItem.f414570f.size() || i18 < 0) {
            gVar = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f414570f.get(i18);
            kotlin.jvm.internal.o.d(yVar);
            gVar = p(131090, i17, yVar, nativeItem);
            gVar.n(yVar.f351184b, yVar.f351185c);
        }
        if (gVar != null) {
            gVar.f423767j = i18 + 1;
            if (i18 == nativeItem.f414570f.size() - 1) {
                gVar.f423761d = false;
            }
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y matchInfo, t13.i nativeItem) {
        kotlin.jvm.internal.o.g(matchInfo, "matchInfo");
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        e23.u1 u1Var = new e23.u1(19, i18);
        u1Var.f246839q = matchInfo;
        u1Var.f423762e = nativeItem.f414571g;
        u1Var.n(matchInfo.f351184b, matchInfo.f351185c);
        return u1Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 handler, java.util.HashSet blockSet) {
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(blockSet, "blockSet");
        p13.u uVar = new p13.u();
        uVar.f351140b = 771;
        uVar.f351147i = Integer.MAX_VALUE;
        java.lang.String str = this.f138007i;
        uVar.f351141c = str;
        uVar.f351148j = blockSet;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351151m = this;
        uVar.f351152n = handler;
        kotlin.jvm.internal.o.f(str, "getQuery(...)");
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 4L;
        kFContactSessionSearchLogStruct.f58544e = 1L;
        kFContactSessionSearchLogStruct.p(str);
        kFContactSessionSearchLogStruct.f58546g = 0L;
        kFContactSessionSearchLogStruct.f58547h = 0L;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
        p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(14, uVar);
        kotlin.jvm.internal.o.f(sj6, "search(...)");
        return sj6;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public void s(p13.v ftsResult, java.util.HashSet blockSet) {
        kotlin.jvm.internal.o.g(ftsResult, "ftsResult");
        kotlin.jvm.internal.o.g(blockSet, "blockSet");
        if (k(ftsResult.f351160e)) {
            t13.i iVar = new t13.i();
            iVar.f414570f = ftsResult.f351160e;
            iVar.f414569e = -26;
            iVar.f414571g = ftsResult.f351159d;
            this.f138009n.add(iVar);
        }
        this.f297269p = ftsResult.f351160e.size();
        java.lang.String str = this.f138007i;
        kotlin.jvm.internal.o.f(str, "getQuery(...)");
        long j17 = this.f297269p;
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 5L;
        kFContactSessionSearchLogStruct.f58544e = 1L;
        kFContactSessionSearchLogStruct.p(str);
        kFContactSessionSearchLogStruct.f58546g = j17;
        kFContactSessionSearchLogStruct.f58547h = 0L;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
    }
}
