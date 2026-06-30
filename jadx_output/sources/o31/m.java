package o31;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final o31.m f342681a = new o31.m();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String userName, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData data, im5.b bVar, yz5.l receiver) {
        f31.f c17;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        f31.c cVar = f31.d.f259271a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = data.f71836f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
            java.util.Iterator it6 = data.f71838h.f71785h.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (android.text.TextUtils.equals(((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj).f71803f, subscribeMsgTmpItem.f71803f)) {
                        break;
                    }
                }
            }
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj;
            if (subscribeMsgTmpItem2 != null) {
                if ((subscribeMsgTmpItem2.f71807m == subscribeMsgTmpItem.f71807m && subscribeMsgTmpItem2.f71815u == subscribeMsgTmpItem.f71815u && subscribeMsgTmpItem2.f71818x == subscribeMsgTmpItem.f71818x && subscribeMsgTmpItem2.C == subscribeMsgTmpItem.C) ? false : true) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        o31.l lVar = new o31.l(receiver, userName);
        if (bVar != null) {
            o31.j jVar = new o31.j();
            jVar.f342676d = lVar;
            bVar.keep(jVar);
            lVar = jVar;
        }
        c17 = cVar.c(userName, "", data.f71835e, lVar, arrayList, 1, new byte[0], (r22 & 128) != 0 ? null : null, (r22 & 256) != 0 ? "" : null);
        c17.a(f31.b.f259269a);
    }

    public final void b(java.lang.String userName, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData data, yz5.l receiver) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(receiver, "receiver");
        a(userName, data, null, receiver);
    }
}
