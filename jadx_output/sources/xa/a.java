package xa;

/* loaded from: classes13.dex */
public final class a extends android.content.BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f452743b = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f452744a;

    public a(android.content.Context context) {
        this.f452744a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        synchronized (xa.b.f452750m) {
            java.util.Iterator it = ((x.b) xa.b.f452751n).values().iterator();
            while (it.hasNext()) {
                ((xa.b) it.next()).f();
            }
        }
        this.f452744a.unregisterReceiver(this);
    }
}
