package e75;

/* loaded from: classes12.dex */
public final class f implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver f249975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f249976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e75.g f249977f;

    public f(com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver, java.util.List list, e75.g gVar) {
        this.f249975d = mvvmObserverOwner$LifecycleBoundObserver;
        this.f249976e = list;
        this.f249977f = gVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f249977f.getLogTag();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver = this.f249975d;
        if (mvvmObserverOwner$LifecycleBoundObserver.b()) {
            java.util.Iterator it = this.f249976e.iterator();
            while (it.hasNext()) {
                mvvmObserverOwner$LifecycleBoundObserver.f192406e.onChanged(it.next());
            }
        }
    }
}
