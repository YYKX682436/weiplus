package ks2;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks2.m f311613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ks2.m mVar) {
        super(1);
        this.f311613d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ks2.m mVar = this.f311613d;
        mVar.f311617d = false;
        androidx.lifecycle.j0 j0Var = mVar.f311615b;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        j0Var.postValue(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Throwable(java.lang.String.valueOf(fVar != null ? fVar.f70617c : null))))));
        return jz5.f0.f302826a;
    }
}
