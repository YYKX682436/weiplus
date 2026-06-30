package s;

/* loaded from: classes13.dex */
public class a implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.c f401824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s.b f401825e;

    public a(s.b bVar, s.c cVar) {
        this.f401825e = bVar;
        this.f401824d = cVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        androidx.browser.customtabs.CustomTabsService customTabsService = this.f401825e.f401826d;
        s.c cVar = this.f401824d;
        customTabsService.getClass();
        try {
            synchronized (customTabsService.f9765d) {
                android.os.IBinder asBinder = cVar.f401827a.asBinder();
                asBinder.unlinkToDeath((android.os.IBinder.DeathRecipient) ((x.n) customTabsService.f9765d).getOrDefault(asBinder, null), 0);
                ((x.n) customTabsService.f9765d).remove(asBinder);
            }
        } catch (java.util.NoSuchElementException unused) {
        }
    }
}
