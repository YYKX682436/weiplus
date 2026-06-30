package ss1;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout f411900d;

    public f(com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout) {
        this.f411900d = mPCollapseTextLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout = this.f411900d;
        android.widget.TextView textView = mPCollapseTextLayout.f94591m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = mPCollapseTextLayout.f94591m;
        if (textView2 == null) {
            return;
        }
        textView2.setText(mPCollapseTextLayout.f94585d);
    }
}
