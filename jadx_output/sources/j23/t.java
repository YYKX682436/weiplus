package j23;

/* loaded from: classes12.dex */
public final class t extends com.tencent.mm.plugin.fts.ui.a {
    @Override // t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        if (gVar == null || gVar.f423769l != 65536 || !gVar.f423772o) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 6L;
        kFContactSessionSearchLogStruct.f58544e = g23.j.f267931b;
        kFContactSessionSearchLogStruct.p(g23.j.f267933d);
        kFContactSessionSearchLogStruct.f58546g = g23.j.f267934e;
        kFContactSessionSearchLogStruct.f58547h = 3L;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
        return true;
    }

    @Override // t13.k
    public int getType() {
        return 12290;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g o(int i17, t13.i nativeItem) {
        e23.p0 p0Var;
        kotlin.jvm.internal.o.g(nativeItem, "nativeItem");
        int i18 = i17 - nativeItem.f414565a;
        if (nativeItem.f414566b) {
            i18--;
        }
        if (i18 >= nativeItem.f414570f.size() || i18 < 0) {
            p0Var = null;
        } else {
            p13.y yVar = (p13.y) nativeItem.f414570f.get(i18);
            p0Var = new e23.p0(i17);
            p0Var.f246925q = yVar;
            p0Var.f423764g = -2;
            p0Var.n(yVar.f351184b, yVar.f351185c);
        }
        if (p0Var != null) {
            p0Var.f423767j = i18 + 1;
            p0Var.f423762e = nativeItem.f414571g;
            if (i18 == nativeItem.f414570f.size() - 1) {
                p0Var.f423761d = false;
            }
        }
        return p0Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 handler, java.util.HashSet blockSet) {
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(blockSet, "blockSet");
        p13.u uVar = new p13.u();
        uVar.f351140b = 770;
        uVar.f351147i = Integer.MAX_VALUE;
        uVar.f351141c = this.f138007i;
        uVar.f351148j = blockSet;
        uVar.f351150l = r13.b.f368602d;
        uVar.f351151m = this;
        uVar.f351152n = handler;
        p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
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
            iVar.f414569e = -2;
            iVar.f414571g = ftsResult.f351159d;
            this.f138009n.add(iVar);
        }
    }
}
