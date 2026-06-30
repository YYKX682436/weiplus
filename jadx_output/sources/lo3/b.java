package lo3;

/* loaded from: classes13.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lo3.c f320180a;

    public b(lo3.c cVar) {
        this.f320180a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        lo3.c.f320182e.post(new lo3.a(this, intent));
    }
}
