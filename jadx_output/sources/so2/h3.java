package so2;

/* loaded from: classes2.dex */
public final class h3 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.h3 f410392d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f410393e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f410394f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.LinkedList f410395g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f410396h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f410397i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f410398m;

    /* renamed from: n, reason: collision with root package name */
    public static java.util.HashMap f410399n;

    static {
        so2.h3 h3Var = new so2.h3();
        f410392d = h3Var;
        f410393e = jz5.h.b(so2.d3.f410313d);
        f410394f = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED), -18});
        f410395g = new java.util.LinkedList();
        f410396h = jz5.h.b(so2.e3.f410329d);
        if (!h3Var.g()) {
            gm0.j1.d().a(3520, h3Var);
        }
        f410397i = new com.tencent.mm.sdk.platformtools.n3("Finder.FinderMarkReadLogic", so2.g3.f410361d);
        f410398m = new java.util.concurrent.atomic.AtomicInteger(0);
        f410399n = new java.util.HashMap();
    }

    public static final void a(so2.h3 h3Var) {
        h3Var.getClass();
        r45.qf2 qf2Var = new r45.qf2();
        qf2Var.set(2, f410395g);
        byte[] byteArray = qf2Var.toByteArray();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102145n;
        sb6.append(str);
        sb6.append("markread.info");
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.vfs.w6.j(sb7)) {
            com.tencent.mm.vfs.w6.f(sb7);
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        com.tencent.mm.vfs.w6.R(sb7, byteArray);
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "saveToFile " + sb7);
    }

    public static final void b(so2.h3 h3Var) {
        h3Var.getClass();
        int i17 = 0;
        while (i17 < f410395g.size()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i18 = i17 + 50;
            if (f410395g.size() > i18) {
                linkedList.addAll(f410395g.subList(i17, i18));
            } else {
                java.util.LinkedList linkedList2 = f410395g;
                linkedList.addAll(linkedList2.subList(i17, linkedList2.size()));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start to send new cgi ");
            sb6.append(h3Var.g());
            sb6.append(' ');
            sb6.append(linkedList.size());
            sb6.append(' ');
            java.util.LinkedList linkedList3 = f410395g;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((r45.ni4) it.next()).getLong(0)));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", sb6.toString());
            if (h3Var.g()) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                bq.z0 z0Var = new bq.z0(linkedList, null);
                z0Var.l().q(new so2.f3(z0Var));
            } else {
                db2.h6 h6Var = new db2.h6(linkedList);
                gm0.j1.d().a(3520, h3Var);
                gm0.j1.d().g(h6Var);
            }
            i17 = i18;
        }
    }

    public final void c(java.util.List list, r45.qt2 contextObj, int i17) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fc2.r) it.next()).f260977a);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            fc2.r rVar = (fc2.r) it6.next();
            if (rVar.f260977a.getItemId() != 0) {
                so2.j5 j5Var = rVar.f260977a;
                if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                    if (f410394f.contains(java.lang.Integer.valueOf(j5Var.h()))) {
                    }
                }
                r45.ni4 ni4Var = new r45.ni4();
                ni4Var.set(6, java.lang.Integer.valueOf(rVar.f260978b));
                ni4Var.set(0, java.lang.Long.valueOf(j5Var.getItemId()));
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                ni4Var.set(15, baseFinderFeed != null ? baseFinderFeed.w() : null);
                f410392d.f(ni4Var, contextObj.getInteger(5), contextObj.getInteger(7));
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long itemId = j5Var.getItemId();
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                ni4Var.set(4, o3Var.ek(itemId, baseFinderFeed2 != null ? baseFinderFeed2.w() : null, contextObj.getInteger(5)));
                linkedList.add(ni4Var);
            }
        }
        e(linkedList, arrayList, contextObj, i17);
    }

    public final void d(java.util.LinkedList itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "addMarkReadItemList " + itemList.size());
        android.os.Message obtainMessage = f410397i.obtainMessage(0);
        obtainMessage.obj = itemList;
        obtainMessage.sendToTarget();
    }

    public final void e(java.util.LinkedList itemList, java.util.List list, r45.qt2 contextObj, int i17) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        d(itemList);
        if (contextObj.getInteger(5) == 17 || contextObj.getInteger(5) == 18 || contextObj.getInteger(5) == 156 || contextObj.getInteger(5) == 155 || contextObj.getInteger(5) == 171 || contextObj.getInteger(5) == 25 || contextObj.getInteger(5) == 1 || contextObj.getInteger(5) == 120) {
            ((ey2.i2) pf5.u.f353936a.e(c61.l7.class).a(ey2.i2.class)).N6(contextObj.getInteger(5), list);
        } else if (contextObj.getInteger(5) == 51) {
            ey2.e2 e2Var = (ey2.e2) pf5.u.f353936a.e(c61.l7.class).a(ey2.e2.class);
            e2Var.getClass();
            synchronized (e2Var.f257359g) {
                java.util.Iterator it = itemList.iterator();
                while (it.hasNext()) {
                    r45.ni4 ni4Var = (r45.ni4) it.next();
                    java.util.Iterator it6 = e2Var.f257359g.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i18 = -1;
                            break;
                        } else {
                            if (((r45.ni4) it6.next()).getLong(0) == ni4Var.getLong(0)) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                    if (i18 < 0 && !e2Var.f257360h.contains(java.lang.Long.valueOf(ni4Var.getLong(0)))) {
                        e2Var.f257359g.add(ni4Var);
                        e2Var.f257360h.add(java.lang.Long.valueOf(ni4Var.getLong(0)));
                    }
                }
            }
        }
        ey2.i2 i2Var = (ey2.i2) pf5.u.f353936a.e(c61.l7.class).a(ey2.i2.class);
        i2Var.getClass();
        if (list != null && i17 == 39) {
            i2Var.f257398i.b(list);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0032. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0035. Please report as an issue. */
    public final void f(r45.ni4 markReadStat, int i17, int i18) {
        kotlin.jvm.internal.o.g(markReadStat, "markReadStat");
        markReadStat.set(3, java.lang.Integer.valueOf(i17));
        if (i17 != 1) {
            if (i17 == 20) {
                markReadStat.set(1, 6);
                markReadStat.set(2, 4);
                return;
            }
            if (i17 != 22) {
                if (i17 != 43) {
                    if (i17 == 76) {
                        markReadStat.set(1, 9);
                        return;
                    }
                    if (i17 == 80) {
                        markReadStat.set(1, 10);
                        return;
                    }
                    if (i17 != 156 && i17 != 171) {
                        switch (i17) {
                            case 4:
                            case 5:
                            case 7:
                                markReadStat.set(1, 2);
                                return;
                            case 6:
                                markReadStat.set(1, 4);
                                return;
                            case 8:
                                break;
                            default:
                                switch (i17) {
                                    case 15:
                                        markReadStat.set(1, 1);
                                        markReadStat.set(2, 3);
                                        return;
                                    case 16:
                                        break;
                                    case 17:
                                        break;
                                    case 18:
                                        markReadStat.set(1, 1);
                                        markReadStat.set(2, 2);
                                        return;
                                    default:
                                        switch (i17) {
                                            case 26:
                                                break;
                                            case 27:
                                                break;
                                            case 28:
                                            case 29:
                                            case 30:
                                            case 31:
                                                markReadStat.set(1, 8);
                                                return;
                                            default:
                                                return;
                                        }
                                }
                            case 9:
                                if (i18 == 34) {
                                    markReadStat.set(1, 8);
                                    return;
                                } else {
                                    markReadStat.set(1, 5);
                                    return;
                                }
                        }
                    }
                    markReadStat.set(1, 1);
                    markReadStat.set(2, 1);
                    return;
                }
                markReadStat.set(1, 7);
                markReadStat.set(2, 4);
                return;
            }
            if (i18 == 34) {
                markReadStat.set(1, 8);
                return;
            }
            return;
        }
        markReadStat.set(1, 3);
    }

    public final boolean g() {
        return ((java.lang.Boolean) f410393e.getValue()).booleanValue();
    }

    public final java.util.LinkedList h(int i17) {
        r45.ni4 ni4Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128019x7).getValue()).r()).booleanValue()) {
            return linkedList;
        }
        java.util.HashMap hashMap = (java.util.HashMap) f410399n.get(java.lang.Integer.valueOf(i17 != 1 ? i17 != 3 ? i17 != 4 ? 0 : 20 : 17 : 18));
        if (hashMap != null) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (((so2.x5) entry.getValue()).f410700e) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                linkedList2.add(((java.util.Map.Entry) it.next()).getValue());
            }
            kz5.g0.s(linkedList2);
            int i18 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.x5 x5Var = (so2.x5) obj;
                if (i18 < 20 && x5Var != null && (ni4Var = x5Var.f410702g) != null) {
                    linkedList.add(ni4Var);
                }
                i18 = i19;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getStreamMarkReadList: tabType=");
        sb6.append(i17);
        sb6.append(", size=");
        sb6.append(linkedList.size());
        sb6.append(", ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add(pm0.v.u(((r45.ni4) it6.next()).getLong(0)));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", sb6.toString());
        return linkedList;
    }

    public final void i() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = f410397i;
        n3Var.removeMessages(1);
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderMarkReadReportIntervalSecond", 60);
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "nextSend size: " + f410395g.size() + " delay second: " + b17);
        n3Var.sendEmptyMessageDelayed(1, ((long) b17) * 1000);
    }

    public final void j(int i17, java.util.List feedList) {
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(feedList, "feedList");
        if (i17 == 1) {
            i18 = 18;
        } else if (i17 == 3) {
            i18 = 17;
        } else if (i17 != 4) {
            return;
        } else {
            i18 = 20;
        }
        java.util.HashMap hashMap = (java.util.HashMap) f410399n.get(java.lang.Integer.valueOf(i18));
        int size = hashMap != null ? hashMap.size() : 0;
        java.util.Iterator it = feedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            java.util.HashMap hashMap2 = (java.util.HashMap) f410399n.get(java.lang.Integer.valueOf(i18));
            jz5.f0 f0Var = null;
            if (hashMap2 != null) {
                so2.x5 x5Var = (so2.x5) hashMap2.get(java.lang.Long.valueOf(finderObject.getId()));
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (x5Var != null) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "already in mark read map isRead:" + x5Var.f410700e);
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    hashMap2.put(java.lang.Long.valueOf(finderObject.getId()), new so2.x5(finderObject.getId(), false, 0L, null, 14, null));
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                java.util.HashMap hashMap3 = f410399n;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put(java.lang.Long.valueOf(finderObject.getId()), new so2.x5(finderObject.getId(), false, 0L, null, 14, null));
                hashMap3.put(valueOf, hashMap4);
            }
        }
        java.util.HashMap hashMap5 = (java.util.HashMap) f410399n.get(java.lang.Integer.valueOf(i18));
        if (hashMap5 == null || hashMap5.size() <= 50) {
            i19 = 0;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(hashMap5.values());
            kz5.g0.s(linkedList);
            java.util.HashMap hashMap6 = f410399n;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.util.HashMap hashMap7 = new java.util.HashMap();
            i19 = 0;
            java.util.List<so2.x5> subList = linkedList.subList(0, 50);
            kotlin.jvm.internal.o.f(subList, "subList(...)");
            for (so2.x5 x5Var2 : subList) {
                hashMap7.put(java.lang.Long.valueOf(x5Var2.f410699d), x5Var2);
            }
            hashMap6.put(valueOf2, hashMap7);
        }
        java.util.HashMap hashMap8 = (java.util.HashMap) f410399n.get(java.lang.Integer.valueOf(i18));
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "onStreamCgiBack beforeSize:" + size + " afterSize:" + (hashMap8 != null ? hashMap8.size() : i19));
    }

    public final void k(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        android.os.Message obtainMessage = f410397i.obtainMessage(2);
        obtainMessage.obj = list;
        obtainMessage.sendToTarget();
    }

    public final void l() {
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "start success " + f410398m.incrementAndGet());
        i();
    }

    public final void m() {
        int decrementAndGet = f410398m.decrementAndGet();
        if (decrementAndGet != 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "not really stop " + decrementAndGet);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "really stop");
            com.tencent.mm.sdk.platformtools.n3 n3Var = f410397i;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessage(5);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadLogic", "onSceneEnd errType:" + i17 + " errCode:" + i18);
        if (m1Var == null || !(m1Var instanceof db2.h6)) {
            return;
        }
        so2.h3 h3Var = f410392d;
        if (!h3Var.g() && i17 == 0 && i18 == 0) {
            h3Var.k(((db2.h6) m1Var).f228011g);
        }
    }
}
