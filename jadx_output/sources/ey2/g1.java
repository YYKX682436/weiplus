package ey2;

/* loaded from: classes2.dex */
public final class g1 extends pf5.o0 implements xy2.j {

    /* renamed from: g, reason: collision with root package name */
    public r45.sd4 f257378g;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f257376e = jz5.h.b(ey2.c1.f257331d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f257379h = jz5.h.b(ey2.f1.f257371d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f257380i = jz5.h.b(ey2.e1.f257355d);

    /* renamed from: f, reason: collision with root package name */
    public int f257377f = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_SWITCH_INT_SYNC, 0);

    public g1() {
        this.f257378g = new r45.sd4();
        try {
            this.f257378g = new r45.sd4();
            this.f257378g.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_INFO_STRING_SYNC, "")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.LongVideoVM", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "init long video switch:" + this.f257377f);
    }

    public final java.util.List N6() {
        return (java.util.List) ((jz5.n) this.f257380i).getValue();
    }

    public void O6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.sd4 sd4Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "longvideo_info")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            sd4Var = new r45.sd4();
            com.tencent.mm.protobuf.g byteString = yy0Var.getByteString(1);
            if (byteString != null) {
                sd4Var.parseFrom(byteString.g());
            }
        } else {
            sd4Var = new r45.sd4();
        }
        com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "modify longVideoInfo");
        this.f257378g = sd4Var;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_INFO_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(sd4Var.toByteArray()));
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R1).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "modify switchValue from " + this.f257377f + " to " + intValue);
        this.f257377f = intValue;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_SWITCH_INT_SYNC, java.lang.Integer.valueOf(this.f257377f));
    }

    public void P6(long j17) {
        com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "removeSeeLaterFeed ".concat(pm0.v.u(j17)));
        ((java.util.HashSet) ((jz5.n) this.f257379h).getValue()).remove(java.lang.Long.valueOf(j17));
        java.util.List N6 = N6();
        kotlin.jvm.internal.o.f(N6, "<get-seeLaterFeedList>(...)");
        pm0.v.c0(N6, new ey2.d1(j17));
    }

    public void Q6(so2.j5 feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            N6().add(feed);
        }
        com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "saveSeeLaterFeed " + pm0.v.u(feed.getItemId()) + ", map size=" + N6().size());
        ((java.util.HashSet) ((jz5.n) this.f257379h).getValue()).add(java.lang.Long.valueOf(feed.getItemId()));
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        com.tencent.mars.xlog.Log.i("Finder.LongVideoVM", "onCleared long video switch:" + this.f257377f);
        super.onCleared();
    }
}
