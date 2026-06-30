package g31;

/* loaded from: classes9.dex */
public final class k implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.l f268084a;

    public k(g31.l lVar) {
        this.f268084a = lVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        this.f268084a.s(bizUsername, result.f71789o, 0);
    }
}
