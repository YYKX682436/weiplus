package l31;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l31.t f315390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315392h;

    public r(int i17, int i18, l31.t tVar, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, java.lang.String str) {
        this.f315388d = i17;
        this.f315389e = i18;
        this.f315390f = tVar;
        this.f315391g = subscribeMsgRequestResult;
        this.f315392h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f315389e;
        l31.t tVar = this.f315390f;
        int i18 = this.f315388d;
        if (i18 != 0 || i17 != 0) {
            e31.l lVar = tVar.f315394e;
            if (lVar != null) {
                lVar.d(i18, i17, this.f315392h);
                return;
            }
            return;
        }
        e31.l lVar2 = tVar.f315394e;
        if (lVar2 != null) {
            java.lang.String str = tVar.f315313a;
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f315391g;
            kotlin.jvm.internal.o.d(subscribeMsgRequestResult);
            lVar2.e(str, subscribeMsgRequestResult);
        }
    }
}
