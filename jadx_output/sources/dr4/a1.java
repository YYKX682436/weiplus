package dr4;

/* loaded from: classes7.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final dr4.a1 f242590d = new dr4.a1();

    public a1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("display");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return (android.hardware.display.DisplayManager) systemService;
    }
}
