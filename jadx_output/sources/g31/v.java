package g31;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g31.y f268124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268125f;

    public v(java.util.List list, g31.y yVar, java.util.List list2) {
        this.f268123d = list;
        this.f268124e = yVar;
        this.f268125f = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        java.util.List<com.tencent.mm.msgsubscription.NotifySwitchItem> list2 = this.f268123d;
        g31.y yVar = this.f268124e;
        for (com.tencent.mm.msgsubscription.NotifySwitchItem notifySwitchItem : list2) {
            k31.a aVar = yVar.f268129a;
            if (aVar != null) {
                java.lang.String bizUsername = notifySwitchItem.f71767d;
                boolean z17 = notifySwitchItem.f71768e;
                kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateDiskSubscribeSwitchOpened bizUsername: " + bizUsername + ", switchOpened: " + z17);
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(((k31.h) aVar).c());
                com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = null;
                java.lang.String string = M.getString(bizUsername, null);
                if (string != null) {
                    try {
                        e31.f creator = com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper.CREATOR;
                        kotlin.jvm.internal.o.g(creator, "creator");
                        byte[] decode = android.util.Base64.decode(string, 0);
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
                        obtain.unmarshall(decode, 0, decode.length);
                        obtain.setDataPosition(0);
                        java.lang.Object createFromParcel = creator.createFromParcel(obtain);
                        obtain.recycle();
                        iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper) createFromParcel;
                    } catch (java.lang.Exception unused) {
                        M.W(bizUsername);
                    }
                }
                com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper2 = new com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper((iSubscribeMsgService$Companion$SubscribeMsgListWrapper == null || (list = iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f71832d) == null) ? new java.util.ArrayList() : kz5.n0.V0(kz5.n0.V(list)), z17);
                try {
                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                    kotlin.jvm.internal.o.f(obtain2, "obtain(...)");
                    iSubscribeMsgService$Companion$SubscribeMsgListWrapper2.writeToParcel(obtain2, 0);
                    byte[] marshall = obtain2.marshall();
                    obtain2.recycle();
                    java.lang.String encodeToString = android.util.Base64.encodeToString(marshall, 0);
                    kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                    M.putString(bizUsername, encodeToString);
                } catch (java.lang.Exception unused2) {
                    M.W(bizUsername);
                }
            }
            k31.a aVar2 = yVar.f268129a;
            if (aVar2 != null) {
                ((k31.h) aVar2).f(notifySwitchItem.f71767d, notifySwitchItem.f71769f);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new g31.u(this.f268123d, this.f268125f, this.f268124e));
    }
}
