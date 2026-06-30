package l85;

/* loaded from: classes7.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l85.p0 f317203d = new l85.p0();

    public p0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.util.Pair it = (android.util.Pair) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.w("MicoMsg.proc.ServiceConnection", "detach service: " + ((java.lang.String) it.first) + '@' + ((java.lang.ref.WeakReference) it.second).get());
        try {
            android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) ((java.lang.ref.WeakReference) it.second).get();
            if (serviceConnection != null) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(serviceConnection);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicoMsg.proc.ServiceConnection", "unbindService fail: " + e17.getMessage());
        }
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.Class.forName((java.lang.String) it.first)));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicoMsg.proc.ServiceConnection", "stopService fail: " + e18.getMessage());
        }
        return java.lang.Boolean.TRUE;
    }
}
