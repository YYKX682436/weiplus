package r63;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r63.i f393019d = new r63.i();

    public i() {
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
