package k31;

/* loaded from: classes9.dex */
public final class h implements k31.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k31.h f303839a = new k31.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f303840b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f303841c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f303842d = new java.util.HashMap();

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "SubscribeMsg clearStorage");
        com.tencent.mm.sdk.platformtools.o4.M(c()).clear();
    }

    public final void b(java.lang.String str, java.util.List list, boolean z17, boolean z18, boolean z19, boolean z27) {
        boolean z28;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(c());
        com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper d17 = d(str);
        java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> list2 = d17 != null ? d17.f71832d : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                if (list2 != null) {
                    z28 = false;
                    for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 : list2) {
                        if (subscribeMsgTmpItem2.f71803f.equals(subscribeMsgTmpItem.f71803f)) {
                            if (z18) {
                                subscribeMsgTmpItem2.f71807m = subscribeMsgTmpItem.f71807m;
                                subscribeMsgTmpItem2.f71815u = subscribeMsgTmpItem.f71815u;
                                subscribeMsgTmpItem2.f71814t = subscribeMsgTmpItem.f71814t;
                                subscribeMsgTmpItem2.f71818x = subscribeMsgTmpItem.f71818x;
                                subscribeMsgTmpItem2.f71817w = subscribeMsgTmpItem.f71817w;
                                subscribeMsgTmpItem2.B = subscribeMsgTmpItem.B;
                                subscribeMsgTmpItem2.C = subscribeMsgTmpItem.C;
                                subscribeMsgTmpItem2.f71819y = subscribeMsgTmpItem.f71819y;
                                subscribeMsgTmpItem2.A = subscribeMsgTmpItem.A;
                            }
                            if (z27) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "doSaveSubscribeStatus timestamp: %s", java.lang.Long.valueOf(subscribeMsgTmpItem.f71809o));
                                subscribeMsgTmpItem2.f71809o = subscribeMsgTmpItem.f71809o;
                            }
                            z28 = true;
                        }
                    }
                } else {
                    z28 = false;
                }
                if (!z28) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "saveSubscribeMsgUiStatus finalList: %d, switchOpen: %b, needUpateSwitchOpen: %b", java.lang.Integer.valueOf(arrayList.size()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = new com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper(arrayList, z19 ? z17 : d17 != null ? d17.f71833e : false);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        iSubscribeMsgService$Companion$SubscribeMsgListWrapper.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        java.lang.String encodeToString = android.util.Base64.encodeToString(marshall, 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        M.putString(str, encodeToString);
        k31.d dVar = new k31.d(list, z19, str, z17, z18, z27);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            dVar.invoke();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new k31.e(dVar));
        }
    }

    public final java.lang.String c() {
        return gm0.j1.b().j() + "_subscribe_msg_storage";
    }

    public com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper d(java.lang.String bizUsername) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(c());
        try {
            java.lang.String string = M.getString(bizUsername, null);
            if (string == null) {
                return null;
            }
            e31.f creator = com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper.CREATOR;
            kotlin.jvm.internal.o.g(creator, "creator");
            byte[] decode = android.util.Base64.decode(string, 0);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.o.f(obtain, "obtain(...)");
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            java.lang.Object createFromParcel = creator.createFromParcel(obtain);
            obtain.recycle();
            com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper) createFromParcel;
            java.util.List V0 = kz5.n0.V0(kz5.n0.V(iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71832d));
            iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71832d = V0;
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                e(bizUsername, V0);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new k31.g(bizUsername, V0));
            }
            j(bizUsername, iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71833e);
            return iSubscribeMsgService$Companion$SubscribeMsgListWrapper;
        } catch (java.lang.Exception unused) {
            M.putString(bizUsername, null);
            return null;
        }
    }

    public final void e(java.lang.String str, java.util.List list) {
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(list)).iterator();
        while (it.hasNext()) {
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
            f303840b.put(str + subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem);
        }
    }

    public void f(java.lang.String bizUsername, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateDiskImportantNotifyNum bizUsername: " + bizUsername + ", importantNotifyNum: " + i17);
        com.tencent.mm.sdk.platformtools.o4.M(c()).A("important_notify_num_".concat(bizUsername), i17);
    }

    public void g(java.lang.String bizUsername, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateMemImportantNotifyNum bizUsername: %s, importantNotifyNum: %d", bizUsername, java.lang.Integer.valueOf(i17));
        f303842d.put(bizUsername, java.lang.Integer.valueOf(i17));
    }

    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateSubscribeGlobalAutoNotify: " + z17);
        com.tencent.mm.sdk.platformtools.o4.M(c()).G("IsSubscribeGlobalAutoNotify", z17);
    }

    public void i(java.lang.String bizUsername, java.util.List list, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = bizUsername;
        objArr[1] = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        objArr[4] = java.lang.Boolean.valueOf(z19);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "saveSubscribeMsgSubscribeStatus bizUsername: %s, size: %s, switchOpened: %b, needUpdateSwitchOpen: %b, needUpdateTimestamp: %b", objArr);
        b(bizUsername, list, z17, true, z18, z19);
    }

    public final void j(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateSwitchOpen: %b", java.lang.Boolean.valueOf(z17));
        f303841c.put(str, java.lang.Boolean.valueOf(z17));
    }
}
