package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class j3 extends v26.d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310299a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.flow.j3.class, java.lang.Object.class, "_state");
    volatile /* synthetic */ java.lang.Object _state = null;

    @Override // v26.d
    public boolean a(java.lang.Object obj) {
        if (this._state != null) {
            return false;
        }
        this._state = kotlinx.coroutines.flow.i3.f310296a;
        return true;
    }

    @Override // v26.d
    public kotlin.coroutines.Continuation[] b(java.lang.Object obj) {
        this._state = null;
        return v26.c.f432987a;
    }
}
