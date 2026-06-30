package r63;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r63.k f393021d = new r63.k();

    public k() {
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
