package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class f extends kotlinx.coroutines.sync.g {

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.q f310649i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.k f310650m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlinx.coroutines.sync.k kVar, java.lang.Object obj, kotlinx.coroutines.q qVar) {
        super(kVar, obj);
        this.f310650m = kVar;
        this.f310649i = qVar;
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "LockCont[" + this.f310652g + ", " + this.f310649i + "] for " + this.f310650m;
    }

    @Override // kotlinx.coroutines.sync.g
    public void u() {
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f310649i;
        rVar.h(rVar.resumeMode);
    }

    @Override // kotlinx.coroutines.sync.g
    public boolean w() {
        if (kotlinx.coroutines.sync.g.f310651h.compareAndSet(this, 0, 1)) {
            return ((kotlinx.coroutines.r) this.f310649i).w(jz5.f0.f302826a, null, new kotlinx.coroutines.sync.e(this.f310650m, this)) != null;
        }
        return false;
    }
}
