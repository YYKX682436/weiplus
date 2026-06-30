package yo5;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yo5.g f464367d = new yo5.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MTRHandlerThreadDispatcher-");
        int i17 = yo5.h.f464368h;
        yo5.h.f464368h = i17 + 1;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(sb7, -16);
        a17.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread start");
        return a17;
    }
}
