package zi4;

/* loaded from: classes11.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.c f473183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.status.FLTStatusActionRequest f473184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f473185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zi4.c cVar, com.tencent.pigeon.status.FLTStatusActionRequest fLTStatusActionRequest, zi4.g0 g0Var, yz5.l lVar) {
        super(0);
        this.f473183d = cVar;
        this.f473184e = fLTStatusActionRequest;
        this.f473185f = g0Var;
        this.f473186g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f473186g;
        com.tencent.pigeon.status.FLTStatusActionRequest fLTStatusActionRequest = this.f473184e;
        zi4.g0 g0Var = this.f473185f;
        try {
            yz5.q qVar = this.f473183d.f473194a;
            java.lang.String cmdId = fLTStatusActionRequest.getCmdId();
            java.lang.Object obj = g0Var.f473215a;
            if (obj == null) {
                obj = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            zi4.a aVar = (zi4.a) qVar.invoke(cmdId, new java.lang.ref.WeakReference(obj), g0Var);
            com.tencent.pigeon.status.FLTStatusPlatformProto proto = fLTStatusActionRequest.getProto();
            aVar.a(proto != null ? proto.getByteArray() : null, lVar);
        } catch (java.lang.Throwable th6) {
            zi4.g0.a(g0Var);
            com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusActionHost", "fltStatusAction factory failed, cmdId=" + fLTStatusActionRequest.getCmdId() + ", err=" + th6.getMessage());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6))));
        }
        return jz5.f0.f302826a;
    }
}
