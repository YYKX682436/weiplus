package xl5;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xl5.c f455133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xl5.c cVar) {
        super(0);
        this.f455133d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        xl5.c cVar = this.f455133d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(new nl5.l(new android.widget.Magnifier(cVar.f455135a)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return (nl5.l) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
    }
}
