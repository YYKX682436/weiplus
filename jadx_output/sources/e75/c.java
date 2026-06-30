package e75;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver f249970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e75.g f249971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver, e75.g gVar) {
        super(0);
        this.f249970d = mvvmObserverOwner$LifecycleBoundObserver;
        this.f249971e = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver = this.f249970d;
        boolean b17 = mvvmObserverOwner$LifecycleBoundObserver.b();
        androidx.lifecycle.y yVar = mvvmObserverOwner$LifecycleBoundObserver.f192405d;
        if (b17) {
            yVar.mo133getLifecycle().a(mvvmObserverOwner$LifecycleBoundObserver);
        } else {
            com.tencent.mars.xlog.Log.e(this.f249971e.getLogTag(), "attachObserver fail, lifecycle is destroyed owner:" + yVar.hashCode() + " observer:" + mvvmObserverOwner$LifecycleBoundObserver.f192406e.hashCode());
        }
        return jz5.f0.f302826a;
    }
}
