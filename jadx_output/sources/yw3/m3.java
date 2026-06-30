package yw3;

/* loaded from: classes15.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI f466808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466809e;

    public m3(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI, int i17) {
        this.f466808d = repairerKeyboardObserverDemoUI;
        this.f466809e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI repairerKeyboardObserverDemoUI = this.f466808d;
        repairerKeyboardObserverDemoUI.h = this.f466809e;
        repairerKeyboardObserverDemoUI.V6().a().setText(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardObserverDemoUI.U6(repairerKeyboardObserverDemoUI));
        com.tencent.mars.xlog.Log.i("MicroMsg.RepairerKeyboardObserverDemoUI", "onKeyboardChangeHeight: " + repairerKeyboardObserverDemoUI.h);
    }
}
