package ju2;

/* loaded from: classes10.dex */
public final class k implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f301821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f301822e;

    public k(com.tencent.mm.view.MMPAGView mMPAGView, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton) {
        this.f301821d = mMPAGView;
        this.f301822e = finderThanksButton;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.ui.widget.imageview.WeImageView thankStaticIcon;
        android.widget.TextView thankTextView;
        android.widget.TextView thankTextView2;
        android.widget.TextView thankTextView3;
        this.f301821d.setVisibility(8);
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = this.f301822e;
        thankStaticIcon = finderThanksButton.getThankStaticIcon();
        thankStaticIcon.setVisibility(0);
        thankTextView = finderThanksButton.getThankTextView();
        thankTextView.setAlpha(1.0f);
        thankTextView2 = finderThanksButton.getThankTextView();
        thankTextView2.invalidate();
        thankTextView3 = finderThanksButton.getThankTextView();
        thankTextView3.requestLayout();
        finderThanksButton.E = false;
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.ui.widget.imageview.WeImageView thankStaticIcon;
        android.widget.TextView thankTextView;
        android.widget.TextView thankTextView2;
        android.widget.TextView thankTextView3;
        this.f301821d.setVisibility(8);
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = this.f301822e;
        thankStaticIcon = finderThanksButton.getThankStaticIcon();
        thankStaticIcon.setVisibility(0);
        thankTextView = finderThanksButton.getThankTextView();
        thankTextView.invalidate();
        thankTextView2 = finderThanksButton.getThankTextView();
        thankTextView2.requestLayout();
        thankTextView3 = finderThanksButton.getThankTextView();
        thankTextView3.animate().alpha(1.0f).setDuration(100L).start();
        finderThanksButton.E = false;
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
