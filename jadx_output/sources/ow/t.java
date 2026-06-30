package ow;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.t f349265a = new ow.t();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f349266b;

    /* renamed from: c, reason: collision with root package name */
    public static int f349267c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f349268d;

    public static final com.tencent.wechat.mm.brand_service.e a(ow.t tVar) {
        tVar.getClass();
        com.tencent.wechat.mm.brand_service.k c17 = com.tencent.wechat.mm.brand_service.g0.f218913c.c(2147483647L, 1);
        java.util.LinkedList linkedList = c17.f218998d;
        int size = linkedList != null ? linkedList.size() : 0;
        jz5.l e17 = tVar.e(c17);
        java.util.List list = (java.util.List) e17.f302833d;
        com.tencent.wechat.mm.brand_service.j jVar = (com.tencent.wechat.mm.brand_service.j) e17.f302834e;
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]getMainEntryNotifyData list size = " + size);
        return tVar.c(jVar, list, null);
    }

    public static final com.tencent.wechat.mm.brand_service.e b(ow.t tVar, com.tencent.wechat.mm.brand_service.k kVar) {
        tVar.getClass();
        java.util.LinkedList linkedList = kVar.f218998d;
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]getTiledNotifyCacheData list size = " + (linkedList != null ? linkedList.size() : 0));
        jz5.l e17 = tVar.e(kVar);
        return tVar.c((com.tencent.wechat.mm.brand_service.j) e17.f302834e, (java.util.List) e17.f302833d, kVar);
    }

    public final com.tencent.wechat.mm.brand_service.e c(com.tencent.wechat.mm.brand_service.j jVar, java.util.List list, com.tencent.wechat.mm.brand_service.k kVar) {
        com.tencent.wechat.mm.brand_service.e eVar = new com.tencent.wechat.mm.brand_service.e();
        if (jVar != null) {
            eVar.f218881f = jVar;
        }
        if (kVar != null) {
            eVar.f218879d = kVar;
        }
        if (!list.isEmpty()) {
            eVar.f218880e.addAll(list);
            com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]buildBSNotifyCache add success BSContactInfo size = " + list.size());
        }
        return eVar;
    }

    public final com.tencent.wechat.mm.brand_service.c d(com.tencent.pigeon.biz_base.ContactInfo contactInfo) {
        kotlin.jvm.internal.o.g(contactInfo, "contactInfo");
        com.tencent.wechat.mm.brand_service.c cVar = new com.tencent.wechat.mm.brand_service.c();
        java.lang.String userName = contactInfo.getUserName();
        if (userName != null) {
            if (!(userName.length() > 0)) {
                userName = null;
            }
            if (userName != null) {
                cVar.f218857d = userName;
            }
        }
        java.lang.String nickName = contactInfo.getNickName();
        if (nickName != null) {
            java.lang.String str = nickName.length() > 0 ? nickName : null;
            if (str != null) {
                cVar.f218858e = str;
            }
        }
        java.lang.Boolean isContact = contactInfo.isContact();
        if (isContact != null) {
            cVar.f218859f = isContact.booleanValue();
        }
        java.lang.Boolean isPlaceTop = contactInfo.isPlaceTop();
        if (isPlaceTop != null) {
            cVar.f218860g = isPlaceTop.booleanValue();
        }
        java.lang.Boolean isMute = contactInfo.isMute();
        if (isMute != null) {
            cVar.f218861h = isMute.booleanValue();
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public final jz5.l e(com.tencent.wechat.mm.brand_service.k kVar) {
        ?? r07;
        com.tencent.wechat.mm.brand_service.c cVar;
        java.util.LinkedList msgList = kVar.f218998d;
        kotlin.jvm.internal.o.f(msgList, "msgList");
        java.util.List V = kz5.n0.V(msgList);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) V).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.tencent.wechat.mm.brand_service.j) it.next()).f218975f;
            if (str != null) {
                arrayList.add(str);
            }
        }
        java.util.List<java.lang.String> Q = kz5.n0.Q(arrayList);
        if (!Q.isEmpty()) {
            com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]userNames SIZE -> " + Q.size());
            r07 = new java.util.ArrayList();
            for (java.lang.String str2 : Q) {
                try {
                    cVar = f349265a.d(zv.q.f476079a.d(str2));
                    com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]batchGetAndConvertToBSContact: success，userName = " + str2);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("BrandEcsNotifyCacheMgr", e17, "[BRS]batchGetAndConvertToBSContact: failure，userName = " + str2, new java.lang.Object[0]);
                    cVar = null;
                }
                if (cVar != null) {
                    r07.add(cVar);
                }
            }
        } else {
            r07 = kz5.p0.f313996d;
        }
        com.tencent.wechat.mm.brand_service.k c17 = com.tencent.wechat.mm.brand_service.g0.f218913c.c(2147483647L, 1);
        java.util.LinkedList linkedList = c17.f218998d;
        int size = linkedList != null ? linkedList.size() : 0;
        java.util.LinkedList linkedList2 = c17.f218998d;
        com.tencent.wechat.mm.brand_service.j jVar = linkedList2 != null ? (com.tencent.wechat.mm.brand_service.j) kz5.n0.Z(linkedList2) : null;
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]getCommonNotifyData mainEntryNotifyList size = " + size + ", bsContactList size -> " + r07.size());
        return new jz5.l(r07, jVar);
    }
}
