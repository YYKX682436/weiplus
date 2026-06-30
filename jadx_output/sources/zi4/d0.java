package zi4;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.status.FLTStatusCommonApi f473199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.status.FLTStatusActionRequest f473200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f473202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473203h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.pigeon.status.FLTStatusCommonApi fLTStatusCommonApi, com.tencent.pigeon.status.FLTStatusActionRequest fLTStatusActionRequest, yz5.l lVar, zi4.g0 g0Var, java.lang.String str) {
        super(0);
        this.f473199d = fLTStatusCommonApi;
        this.f473200e = fLTStatusActionRequest;
        this.f473201f = lVar;
        this.f473202g = g0Var;
        this.f473203h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f473201f;
        try {
            this.f473199d.onReceiveAction(this.f473200e, lVar);
        } catch (java.lang.Throwable th6) {
            zi4.g0.a(this.f473202g);
            com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusActionHost", "sendCallbackToFlutter: onReceiveAction throw, cmdId=" + this.f473203h + ", err=" + th6.getMessage());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6))));
        }
        return jz5.f0.f302826a;
    }
}
