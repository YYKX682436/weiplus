package g31;

/* loaded from: classes9.dex */
public final class o implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgTmpItem f268102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g31.p f268103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e31.i f268104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268105d;

    public o(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem, g31.p pVar, e31.i iVar, java.lang.String str) {
        this.f268102a = subscribeMsgTmpItem;
        this.f268103b = pVar;
        this.f268104c = iVar;
        this.f268105d = str;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchSubscribeStatus onError templateId: ");
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = this.f268102a;
        sb6.append(subscribeMsgTmpItem.f71803f);
        sb6.append(", errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(errMsg);
        com.tencent.mars.xlog.Log.e("MicroMsg.SubscribeStatusUpdateManager", sb6.toString());
        if (subscribeMsgTmpItem.f71807m == 1) {
            subscribeMsgTmpItem.f71807m = 0;
        } else {
            subscribeMsgTmpItem.f71807m = 1;
        }
        this.f268104c.a();
        e31.k kVar = this.f268103b.f268107b;
        if (kVar != null) {
            e31.k.i(kVar, this.f268105d, kz5.c0.k(subscribeMsgTmpItem), false, false, false, 4, null);
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = this.f268102a;
        java.lang.String str = subscribeMsgTmpItem.f71803f;
        int i17 = subscribeMsgTmpItem.f71807m;
        boolean z17 = false;
        boolean z18 = false;
        for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 : result.f71785h) {
            if (subscribeMsgTmpItem.f71803f.equals(subscribeMsgTmpItem2.f71803f)) {
                z18 = subscribeMsgTmpItem2.f71808n;
                z17 = true;
            }
        }
        e31.j jVar = z17 ? new e31.j(subscribeMsgTmpItem.f71807m == 1, z18) : new e31.j(false, subscribeMsgTmpItem.f71808n);
        jVar.f247077c = subscribeMsgTmpItem.f71814t;
        jVar.f247078d = subscribeMsgTmpItem.f71815u;
        jVar.f247079e = subscribeMsgTmpItem.f71817w;
        jVar.f247080f = subscribeMsgTmpItem.f71818x;
        jVar.f247081g = subscribeMsgTmpItem.B;
        jVar.f247082h = subscribeMsgTmpItem.C;
        jVar.f247084j = bizUsername;
        jVar.f247083i = subscribeMsgTmpItem.f71819y;
        jVar.f247085k = subscribeMsgTmpItem.A;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeStatusUpdateManager", "switchSubscribeStatus onSuccess hasResult: %b, isSubscribed: %b, switchOpen: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(jVar.f247075a), java.lang.Boolean.valueOf(jVar.f247076b));
        e31.k kVar = this.f268103b.f268107b;
        if (kVar != null) {
            e31.k.i(kVar, bizUsername, result.f71785h, false, false, false, 4, null);
        }
        this.f268104c.b(subscribeMsgTmpItem.f71803f, jVar);
    }
}
