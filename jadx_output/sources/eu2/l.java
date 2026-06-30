package eu2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final eu2.l f256799d = new eu2.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard");
        if (systemService instanceof android.app.KeyguardManager) {
            return (android.app.KeyguardManager) systemService;
        }
        return null;
    }
}
