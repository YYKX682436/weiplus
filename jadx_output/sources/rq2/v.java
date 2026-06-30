package rq2;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.v f398891a = new rq2.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f398892b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f398893c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f398894d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f398895e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f398896f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.LinkedList f398897g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.LinkedList f398898h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.LinkedList f398899i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.LinkedList f398900j = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.LinkedList f398901k = new java.util.LinkedList();

    public final java.util.List a(int i17) {
        if (i17 == 15) {
            return f398896f;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                return f398899i;
            }
            if (i17 != 94) {
                return new java.util.LinkedList();
            }
        }
        return f398893c;
    }

    public final java.util.List b(int i17) {
        if (i17 == 15) {
            return f398895e;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                return f398898h;
            }
            if (i17 != 94) {
                return new java.util.LinkedList();
            }
        }
        return f398892b;
    }

    public java.util.List c(int i17) {
        java.util.List d17 = d(i17);
        for (r45.ni4 ni4Var : a(i17)) {
            for (so2.j5 j5Var : f398891a.b(i17)) {
                if (ni4Var.getLong(0) == j5Var.getItemId()) {
                    java.util.Iterator it = d17.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        }
                        if (((r45.ni4) it.next()).getLong(0) == ni4Var.getLong(0)) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 < 0) {
                        ni4Var.set(5, java.lang.Integer.valueOf((int) (c01.id.c() - ni4Var.getInteger(5))));
                        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            ni4Var.set(4, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).g0());
                        }
                        ni4Var.getLong(0);
                        ni4Var.getInteger(5);
                        ni4Var.getString(4);
                        ((java.util.LinkedList) d17).add(ni4Var);
                    }
                }
            }
        }
        return d17;
    }

    public final java.util.List d(int i17) {
        if (i17 == 15) {
            return f398897g;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                return f398900j;
            }
            if (i17 != 94) {
                return new java.util.LinkedList();
            }
        }
        return f398894d;
    }

    public java.util.List e(int i17, int i18) {
        java.util.LinkedList linkedList = f398901k;
        linkedList.clear();
        for (so2.j5 j5Var : b(i17)) {
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                java.util.Iterator it = f398891a.d(i17).iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    if (((r45.ni4) it.next()).getLong(0) == j5Var.getItemId()) {
                        break;
                    }
                    i19++;
                }
                if (i19 < 0) {
                    r45.e13 e13Var = new r45.e13();
                    e13Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()));
                    e13Var.set(1, baseFinderFeed.getFeedObject().getFeedObject().getObjectNonceId());
                    e13Var.set(2, java.lang.Integer.valueOf(i18));
                    e13Var.set(3, baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer());
                    e13Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getFeedObject().getId()));
                    e13Var.set(1, baseFinderFeed.getFeedObject().getObjectNonceId());
                    linkedList.add(e13Var);
                }
            }
        }
        ((java.util.LinkedList) b(i17)).size();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((java.util.LinkedList) d(i17)).size();
        linkedList.size();
        return linkedList;
    }

    public boolean f(int i17) {
        return i17 == 15 || i17 == 76 || i17 == 80 || i17 == 94;
    }

    public final void g(int i17, java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        for (so2.j5 j5Var : b(i17)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.ni4 ni4Var = (r45.ni4) it.next();
                if (j5Var.getItemId() == ni4Var.getLong(0)) {
                    rq2.v vVar = f398891a;
                    java.util.Iterator it6 = vVar.d(i17).iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i18 = -1;
                            break;
                        } else if (((r45.ni4) it6.next()).getLong(0) == j5Var.getItemId()) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i18 < 0) {
                        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            ni4Var.set(4, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).g0());
                        }
                        ((java.util.LinkedList) vVar.d(i17)).add(ni4Var);
                    }
                }
            }
        }
    }

    public final void h(int i17, java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        list.size();
        if (i17 == 15) {
            f398897g.clear();
            f398896f.clear();
            java.util.LinkedList linkedList = f398895e;
            linkedList.clear();
            linkedList.addAll(list);
            return;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                f398900j.clear();
                f398899i.clear();
                java.util.LinkedList linkedList2 = f398898h;
                linkedList2.clear();
                linkedList2.addAll(list);
                return;
            }
            if (i17 != 94) {
                return;
            }
        }
        f398894d.clear();
        f398893c.clear();
        java.util.LinkedList linkedList3 = f398892b;
        linkedList3.clear();
        linkedList3.addAll(list);
    }
}
