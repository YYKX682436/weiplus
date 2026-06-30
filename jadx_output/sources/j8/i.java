package j8;

/* loaded from: classes15.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8.j f298111a;

    public i(j8.j jVar) {
        this.f298111a = jVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        j8.j jVar = this.f298111a;
        j8.h a17 = jVar.f298113a.a();
        if (a17.equals(jVar.f298117e)) {
            return;
        }
        jVar.f298117e = a17;
        jVar.f298115c.a(a17);
    }
}
