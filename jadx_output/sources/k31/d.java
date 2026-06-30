package k31;

/* loaded from: classes9.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f303827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f303829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f303830h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f303831i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, boolean z17, java.lang.String str, boolean z18, boolean z19, boolean z27) {
        super(0);
        this.f303826d = list;
        this.f303827e = z17;
        this.f303828f = str;
        this.f303829g = z18;
        this.f303830h = z19;
        this.f303831i = z27;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f303827e;
        java.lang.String str = this.f303828f;
        java.util.List list = this.f303826d;
        if (list != null) {
            k31.h hVar = k31.h.f303839a;
            k31.c cVar = new k31.c(this.f303830h, this.f303831i, z17);
            java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(list)).iterator();
            while (it.hasNext()) {
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                k31.h hVar2 = k31.h.f303839a;
                java.lang.String str2 = str + subscribeMsgTmpItem.f71803f;
                java.util.HashMap hashMap = k31.h.f303840b;
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) hashMap.get(str2);
                if (subscribeMsgTmpItem2 != null) {
                    cVar.invoke(subscribeMsgTmpItem2, subscribeMsgTmpItem);
                } else {
                    hashMap.put(str2, subscribeMsgTmpItem);
                    cVar.invoke(subscribeMsgTmpItem, subscribeMsgTmpItem);
                }
            }
        }
        if (z17) {
            k31.h.f303839a.j(str, this.f303829g);
        }
        return jz5.f0.f302826a;
    }
}
