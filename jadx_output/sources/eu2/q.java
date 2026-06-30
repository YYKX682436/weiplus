package eu2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final eu2.q f256806d = new eu2.q();

    public q() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        if (systemService instanceof android.os.PowerManager) {
            return (android.os.PowerManager) systemService;
        }
        return null;
    }
}
