package ya2;

/* loaded from: classes5.dex */
public final class t implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f460534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460535b;

    public t(java.lang.CharSequence charSequence, android.content.Context context) {
        this.f460534a = charSequence;
        this.f460535b = context;
    }

    @Override // db5.l4
    public final void a(android.widget.TextView titleTV, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(titleTV, "titleTV");
        titleTV.setText(this.f460534a);
        titleTV.setMaxLines(1);
        titleTV.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.view.ViewGroup.LayoutParams layoutParams = titleTV.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f460535b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        }
    }
}
