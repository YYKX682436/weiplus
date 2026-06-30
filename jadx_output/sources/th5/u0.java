package th5;

/* loaded from: classes8.dex */
public final class u0 extends lf3.c0 {

    /* renamed from: h, reason: collision with root package name */
    public int f419464h;

    /* renamed from: i, reason: collision with root package name */
    public int f419465i;

    /* renamed from: m, reason: collision with root package name */
    public int f419466m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f419467n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f419465i = -1;
    }

    @Override // lf3.c0, qf3.a
    public void T3(int i17) {
        super.T3(i17);
        a7(i17);
        b7(i17);
    }

    public final void a7(int i17) {
        if (this.f419464h == 0 || i17 == this.f419465i) {
            return;
        }
        this.f419465i = i17;
        try {
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            px4.a.f358955a.a(this.f419464h, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPhotoPreviewComponent", "notifyOnImagePreviewPositionChanged pos=" + i17 + " webViewId=" + this.f419464h, e17);
        }
    }

    public final void b7(int i17) {
        android.widget.TextView textView;
        if (this.f419466m <= 1 || (textView = this.f419467n) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17 + 1);
        sb6.append('/');
        sb6.append(this.f419466m);
        textView.setText(sb6.toString());
    }

    @Override // lf3.c0, kg3.f
    public void onPageSelected(int i17) {
        super.onPageSelected(i17);
        a7(i17);
        b7(i17);
    }

    @Override // lf3.c0, lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs bizPhotoAccountGalleryArgs;
        kotlin.jvm.internal.o.g(contentView, "contentView");
        android.content.Intent intent = getActivity().getIntent();
        if (intent != null && (bizPhotoAccountGalleryArgs = (com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs) b3.q.a(intent, "biz_photo_account_gallery_args", com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs.class)) != null) {
            this.f419464h = bizPhotoAccountGalleryArgs.f67093h;
            this.f419466m = bizPhotoAccountGalleryArgs.f67089d.size();
        }
        super.onViewCreated(contentView);
        if (this.f419466m > 1) {
            android.content.Context context = contentView.getContext();
            int i17 = (int) (57 * context.getResources().getDisplayMetrics().density);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setTextColor(-1);
            textView.setTextSize(17.0f);
            textView.setGravity(17);
            textView.setShadowLayer(4.0f, 0.0f, 1.0f, 1711276032);
            this.f419467n = textView;
            android.view.ViewGroup viewGroup = contentView instanceof android.view.ViewGroup ? (android.view.ViewGroup) contentView : null;
            if (viewGroup != null) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = i17;
                layoutParams.addRule(10);
                viewGroup.addView(textView, layoutParams);
            }
        }
    }
}
