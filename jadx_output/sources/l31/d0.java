package l31;

/* loaded from: classes9.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l31.f0 f315335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315337i;

    public d0(int i17, int i18, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, l31.f0 f0Var, java.lang.String str, java.lang.String str2) {
        this.f315332d = i17;
        this.f315333e = i18;
        this.f315334f = subscribeMsgRequestResult;
        this.f315335g = f0Var;
        this.f315336h = str;
        this.f315337i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e31.l lVar;
        int i17 = this.f315333e;
        l31.f0 f0Var = this.f315335g;
        int i18 = this.f315332d;
        if (i18 != 0 || i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList failed");
            e31.l lVar2 = f0Var.f315342f;
            java.lang.String str = this.f315337i;
            if (lVar2 != null) {
                lVar2.d(i18, i17, str);
            }
            e31.l lVar3 = f0Var.f315341e;
            if (lVar3 != null) {
                lVar3.d(i18, i17, str);
                return;
            }
            return;
        }
        java.lang.String str2 = this.f315336h;
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f315334f;
        if (subscribeMsgRequestResult != null && (lVar = f0Var.f315342f) != null) {
            lVar.e(str2, subscribeMsgRequestResult);
        }
        e31.l lVar4 = f0Var.f315341e;
        if (lVar4 != null) {
            kotlin.jvm.internal.o.d(subscribeMsgRequestResult);
            lVar4.e(str2, subscribeMsgRequestResult);
        }
    }
}
