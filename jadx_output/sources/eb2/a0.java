package eb2;

/* loaded from: classes2.dex */
public final class a0 implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb2.b0 f250709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb2.v f250711f;

    public a0(eb2.b0 b0Var, int i17, eb2.v vVar) {
        this.f250709d = b0Var;
        this.f250710e = i17;
        this.f250711f = vVar;
    }

    @Override // db2.u3
    public void a(com.tencent.mm.plugin.finder.feed.model.d info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        eb2.b0 b0Var = this.f250709d;
        int i18 = info.f107764b;
        int i19 = info.f107763a;
        if (i19 == 0 && i18 == 0) {
            b0Var.f250717i.f250859c = info.f107776n;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", "[call] onFetchDone... pullType=" + i17);
        boolean z17 = info.f107770h != 0;
        com.tencent.mm.plugin.finder.feed.model.n2 n2Var = new com.tencent.mm.plugin.finder.feed.model.n2(i19, i18, info.f107765c);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(b0Var.f250717i.f250860d)) {
            linkedList.addAll(b0Var.f250717i.f250860d);
            b0Var.f250717i.f250860d.clear();
        }
        java.util.Iterator it = info.f107767e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                kotlin.jvm.internal.o.g(feed, "feed");
                r45.dh2 dh2Var = new r45.dh2();
                dh2Var.set(0, 2);
                dh2Var.set(3, feed.getFeedObject().getFeedObject());
                com.tencent.mm.plugin.finder.storage.ja0 ja0Var = new com.tencent.mm.plugin.finder.storage.ja0(dh2Var);
                ja0Var.f126993b = null;
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = feed.getFeedObject();
                ja0Var.f126994c = feedObject;
                ja0Var.f126995d = null;
                ja0Var.f126997f = feedObject.getMediaType();
                ja0Var.f126998g = feedObject.getId();
                linkedList.add(new so2.k(ja0Var));
            }
        }
        n2Var.setIncrementList(linkedList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List incrementList = n2Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLbsFeedFetcher", sb6.toString());
        n2Var.setPullType(this.f250710e);
        n2Var.setLastBuffer(info.f107776n);
        n2Var.setHasMore(z17);
        ((com.tencent.mm.plugin.finder.feed.model.p2) this.f250711f).a(n2Var);
    }
}
