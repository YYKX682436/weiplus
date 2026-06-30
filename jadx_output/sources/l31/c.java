package l31;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l31.e f315324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315326h;

    public c(int i17, int i18, l31.e eVar, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, java.lang.String str) {
        this.f315322d = i17;
        this.f315323e = i18;
        this.f315324f = eVar;
        this.f315325g = subscribeMsgRequestResult;
        this.f315326h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f315323e;
        l31.e eVar = this.f315324f;
        int i18 = this.f315322d;
        if (i18 != 0 || i17 != 0) {
            e31.l lVar = eVar.f315338e;
            if (lVar != null) {
                lVar.d(i18, i17, this.f315326h);
                return;
            }
            return;
        }
        e31.l lVar2 = eVar.f315338e;
        if (lVar2 != null) {
            java.lang.String str = eVar.f315313a;
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f315325g;
            kotlin.jvm.internal.o.d(subscribeMsgRequestResult);
            lVar2.e(str, subscribeMsgRequestResult);
        }
    }
}
