package e75;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver f249973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f249974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver, java.util.List list) {
        super(0);
        this.f249973d = mvvmObserverOwner$LifecycleBoundObserver;
        this.f249974e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver = this.f249973d;
        if (mvvmObserverOwner$LifecycleBoundObserver.b()) {
            java.util.Iterator it = this.f249974e.iterator();
            while (it.hasNext()) {
                mvvmObserverOwner$LifecycleBoundObserver.f192406e.onChanged(it.next());
            }
        }
        return jz5.f0.f302826a;
    }
}
