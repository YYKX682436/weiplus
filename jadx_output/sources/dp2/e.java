package dp2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f242193b;

    /* renamed from: a, reason: collision with root package name */
    public static final dp2.e f242192a = new dp2.e();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f242194c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static long f242195d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f242196e = jz5.h.b(dp2.d.f242191d);

    public static final java.lang.String a(dp2.e eVar, long j17, java.lang.String str) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) f242194c.get(eVar.f(j17, str));
        if (finderObject == null) {
            return "";
        }
        com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "getTargetLiveId return for hit cache.");
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        return java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
    }

    public static final void b(dp2.e eVar, long j17, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        synchronized (eVar.e()) {
            java.util.LinkedList linkedList = (java.util.LinkedList) f242192a.e().remove(java.lang.Long.valueOf(j17));
            if (linkedList != null) {
                com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "invokeFinderObjectCallback " + j17 + " size:" + linkedList.size());
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.invoke(finderObject);
                    } else {
                        com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "invokeFinderObjectCallback callback is null!");
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d4  */
    /* JADX WARN: Type inference failed for: r8v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(dp2.e r40, android.app.Activity r41, int r42, long r43, java.lang.String r45, java.lang.String r46, java.lang.String r47, long r48, yz5.l r50, int r51, java.lang.Object r52) {
        /*
            Method dump skipped, instructions count: 1481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp2.e.d(dp2.e, android.app.Activity, int, long, java.lang.String, java.lang.String, java.lang.String, long, yz5.l, int, java.lang.Object):void");
    }

    public void c(com.tencent.mm.ui.MMActivity mMActivity, long j17, java.lang.String str, boolean z17, int i17, yz5.l lVar) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        java.lang.String str2 = str;
        if (j17 == -1 || j17 == 0) {
            com.tencent.mars.xlog.Log.w("NearbyEnterTargetLiveRoomChecker", "checkEnterTargetLiveRoom return for targetObjectId:" + j17);
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "checkEnterTargetLiveRoom activity:" + mMActivity + ", checkCache:" + z17 + ", targetObjectId:" + j17 + " targetObjectNonceId:" + str2);
        if (z17 && (h17 = bu2.j.f24534a.h(j17)) != null) {
            if (lVar != null) {
                lVar.invoke(h17.getFeedObject());
                return;
            }
            return;
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(i17));
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchTargetLiveRoomObject activity:");
        sb6.append(mMActivity);
        sb6.append(", objectId:");
        sb6.append(j17);
        sb6.append(" objectNonceId:");
        sb6.append(str3);
        sb6.append(",onGetFinderObjectCallback is null:");
        sb6.append(lVar == null);
        com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", sb6.toString());
        f242195d = java.lang.System.currentTimeMillis();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) f242194c.get(f(j17, str3));
        if (finderObject != null) {
            com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject fetch time:" + (java.lang.System.currentTimeMillis() - f242195d));
            if (lVar != null) {
                lVar.invoke(finderObject);
            }
            com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject return for hit cache.");
            return;
        }
        if (lVar != null) {
            synchronized (e()) {
                dp2.e eVar = f242192a;
                java.util.LinkedList linkedList = (java.util.LinkedList) eVar.e().get(java.lang.Long.valueOf(j17));
                if (linkedList != null) {
                    linkedList.add(new java.lang.ref.WeakReference(lVar));
                    com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "setFinderObjectCallback add " + j17 + " onGetFinderObjectCallback size:" + linkedList.size());
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    java.util.HashMap e17 = eVar.e();
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(new java.lang.ref.WeakReference(lVar));
                    e17.put(valueOf, linkedList2);
                    com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "setFinderObjectCallback put " + j17 + " onGetFinderObjectCallback");
                }
            }
        }
        if (f242193b) {
            com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject return for isFetchTargetFeed:" + f242193b + '.');
            return;
        }
        f242193b = true;
        pq5.g l17 = new db2.g4(j17, str3, 0, 2, "", true, null, null, 0L, null, false, false, null, qt2Var, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536829888, null).l();
        if (mMActivity != null) {
            l17.f(mMActivity);
        }
        l17.h(new dp2.c(j17, str3));
    }

    public final java.util.HashMap e() {
        return (java.util.HashMap) ((jz5.n) f242196e).getValue();
    }

    public final java.lang.String f(long j17, java.lang.String str) {
        return j17 + '-' + str;
    }

    public final r45.kd1 g() {
        r45.xs2 Q = ((c61.l7) i95.n0.c(c61.l7.class)).nk().Q("NearbyLiveTab");
        boolean z17 = Q != null;
        r45.kd1 kd1Var = new r45.kd1();
        if (Q != null) {
            kd1Var.set(0, java.lang.Long.valueOf(Q.getLong(3)));
            kd1Var.set(1, Q.getString(8));
            kd1Var.set(2, Q.getByteString(7));
            if (c92.g.f39738a.b()) {
                kd1Var.set(3, "FinderLiveEntrance");
            } else {
                kd1Var.set(3, "NearbyEntrance");
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRedDotInfo isEnterRequest=");
        sb6.append(z17);
        sb6.append(" tab_tips_path=");
        sb6.append(kd1Var.getString(3));
        sb6.append("  tabTipsByPassInfo=");
        sb6.append(kd1Var.getByteString(2) != null);
        sb6.append(" objectId=");
        sb6.append(pm0.v.u(kd1Var.getLong(0)));
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("NearbyEnterTargetLiveRoomChecker", sb6.toString());
        return kd1Var;
    }
}
