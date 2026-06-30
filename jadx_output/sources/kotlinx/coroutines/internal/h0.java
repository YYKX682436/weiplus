package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public class h0 extends kotlinx.coroutines.a implements qz5.e {

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f310497f;

    public h0(oz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(lVar, true, true);
        this.f310497f = continuation;
    }

    @Override // kotlinx.coroutines.c3
    public final boolean T() {
        return true;
    }

    @Override // qz5.e
    public final qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation continuation = this.f310497f;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.c3
    public void u(java.lang.Object obj) {
        kotlin.coroutines.Continuation continuation = this.f310497f;
        kotlinx.coroutines.internal.i.b(pz5.f.b(continuation), kotlinx.coroutines.i0.a(obj, continuation), null, 2, null);
    }

    @Override // kotlinx.coroutines.c3
    public void v(java.lang.Object obj) {
        kotlin.coroutines.Continuation continuation = this.f310497f;
        continuation.resumeWith(kotlinx.coroutines.i0.a(obj, continuation));
    }
}
