package q65;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f360284a = new java.util.HashMap();

    public static void a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SandBoxCore", "regLifeCycle, id=" + i17 + ", class=%s", obj.getClass().getName());
        java.util.Map map = f360284a;
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        com.tencent.mars.xlog.Log.i("MicroMsg.SandBoxCore", "regLifeCycle, map size=" + ((java.util.HashMap) map).size());
    }

    public static void b(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SandBoxCore", "unregLifeCycle, id=" + i17 + ", class=%s", obj.getClass().getName());
        java.util.Map map = f360284a;
        ((java.util.HashMap) map).remove(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.SandBoxCore", "unregLifeCycle, map size=" + ((java.util.HashMap) map).size());
        if (((java.util.HashMap) map).size() == 0) {
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/sandbox/SandBoxCore", "unregLifeCycle", "(ILjava/lang/Object;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj2, "com/tencent/mm/sandbox/SandBoxCore", "unregLifeCycle", "(ILjava/lang/Object;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            com.tencent.mars.xlog.Log.w("MicroMsg.SandBoxCore", "Sandbox exit Now.");
            com.tencent.mars.xlog.Log.appenderFlushSync();
        }
    }
}
