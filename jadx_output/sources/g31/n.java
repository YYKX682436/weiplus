package g31;

/* loaded from: classes9.dex */
public final class n implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.p f268097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f268098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.i f268101e;

    public n(g31.p pVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str, int i17, e31.i iVar) {
        this.f268097a = pVar;
        this.f268098b = h0Var;
        this.f268099c = str;
        this.f268100d = i17;
        this.f268101e = iVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.SubscribeStatusUpdateManager", "loadSubscribeMsgList onError templateId: " + this.f268099c + ", errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + errMsg);
        e31.i iVar = this.f268101e;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> arrayList = result.f71785h;
        boolean z17 = !arrayList.isEmpty();
        e31.i iVar = this.f268101e;
        java.lang.String str = this.f268099c;
        kotlin.jvm.internal.h0 h0Var = this.f268098b;
        if (z17) {
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : arrayList) {
                if (str.equals(subscribeMsgTmpItem.f71803f)) {
                    e31.j jVar = new e31.j(subscribeMsgTmpItem.f71807m == 1, subscribeMsgTmpItem.f71808n);
                    jVar.f247077c = subscribeMsgTmpItem.f71814t;
                    jVar.f247078d = subscribeMsgTmpItem.f71815u;
                    jVar.f247079e = subscribeMsgTmpItem.f71817w;
                    jVar.f247080f = subscribeMsgTmpItem.f71818x;
                    jVar.f247081g = subscribeMsgTmpItem.B;
                    jVar.f247082h = subscribeMsgTmpItem.C;
                    jVar.f247085k = subscribeMsgTmpItem.A;
                    if (iVar != null) {
                        iVar.b(str, jVar);
                    }
                    h0Var.f310123d = subscribeMsgTmpItem;
                }
            }
        }
        java.lang.Object obj = h0Var.f310123d;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem3 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj;
        g31.b bVar = new g31.b(bizUsername, str, subscribeMsgTmpItem3 != null ? subscribeMsgTmpItem3.f71807m : -1, this.f268100d);
        bVar.f268065e = iVar;
        this.f268097a.a(subscribeMsgTmpItem2, bVar);
    }
}
