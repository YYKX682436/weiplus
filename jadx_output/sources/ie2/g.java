package ie2;

/* loaded from: classes11.dex */
public final class g extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f290987d;

    public g(kotlinx.coroutines.q qVar) {
        this.f290987d = qVar;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f290987d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
