package h13;

/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final h13.h0 f278132d = new h13.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("ForceNotifyService", 5);
        a17.start();
        return new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
    }
}
