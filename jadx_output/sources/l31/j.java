package l31;

/* loaded from: classes9.dex */
public final class j extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final e31.l f315365e;

    /* renamed from: f, reason: collision with root package name */
    public final k31.a f315366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String username, k31.a aVar, e31.l lVar) {
        super(username);
        kotlin.jvm.internal.o.g(username, "username");
        this.f315366f = aVar;
        this.f315365e = lVar;
    }

    @Override // l31.u
    public void run() {
        java.util.List list;
        k31.a aVar = this.f315366f;
        com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper d17 = aVar != null ? ((k31.h) aVar).d(this.f315313a) : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (d17 != null && (list = d17.f71832d) != null) {
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : kz5.n0.V(list)) {
                if (subscribeMsgTmpItem.f71804g == 3) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        e31.l lVar = this.f315365e;
        if (lVar != null) {
            lVar.e(this.f315313a, new com.tencent.mm.msgsubscription.SubscribeMsgRequestResult(false, "", "", 0, arrayList, false, false, null, d17 != null ? d17.f71833e : false, true, true, new byte[0], -1, null, "", "", 0, "", false, "", false, kz5.p0.f313996d));
        }
        k31.o.f303850a.a(this);
    }
}
