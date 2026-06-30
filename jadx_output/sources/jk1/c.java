package jk1;

/* loaded from: classes7.dex */
public class c extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk1.d f300052a;

    public c(jk1.d dVar, jk1.b bVar) {
        this.f300052a = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        synchronized (this.f300052a.f300057h) {
            this.f300052a.f300056g = intent;
        }
    }
}
