package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class p extends kotlinx.coroutines.internal.d {

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.internal.t f310513b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.internal.t f310514c;

    public p(kotlinx.coroutines.internal.t tVar) {
        this.f310513b = tVar;
    }

    @Override // kotlinx.coroutines.internal.d
    public void d(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.internal.t tVar = (kotlinx.coroutines.internal.t) obj;
        boolean z17 = true;
        boolean z18 = obj2 == null;
        kotlinx.coroutines.internal.t tVar2 = this.f310513b;
        kotlinx.coroutines.internal.t tVar3 = z18 ? tVar2 : this.f310514c;
        if (tVar3 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.t.f310525d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(tVar, this, tVar3)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(tVar) != this) {
                    z17 = false;
                    break;
                }
            }
            if (z17 && z18) {
                kotlinx.coroutines.internal.t tVar4 = this.f310514c;
                kotlin.jvm.internal.o.d(tVar4);
                tVar2.k(tVar4);
            }
        }
    }
}
