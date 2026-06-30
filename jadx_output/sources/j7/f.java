package j7;

/* loaded from: classes13.dex */
public class f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j7.g f298005a;

    public f(j7.g gVar) {
        this.f298005a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        j7.g gVar = this.f298005a;
        boolean z17 = gVar.f298008f;
        gVar.f298008f = gVar.i(context);
        if (z17 != this.f298005a.f298008f) {
            if (android.util.Log.isLoggable("ConnectivityMonitor", 3)) {
                boolean z18 = this.f298005a.f298008f;
            }
            j7.g gVar2 = this.f298005a;
            com.bumptech.glide.q qVar = (com.bumptech.glide.q) gVar2.f298007e;
            if (!gVar2.f298008f) {
                qVar.getClass();
                return;
            }
            synchronized (qVar.f43980b) {
                qVar.f43979a.b();
            }
        }
    }
}
