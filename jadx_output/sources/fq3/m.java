package fq3;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq3.n f265527d;

    public m(fq3.n nVar, fq3.j jVar) {
        this.f265527d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.lifecycle.c1 a17;
        java.util.Iterator it;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PRIORITY_DB_VERSION_INT;
        int i17 = 0;
        int r17 = c17.r(u3Var, 0);
        if (r17 != 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PluginPriority", "New DB FILE %d %d", java.lang.Integer.valueOf(r17), 7);
            gm0.j1.i();
            com.tencent.mm.vfs.w6.h(new com.tencent.mm.vfs.r6(gm0.j1.u().h(), "MicroMsgPriority.db").o());
            gm0.j1.u().c().x(u3Var, 7);
        }
        fq3.n nVar = this.f265527d;
        gm0.j1.i();
        nVar.f265529n = new kq3.h(gm0.j1.u().h());
        fq3.n nVar2 = this.f265527d;
        nVar2.f265528m = nVar2.f265529n.e(16777217L, 0L);
        fq3.n nVar3 = this.f265527d;
        if (nVar3.f265528m == 0) {
            nVar3.f265528m = java.lang.System.currentTimeMillis();
            fq3.n nVar4 = this.f265527d;
            nVar4.f265529n.i(16777217L, nVar4.f265528m);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PluginPriority", "install priority time %s", k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, this.f265527d.f265528m / 1000));
        fq3.n nVar5 = this.f265527d;
        nVar5.f265530o = new com.tencent.mm.plugin.priority.model.c2c.img.e(nVar5.f265529n);
        fq3.n nVar6 = this.f265527d;
        nVar6.f265531p = new nq3.f(nVar6.f265529n);
        fq3.n nVar7 = this.f265527d;
        nVar7.f265532q = new com.tencent.mm.plugin.priority.model.c2c.img.f(nVar7.f265529n);
        fq3.n nVar8 = this.f265527d;
        nVar8.f265533r = new nq3.g(nVar8.f265529n);
        fq3.n nVar9 = this.f265527d;
        nVar9.f265534s = new mq3.d(nVar9.f265529n);
        fq3.n nVar10 = this.f265527d;
        nVar10.f265535t = new mq3.c(nVar10.f265529n);
        this.f265527d.f265536u = new kq3.l();
        fq3.n nVar11 = this.f265527d;
        nVar11.f265537v = new com.tencent.mm.plugin.priority.model.c2c.img.d();
        nVar11.f265538w = new nq3.e();
        nVar11.f265540y = new com.tencent.mm.plugin.priority.model.c2c.img.c();
        fq3.n nVar12 = this.f265527d;
        nVar12.f265541z = new nq3.d();
        nVar12.f265539x = new mq3.b();
        sq3.e.f411360m.a();
        fq3.n nVar13 = this.f265527d;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(sq3.e.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(sq3.e.class);
        }
        nVar13.A = (sq3.b) ((sq3.e) a17).P6(sq3.b.class);
        sq3.b bVar = this.f265527d.A;
        bVar.getClass();
        p75.n0 n0Var = dm.n1.f238601u;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("Status", (java.lang.Integer) 1);
        p75.h1 j17 = n0Var.j(contentValues);
        j17.f352651c = dm.n1.f238605y.i(2);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadStorage", "c2c pre download update downloading msg count : " + j17.a().f(bVar.f193147g.Q4()));
        sq3.b bVar2 = this.f265527d.A;
        bVar2.getClass();
        long j18 = 1209600000;
        p75.m0 x17 = dm.n1.C.x(java.lang.Long.valueOf(c01.id.c() - 1209600000));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f352676a;
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        kotlin.jvm.internal.o.g(table, "table");
        n75.b bVar3 = bVar2.f193147g;
        l75.k0 Q4 = bVar3.Q4();
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadStorage", "delete old pre download msg, res:" + (Q4 != null ? Q4.delete(table, b17, e17) : -1));
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadStorage", "vacuum old pre download msg, res:" + (Q4 != null ? java.lang.Boolean.valueOf(Q4.u()) : null));
        long c18 = c01.id.c() - 1209600000;
        p75.n0 n0Var2 = dm.o1.f238862g;
        n0Var2.getClass();
        p75.m0 x18 = dm.o1.f238863h.x(java.lang.Long.valueOf(c18));
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table2 = n0Var2.f352676a;
        p75.h hVar2 = (p75.h) x18;
        java.lang.String b18 = hVar2.b();
        java.lang.String[] e18 = hVar2.e();
        kotlin.jvm.internal.o.g(table2, "table");
        l75.k0 Q42 = bVar3.Q4();
        if (Q42 != null) {
            Q42.delete(table2, b18, e18);
        }
        i95.m c19 = i95.n0.c(rq3.k.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        jm0.o oVar = (jm0.o) c19;
        if (!jm0.g.class.isAssignableFrom(rq3.m.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a18 = new androidx.lifecycle.j1(oVar.getViewModel(), new jm0.e(oVar)).a(rq3.m.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        rq3.m mVar = (rq3.m) ((jm0.g) a18);
        long c27 = c01.id.c();
        if (java.lang.Math.abs(c27 - java.lang.System.currentTimeMillis()) > 3600000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PreloadMediaMoveFSC", "system time maybe error");
        } else {
            java.util.Iterator it6 = kz5.c0.i(1, 2, 3, 4).iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(mVar.T6(intValue)).G();
                if (G != null) {
                    int length = G.length;
                    int i18 = i17;
                    while (i18 < length) {
                        com.tencent.mm.vfs.r6 r6Var = G[i18];
                        if (c27 - r6Var.B() > j18) {
                            r6Var.l();
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete expired type ");
                            sb6.append(intValue);
                            sb6.append(": ");
                            sb6.append(r6Var.getName());
                            sb6.append(",  ");
                            it = it6;
                            sb6.append(r6Var.B());
                            com.tencent.mars.xlog.Log.i("MicroMsg.PreloadMediaMoveFSC", sb6.toString());
                        } else {
                            it = it6;
                        }
                        i18++;
                        it6 = it;
                        i17 = 0;
                        j18 = 1209600000;
                    }
                }
            }
        }
        this.f265527d.B = new pq3.j();
        alive();
        kq3.l lVar = this.f265527d.f265536u;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityTaskRunner", "start tick");
        kq3.k kVar = lVar.f311279b;
        if (kVar != null) {
            kVar.sendEmptyMessageDelayed(2, 5000L);
        }
        kq3.k kVar2 = lVar.f311279b;
        if (kVar2 != null) {
            kVar2.sendEmptyMessage(0);
        }
        long e19 = this.f265527d.f265529n.e(16777218L, -1L);
        long j19 = java.util.Calendar.getInstance().get(5);
        if (j19 != e19) {
            java.lang.String format = java.lang.String.format("%d,%d", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG, null), 0L)), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatImgAutoDownloadMax"), 0)));
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityReportLogic", "report16341 %s", format);
            jx3.f.INSTANCE.kvStat(16341, format);
            this.f265527d.f265529n.i(16777218L, j19);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f265527d.C, null);
        com.tencent.mm.plugin.priority.model.c2c.img.e eVar = this.f265527d.f265530o;
        eVar.getClass();
        eVar.f153182a.d(java.lang.String.format("DELETE FROM %s WHERE createtime < ?", "C2CMsgAutoDownloadRes"), new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 7776000000L)});
        this.f265527d.f265536u.a(new tq3.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PluginPriority", "Init Priority Use Time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
