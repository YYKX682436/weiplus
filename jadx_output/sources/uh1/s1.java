package uh1;

/* loaded from: classes7.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final uh1.s1 f427902d = new uh1.s1();

    public s1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (android.net.ConnectivityManager) systemService;
    }
}
