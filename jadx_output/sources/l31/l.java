package l31;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.n f315367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315371h;

    public l(l31.n nVar, int i17, int i18, java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f315367d = nVar;
        this.f315368e = i17;
        this.f315369f = i18;
        this.f315370g = str;
        this.f315371h = subscribeMsgRequestResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r47;
        java.util.List list;
        java.util.List<com.tencent.mm.msgsubscription.NotifySwitchItem> list2;
        l31.n nVar = this.f315367d;
        l31.k kVar = nVar.f315374f;
        if (kVar != null) {
            int i17 = this.f315368e;
            int i18 = this.f315369f;
            java.lang.String errMsg = this.f315370g;
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f315371h;
            java.util.List requestedUsernames = nVar.f315373e;
            g31.w wVar = (g31.w) kVar;
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            kotlin.jvm.internal.o.g(requestedUsernames, "requestedUsernames");
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeSwitchInfoBatchFetcher", "onNetSceneEndCallback errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
            if (i17 == 0 && i18 == 0) {
                g31.y yVar = wVar.f268126a;
                java.util.List<java.lang.String> list3 = wVar.f268127b;
                yVar.getClass();
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                if (subscribeMsgRequestResult != null && (list2 = subscribeMsgRequestResult.B) != null) {
                    for (com.tencent.mm.msgsubscription.NotifySwitchItem notifySwitchItem : list2) {
                        if (notifySwitchItem.f71767d.length() > 0) {
                            linkedHashSet.add(notifySwitchItem.f71767d);
                            g31.r rVar = (g31.r) ((java.util.LinkedHashMap) yVar.f268130b).get(notifySwitchItem.f71767d);
                            if (rVar != null) {
                                rVar.f268110c = g31.s.f268115g;
                                rVar.f268109b = java.lang.System.currentTimeMillis();
                                rVar.f268111d = 0;
                            }
                        }
                    }
                }
                for (java.lang.String str : list3) {
                    if (!linkedHashSet.contains(str)) {
                        g31.r rVar2 = (g31.r) ((java.util.LinkedHashMap) yVar.f268130b).get(str);
                        if (rVar2 != null) {
                            rVar2.f268110c = g31.s.f268114f;
                            rVar2.f268109b = java.lang.System.currentTimeMillis();
                            rVar2.f268111d++;
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.SubscribeSwitchInfoBatchFetcher", "handleCgiSuccess: username(%s) not found in response", str);
                    }
                }
                if (subscribeMsgRequestResult == null || (list = subscribeMsgRequestResult.B) == null) {
                    r47 = kz5.p0.f313996d;
                } else {
                    r47 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        com.tencent.mm.msgsubscription.NotifySwitchItem notifySwitchItem2 = (com.tencent.mm.msgsubscription.NotifySwitchItem) obj;
                        if ((notifySwitchItem2.f71767d.length() > 0) && linkedHashSet.contains(notifySwitchItem2.f71767d)) {
                            r47.add(obj);
                        }
                    }
                }
                if (!r47.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(r47, 10));
                    for (com.tencent.mm.msgsubscription.NotifySwitchItem notifySwitchItem3 : r47) {
                        arrayList.add(new g31.t(notifySwitchItem3.f71767d, notifySwitchItem3.f71768e, notifySwitchItem3.f71769f));
                    }
                    ((ku5.t0) ku5.t0.f312615d).g(new g31.v(r47, yVar, arrayList));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SubscribeSwitchInfoBatchFetcher", "CGI failed, errCode=%d", java.lang.Integer.valueOf(i18));
                g31.y yVar2 = wVar.f268126a;
                java.util.List list4 = wVar.f268127b;
                yVar2.getClass();
                java.util.Iterator it = list4.iterator();
                while (it.hasNext()) {
                    g31.r rVar3 = (g31.r) ((java.util.LinkedHashMap) yVar2.f268130b).get((java.lang.String) it.next());
                    if (rVar3 != null) {
                        rVar3.f268110c = g31.s.f268114f;
                        rVar3.f268109b = java.lang.System.currentTimeMillis();
                        rVar3.f268111d++;
                    }
                }
            }
            g31.y yVar3 = wVar.f268126a;
            yVar3.f268131c = false;
            g31.y.a(yVar3);
        }
    }
}
