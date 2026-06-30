package fo5;

/* loaded from: classes11.dex */
public final class w implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f265134a;

    public w(yz5.l lVar) {
        this.f265134a = lVar;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        jz5.f0 f0Var;
        jz5.o oVar = (jz5.o) obj;
        yz5.l lVar = this.f265134a;
        if (oVar != null) {
            java.lang.String str = (java.lang.String) oVar.f302841d;
            java.lang.String str2 = (java.lang.String) oVar.f302842e;
            java.lang.String str3 = (java.lang.String) oVar.f302843f;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.voipmp.VoIPMPSelectFileResult(str, str2, str3))));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("FileSelectorContract: result is null")))));
        }
    }
}
