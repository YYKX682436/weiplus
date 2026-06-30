package wx5;

/* loaded from: classes13.dex */
public abstract class f {
    public static void a(java.lang.String str) {
        by5.c4.f("XWebRemoteDebugHandler", "startRemoteDebug, process:" + org.xwalk.core.XWalkEnvironment.getProcessName() + ", token:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            by5.c4.g("XWebRemoteDebugHandler", "startRemoteDebug, invalid token");
        } else if (by5.a1.c()) {
            by5.c4.f("XWebRemoteDebugHandler", "startRemoteDebug, main process ignored");
        } else {
            tx5.j.d(80033, new java.lang.Object[]{str});
        }
    }
}
