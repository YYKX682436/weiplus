package g31;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f268121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g31.y f268122f;

    public u(java.util.List list, java.util.List list2, g31.y yVar) {
        this.f268120d = list;
        this.f268121e = list2;
        this.f268122f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g31.y yVar;
        java.util.Iterator it = this.f268120d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yVar = this.f268122f;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.msgsubscription.NotifySwitchItem notifySwitchItem = (com.tencent.mm.msgsubscription.NotifySwitchItem) it.next();
            k31.a aVar = yVar.f268129a;
            if (aVar != null) {
                java.lang.String bizUsername = notifySwitchItem.f71767d;
                kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
                boolean z17 = notifySwitchItem.f71768e;
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeStorageManager", "updateMemScribeSwitchOpened bizUsername: %s, switchOpened: %b, ", bizUsername, java.lang.Boolean.valueOf(z17));
                ((k31.h) aVar).j(bizUsername, z17);
            }
            k31.a aVar2 = yVar.f268129a;
            if (aVar2 != null) {
                ((k31.h) aVar2).g(notifySwitchItem.f71767d, notifySwitchItem.f71769f);
            }
        }
        for (g31.t notifySwitchInfo : this.f268121e) {
            java.util.Iterator it6 = ((java.util.LinkedHashMap) yVar.f268132d).entrySet().iterator();
            while (it6.hasNext()) {
                g31.d dVar = (g31.d) ((g31.q) ((java.util.Map.Entry) it6.next()).getValue());
                dVar.getClass();
                kotlin.jvm.internal.o.g(notifySwitchInfo, "notifySwitchInfo");
                dVar.f268073a.s(notifySwitchInfo.f268117a, notifySwitchInfo.f268118b, notifySwitchInfo.f268119c);
            }
        }
    }
}
