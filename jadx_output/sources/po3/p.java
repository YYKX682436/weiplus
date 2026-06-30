package po3;

@j95.b
/* loaded from: classes15.dex */
public class p extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile po3.k f357339d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile po3.o f357340e = null;

    public static com.tencent.mm.plugin.notification.ui.a Ai(int i17) {
        if (i17 == 2 && wi().Di() != null) {
            return wi().Di().f152444b;
        }
        if (i17 != 1 || wi().Bi() == null) {
            return null;
        }
        return wi().Bi().f152444b;
    }

    public static po3.p wi() {
        return (po3.p) i95.n0.c(po3.p.class);
    }

    public po3.k Bi() {
        if (this.f357339d == null) {
            synchronized (this) {
                if (this.f357339d == null) {
                    this.f357339d = new po3.k();
                }
            }
        }
        return this.f357339d;
    }

    public po3.o Di() {
        if (this.f357340e == null) {
            synchronized (this) {
                if (this.f357340e == null) {
                    this.f357340e = new po3.o();
                }
            }
        }
        return this.f357340e;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        c01.m8 f17 = c01.d9.f();
        int b17 = ip.l.b();
        ((com.tencent.mm.booter.notification.x) f17).getClass();
        com.tencent.mm.booter.notification.h0.d(b17);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
        com.tencent.mm.booter.notification.h0.c(false);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
        com.tencent.mm.booter.notification.h0.d(0);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
        com.tencent.mm.booter.notification.h0.c(true);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
    }
}
