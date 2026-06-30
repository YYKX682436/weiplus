package sc3;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final sc3.a f406426d = new sc3.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bf3.g0.f19627a.getClass();
        int i17 = 60;
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            if (windowManager != null) {
                android.view.Display.Mode[] supportedModes = windowManager.getDefaultDisplay().getSupportedModes();
                kotlin.jvm.internal.o.f(supportedModes, "getSupportedModes(...)");
                for (android.view.Display.Mode mode : supportedModes) {
                    int b17 = a06.d.b(mode.getRefreshRate());
                    if (b17 > i17 && b17 <= 144) {
                        i17 = b17;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MBServerUtil", e17, "getRefreshRate error", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MBServerUtil", "findMaxRefreshRate " + i17);
        return java.lang.Integer.valueOf(i17);
    }
}
