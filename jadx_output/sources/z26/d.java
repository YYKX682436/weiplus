package z26;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.imid.swipebacklayout.lib.SwipeBackLayout f469830d;

    public d(me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout) {
        this.f469830d = swipeBackLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = this.f469830d;
        swipeBackLayout.B = null;
        com.tencent.mars.xlog.Log.i("SwipeBackLayout", "startFreezeResetAnim|timeout");
        me.imid.swipebacklayout.lib.SwipeBackLayout.b(swipeBackLayout);
    }
}
