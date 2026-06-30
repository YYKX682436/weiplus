package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310494a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.g.class, java.lang.Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310495b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.g.class, java.lang.Object.class, "_prev");
    private volatile /* synthetic */ java.lang.Object _next = null;
    private volatile /* synthetic */ java.lang.Object _prev;

    public g(kotlinx.coroutines.internal.g gVar) {
        this._prev = gVar;
    }

    public static final java.lang.Object a(kotlinx.coroutines.internal.g gVar) {
        return gVar._next;
    }

    public abstract boolean b();

    public final boolean c() {
        java.lang.Object obj = this._next;
        return (obj == kotlinx.coroutines.internal.f.f310492a ? null : (kotlinx.coroutines.internal.g) obj) == null;
    }

    public final void d() {
        while (true) {
            kotlinx.coroutines.internal.g gVar = (kotlinx.coroutines.internal.g) this._prev;
            while (gVar != null && gVar.b()) {
                gVar = (kotlinx.coroutines.internal.g) gVar._prev;
            }
            java.lang.Object obj = this._next;
            kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.internal.f.f310492a;
            kotlinx.coroutines.internal.g gVar2 = obj == l0Var ? null : (kotlinx.coroutines.internal.g) obj;
            kotlin.jvm.internal.o.d(gVar2);
            while (gVar2.b()) {
                java.lang.Object obj2 = gVar2._next;
                gVar2 = obj2 == l0Var ? null : (kotlinx.coroutines.internal.g) obj2;
                kotlin.jvm.internal.o.d(gVar2);
            }
            gVar2._prev = gVar;
            if (gVar != null) {
                gVar._next = gVar2;
            }
            if (!gVar2.b() && (gVar == null || !gVar.b())) {
                return;
            }
        }
    }
}
