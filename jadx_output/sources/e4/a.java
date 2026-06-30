package e4;

/* loaded from: classes11.dex */
public class a extends android.support.v4.media.d {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f247598c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Intent f247599d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.BroadcastReceiver.PendingResult f247600e;

    /* renamed from: f, reason: collision with root package name */
    public android.support.v4.media.m f247601f;

    public a(android.content.Context context, android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult) {
        this.f247598c = context;
        this.f247599d = intent;
        this.f247600e = pendingResult;
    }

    @Override // android.support.v4.media.d
    public void a() {
        android.support.v4.media.session.MediaSessionCompat$Token b17 = this.f247601f.b();
        new java.util.concurrent.ConcurrentHashMap();
        if (b17 == null) {
            throw new java.lang.IllegalArgumentException("sessionToken must not be null");
        }
        android.support.v4.media.session.k kVar = new android.support.v4.media.session.k(this.f247598c, b17);
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) this.f247599d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new java.lang.IllegalArgumentException("KeyEvent may not be null");
        }
        kVar.f8976a.dispatchMediaButtonEvent(keyEvent);
        this.f247601f.a();
        this.f247600e.finish();
    }

    @Override // android.support.v4.media.d
    public void b() {
        this.f247601f.a();
        this.f247600e.finish();
    }

    @Override // android.support.v4.media.d
    public void c() {
        this.f247601f.a();
        this.f247600e.finish();
    }
}
