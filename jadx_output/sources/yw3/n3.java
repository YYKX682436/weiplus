package yw3;

/* loaded from: classes15.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI f466825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f466826e;

    public n3(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI, boolean z17) {
        this.f466825d = repairerKeyboardObserverDemoUI;
        this.f466826e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI = this.f466825d;
        repairerKeyboardObserverDemoUI.g = this.f466826e;
        repairerKeyboardObserverDemoUI.V6().a().setText(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI.U6(repairerKeyboardObserverDemoUI));
        com.tencent.mars.xlog.Log.i("MicroMsg.RepairerKeyboardObserverDemoUI", "onKeyboardChangeAfter: " + repairerKeyboardObserverDemoUI.g);
    }
}
