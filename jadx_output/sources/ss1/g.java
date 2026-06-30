package ss1;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout f411901d;

    public g(com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout) {
        this.f411901d = mPCollapseTextLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f411901d.f94590i;
        if (mMNeat7extView != null) {
            mMNeat7extView.requestLayout();
        }
    }
}
