package mm5;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final mm5.a f329696b = new mm5.a();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f329697a;

    public a() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Vending-HeavyWorkThread", 10);
        this.f329697a = handlerThread;
        handlerThread.start();
        new android.os.Handler(handlerThread.getLooper());
    }
}
