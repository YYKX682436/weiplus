package no3;

/* loaded from: classes11.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f338753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f338754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f338756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ no3.g f338757h;

    public f(no3.g gVar, int i17, boolean z17, int i18, java.util.Map map) {
        this.f338757h = gVar;
        this.f338753d = i17;
        this.f338754e = z17;
        this.f338755f = i18;
        this.f338756g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f338753d;
        if (i17 >= 0) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
            com.tencent.mm.booter.notification.h0.d(i17);
        }
        int i18 = this.f338755f;
        boolean z17 = this.f338754e;
        if (!z17) {
            c01.m8 f17 = c01.d9.f();
            java.lang.String str = this.f338757h.f338758d;
            ((com.tencent.mm.booter.notification.x) f17).getClass();
            com.tencent.mm.booter.notification.h0.e(str, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationObserver", "NotificationObserver refresh total badge count: %d, and talker badge count: %d, talker is mute: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        s75.d.f404635a.a(new no3.e(this), "NotificationObserver", false);
    }
}
