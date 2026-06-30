package ss1;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout f411902d;

    public h(com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout) {
        this.f411902d = mPCollapseTextLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewParent parent;
        com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout = this.f411902d;
        android.widget.TextView textView = mPCollapseTextLayout.f94591m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = mPCollapseTextLayout.f94591m;
        if (textView2 != null) {
            textView2.setMaxLines(mPCollapseTextLayout.f94588g);
        }
        android.widget.TextView textView3 = mPCollapseTextLayout.f94591m;
        if (textView3 != null) {
            textView3.setText(mPCollapseTextLayout.f94585d);
        }
        android.widget.TextView textView4 = mPCollapseTextLayout.f94592n;
        if (textView4 != null) {
            textView4.setPadding(0, 0, 0, 0);
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = mPCollapseTextLayout.f94590i;
        if (mMNeat7extView != null) {
            mMNeat7extView.setVisibility(8);
        }
        android.widget.TextView textView5 = mPCollapseTextLayout.f94592n;
        android.view.ViewGroup.LayoutParams layoutParams = textView5 != null ? textView5.getLayoutParams() : null;
        if (layoutParams != null && (layoutParams instanceof android.widget.RelativeLayout.LayoutParams)) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(12);
            layoutParams2.removeRule(3);
            layoutParams2.addRule(3, com.tencent.mm.R.id.f483932ci3);
        }
        android.widget.TextView textView6 = mPCollapseTextLayout.f94592n;
        if (textView6 == null || (parent = textView6.getParent()) == null) {
            return;
        }
        parent.requestLayout();
    }
}
