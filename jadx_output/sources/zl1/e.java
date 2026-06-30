package zl1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f473578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f473579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f473580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f473581g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f473582h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f473583i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473584m;

    public e(zl1.t tVar, boolean z17, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.TextView textView2, android.widget.RelativeLayout relativeLayout, android.widget.ImageView imageView2) {
        this.f473584m = tVar;
        this.f473578d = z17;
        this.f473579e = textView;
        this.f473580f = imageView;
        this.f473581g = textView2;
        this.f473582h = relativeLayout;
        this.f473583i = imageView2;
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.t tVar = this.f473584m;
        boolean z17 = this.f473578d;
        int c17 = zl1.t.c(tVar.getContext(), z17 ? -12 : -8);
        int c18 = zl1.t.c(tVar.getContext(), z17 ? -1 : -3);
        int measuredWidth = this.f473579e.getMeasuredWidth();
        android.widget.ImageView imageView = this.f473580f;
        int measuredWidth2 = (measuredWidth - imageView.getMeasuredWidth()) >> 1;
        android.widget.RelativeLayout relativeLayout = this.f473582h;
        android.widget.ImageView imageView2 = this.f473583i;
        android.widget.TextView textView = this.f473581g;
        if (measuredWidth2 <= 0 || imageView.getVisibility() == 8) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
            if (layoutParams.leftMargin != c17) {
                layoutParams.leftMargin = c17;
                relativeLayout.updateViewLayout(textView, layoutParams);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) imageView2.getLayoutParams();
            if (layoutParams2.rightMargin != c18) {
                layoutParams2.rightMargin = c18;
                relativeLayout.updateViewLayout(imageView2, layoutParams2);
                return;
            }
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
        int i17 = c17 - measuredWidth2;
        if (layoutParams3.leftMargin != i17) {
            layoutParams3.leftMargin = i17;
            relativeLayout.updateViewLayout(textView, layoutParams3);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        int i18 = c18 + measuredWidth2;
        if (layoutParams4.rightMargin != i18) {
            layoutParams4.rightMargin = i18;
            relativeLayout.updateViewLayout(imageView2, layoutParams4);
        }
    }
}
