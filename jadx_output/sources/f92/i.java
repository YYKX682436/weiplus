package f92;

/* loaded from: classes10.dex */
public final class i implements l92.b, com.tencent.mm.app.t2, l92.c {

    /* renamed from: d, reason: collision with root package name */
    public long f260250d;

    @Override // l92.c
    public void a(java.lang.String newDefaultUsername, java.lang.String rawDefaultUsername) {
        kotlin.jvm.internal.o.g(newDefaultUsername, "newDefaultUsername");
        kotlin.jvm.internal.o.g(rawDefaultUsername, "rawDefaultUsername");
    }

    public final void b(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "[doFinderInit] source=" + source + " lastFinderInitTime=" + this.f260250d);
        this.f260250d = java.lang.System.currentTimeMillis();
        kotlinx.coroutines.l.d(((c61.l7) i95.n0.c(c61.l7.class)).U, null, null, new f92.g(source, this, null), 3, null);
        qx.a.f367242c = true;
    }

    public void c(m92.b account, java.lang.String source) {
        java.util.LinkedList linkedList;
        m92.b b17;
        kotlin.jvm.internal.o.g(account, "account");
        kotlin.jvm.internal.o.g(source, "source");
        if (kotlin.jvm.internal.o.b("FINDER_RE_INIT", source)) {
            com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "[onDeleted] Source from reInit return");
            return;
        }
        java.lang.String str = account.field_username;
        com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.remove(str);
        ya2.g gVar = ya2.h.f460484a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ya2.c a17 = gVar.a();
            a17.getClass();
            a17.f460459a.remove(str);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(str);
            java.lang.String str2 = "DELETE FROM FinderContact WHERE username = " + d95.b0.O(str);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            com.tencent.mm.plugin.finder.storage.o80 Jj = ((c61.l7) i95.n0.c(c61.l7.class)).Jj();
            if ((Jj != null ? Jj.execSQL("FinderContact", str2) : false) && Jj != null) {
                Jj.doNotify("FinderContact", 5, Jj);
            }
        }
        bu2.e0.f24502e.a(1).f24493c.getList(0).clear();
        so2.i4 i4Var = new so2.i4();
        i4Var.field_username = str;
        i4Var.field_type = 1;
        if (!((c61.l7) i95.n0.c(c61.l7.class)).Vj().insert(i4Var)) {
            com.tencent.mars.xlog.Log.e("Finder.AccountLogicHandler", "insert DeletingInfo failure. finderUsername=" + str + " source=" + source);
            return;
        }
        com.tencent.mm.plugin.finder.storage.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
        com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        pk6.getClass();
        if ((str.length() == 0) || (b17 = g92.b.f269769e.b1(str, true)) == null) {
            linkedList = null;
        } else {
            linkedList = new java.util.LinkedList();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            p75.n0 n0Var = dm.b5.f235851s;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            p75.d dVar = dm.b5.f235852t;
            java.lang.String field_finder_version_username_history = b17.field_finder_version_username_history;
            kotlin.jvm.internal.o.f(field_finder_version_username_history, "field_finder_version_username_history");
            p75.m0 l17 = dVar.l(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null));
            p75.i0 g17 = dm.b5.f235851s.g(linkedList2);
            g17.f352657d = l17;
            g17.f352659f = linkedList3;
            g17.f352660g = linkedList4;
            p75.l0 a18 = g17.a();
            java.util.List k17 = a18.k(pk6.f126658d, qb2.x1.class);
            if (true ^ ((java.util.ArrayList) k17).isEmpty()) {
                linkedList.addAll(k17);
            }
            java.lang.String name = java.lang.Thread.currentThread().getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            java.lang.String sql = a18.toString();
            kotlin.jvm.internal.o.g(sql, "sql");
            new qb2.r("FinderSessionInfoStorage.getSessionInfoBySenderUserName", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteMyLocalAccountData] finderUsername=");
        sb6.append(str);
        sb6.append(" sessionInfoList.size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", sb6.toString());
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String field_sessionId = ((qb2.x1) it.next()).field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                qb2.t D0 = Kj.D0(field_sessionId);
                boolean deleteNotify = Kj.deleteNotify(D0.systemRowid, false);
                com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + str + " delete conv begin[" + deleteNotify + "]... " + D0.F1 + ' ' + D0.field_sessionId);
                if (deleteNotify) {
                    c01.w9.h(D0.field_sessionId, new f92.h(str, D0));
                }
                java.lang.String field_sessionId2 = D0.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
                pk6.y0(field_sessionId2, false);
                pk6.doNotify(D0.field_sessionId, 6, D0);
                com.tencent.mars.xlog.Log.i("Finder.AccountLogicHandler", "[deleteMyLocalAccountData] finderUsername=" + str + " delete conv end... " + D0.F1 + ' ' + D0.field_sessionId);
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).Vj().delete(i4Var, dm.i4.COL_USERNAME);
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().S()).d(str, zy2.y8.H);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (!pr2.a.f357949a.a() || java.lang.System.currentTimeMillis() - this.f260250d < 86400000) {
            return;
        }
        b("onAppForeground");
    }
}
