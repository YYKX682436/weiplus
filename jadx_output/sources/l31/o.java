package l31;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l31.q f315378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315380h;

    public o(int i17, int i18, l31.q qVar, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, java.lang.String str) {
        this.f315376d = i17;
        this.f315377e = i18;
        this.f315378f = qVar;
        this.f315379g = subscribeMsgRequestResult;
        this.f315380h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f315377e;
        l31.q qVar = this.f315378f;
        int i18 = this.f315376d;
        if (i18 != 0 || i17 != 0) {
            e31.l lVar = qVar.f315382e;
            if (lVar != null) {
                lVar.d(i18, i17, this.f315380h);
                return;
            }
            return;
        }
        e31.l lVar2 = qVar.f315382e;
        if (lVar2 != null) {
            java.lang.String str = qVar.f315313a;
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f315379g;
            kotlin.jvm.internal.o.d(subscribeMsgRequestResult);
            lVar2.e(str, subscribeMsgRequestResult);
        }
    }
}
