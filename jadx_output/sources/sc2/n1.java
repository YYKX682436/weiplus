package sc2;

/* loaded from: classes2.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f406092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f406093e;

    public n1(android.widget.TextView textView, sc2.f2 f2Var) {
        this.f406092d = textView;
        this.f406093e = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.Layout layout;
        int i17 = 0;
        android.widget.TextView textView = this.f406092d;
        if (textView != null && (layout = textView.getLayout()) != null) {
            i17 = layout.getEllipsisCount(0);
        }
        if (i17 > 0) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mars.xlog.Log.i(this.f406093e.k(), "bindBigCard: infoAfterWording is empty");
        }
    }
}
