package gl4;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f272852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f272852d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.y80 response = (bw5.y80) obj;
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doJoinMembership result response.ret: ");
        r45.ie baseResponse = response.getBaseResponse();
        sb6.append(baseResponse != null ? java.lang.Integer.valueOf(baseResponse.f376959d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        this.f272852d.resumeWith(kotlin.Result.m521constructorimpl(response));
        return jz5.f0.f302826a;
    }
}
