package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class e implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.f f122185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f122186c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f122187d;

    public e(int i17, com.tencent.mm.plugin.finder.nearby.video.f fVar, boolean z17, db2.u3 u3Var) {
        this.f122184a = i17;
        this.f122185b = fVar;
        this.f122186c = z17;
        this.f122187d = u3Var;
    }

    @Override // db2.z2
    public void onCgiBack(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        java.lang.String l17;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.finder.feed.model.d dVar = new com.tencent.mm.plugin.finder.feed.model.d(new java.util.LinkedList(), i17, i18, str);
            dVar.f107766d = this.f122185b.f122188g;
            dVar.f107770h = 1;
            dVar.f107772j = resp.f227920h;
            dVar.f107776n = resp.getByteString(2);
            this.f122187d.a(dVar, this.f122184a);
            return;
        }
        int i19 = 4;
        if (this.f122184a == 0) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyVideoFeedFetcher", "tabType=" + this.f122185b.f122188g + " headWording=" + resp.getString(3) + " endWording=" + resp.getString(4) + " prefetch_last_feed_count=" + resp.getInteger(8) + " continueFlag:" + resp.f227916d);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, resp.getString(3));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, resp.getString(4));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, java.lang.Integer.valueOf(resp.getInteger(8)));
        }
        if (((r45.fx2) resp.getCustom(17)) != null) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
            r45.fx2 fx2Var = (r45.fx2) resp.getCustom(17);
            c17.x(u3Var, com.tencent.mm.sdk.platformtools.t8.l(fx2Var != null ? fx2Var.toByteArray() : null));
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
            int i27 = this.f122185b.f122188g;
            r45.fx2 S6 = finderStreamTabPreloadCore.S6();
            java.util.Iterator it = finderStreamTabPreloadCore.f122543e.iterator();
            while (it.hasNext()) {
                ((bs2.n1) it.next()).p(i27, S6);
            }
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
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) next;
            kotlin.jvm.internal.o.d(finderObject);
            jz5.g gVar = hc2.o0.f280336a;
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            int mediaType = objectDesc != null ? objectDesc.getMediaType() : 0;
            if (mediaType == 2 || mediaType == i19 || mediaType == 9) {
                r13 = true;
            } else {
                com.tencent.mars.xlog.Log.w("FinderExt", " isAcceptNearbyVideoObj return for invalid mediaType:" + mediaType);
            }
            if (r13) {
                arrayList.add(next);
            }
            i19 = 4;
        }
        if (arrayList.size() < resp.getList(1).size()) {
            com.tencent.mars.xlog.Log.e("Finder.NearbyVideoFeedFetcher", "[onCgiBack] has filter some feed. valid=" + arrayList.size() + " raw=" + resp.getList(1).size());
        }
        boolean z17 = resp.getInteger(6) > 0;
        java.util.List j17 = cu2.u.f222441a.j(arrayList, hc2.d0.d(this.f122185b.f122188g), this.f122185b.f122189h);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it7 = ((java.util.ArrayList) j17).iterator();
        while (it7.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it7.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        com.tencent.mm.plugin.finder.feed.model.d dVar2 = new com.tencent.mm.plugin.finder.feed.model.d(linkedList, i17, i18, str);
        dVar2.f107766d = this.f122185b.f122188g;
        dVar2.f107774l = resp.f227917e;
        dVar2.f107773k = resp.f227918f;
        dVar2.f107770h = resp.f227916d;
        dVar2.f107768f = arrayList;
        dVar2.f107772j = resp.f227920h;
        dVar2.f107776n = resp.getByteString(2);
        dVar2.f107775m = (r45.lw0) resp.getCustom(14);
        dVar2.f107769g = resp.getInteger(5);
        dVar2.f107771i = resp.getInteger(6) != 0;
        dVar2.f107777o = (r45.bx2) resp.getCustom(18);
        if (this.f122184a != 2) {
            cu2.u.f222441a.m(linkedList, hc2.d0.d(this.f122185b.f122188g), "", z17);
        }
        int i28 = this.f122184a;
        if (i28 == 0 || i28 == 1) {
            so2.h3.f410392d.j(this.f122185b.f122188g, arrayList);
        }
        if (this.f122186c) {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 c19 = hc2.d0.c(this.f122185b.f122188g);
            if (resp.getByteString(2) == null) {
                l17 = null;
            } else {
                com.tencent.mm.protobuf.g byteString = resp.getByteString(2);
                l17 = com.tencent.mm.sdk.platformtools.t8.l(byteString != null ? byteString.g() : null);
            }
            c18.x(c19, l17);
        }
        this.f122185b.f122191m = resp.f227920h;
        this.f122187d.a(dVar2, this.f122184a);
    }
}
