package fj3;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final fj3.m f263219d = new fj3.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MTRHandlerThreadDispatcher-");
        int i17 = fj3.n.f263220g;
        fj3.n.f263220g = i17 + 1;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        int i18 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(sb7, -16);
        a17.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread start");
        return a17;
    }
}
