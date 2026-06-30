package p01;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f350366c;

    /* renamed from: a, reason: collision with root package name */
    public static final p01.f f350364a = new p01.f();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f350365b = jz5.h.b(p01.e.f350363d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f350367d = jz5.h.b(p01.d.f350362d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f350368e = jz5.h.b(p01.c.f350361d);

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f350365b).getValue()).booleanValue();
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewInitThread", "quit() called hasNewHandlerThread:" + f350366c);
        if (f350366c) {
            ((android.os.HandlerThread) ((jz5.n) f350367d).getValue()).quit();
        }
    }
}
