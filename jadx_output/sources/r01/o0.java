package r01;

/* loaded from: classes7.dex */
public final class o0 implements com.tencent.wechat.iam.biz.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f368169a;

    public o0(kotlinx.coroutines.q qVar) {
        this.f368169a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.u0
    public final void a(com.tencent.wechat.mm.biz.b acctResp, boolean z17) {
        kotlin.jvm.internal.o.g(acctResp, "acctResp");
        kotlinx.coroutines.q qVar = this.f368169a;
        if (z17) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(acctResp));
        } else {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
    }
}
