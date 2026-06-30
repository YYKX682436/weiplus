package dk1;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f233149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.ref.WeakReference weakReference) {
        super(5);
        this.f233149d = weakReference;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) obj4;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "callback, errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + str);
        java.lang.ref.WeakReference weakReference = this.f233149d;
        if (intValue == 0 && intValue2 == 0) {
            java.lang.Object obj6 = oVar != null ? oVar.f70711b.f70700a : null;
            r45.lc7 lc7Var = obj6 instanceof r45.lc7 ? (r45.lc7) obj6 : null;
            if (lc7Var == null) {
                kotlinx.coroutines.q qVar = (kotlinx.coroutines.q) weakReference.get();
                if (qVar != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Client Framework Error(resp is null)"))));
                }
            } else {
                kotlinx.coroutines.q qVar2 = (kotlinx.coroutines.q) weakReference.get();
                if (qVar2 != null) {
                    ((kotlinx.coroutines.r) qVar2).resumeWith(kotlin.Result.m521constructorimpl(lc7Var));
                }
            }
        } else {
            kotlinx.coroutines.q qVar3 = (kotlinx.coroutines.q) weakReference.get();
            if (qVar3 != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar3).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Server Framework Error(errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + str + ')'))));
            }
        }
        return 0;
    }
}
