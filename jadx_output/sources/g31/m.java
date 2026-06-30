package g31;

/* loaded from: classes9.dex */
public final class m implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.p f268095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g31.b f268096b;

    public m(g31.p pVar, g31.b bVar) {
        this.f268095a = pVar;
        this.f268096b = bVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSubscribeStatus onError templateId: ");
        g31.b bVar = this.f268096b;
        sb6.append(bVar.f268062b);
        sb6.append(", errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(errMsg);
        com.tencent.mars.xlog.Log.e("MicroMsg.SubscribeStatusUpdateManager", sb6.toString());
        this.f268095a.f268106a.remove(bVar.f268062b);
        e31.i iVar = bVar.f268065e;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        java.lang.String str;
        boolean z17;
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result = subscribeMsgRequestResult;
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        g31.p pVar = this.f268095a;
        java.util.HashSet hashSet = pVar.f268106a;
        g31.b bVar = this.f268096b;
        hashSet.remove(bVar.f268062b);
        java.util.ArrayList arrayList = result.f71785h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(arrayList.size());
        java.lang.String str2 = bVar.f268062b;
        java.lang.String str3 = "MicroMsg.SubscribeStatusUpdateManager";
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeStatusUpdateManager", "onUpdateSubscribeUIStatusSuccess onSuccess %d, templateId: %s", valueOf, str2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        int i17 = -1;
        boolean z18 = false;
        int i18 = 0;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z37 = false;
        boolean z38 = false;
        boolean z39 = false;
        while (it.hasNext()) {
            java.util.Iterator it6 = it;
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
            boolean z47 = z27;
            if (subscribeMsgTmpItem.f71803f.equals(str2)) {
                java.lang.String str4 = subscribeMsgTmpItem.f71803f;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(subscribeMsgTmpItem.f71807m);
                int i19 = result.f71784g;
                com.tencent.mars.xlog.Log.i(str3, "onUpdateSubscribeUIStatusSuccess templateId: %s, %d, cacheMax: %d, switchOpen: %b isForceNotifyTemplate: %b, isShowVoipSetting:%b", str4, valueOf2, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(subscribeMsgTmpItem.f71808n), java.lang.Boolean.valueOf(subscribeMsgTmpItem.f71817w), java.lang.Boolean.valueOf(subscribeMsgTmpItem.A));
                int i27 = subscribeMsgTmpItem.f71807m;
                z29 = subscribeMsgTmpItem.f71808n;
                z28 = subscribeMsgTmpItem.f71814t;
                z37 = subscribeMsgTmpItem.f71815u;
                z38 = subscribeMsgTmpItem.f71817w;
                z39 = subscribeMsgTmpItem.f71818x;
                boolean z48 = subscribeMsgTmpItem.B;
                boolean z49 = subscribeMsgTmpItem.C;
                int i28 = subscribeMsgTmpItem.f71819y;
                boolean z57 = subscribeMsgTmpItem.A;
                subscribeMsgTmpItem.f71808n = result.f71789o;
                if (i19 <= 0) {
                    subscribeMsgTmpItem.f71809o = java.lang.System.currentTimeMillis() + 30000;
                    z17 = z48;
                    str = str3;
                } else {
                    z17 = z48;
                    str = str3;
                    subscribeMsgTmpItem.f71809o = java.lang.System.currentTimeMillis() + (i19 * 1000);
                }
                arrayList2.add(subscribeMsgTmpItem);
                z18 = z49;
                i18 = i28;
                i17 = i27;
                z27 = z57;
                z19 = z17;
            } else {
                str = str3;
                z27 = z47;
            }
            result = subscribeMsgRequestResult;
            it = it6;
            str3 = str;
        }
        boolean z58 = z27;
        e31.j jVar = new e31.j(i17 == 1, z29);
        jVar.f247077c = z28;
        jVar.f247078d = z37;
        jVar.f247079e = z38;
        jVar.f247080f = z39;
        jVar.f247081g = z19;
        jVar.f247082h = z18;
        jVar.f247083i = i18;
        java.lang.String str5 = bVar.f268061a;
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        jVar.f247084j = str5;
        jVar.f247085k = z58;
        e31.k kVar = pVar.f268107b;
        if (kVar != null) {
            kVar.a(bVar.f268061a, arrayList2, z29, true, true);
        }
        e31.i iVar = bVar.f268065e;
        if (iVar != null) {
            iVar.b(str2, jVar);
        }
    }
}
