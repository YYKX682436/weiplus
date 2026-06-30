package st1;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f412206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f412207e;

    public f(yz5.a aVar, kotlinx.coroutines.q qVar) {
        this.f412206d = aVar;
        this.f412207e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f412206d.invoke();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f412207e.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
