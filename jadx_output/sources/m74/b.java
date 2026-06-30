package m74;

/* loaded from: classes4.dex */
public class b extends android.widget.PopupWindow implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f324515d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f324516e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f324517f;

    public b(android.content.Context context) {
        super(context);
        super.setOnDismissListener(this);
        this.f324517f = context;
    }

    public void a(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dimBehind", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            android.view.View rootView = getContentView().getRootView();
            android.view.WindowManager windowManager = (android.view.WindowManager) this.f324517f.getSystemService("window");
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = f17;
            windowManager.updateViewLayout(rootView, layoutParams);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("FeedbackPopupWindow", "the window dim account is set failed!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dimBehind", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        android.widget.PopupWindow.OnDismissListener onDismissListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            super.dismiss();
        } catch (java.lang.Throwable unused) {
            if (!this.f324516e && (onDismissListener = this.f324515d) != null) {
                onDismissListener.onDismiss();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            this.f324516e = true;
            android.widget.PopupWindow.OnDismissListener onDismissListener = this.f324515d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDismissListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        this.f324515d = onDismissListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDismissListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }
}
