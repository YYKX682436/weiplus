package l41;

/* loaded from: classes2.dex */
public final class y0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f315969a;

    public y0(kotlin.coroutines.Continuation continuation) {
        this.f315969a = continuation;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "checkAppBrandBindState errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        kotlin.coroutines.Continuation continuation = this.f315969a;
        if (i17 != 0 || i18 != 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(6, "check failed")));
            return;
        }
        if ((oVar != null ? oVar.f70711b.f70700a : null) instanceof r45.oz) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckAppCustomerServiceBindResponse");
            r45.oz ozVar = (r45.oz) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "checkAppBrandBindState bindState: %s", java.lang.Integer.valueOf(ozVar.f382622d));
            if (ozVar.f382622d == 1) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(0, "")));
            } else {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(6, "not bind")));
            }
        }
    }
}
