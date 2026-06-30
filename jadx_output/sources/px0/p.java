package px0;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f358792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f358793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.q qVar) {
        super(2);
        this.f358792d = h0Var;
        this.f358793e = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q23 info = (r45.q23) obj2;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.h0 h0Var = this.f358792d;
        h0Var.f310123d = info;
        com.tencent.mars.xlog.Log.i("MaterialImportPreviewFragment", "saveAsyncAIGCDraft result " + booleanValue + ' ' + h0Var.f310123d);
        if (!booleanValue) {
            kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f358793e;
            if (rVar.n()) {
                rVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(null, "saveAsyncAIGCDraft error")));
            }
        }
        return jz5.f0.f302826a;
    }
}
