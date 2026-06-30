package zx5;

/* loaded from: classes13.dex */
public class i0 implements zx5.m0 {
    public static void a() {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateCancelled");
        d("finished", -2, 0);
        yu5.c.b(new zx5.f0());
    }

    public static void b() {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateCompleted");
        d("finished", 0, 0);
        yu5.c.b(new zx5.h0());
    }

    public static void c(int i17) {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateFailed, errorCode:" + i17);
        d("finished", -1, i17);
        yu5.c.b(new zx5.e0(i17));
    }

    public static void d(java.lang.String str, int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.xweb.update");
        intent.putExtra("stage", str);
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, i17);
        intent.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
        intent.putExtra("package_name", org.xwalk.core.XWalkEnvironment.l());
        intent.setPackage(org.xwalk.core.XWalkEnvironment.l());
        android.content.Context context = org.xwalk.core.XWalkEnvironment.f347970c;
        if (context != null) {
            context.sendBroadcast(intent);
            return;
        }
        by5.c4.c("XWebRuntimeUpdater", "Send broadcast failed. stage: " + str + " stage code: " + i17 + " error code: " + i18);
    }

    public void e(android.content.Context context, java.util.HashMap hashMap) {
        synchronized (this) {
            by5.s0.o();
            java.lang.String str = hashMap != null ? (java.lang.String) hashMap.get("UpdaterCheckType") : null;
            by5.c4.f("XWebRuntimeUpdater", "startCheck, check type:" + str);
            if ("5".equals(str)) {
                by5.c4.f("XWebRuntimeUpdater", "startCheck, check config update only");
                new zx5.b0().e(hashMap);
            } else if ("4".equals(str)) {
                zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
                by5.c4.f("XWebRuntimeUpdater", "startCheck, check embed install only");
                new zx5.x().e(true);
            } else {
                zx5.k kVar2 = org.xwalk.core.XWalkEnvironment.f347968a;
                new zx5.x().e(false);
                new zx5.b0().e(hashMap);
                yu5.c.a(new by5.b1(context));
                by5.c1.f36422a = true;
            }
        }
    }
}
