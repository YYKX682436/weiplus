package o31;

/* loaded from: classes9.dex */
public final class k implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f342678e;

    public k(java.lang.String str, yz5.l lVar) {
        this.f342677d = str;
        this.f342678e = lVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        yz5.l lVar = this.f342678e;
        if (i17 != 0 || i18 != 0) {
            lVar.invoke(null);
            return;
        }
        if (subscribeMsgRequestResult == null) {
            lVar.invoke(null);
            return;
        }
        e31.k a17 = e31.n.f247087a.a("name_wxa");
        if (a17 != null) {
            a17.a(this.f342677d, subscribeMsgRequestResult.f71785h, subscribeMsgRequestResult.f71789o, true, false);
        }
        lVar.invoke(new com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData(subscribeMsgRequestResult, false, 2, null));
    }
}
