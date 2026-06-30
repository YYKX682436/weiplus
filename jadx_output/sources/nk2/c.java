package nk2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final nk2.c f337960a = new nk2.c();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f337961b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f337962c;

    static {
        android.content.Context applicationContext;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null || (applicationContext = context.getApplicationContext()) == null || !(applicationContext instanceof android.app.Application)) {
            return;
        }
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new nk2.b());
    }

    public final void a() {
        f337962c = false;
        f337961b = new java.util.ArrayList();
    }
}
