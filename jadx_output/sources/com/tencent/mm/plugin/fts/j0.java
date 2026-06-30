package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class j0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137422n;

    public j0(com.tencent.mm.plugin.fts.d0 d0Var) {
        this.f137422n = d0Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InitSearchTask";
    }

    @Override // p13.c
    public boolean i() {
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FTS_MASTER_DB_VERISON_INT_SYNC;
        if (2 != ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
            com.tencent.mm.plugin.fts.o.f();
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, 2);
        }
        gm0.j1.i();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "IndexMicroMsg.db");
        if (r6Var.m()) {
            r6Var.l();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "not exist fts3DBFile %s", r6Var.o());
        }
        gm0.j1.i();
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg.db");
        if (r6Var2.m()) {
            r6Var2.l();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "not exist fts5DBUnEncrypt %s", r6Var2.o());
        }
        gm0.j1.i();
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "FTS5IndexMicroMsg_encrypt.db");
        gm0.j1.i();
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(gm0.j1.u().g());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("enFavorite.db");
        com.tencent.mm.vfs.r6 r6Var5 = new com.tencent.mm.vfs.r6(sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "ftsEncryptDB:%s mainEncryptDB:%s favEncryptDB:%s", com.tencent.mm.sdk.platformtools.t8.h0(r6Var3.C()), com.tencent.mm.sdk.platformtools.t8.h0(r6Var4.C()), com.tencent.mm.sdk.platformtools.t8.h0(r6Var5.C()));
        if (r6Var3.C() > 1.610612736E9d && r6Var3.C() > (r6Var4.C() + r6Var5.C()) * 2) {
            r6Var3.l();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PluginFTS", "try to delete old db and rebuild");
            jx3.f.INSTANCE.idkeyStat(729L, 14L, 1L, false);
        }
        try {
            com.tencent.mm.plugin.fts.d0 d0Var = this.f137422n;
            gm0.j1.i();
            d0Var.f137381f = new com.tencent.mm.plugin.fts.o(gm0.j1.u().h());
            com.tencent.mm.plugin.fts.d0.wi(this.f137422n);
            com.tencent.mm.plugin.fts.d0.Ai(this.f137422n);
            com.tencent.mm.plugin.fts.d0.Bi(this.f137422n);
            com.tencent.mm.plugin.fts.d0.Di(this.f137422n);
            ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).Bi();
            ((od2.s) ((m40.l0) i95.n0.c(m40.l0.class))).wi();
            if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f442955d) {
                ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).Di();
            }
            ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).Ai();
        } catch (com.tencent.mm.plugin.fts.q e17) {
            throw e17;
        } catch (java.lang.Exception e18) {
            if (com.tencent.mm.plugin.fts.d0.E) {
                return true;
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.PluginFTS", e18, "Index database corruption detected", new java.lang.Object[0]);
            ((com.tencent.mm.plugin.fts.d0$$a) this.f137422n.f137388p).onCorruption(null);
        }
        return true;
    }
}
