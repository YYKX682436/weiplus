package df;

/* loaded from: classes.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229528d;

    public o0(kotlinx.coroutines.q qVar) {
        this.f229528d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.q qVar = this.f229528d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
