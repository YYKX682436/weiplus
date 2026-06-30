package eb2;

/* loaded from: classes2.dex */
public final class j0 implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f250783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f250784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f250785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f250786e;

    public j0(int i17, db2.n3 n3Var, eb2.m0 m0Var, boolean z17, db2.u3 u3Var) {
        this.f250782a = i17;
        this.f250783b = n3Var;
        this.f250784c = m0Var;
        this.f250785d = z17;
        this.f250786e = u3Var;
    }

    @Override // db2.z2
    public void onCgiBack(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        boolean z17;
        java.util.ArrayList arrayList;
        r45.nx2 nx2Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        java.lang.String l17;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        if (i17 == 0 && i18 == 0) {
            if (this.f250782a == 0) {
                db2.o3.a(resp, this.f250783b.f228079d, this.f250784c.f250833u);
            }
            r45.fx2 fx2Var = (r45.fx2) resp.getCustom(17);
            pf5.u uVar = pf5.u.f353936a;
            if (fx2Var != null) {
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
                r45.fx2 fx2Var2 = (r45.fx2) resp.getCustom(17);
                c17.x(u3Var, com.tencent.mm.sdk.platformtools.t8.l(fx2Var2 != null ? fx2Var2.toByteArray() : null));
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
                int i19 = this.f250783b.f228079d;
                r45.fx2 S6 = finderStreamTabPreloadCore.S6();
                java.util.Iterator it = finderStreamTabPreloadCore.f122543e.iterator();
                while (it.hasNext()) {
                    ((bs2.n1) it.next()).p(i19, S6);
                }
            }
            eb2.f0 f0Var = this.f250784c.f250824i;
            if (f0Var != null) {
                f0Var.f250742a = null;
            }
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f89);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, string);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f88);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, string2);
            kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.String");
            java.util.LinkedList list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                kotlin.jvm.internal.o.d(finderObject);
                if (hc2.o0.C(finderObject)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() < resp.getList(1).size()) {
                com.tencent.mars.xlog.Log.e(this.f250784c.f250833u, "[onCgiBack] has filter some feed. valid=" + arrayList2.size() + " raw=" + resp.getList(1).size());
                pm0.z.a(xy2.b.f458155b, "finderStreamReturnInvalidFeed", true, null, null, false, false, new eb2.i0(this.f250783b, this.f250782a, arrayList2, resp), 60, null);
            }
            boolean z18 = resp.getInteger(6) > 0;
            java.util.List j17 = cu2.u.f222441a.j(arrayList2, hc2.d0.d(this.f250783b.f228079d), this.f250784c.f250823h);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(j17, 10));
            java.util.Iterator it6 = ((java.util.ArrayList) j17).iterator();
            while (it6.hasNext()) {
                arrayList3.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()));
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList3);
            r45.of6 of6Var = (r45.of6) resp.getCustom(29);
            if (of6Var != null) {
                db2.n3 n3Var = this.f250783b;
                eb2.m0 m0Var = this.f250784c;
                androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.i.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                int i27 = n3Var.f228079d;
                r45.qt2 qt2Var = m0Var.f250823h;
                cu2.t tVar = cu2.u.f222441a;
                z17 = z18;
                java.util.LinkedList list2 = of6Var.getList(0);
                kotlin.jvm.internal.o.f(list2, "getObject(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) obj2;
                    kotlin.jvm.internal.o.d(finderObject2);
                    if (hc2.o0.C(finderObject2)) {
                        arrayList4.add(obj2);
                    }
                }
                java.util.List j18 = tVar.j(arrayList4, hc2.d0.d(i27), qt2Var);
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(j18, 10));
                for (java.util.Iterator it7 = ((java.util.ArrayList) j18).iterator(); it7.hasNext(); it7 = it7) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it7.next());
                    p17.getFeedObject().m131setUnreadExpiredTimeVKZWuLQ(c01.id.e() + of6Var.getInteger(1));
                    arrayList5.add(p17);
                    arrayList2 = arrayList2;
                }
                arrayList = arrayList2;
                java.util.LinkedList linkedList2 = new java.util.LinkedList(arrayList5);
                if (of6Var.getInteger(2) == 0) {
                    ((ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class)).R6(linkedList2, hc2.d0.b(i27), 2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveBackupInfo tabType:");
                    sb6.append(i27);
                    sb6.append(" list:");
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                    java.util.Iterator it8 = linkedList2.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(hc2.b0.h((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it8.next(), false, 1, null));
                    }
                    sb6.append(arrayList6);
                    com.tencent.mars.xlog.Log.i("FinderBackupFeedListVM", sb6.toString());
                }
            } else {
                z17 = z18;
                arrayList = arrayList2;
            }
            com.tencent.mm.plugin.finder.feed.model.d dVar = new com.tencent.mm.plugin.finder.feed.model.d(linkedList, i17, i18, str);
            dVar.f107766d = this.f250783b.f228079d;
            dVar.f107774l = java.lang.Math.min(resp.f227917e, arrayList.size());
            java.lang.Math.min(resp.f227919g, arrayList.size());
            dVar.f107773k = resp.f227918f;
            dVar.f107770h = resp.f227916d;
            dVar.f107768f = arrayList;
            dVar.f107772j = resp.f227920h;
            boolean z19 = this.f250784c.f250828p;
            dVar.f107776n = resp.getByteString(2);
            dVar.f107775m = (r45.lw0) resp.getCustom(14);
            dVar.f107769g = resp.getInteger(5);
            dVar.f107771i = resp.getInteger(6) != 0;
            dVar.f107777o = (r45.bx2) resp.getCustom(18);
            dVar.f107778p = resp;
            eb2.m0 m0Var2 = this.f250784c;
            m0Var2.getClass();
            java.util.Iterator it9 = interceptors.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                fb2.m mVar = (fb2.m) it9.next();
                if (mVar.c(dVar, m0Var2.f250822g)) {
                    com.tencent.mars.xlog.Log.w(m0Var2.f250833u, "[onCgiBack] before Interceptor is interrupted by " + mVar);
                    break;
                }
            }
            if (this.f250782a != 2 && this.f250784c.f250827o != 1) {
                cu2.u.f222441a.m(linkedList, hc2.d0.d(this.f250783b.f228079d), "", z17);
            }
            eb2.m0 m0Var3 = this.f250784c;
            m0Var3.getClass();
            java.util.Iterator it10 = interceptors.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                fb2.m mVar2 = (fb2.m) it10.next();
                if (mVar2.b(dVar, m0Var3.f250822g)) {
                    com.tencent.mars.xlog.Log.w(m0Var3.f250833u, "[onCgiBack] after Interceptor is interrupted by " + mVar2);
                    break;
                }
            }
            so2.h3.f410392d.j(this.f250783b.f228079d, arrayList);
            if (this.f250785d) {
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 c19 = hc2.d0.c(this.f250783b.f228079d);
                if (resp.getByteString(2) == null) {
                    l17 = null;
                } else {
                    com.tencent.mm.protobuf.g byteString = resp.getByteString(2);
                    l17 = com.tencent.mm.sdk.platformtools.t8.l(byteString != null ? byteString.g() : null);
                }
                c18.x(c19, l17);
                java.util.Iterator it11 = this.f250784c.f250830r.f257454n.iterator();
                while (it11.hasNext()) {
                }
            }
            this.f250784c.f250828p = resp.f227920h;
            this.f250786e.a(dVar, this.f250782a);
            int i28 = this.f250782a;
            if ((i28 == 0 || i28 == 1 || i28 == 4) && ((nx2Var = (r45.nx2) resp.d().getCustom(30)) == null || nx2Var.getInteger(6) == 0)) {
                java.util.Iterator it12 = linkedList.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        baseFinderFeed = null;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it12.next();
                    baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                    if (baseFinderFeed != null) {
                        break;
                    }
                }
                if (baseFinderFeed != null && resp.d().getLong(12) != 0) {
                    pm0.z.b(xy2.b.f458155b, "finderCgiBackWrongRedDotFeed", resp.d().getLong(12) == baseFinderFeed.getFeedObject().getFeedObject().getId(), null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.c2(resp, baseFinderFeed), 60, null);
                }
            }
        } else {
            com.tencent.mm.plugin.finder.feed.model.d dVar2 = new com.tencent.mm.plugin.finder.feed.model.d(new java.util.LinkedList(), i17, i18, str);
            dVar2.f107766d = this.f250783b.f228079d;
            dVar2.f107770h = 1;
            dVar2.f107772j = resp.f227920h;
            dVar2.f107776n = resp.getByteString(2);
            this.f250786e.a(dVar2, this.f250782a);
        }
        eb2.f0 f0Var2 = this.f250784c.f250824i;
        if (f0Var2 != null) {
            f0Var2.f250743b = null;
        }
        if (f0Var2 == null) {
            return;
        }
        f0Var2.f250748g = false;
    }
}
