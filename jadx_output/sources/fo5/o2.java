package fo5;

/* loaded from: classes7.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final fo5.o2 f265053d = new fo5.o2();

    public o2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).newWakeLock(536870922, "ILinkVoIPSmallView");
    }
}
