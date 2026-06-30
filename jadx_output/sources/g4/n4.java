package g4;

/* loaded from: classes5.dex */
public final class n4 implements g4.m4, kotlinx.coroutines.y0, u26.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final u26.y0 f268459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f268460e;

    public n4(kotlinx.coroutines.y0 scope, u26.y0 channel) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f268460e = scope;
        this.f268459d = channel;
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        return this.f268460e.getCoroutineContext();
    }

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        return this.f268459d.s(th6);
    }

    @Override // u26.y0
    public java.lang.Object t(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return this.f268459d.t(obj, continuation);
    }
}
