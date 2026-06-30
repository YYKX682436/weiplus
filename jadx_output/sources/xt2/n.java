package xt2;

/* loaded from: classes2.dex */
public final class n extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f456894b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f456895c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f456896d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f456897e;

    /* renamed from: f, reason: collision with root package name */
    public final int f456898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f456894b = context;
        this.f456898f = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aou, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.a4z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456895c = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.cgz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456897e = (android.view.ViewGroup) findViewById2;
    }

    public final void a(android.view.View anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!this.f456896d) {
            getContentView().measure(0, 0);
            this.f456896d = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int width = iArr[0] + ((anchor.getWidth() - measuredWidth) / 2);
        int height = iArr[1] + anchor.getHeight();
        int i17 = com.tencent.mm.ui.bh.a(this.f456894b).f197135a;
        int i18 = this.f456898f;
        int i19 = (i17 - i18) - measuredWidth;
        int i27 = i18 + 0;
        if (width > i19) {
            width = i19;
        } else if (width < i27) {
            width = i27;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f456895c;
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (weImageView.getMeasuredWidth() / 2));
        showAtLocation(anchor, 0, width, height);
    }
}
