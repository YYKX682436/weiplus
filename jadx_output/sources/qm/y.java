package qm;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f364666a;

    static {
        boolean z17;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatEnabled not main process");
        } else if (com.tencent.mm.ui.bk.Q()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatEnabled isFoldableDevice ignore");
        } else {
            if (!com.tencent.mm.ui.bk.A()) {
                z17 = true;
                f364666a = z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatDeviceSupport: " + z17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatEnabled isTablet ignore");
        }
        z17 = false;
        f364666a = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationSwitchHelper", "isHalfScreenChatDeviceSupport: " + z17);
    }
}
