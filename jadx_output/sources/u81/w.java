package u81;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.BroadcastReceiver f425483a = new u81.v(this);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f425484b = new x.d(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425485c;

    public w(u81.f0 f0Var, u81.k kVar) {
        this.f425485c = f0Var;
    }

    public void a(k75.c cVar) {
        java.util.Set set = this.f425484b;
        if (((x.d) set).add(cVar) && ((x.d) set).f450816f == 1) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f425483a, intentFilter);
        }
    }

    public void b(k75.c cVar) {
        java.util.Set set = this.f425484b;
        x.d dVar = (x.d) set;
        if (dVar.remove(cVar) && dVar.isEmpty()) {
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f425483a);
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                ((x.d) set).clear();
                throw th6;
            }
            ((x.d) set).clear();
        }
    }
}
