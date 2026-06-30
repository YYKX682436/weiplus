package fl4;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f263933d;

    public g(java.lang.ref.WeakReference mNotificationManagerRef) {
        kotlin.jvm.internal.o.g(mNotificationManagerRef, "mNotificationManagerRef");
        this.f263933d = mNotificationManagerRef;
    }

    @Override // java.lang.Runnable
    public void run() {
        d75.b.g(new fl4.f(this));
    }
}
