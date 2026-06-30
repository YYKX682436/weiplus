package e95;

/* loaded from: classes12.dex */
public final class q extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f250440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e95.r cursor) {
        super(null);
        kotlin.jvm.internal.o.g(cursor, "cursor");
        this.f250440a = new java.lang.ref.WeakReference(cursor);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        e95.r rVar = (e95.r) this.f250440a.get();
        if (rVar != null) {
            synchronized (rVar.f250446i) {
                rVar.f250450p.dispatchChange(false);
            }
        }
    }
}
