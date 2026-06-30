package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public final class h implements kotlinx.coroutines.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f310496d;

    public h(oz5.l lVar) {
        this.f310496d = lVar;
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        return this.f310496d;
    }

    public java.lang.String toString() {
        return "CoroutineScope(coroutineContext=" + this.f310496d + ')';
    }
}
