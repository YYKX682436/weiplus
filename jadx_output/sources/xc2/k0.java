package xc2;

/* loaded from: classes2.dex */
public final class k0 extends pf5.o0 {
    public static long A;

    /* renamed from: z */
    public static int f453174z;

    /* renamed from: f */
    public kotlinx.coroutines.r2 f453176f;

    /* renamed from: g */
    public yz5.a f453177g;

    /* renamed from: y */
    public static final xc2.u f453173y = new xc2.u(null);
    public static final java.util.Map B = kz5.c1.k(new jz5.l(33, 1), new jz5.l(59, 60), new jz5.l(22, 9), new jz5.l(26, 27), new jz5.l(81, 96), new jz5.l(35, 2), new jz5.l(24, 21), new jz5.l(138, java.lang.Integer.valueOf(bd1.f.CTRL_INDEX)));

    /* renamed from: e */
    public final zc2.a f453175e = new zc2.a(new xc2.d0(this));

    /* renamed from: h */
    public final java.util.concurrent.ConcurrentHashMap f453178h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i */
    public final java.util.concurrent.ConcurrentHashMap f453179i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m */
    public final java.util.concurrent.ConcurrentHashMap f453180m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n */
    public final java.util.concurrent.ConcurrentHashMap f453181n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o */
    public final java.util.concurrent.ConcurrentHashMap f453182o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p */
    public final java.util.concurrent.ConcurrentHashMap f453183p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q */
    public final java.util.concurrent.ConcurrentHashMap f453184q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r */
    public final java.util.concurrent.ConcurrentHashMap f453185r = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: s */
    public final java.util.concurrent.ConcurrentHashMap f453186s = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: t */
    public final java.util.concurrent.ConcurrentHashMap f453187t = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u */
    public final java.util.concurrent.ConcurrentHashMap f453188u = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: v */
    public final java.util.concurrent.ConcurrentHashMap f453189v = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: w */
    public final java.util.concurrent.ConcurrentHashMap f453190w = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: x */
    public final java.util.Set f453191x = new java.util.LinkedHashSet();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0124. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N6(xc2.k0 r32, java.util.List r33, java.util.HashMap r34) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.k0.N6(xc2.k0, java.util.List, java.util.HashMap):void");
    }

    public static final void O6(xc2.k0 k0Var, int i17, int i18, java.lang.String str, java.util.List list, java.lang.String str2) {
        java.util.ArrayList arrayList;
        k0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[request] scene=");
        sb6.append(i17);
        sb6.append(" commentScene=");
        sb6.append(i18);
        sb6.append(" feedId=");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(str2);
        sb6.append('=');
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) it.next();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jump_id=");
                sb7.append(finderJumpInfo.getJump_id());
                sb7.append("#jump_type=");
                sb7.append(finderJumpInfo.getJumpinfo_type());
                sb7.append("#business_type=");
                sb7.append(finderJumpInfo.getBusiness_type());
                sb7.append("#wording=");
                sb7.append(finderJumpInfo.getWording());
                sb7.append("#style=");
                java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
                kotlin.jvm.internal.o.f(style, "getStyle(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(style, 10));
                for (r45.wf6 wf6Var : style) {
                    arrayList2.add("pos=" + wf6Var.getInteger(1) + "#style=" + wf6Var.getInteger(2) + "#screen=" + wf6Var.getInteger(0));
                }
                sb7.append(arrayList2);
                arrayList.add(sb7.toString());
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.FeedGlobalJumperUIC", sb6.toString());
    }

    public static void e7(xc2.k0 k0Var, com.tencent.mm.protocal.protobuf.FinderObject feed, int i17, r45.qt2 qt2Var, int i18, com.tencent.mm.protobuf.g gVar, r45.tj2 tj2Var, int i19, java.lang.Object obj) {
        r45.qt2 qt2Var2 = (i19 & 4) != 0 ? null : qt2Var;
        int i27 = (i19 & 8) != 0 ? 0 : i18;
        com.tencent.mm.protobuf.g gVar2 = (i19 & 16) != 0 ? null : gVar;
        r45.tj2 tj2Var2 = (i19 & 32) != 0 ? null : tj2Var;
        k0Var.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        k0Var.d7(kz5.b0.c(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(feed, 0)), i17, qt2Var2, i27, gVar2, tj2Var2);
    }

    public static /* synthetic */ void f7(xc2.k0 k0Var, java.util.List list, int i17, r45.qt2 qt2Var, int i18, com.tencent.mm.protobuf.g gVar, r45.tj2 tj2Var, int i19, java.lang.Object obj) {
        k0Var.d7(list, i17, (i19 & 4) != 0 ? null : qt2Var, (i19 & 8) != 0 ? 0 : i18, (i19 & 16) != 0 ? null : gVar, (i19 & 32) != 0 ? null : tj2Var);
    }

    public final void P6(java.util.HashMap hashMap, int i17, java.util.LinkedList linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K0().r()).booleanValue()) {
            kz5.g0.t(linkedList, new xc2.w(new xc2.v(i17), i17));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.LinkedList) obj).addAll(linkedList);
    }

    public final androidx.lifecycle.j0 Q6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453186s;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 R6(long j17, int i17, java.lang.String str) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453188u;
        java.lang.String a17 = f453173y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a17, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 S6(long j17, long j18, int i17, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453179i;
        java.lang.Integer num = (java.lang.Integer) B.get(java.lang.Integer.valueOf(i17));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            i17 = intValue;
        }
        java.lang.String str2 = j17 + '#' + str + '#' + j18 + '#' + i17;
        java.lang.Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            obj = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.La).getValue()).r()).booleanValue() ? new xc2.e3() : new androidx.lifecycle.j0();
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(str2, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 T6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453185r;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 U6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453181n;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 V6(long j17, int i17, java.lang.String str) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453187t;
        java.lang.String a17 = f453173y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a17, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 W6(long j17, int i17, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453178h;
        java.lang.String a17 = f453173y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            obj = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.La).getValue()).r()).booleanValue() ? new xc2.e3() : new androidx.lifecycle.j0();
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(a17, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (androidx.lifecycle.j0) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo X6(android.content.Context context, long j17, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        if (j17 != 0 && i17 != 0) {
            if (context instanceof androidx.lifecycle.y) {
            }
            java.util.Set set = (java.util.Set) W6(j17, i17, str).getValue();
            if (set != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : set) {
                    int i18 = ((xc2.t) obj).f453301c;
                    if (i18 == 6 || i18 == 7) {
                        arrayList.add(obj);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : ((xc2.t) it.next()).f453302d) {
                        if (finderJumpInfo.getBusiness_type() == 21 || finderJumpInfo.getBusiness_type() == 61) {
                            return finderJumpInfo;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final androidx.lifecycle.j0 Y6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453182o;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 Z6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453190w;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 a7(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453184q;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 b7(long j17, int i17, java.lang.String str) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453189v;
        java.lang.String a17 = f453173y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a17, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final androidx.lifecycle.j0 c7(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f453180m;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(java.util.List r20, int r21, r45.qt2 r22, int r23, com.tencent.mm.protobuf.g r24, r45.tj2 r25) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.k0.d7(java.util.List, int, r45.qt2, int, com.tencent.mm.protobuf.g, r45.tj2):void");
    }

    public final void g7(java.util.List list, int i17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList.add(feedObject);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) next;
            long id6 = finderItem.getId();
            zc2.a aVar = this.f453175e;
            zc2.b bVar = (zc2.b) aVar.f471405b.get(java.lang.Long.valueOf(id6));
            long j17 = (bVar == null || bVar.f471407b == 1) ? 0L : bVar.f471406a;
            boolean z17 = j17 != 0 && c01.id.a() - j17 > 30000;
            if (z17) {
                zc2.b bVar2 = (zc2.b) aVar.f471405b.get(java.lang.Long.valueOf(finderItem.getId()));
                if (bVar2 != null) {
                    bVar2.f471407b = 1;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedGlobalJumperUIC", "requestFeedsByCacheFilter refreshTime:" + j17 + " delta:" + (c01.id.a() - j17) + " isRefresh:" + z17);
            if (z17) {
                arrayList2.add(next);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedGlobalJumperUIC", "requestFeedsByCacheFilter: size:" + arrayList2.size());
        if (!arrayList2.isEmpty()) {
            f7(this, arrayList2, i17, null, 0, null, null, 60, null);
        }
    }

    public final void h7(java.util.List list, int i17) {
        if (list == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList.add(feedObject);
            }
        }
        f7(this, arrayList, i17, null, 0, null, null, 60, null);
    }

    public final void i7(ec2.a event, r45.qt2 qt2Var) {
        r45.mr2 mr2Var;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = event.f250949g;
        if (finderItem == null) {
            return;
        }
        java.util.Set set = this.f453191x;
        if (set.contains(java.lang.Long.valueOf(finderItem.getId()))) {
            return;
        }
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = com.tencent.mm.plugin.finder.viewmodel.component.nc.f135289z;
        com.tencent.mm.plugin.finder.viewmodel.component.db dbVar = (com.tencent.mm.plugin.finder.viewmodel.component.db) com.tencent.mm.plugin.finder.viewmodel.component.nc.D.get(java.lang.Integer.valueOf(event.f250946d));
        if (dbVar == null) {
            dbVar = com.tencent.mm.plugin.finder.viewmodel.component.db.f134116z;
        }
        int i17 = dbVar.f134117d;
        r45.dm2 object_extend = finderItem.getFeedObject().getObject_extend();
        boolean z17 = false;
        java.util.LinkedList list = (object_extend == null || (mr2Var = (r45.mr2) object_extend.getCustom(61)) == null) ? null : mr2Var.getList(0);
        if (list != null && list.contains(java.lang.Integer.valueOf(i17))) {
            z17 = true;
        }
        if (z17) {
            androidx.lifecycle.j0 a76 = ((xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class)).a7(finderItem.getId());
            if (a76.getValue() != null) {
                return;
            }
            set.add(java.lang.Long.valueOf(finderItem.getId()));
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pm0.v.T(new bq.k0(finderItem.getId(), finderItem.getDupFlag(), i17, qt2Var).l(), new cq.z0(new xc2.i0(finderItem, a76, this), new xc2.j0(this, finderItem)));
        }
    }
}
