package p5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final p5.c f351966b = new p5.c();

    /* renamed from: c, reason: collision with root package name */
    public static final int f351967c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f351968d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f351969a = new p5.b(null);

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        f351967c = availableProcessors + 1;
        f351968d = (availableProcessors * 2) + 1;
    }
}
