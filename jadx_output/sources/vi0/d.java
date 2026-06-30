package vi0;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f437250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlinx.coroutines.q qVar) {
        super(1);
        this.f437250d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f437250d).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Failed to get finders: error code is " + intValue))));
        return jz5.f0.f302826a;
    }
}
