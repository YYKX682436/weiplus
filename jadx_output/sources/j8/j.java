package j8;

/* loaded from: classes15.dex */
public class j implements j8.b {

    /* renamed from: f, reason: collision with root package name */
    public static final android.content.IntentFilter f298112f = new android.content.IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a, reason: collision with root package name */
    public final j8.k f298113a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f298114b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.a f298115c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.BroadcastReceiver f298116d;

    /* renamed from: e, reason: collision with root package name */
    public j8.h f298117e = null;

    public j(j8.k kVar, android.content.Context context, j8.a aVar) {
        this.f298113a = kVar;
        this.f298114b = context;
        this.f298115c = aVar;
    }

    @Override // j8.b
    public void a() {
        if (this.f298116d != null) {
            return;
        }
        j8.i iVar = new j8.i(this);
        this.f298116d = iVar;
        this.f298114b.registerReceiver(iVar, f298112f);
        j8.h a17 = this.f298113a.a();
        this.f298117e = a17;
        this.f298115c.a(a17);
    }

    @Override // j8.b
    public void b() {
        android.content.BroadcastReceiver broadcastReceiver = this.f298116d;
        if (broadcastReceiver == null) {
            return;
        }
        this.f298114b.unregisterReceiver(broadcastReceiver);
        this.f298116d = null;
    }
}
