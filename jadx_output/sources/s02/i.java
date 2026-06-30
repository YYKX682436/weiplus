package s02;

/* loaded from: classes2.dex */
public final class i extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f401961b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f401962c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f401963d;

    /* renamed from: e, reason: collision with root package name */
    public final int f401964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f401961b = context;
        this.f401964e = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dh_, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.a4z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f401962c = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.cgz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.view.ViewGroup) findViewById2).setOnClickListener(new s02.h(this));
    }

    public final void a(android.view.View anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!this.f401963d) {
            getContentView().measure(0, 0);
            this.f401963d = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int width = iArr[0] + ((anchor.getWidth() - measuredWidth) / 2);
        int height = iArr[1] - (anchor.getHeight() * 2);
        int i17 = this.f401964e;
        int i18 = height + i17;
        int i19 = (com.tencent.mm.ui.bh.a(this.f401961b).f197135a - i17) - measuredWidth;
        int i27 = i17 + 0;
        if (width > i19) {
            width = i19;
        } else if (width < i27) {
            width = i27;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f401962c;
        android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (weImageView.getMeasuredWidth() / 2));
        showAtLocation(anchor, 0, width, i18);
    }
}
