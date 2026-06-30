package w03;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w03.u f441902d;

    public t(w03.u uVar) {
        this.f441902d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w03.u uVar = this.f441902d;
        uVar.O6().Y6();
        if (uVar.O6().isFinishing()) {
            return;
        }
        db5.f.b(uVar.O6());
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = uVar.O6().getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setNeedRequestActivityTranslucent(true);
            swipeBackLayout.d(false);
        }
    }
}
