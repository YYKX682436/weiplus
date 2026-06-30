package g44;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f268803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f268804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f268805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f268806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f268807h;

    public a(android.view.View view, android.content.Context context, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, android.widget.TextView textView, float f17) {
        this.f268803d = view;
        this.f268804e = context;
        this.f268805f = mMRoundCornerImageView;
        this.f268806g = textView;
        this.f268807h = f17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper$resizeBrandName$1");
        android.view.View view = this.f268803d;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int width = view.getWidth();
        android.content.Context context = this.f268804e;
        int b17 = width - (i65.a.b(context, 40) * 2);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f268805f;
        int width2 = b17 - mMRoundCornerImageView.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = mMRoundCornerImageView.getLayoutParams();
        ca4.m0.b(context, this.f268806g, this.f268807h, width2 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r3.rightMargin : 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdAddBrandHalfScreenHelper$resizeBrandName$1");
        return true;
    }
}
