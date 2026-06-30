package l34;

/* loaded from: classes12.dex */
public final class f implements l34.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.f f315432a = new l34.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f315433b;

    static {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method = null;
        try {
            cls = java.lang.Class.forName("android.hsm.HwSystemManager");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HuaweiShortcutInstallAdapter", e17, "reflect hwSystemManagerClass fail", new java.lang.Object[0]);
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("allowOp", java.lang.Integer.TYPE);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HuaweiShortcutInstallAdapter", e18, "reflect allowOpMethod fail", new java.lang.Object[0]);
            }
        }
        f315433b = method;
    }

    @Override // l34.b
    public int a() {
        java.lang.Boolean bool = null;
        try {
            java.lang.reflect.Method method = f315433b;
            java.lang.Object invoke = method != null ? method.invoke(null, java.lang.Integer.valueOf(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) : null;
            if (invoke instanceof java.lang.Boolean) {
                bool = (java.lang.Boolean) invoke;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HuaweiShortcutInstallAdapter", e17, "reflect call allowOp fail", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiShortcutInstallAdapter", "checkPermissionStatus, isAllowed: " + bool);
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            return 0;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            return 1;
        }
        if (bool == null) {
            return -1;
        }
        throw new jz5.j();
    }

    @Override // l34.b
    public boolean b() {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().queryIntentActivities(new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + com.tencent.mm.sdk.platformtools.x2.f193072b)), 0);
        return !nf.c.a(queryIntentActivities) && queryIntentActivities.get(0).activityInfo.exported;
    }

    @Override // l34.b
    public void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        l34.e.f315431a.b(context);
    }
}
