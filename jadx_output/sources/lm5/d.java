package lm5;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final lm5.j f319600a = new lm5.j(android.os.Looper.getMainLooper(), "Vending.UI");

    /* renamed from: b, reason: collision with root package name */
    public static final lm5.j f319601b = new lm5.j(mm5.b.f329698b.f329699a.getLooper(), "Vending.LOGIC");

    /* renamed from: c, reason: collision with root package name */
    public static final lm5.j f319602c = new lm5.j(mm5.a.f329696b.f329697a.getLooper(), "Vending.HEAVY_WORK");

    static {
        lm5.i.f();
    }

    public abstract void a(java.lang.Runnable runnable);

    public abstract void b(java.lang.Runnable runnable, long j17);

    public abstract void c();

    public abstract java.lang.String d();
}
