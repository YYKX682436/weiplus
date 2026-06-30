package du2;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Service f243496a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f243497b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f243498c;

    /* renamed from: d, reason: collision with root package name */
    public z2.k0 f243499d;

    public q(android.app.Service context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f243496a = context;
        this.f243497b = jz5.h.b(new du2.p(this));
        this.f243498c = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public final void a() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 26) {
            return;
        }
        z2.n1 b17 = b();
        android.app.NotificationChannel notificationChannel = null;
        if (b17 != null && i17 >= 26) {
            notificationChannel = z2.h1.i(b17.f469505b, "finder_channel_id");
        }
        if (notificationChannel != null) {
            return;
        }
        android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel("finder_channel_id", "finder_notification", 4);
        notificationChannel2.setDescription("finder_notification_channel");
        z2.k0 k0Var = this.f243499d;
        if (k0Var != null) {
            k0Var.f469482z = "finder_channel_id";
        }
        z2.n1 b18 = b();
        if (b18 == null || i17 < 26) {
            return;
        }
        z2.h1.a(b18.f469505b, notificationChannel2);
    }

    public final z2.n1 b() {
        return (z2.n1) ((jz5.n) this.f243497b).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.support.v4.media.session.f0 r12, fu2.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: du2.q.c(android.support.v4.media.session.f0, fu2.c, int):void");
    }
}
