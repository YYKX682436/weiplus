package un0;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f429345a;

    static {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner appUIForegroundOwner = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE;
        f429345a = appUIForegroundOwner.isForeground();
        appUIForegroundOwner.addLifecycleCallback(new un0.a());
        f429345a = appUIForegroundOwner.isForeground();
    }
}
