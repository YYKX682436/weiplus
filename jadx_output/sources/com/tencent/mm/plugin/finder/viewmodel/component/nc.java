package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nc extends com.tencent.mm.ui.component.UIComponent {
    public static final java.util.List B;
    public static final java.util.Map C;
    public static final java.util.Map D;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f135290d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f135291e;

    /* renamed from: f, reason: collision with root package name */
    public final eb2.u f135292f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f135293g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f135294h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f135295i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f135296m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.finder.viewmodel.component.ob f135297n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f135298o;

    /* renamed from: p, reason: collision with root package name */
    public int f135299p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f135300q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f135301r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.hb f135302s;

    /* renamed from: t, reason: collision with root package name */
    public ay2.v f135303t;

    /* renamed from: u, reason: collision with root package name */
    public int f135304u;

    /* renamed from: v, reason: collision with root package name */
    public long f135305v;

    /* renamed from: w, reason: collision with root package name */
    public int f135306w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f135307x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f135308y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f135289z = new java.util.concurrent.ConcurrentSkipListSet();
    public static final java.util.List A = kz5.c0.i(0, 2, 1, 8, 3);

    static {
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar = com.tencent.mm.plugin.finder.viewmodel.component.db.f134098e;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar2 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134099f;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar3 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134102i;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar4 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134104n;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar5 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134105o;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar6 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134106p;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar7 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134107q;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar8 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134108r;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar9 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134109s;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar10 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134110t;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar11 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134111u;
        B = kz5.c0.i(dbVar, dbVar2, dbVar3, dbVar4, dbVar5, dbVar6, dbVar7, dbVar8, dbVar9, dbVar10, dbVar11);
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar12 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134103m;
        jz5.l lVar = new jz5.l(6, 5);
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar13 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134113w;
        jz5.l lVar2 = new jz5.l(1001, 1);
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar14 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134112v;
        jz5.l lVar3 = new jz5.l(1000, 11);
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar15 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134114x;
        jz5.l lVar4 = new jz5.l(1002, 10);
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar16 = com.tencent.mm.plugin.finder.viewmodel.component.db.f134115y;
        C = kz5.c1.k(lVar, lVar2, lVar3, lVar4, new jz5.l(1003, 9));
        D = kz5.c1.k(new jz5.l(21, com.tencent.mm.plugin.finder.viewmodel.component.db.f134101h), new jz5.l(7, dbVar), new jz5.l(1, dbVar2), new jz5.l(2, dbVar2), new jz5.l(10, dbVar3), new jz5.l(11, dbVar12), new jz5.l(27, dbVar5), new jz5.l(30, dbVar4), new jz5.l(25, dbVar6), new jz5.l(22, dbVar7), new jz5.l(12, dbVar8), new jz5.l(23, dbVar10), new jz5.l(31, dbVar11), new jz5.l(26, dbVar14), new jz5.l(8, dbVar13), new jz5.l(28, dbVar15), new jz5.l(29, dbVar16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135290d = new java.util.concurrent.ConcurrentSkipListSet();
        this.f135291e = new java.util.LinkedList();
        this.f135292f = new eb2.u();
        this.f135295i = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.ic.f134732d);
        this.f135296m = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.mc.f135161d);
        this.f135298o = new java.util.LinkedHashSet();
        this.f135300q = new java.util.concurrent.ConcurrentHashMap();
        this.f135302s = new com.tencent.mm.plugin.finder.viewmodel.component.hb(com.tencent.mm.plugin.finder.viewmodel.component.ub.f136120d);
        f135289z.clear();
        this.f135304u = -1;
        this.f135306w = -1;
        this.f135307x = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.viewmodel.component.nc r22, int r23, com.tencent.mm.plugin.finder.viewmodel.component.db r24, com.tencent.mm.protocal.protobuf.FinderObject r25, java.util.List r26, boolean r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.nc.O6(com.tencent.mm.plugin.finder.viewmodel.component.nc, int, com.tencent.mm.plugin.finder.viewmodel.component.db, com.tencent.mm.protocal.protobuf.FinderObject, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object P6(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, int i17, kotlin.coroutines.Continuation continuation) {
        ncVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new com.tencent.mm.plugin.finder.viewmodel.component.sb(ncVar, linkedList, i17, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q6(com.tencent.mm.plugin.finder.viewmodel.component.nc r21, r45.qt2 r22, int r23, com.tencent.mm.protocal.protobuf.FinderObject r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.nc.Q6(com.tencent.mm.plugin.finder.viewmodel.component.nc, r45.qt2, int, com.tencent.mm.protocal.protobuf.FinderObject, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void R6(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, long j17, long j18, java.lang.String str) {
        ncVar.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(ncVar.getContext());
        lVarArr[0] = new jz5.l("finder_tab_context_id", e17 != null ? e17.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(ncVar.getContext());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(ncVar.getContext());
        lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f135380n) : null);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(j17));
        lVarArr[4] = new jz5.l("sflow_feedid", pm0.v.u(j18));
        lVarArr[5] = new jz5.l("session_buffer", str);
        ((cy1.a) rVar).Ej("delete_strengthen_flow", kz5.c1.k(lVarArr), 25496);
    }

    public static final java.lang.Object S6(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, int i17, r45.qt2 qt2Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        java.lang.Object g17;
        boolean z17 = ncVar.getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI;
        jz5.f0 f0Var = jz5.f0.f302826a;
        return (!z17 && (g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.finder.viewmodel.component.lc(ncVar, i17, list, qt2Var, null), continuation)) == pz5.a.f359186d) ? g17 : f0Var;
    }

    public final void T6(java.util.List stats) {
        kotlin.jvm.internal.o.g(stats, "stats");
        if (stats.isEmpty()) {
            return;
        }
        synchronized (this.f135291e) {
            java.util.LinkedList linkedList = this.f135291e;
            if (linkedList.size() > 1) {
                kz5.g0.t(linkedList, new com.tencent.mm.plugin.finder.viewmodel.component.pb());
            }
            if (stats.size() > 5) {
                stats = stats.subList(0, 5);
            }
            for (int size = (stats.size() + this.f135291e.size()) - 5; size > 0; size--) {
                if (!this.f135291e.isEmpty()) {
                    this.f135291e.removeFirst();
                }
            }
            this.f135291e.addAll(stats);
        }
    }

    public final void U6(int i17, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        if (finderObject == null) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ob obVar = this.f135297n;
        if ((obVar == null || (finderObject2 = obVar.f135460a) == null || finderObject.getId() != finderObject2.getId()) ? false : true) {
            com.tencent.mm.plugin.finder.viewmodel.component.ob obVar2 = this.f135297n;
            if (obVar2 != null && i17 == obVar2.f135461b) {
                this.f135292f.f250856a.d();
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[cancelRunningEnhance] type=" + i17 + " requestObj=" + b7(finderObject));
    }

    public final void V6(int i17, fc2.w wVar, r45.qt2 qt2Var) {
        int i18;
        boolean contains;
        boolean z17;
        int integer;
        r45.u94 u94Var;
        long j17;
        boolean z18;
        r45.u94 u94Var2;
        com.tencent.mm.plugin.finder.assist.i2 i2Var = com.tencent.mm.plugin.finder.assist.i2.f102246a;
        r45.w11 w11Var = com.tencent.mm.plugin.finder.assist.i2.f102247b;
        boolean z19 = false;
        if (w11Var != null) {
            int integer2 = (w11Var == null || (u94Var2 = (r45.u94) w11Var.getCustom(0)) == null) ? 0 : u94Var2.getInteger(0);
            if (integer2 <= 0) {
                return;
            }
            int i19 = wVar.f260994m;
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f135293g;
            java.util.List listOfType = baseFeedLoader == null ? kz5.p0.f313996d : baseFeedLoader.getListOfType(so2.j5.class);
            if (!listOfType.isEmpty() && (i18 = i19 + integer2) >= 0 && i18 < listOfType.size()) {
                so2.j5 j5Var = (so2.j5) listOfType.get(i18);
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    long itemId = j5Var.getItemId();
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
                    if (!feedObject.isLiveFeed() || feedObject.isReplayLiveFeed() || hc2.o0.E(feedObject.getFeedObject(), false, 1, null)) {
                        return;
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.hb hbVar = this.f135302s;
                    synchronized (hbVar.f134606b) {
                        contains = hbVar.f134607c.contains(java.lang.Long.valueOf(itemId));
                    }
                    if (contains) {
                        return;
                    }
                    if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                        z17 = true;
                    } else {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        z17 = false;
                    }
                    if (!z17 || (integer = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127741hh).getValue()).r()).intValue()) <= 0) {
                        r45.w11 w11Var2 = com.tencent.mm.plugin.finder.assist.i2.f102247b;
                        integer = (w11Var2 == null || (u94Var = (r45.u94) w11Var2.getCustom(0)) == null) ? 0 : u94Var.getInteger(1);
                    }
                    long j18 = integer;
                    r45.hl2 client_local_buffer = feedObject.getFeedObject().getClient_local_buffer();
                    long j19 = client_local_buffer != null ? client_local_buffer.getLong(0) : c01.id.c();
                    long c17 = (c01.id.c() - j19) / 1000;
                    boolean z27 = j18 > 0 && c17 > j18;
                    com.tencent.mm.plugin.finder.viewmodel.component.hb hbVar2 = this.f135302s;
                    java.util.List list = (java.util.List) hbVar2.f134605a.invoke();
                    if (list.isEmpty()) {
                        j17 = itemId;
                    } else {
                        synchronized (hbVar2.f134606b) {
                            java.util.ArrayDeque arrayDeque = hbVar2.f134608d;
                            if (!(arrayDeque instanceof java.util.Collection) || !arrayDeque.isEmpty()) {
                                java.util.Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    com.tencent.mm.plugin.finder.viewmodel.component.fb fbVar = (com.tencent.mm.plugin.finder.viewmodel.component.fb) it.next();
                                    j17 = itemId;
                                    if (fbVar.f134388c > j19 && list.contains(java.lang.Integer.valueOf(fbVar.f134387b))) {
                                        z18 = true;
                                        break;
                                    }
                                    itemId = j17;
                                }
                            }
                            j17 = itemId;
                            z18 = false;
                        }
                        z19 = z18;
                    }
                    if (z27 || z19) {
                        com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[checkLiveRefreshTrigger] trigger live refresh feedId:" + pm0.v.u(j17) + " elapsedSec:" + c17 + " triggerTimeSec:" + j18 + " timeOk:" + z27 + " actionOk:" + z19);
                        com.tencent.mm.plugin.finder.viewmodel.component.hb hbVar3 = this.f135302s;
                        synchronized (hbVar3.f134606b) {
                            hbVar3.f134607c.add(java.lang.Long.valueOf(j17));
                            while (hbVar3.f134607c.size() > 200) {
                                java.util.Iterator it6 = hbVar3.f134607c.iterator();
                                kotlin.jvm.internal.o.f(it6, "iterator(...)");
                                if (!it6.hasNext()) {
                                    break;
                                }
                                it6.next();
                                it6.remove();
                            }
                        }
                        if (z19) {
                            com.tencent.mm.plugin.finder.viewmodel.component.hb hbVar4 = this.f135302s;
                            synchronized (hbVar4.f134606b) {
                                if (!hbVar4.f134608d.isEmpty()) {
                                    int size = hbVar4.f134608d.size();
                                    kz5.h0.A(hbVar4.f134608d, new com.tencent.mm.plugin.finder.viewmodel.component.gb(j19));
                                    int size2 = size - hbVar4.f134608d.size();
                                    if (size2 > 0) {
                                        com.tencent.mars.xlog.Log.i("Finder.LiveRefreshState", "[cleanActionsBefore] removed=" + size2 + " remain=" + hbVar4.f134608d.size());
                                    }
                                }
                            }
                        }
                        pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.gc(this, i17, feedObject, qt2Var, feedObject.getFeedObject(), null), 3, null);
                    }
                }
            }
        }
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.eb W6(long j17) {
        com.tencent.mm.plugin.finder.viewmodel.component.eb ebVar = (com.tencent.mm.plugin.finder.viewmodel.component.eb) this.f135300q.get(java.lang.Long.valueOf(j17));
        return ebVar == null ? new com.tencent.mm.plugin.finder.viewmodel.component.eb(j17, 0L, 0) : ebVar;
    }

    public final ey2.i2 X6() {
        return (ey2.i2) this.f135296m.getValue();
    }

    public final boolean Y6(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17) {
        boolean z18 = false;
        if (finderItem != null) {
            long id6 = finderItem.getId();
            nv2.h1 h1Var = nv2.n1.f340550g;
            boolean booleanValue = ((java.lang.Boolean) nv2.n1.f340551h.k(finderItem.getFeedObject()).f302833d).booleanValue();
            com.tencent.mm.plugin.finder.viewmodel.component.eb W6 = W6(id6);
            if (booleanValue && ((!z17 && W6.f134247c == 1) || (z17 && W6.f134247c >= 1))) {
                z18 = true;
            }
            com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[isFinWatchAndLike] feedId:" + pm0.v.u(id6) + " fromLike:" + z17 + " isLike:" + booleanValue + " replayCount:" + W6.f134247c + " isFinWatchAndLike:" + z18);
        }
        return z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(int r28, fc2.a r29, r45.qt2 r30, yz5.a r31) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.nc.Z6(int, fc2.a, r45.qt2, yz5.a):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0226, code lost:
    
        if (com.tencent.mm.plugin.finder.assist.j2.a(r15, 13) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0239, code lost:
    
        if (com.tencent.mm.plugin.finder.assist.j2.a(r15, 12) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027c, code lost:
    
        if (com.tencent.mm.plugin.finder.assist.j2.a(r15, 9) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a1, code lost:
    
        if (com.tencent.mm.plugin.finder.assist.j2.a(r15, 5) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        if (com.tencent.mm.plugin.finder.assist.j2.a(r15, 15) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(int r28, com.tencent.mm.plugin.finder.viewmodel.component.db r29, r45.qt2 r30, com.tencent.mm.plugin.finder.storage.FinderItem r31, r45.vd6 r32, int r33, long r34) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.nc.a7(int, com.tencent.mm.plugin.finder.viewmodel.component.db, r45.qt2, com.tencent.mm.plugin.finder.storage.FinderItem, r45.vd6, int, long):void");
    }

    public final java.lang.String b7(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        return pm0.v.u(finderObject.getId()) + '#' + finderObject.getNickname();
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        ds2.b0 b0Var = (ds2.b0) ((jz5.n) this.f135295i).getValue();
        b0Var.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        b0Var.f("onClearAll", new ds2.z(linkedList, b0Var));
        com.tencent.mars.xlog.Log.i(b0Var.f242859g, "[onClearAll] " + linkedList);
        this.f135300q.clear();
        this.f135301r = null;
        com.tencent.mm.plugin.finder.viewmodel.component.hb hbVar = this.f135302s;
        synchronized (hbVar.f134606b) {
            hbVar.f134607c.clear();
            hbVar.f134608d.clear();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135290d = new java.util.concurrent.ConcurrentSkipListSet();
        this.f135291e = new java.util.LinkedList();
        this.f135292f = new eb2.u();
        this.f135295i = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.ic.f134732d);
        this.f135296m = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.mc.f135161d);
        this.f135298o = new java.util.LinkedHashSet();
        this.f135300q = new java.util.concurrent.ConcurrentHashMap();
        this.f135302s = new com.tencent.mm.plugin.finder.viewmodel.component.hb(com.tencent.mm.plugin.finder.viewmodel.component.ub.f136120d);
        f135289z.clear();
        this.f135304u = -1;
        this.f135306w = -1;
        this.f135307x = new java.util.concurrent.atomic.AtomicInteger(0);
    }
}
