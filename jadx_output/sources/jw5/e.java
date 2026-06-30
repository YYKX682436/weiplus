package jw5;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final jw5.e f302353d = new jw5.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("waitingChannel");
        handlerThread.start();
        return new android.os.Handler(handlerThread.getLooper());
    }
}
