package k31;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f303833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f303836g;

    public f(int i17, java.lang.String str, java.util.List list, boolean z17) {
        this.f303833d = i17;
        this.f303834e = str;
        this.f303835f = list;
        this.f303836g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        k31.h hVar = k31.h.f303839a;
        int i17 = this.f303833d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.List list = this.f303835f;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.size());
        boolean z17 = this.f303836g;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(z17);
        java.lang.String str2 = this.f303834e;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "saveSubscribeMsgList bizUsername: %s, scene: %d, size: %d, isOpened: %b", str2, valueOf, valueOf2, valueOf3);
        if (i17 == 1) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next()).f71810p = true;
            }
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(hVar.c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list);
        com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper d17 = hVar.d(str2);
        java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> list2 = d17 != null ? d17.f71832d : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list2 != null) {
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : list2) {
                java.util.Iterator it6 = arrayList.iterator();
                boolean z18 = false;
                while (it6.hasNext()) {
                    com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it6.next();
                    subscribeMsgTmpItem2.f71810p = i17 == 1;
                    if (subscribeMsgTmpItem == null || (str = subscribeMsgTmpItem.f71803f) == null) {
                        str = "";
                    }
                    if (kotlin.jvm.internal.o.b(str, subscribeMsgTmpItem2.f71803f)) {
                        z18 = true;
                    }
                }
                if (!z18 && subscribeMsgTmpItem != null && !subscribeMsgTmpItem.f71810p) {
                    arrayList2.add(subscribeMsgTmpItem);
                }
            }
        }
        arrayList2.addAll(arrayList);
        com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = new com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper(arrayList2, z17);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        iSubscribeMsgService$Companion$SubscribeMsgListWrapper.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        java.lang.String encodeToString = android.util.Base64.encodeToString(marshall, 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        M.putString(str2, encodeToString);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            hVar.e(str2, arrayList2);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new k31.g(str2, arrayList2));
        }
        hVar.j(str2, z17);
    }
}
