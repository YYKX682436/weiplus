package tp;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.view.WindowManager a(android.view.WindowManager windowManager) {
        android.view.WindowManager windowManager2 = (android.view.WindowManager) java.lang.reflect.Proxy.newProxyInstance(windowManager.getClass().getClassLoader(), windowManager.getClass().getInterfaces(), new tp.b(windowManager));
        com.tencent.mars.xlog.Log.i("MicroMsg.SafeWindowManager", "proxy");
        return windowManager2;
    }
}
