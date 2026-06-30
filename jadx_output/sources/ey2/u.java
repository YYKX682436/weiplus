package ey2;

/* loaded from: classes2.dex */
public final class u extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.n1 f257525d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.en2 f257526e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f257527f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f257528g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f257529h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f257530i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f257531m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f257532n;

    /* renamed from: o, reason: collision with root package name */
    public r45.dy0 f257533o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f257534p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f257535q;

    /* renamed from: r, reason: collision with root package name */
    public int f257536r;

    /* renamed from: s, reason: collision with root package name */
    public final int f257537s;

    /* renamed from: t, reason: collision with root package name */
    public long f257538t;

    /* renamed from: u, reason: collision with root package name */
    public int f257539u;

    /* renamed from: v, reason: collision with root package name */
    public int f257540v;

    /* renamed from: w, reason: collision with root package name */
    public int f257541w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.j0 f257542x;

    public u(so2.n1 item, r45.en2 en2Var, r45.qt2 contextObj, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader, int i17, kotlin.jvm.internal.i iVar) {
        en2Var = (i17 & 2) != 0 ? item.getFeedObject().getFinderObject().getPlace_holder_info() : en2Var;
        finderTimelineFeedLoader = (i17 & 8) != 0 ? null : finderTimelineFeedLoader;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f257525d = item;
        this.f257526e = en2Var;
        this.f257527f = contextObj;
        this.f257528g = finderTimelineFeedLoader;
        this.f257529h = "Finder." + ey2.u.class.getSimpleName() + "_@" + hashCode();
        this.f257534p = jz5.h.b(ey2.t.f257501d);
        this.f257535q = new java.lang.Object();
        this.f257536r = -1;
        this.f257537s = 3;
        this.f257541w = -1;
        this.f257542x = new androidx.lifecycle.j0(new jz5.l(new com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer(null, 1, null), new ey2.m(new e06.k(0, 0), ey2.n.f257434f)));
    }

    public final void N6(int i17) {
        jz5.l lVar;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        this.f257536r = i17;
        if (this.f257532n || this.f257531m || (lVar = (jz5.l) this.f257542x.getValue()) == null || (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) == null || i17 < dataBuffer.size() - this.f257537s) {
            return;
        }
        this.f257532n = true;
        Q6();
    }

    public final java.lang.String O6() {
        r45.ey0 ey0Var;
        so2.n1 item = this.f257525d;
        java.lang.Object obj = null;
        if (item instanceof so2.n1) {
            kotlin.jvm.internal.o.g(item, "item");
            long itemId = item.getItemId();
            r45.en2 place_holder_info = item.getFeedObject().getFinderObject().getPlace_holder_info();
            if (place_holder_info != null && (ey0Var = (r45.ey0) place_holder_info.getCustom(11)) != null) {
                obj = java.lang.Integer.valueOf(ey0Var.getInteger(0));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(itemId);
            sb6.append('_');
            sb6.append(obj);
            obj = sb6.toString();
        }
        if (obj == null) {
            obj = com.tencent.mm.sdk.platformtools.t8.Y(16);
        }
        return java.lang.String.valueOf(obj);
    }

    public final void P6(java.util.List list) {
        java.util.HashSet hashSet;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer3;
        synchronized (this.f257535q) {
            java.util.List y17 = q26.h0.y(q26.h0.r(q26.h0.o(q26.h0.j(kz5.n0.J(list), new ey2.o(this)), ey2.p.f257462d), new ey2.q(this)));
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(y17, 10));
            java.util.Iterator it = y17.iterator();
            while (it.hasNext()) {
                arrayList.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
            }
            jz5.l lVar = (jz5.l) this.f257542x.getValue();
            if (lVar == null || (dataBuffer3 = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) == null) {
                hashSet = new java.util.HashSet();
            } else {
                hashSet = new java.util.HashSet();
                java.util.Iterator<T> it6 = dataBuffer3.iterator();
                while (it6.hasNext()) {
                    hashSet.add(java.lang.Long.valueOf(((so2.j5) it6.next()).getItemId()));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!hashSet.contains(java.lang.Long.valueOf(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getItemId()))) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                jz5.l lVar2 = (jz5.l) this.f257542x.getValue();
                int size = (lVar2 == null || (dataBuffer2 = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar2.f302833d) == null) ? 0 : dataBuffer2.size();
                jz5.l lVar3 = (jz5.l) this.f257542x.getValue();
                if (lVar3 == null || (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar3.f302833d) == null) {
                    dataBuffer = new com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer(null, 1, null);
                }
                dataBuffer.addAll(arrayList2);
                com.tencent.mars.xlog.Log.i(this.f257529h, "mergeExternalData size: " + arrayList2.size());
                this.f257542x.postValue(new jz5.l(dataBuffer, new ey2.m(e06.p.m(size + 1, size + arrayList2.size()), ey2.n.f257433e)));
            } else {
                jz5.l lVar4 = (jz5.l) this.f257542x.getValue();
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer4 = lVar4 != null ? (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar4.f302833d : null;
                if (dataBuffer4 != null) {
                    this.f257542x.postValue(new jz5.l(dataBuffer4, new ey2.m(e06.p.m(kz5.c0.h(dataBuffer4), kz5.c0.h(dataBuffer4)), ey2.n.f257432d)));
                }
            }
        }
    }

    public final boolean Q6() {
        java.lang.String str;
        r45.ey0 ey0Var;
        r45.ey0 ey0Var2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.ey0 ey0Var3;
        int i17 = 0;
        if (this.f257531m) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMoreFeedData columnid:");
        r45.en2 en2Var = this.f257526e;
        sb6.append((en2Var == null || (ey0Var3 = (r45.ey0) en2Var.getCustom(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var3.getInteger(0)));
        com.tencent.mars.xlog.Log.i(this.f257529h, sb6.toString());
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        cq.k kVar = (cq.k) i95.n0.c(cq.k.class);
        r45.qt2 qt2Var = this.f257527f;
        int integer = qt2Var.getInteger(5);
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f257528g;
        com.tencent.mm.protobuf.g lastBuffer = finderTimelineFeedLoader != null ? finderTimelineFeedLoader.getLastBuffer() : null;
        com.tencent.mm.protobuf.g gVar = this.f257530i;
        long id6 = (en2Var == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) en2Var.getCustom(7)) == null) ? 0L : finderObject.getId();
        float floatValue = ((java.lang.Number) P6.f302834e).floatValue();
        float floatValue2 = ((java.lang.Number) P6.f302833d).floatValue();
        if (en2Var != null && (ey0Var2 = (r45.ey0) en2Var.getCustom(11)) != null) {
            i17 = ey0Var2.getInteger(0);
        }
        int i18 = i17;
        if (en2Var == null || (ey0Var = (r45.ey0) en2Var.getCustom(11)) == null || (str = ey0Var.getString(1)) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        ey2.r rVar = new ey2.r(this);
        ey2.s sVar = ey2.s.f257496d;
        kVar.getClass();
        new bq.l(qt2Var, lastBuffer, gVar, id6, floatValue, floatValue2, 2, 4, i18, str2).l().q(new cq.h(rVar, sVar, kVar, integer));
        return true;
    }

    public final void clear() {
        r45.ey0 ey0Var;
        java.lang.String O6 = O6();
        ey2.l0 l0Var = ey2.l0.f257422a;
        synchronized (ey2.l0.f257425d) {
            java.lang.String str = ey2.u.class.getCanonicalName() + '_' + O6;
            java.util.Map map = ey2.l0.f257423b;
            androidx.lifecycle.l1 l1Var = (androidx.lifecycle.l1) ((java.util.LinkedHashMap) map).get(str);
            if (l1Var != null) {
                l1Var.a();
            }
            map.remove(str);
            ey2.l0.f257424c.remove(str);
            com.tencent.mars.xlog.Log.i(ey2.l0.f257426e, "clear combinedKey:" + str);
        }
        java.lang.String str2 = this.f257529h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear columnid:");
        r45.en2 en2Var = this.f257526e;
        sb6.append((en2Var == null || (ey0Var = (r45.ey0) en2Var.getCustom(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var.getInteger(0)));
        sb6.append(" sharedKey:");
        sb6.append(O6);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        clear();
    }
}
